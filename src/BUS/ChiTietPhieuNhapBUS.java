package BUS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import DAO.ChiTietPhieuNhapDAO;

import Util.JDBCUtil;

public class ChiTietPhieuNhapBUS {
  private ChiTietPhieuNhapDAO chiTietPhieuNhapDAO;
  public ChiTietPhieuNhapBUS() {
      chiTietPhieuNhapDAO = new ChiTietPhieuNhapDAO();
  }
  public void loadChiTietPhieuNhapToTable(JTable table, String maPhieuNhap) {
  if (table == null) {
      throw new IllegalArgumentException("Table is null");
  }
  ArrayList<Object[]> data = chiTietPhieuNhapDAO.getChiTietPhieuNhap(maPhieuNhap);
  DefaultTableModel model = (DefaultTableModel) table.getModel();
  model.setRowCount(0); // Clear existing data
  for (Object[] row : data) {
      String maNguyenLieu = (String) row[0];
      String tenNguyenLieu = (String) row[1];
      double khoiLuong = (double) row[2];
      int donGia = (int) row[3];
      int thanhTien = (int) row[4];

      model.addRow(new Object[]{maNguyenLieu, tenNguyenLieu, khoiLuong, donGia, thanhTien});
  }
}
public void addChiTietPhieuNhap(String maPhieuNhap, String maNguyenLieu,double khoiLuong, int donGia, int thanhTien){
    Connection c = JDBCUtil.getConnection();
    PreparedStatement pstms = null;
    try{
      String sql = "insert into ChiTietPhieuNhap(MaPhieuNhap, MaNguyenLieu, KhoiLuong, DonGia, ThanhTien) values(?,?,?,?,?)";
      pstms = c.prepareStatement(sql);
      pstms.setString(1, maPhieuNhap);
      pstms.setString(2, maNguyenLieu);
      pstms.setDouble(3, khoiLuong);
      pstms.setInt(4, donGia);
      pstms.setInt(5, thanhTien);
      pstms.executeUpdate();
    }catch(SQLException e){
      e.printStackTrace();
    }finally {
      if (pstms != null) try { pstms.close(); } catch (SQLException e) { e.printStackTrace(); }
      JDBCUtil.closeConnection(c);
  }
  }
}
