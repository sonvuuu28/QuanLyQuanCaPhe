package BUS;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import Util.JDBCUtil;


import DAO.PhieuNhapDAO;
import DTO.PhieuNhapDTO;
public class PhieuNhapBUS {

    private PhieuNhapDAO phieuNhapDAO;

    public PhieuNhapBUS() {
        phieuNhapDAO = new PhieuNhapDAO();
    }
    public void loadDataToTable_PhieuNhap(JTable table) {
        if(table == null){
          throw new IllegalArgumentException("Table is null");
        }
        ArrayList<Object[]> data = phieuNhapDAO.getDataFromDatabase();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Clear existing data
        for (Object[] row : data) {
              String maPhieuNhap = (String) row[0];
              Date ngayLapPhieuNhap = (Date) row[1];
              int tongTien = (int) row[2];
              String maNhanVien = (String) row[3];
              String maNhaCungCap = (String) row[4];

              // System.out.println("maPhieuNhap: " + maPhieuNhap + ", ngayLapPhieuNhap: " + ngayLapPhieuNhap + ", tongTien: " + tongTien + ", maNhanVien: " + maNhanVien + ", maNhaCungCap: " + maNhaCungCap);

              model.addRow(new Object[]{maPhieuNhap, ngayLapPhieuNhap, tongTien, maNhanVien, maNhaCungCap});
              // System.out.println("Number of rows retrieved: " + data.size());
              System.out.println("Total rows in table model: " + model.getRowCount());



        }
    }

    public static class NonEditableTableModel extends DefaultTableModel {
      public NonEditableTableModel(Object[][] data, Object[] columnNames) {
          super(data, columnNames);
      }

      @Override
      public boolean isCellEditable(int row, int column) {
          return false; // Tất cả các ô đều không thể chỉnh sửa
      }
  }
  public String getMaxMaPhieuNhap() throws SQLException{
    Connection c = JDBCUtil.getConnection();
    PreparedStatement pstms = null;
    ResultSet rs = null;
    String maxMaPhieuNhap = null;
    try{
      String sql = "select max(maPhieuNhap) AS maxMaPhieuNhap from PhieuNhap";
      pstms = c.prepareStatement(sql);
      rs = pstms.executeQuery();
      if(rs.next()){
        maxMaPhieuNhap = rs.getString("maxMaPhieuNhap");
      }
    }catch(SQLException e){
        e.printStackTrace();

    }
    return maxMaPhieuNhap;
  }

  public String taoMaPhieuNhapNew() throws SQLException{
    String maxMaPhieuNhap = getMaxMaPhieuNhap();
    if(maxMaPhieuNhap == null){
      return "PN001";
    }
    int number = Integer.parseInt(maxMaPhieuNhap.substring(2)) +1;
    return "PN" + String.format("%03d", number);
  }

  public String addPhieuNhap(String ngayLapPhieuNhap, int tongTienPhieuNhap, String maNhaCungCap, String maNhanVien){
    Connection c = JDBCUtil.getConnection();
    PreparedStatement pstms = null;
    String maPhieuNhap = null;
    // String maNhanVien = null;
    // String maNhaCungCap = null;
    try{
      maPhieuNhap = taoMaPhieuNhapNew();
      maNhanVien = getFirstMaNhanVien();
      maNhaCungCap = getMaNhaCungCap(maNhaCungCap);

      String sql = "insert into PhieuNhap(MaPhieuNhap, NgayLapPhieuNhap, TongTienPhieuNhap, MaNhanVien, MaNhaCungCap) values(?,?,?,?,?)";
      pstms = c.prepareStatement(sql);
      pstms.setString(1, maPhieuNhap);
      pstms.setString(2, ngayLapPhieuNhap);
      pstms.setInt(3, tongTienPhieuNhap);
      pstms.setString(4, maNhanVien);
      pstms.setString(5, maNhaCungCap);
      pstms.executeUpdate();
    }catch(SQLException e){
      e.printStackTrace();
    }finally {
      if (pstms != null) try { pstms.close(); } catch (SQLException e) { e.printStackTrace(); }
      JDBCUtil.closeConnection(c);
  }
    return maPhieuNhap;

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

  //Lấy đỡ 1 mã nhân viên để test chức năng thêm phiếu nhập
  public String getFirstMaNhanVien() throws SQLException {
    Connection c = JDBCUtil.getConnection();
    PreparedStatement pstms = null;
    ResultSet rs = null;
    String maNhanVien = null;
    try {
        String sql = "SELECT TOP 1 MaNhanVien FROM NhanVien ORDER BY MaNhanVien";
        pstms = c.prepareStatement(sql);
        rs = pstms.executeQuery();
        if (rs.next()) {
            maNhanVien = rs.getString("MaNhanVien");
            System.out.println("Mã nhân viên lấy được: " + maNhanVien);
            
        }
        else{
          System.out.println("Không tìm thấy mã nhân viên nào trong bảng NhanVien."); 
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        if (rs != null) rs.close();
        if (pstms != null) pstms.close();
        JDBCUtil.closeConnection(c);
    }
    return maNhanVien;
}
public boolean isMaNhanVienExists(String maNhanVien) throws SQLException {
  Connection c = JDBCUtil.getConnection();
  PreparedStatement pstms = null;
  ResultSet rs = null;
  boolean exists = false;
  try {
      String sql = "SELECT 1 FROM NhanVien WHERE MaNhanVien = ?";
      pstms = c.prepareStatement(sql);
      pstms.setString(1, maNhanVien);
      rs = pstms.executeQuery();
      exists = rs.next();
  } catch (SQLException e) {
      e.printStackTrace();
  } finally {
      if (rs != null) rs.close();
      if (pstms != null) pstms.close();
      JDBCUtil.closeConnection(c);
  }
  return exists;
}
public String getMaNhaCungCap(String tenNhaCungCap) throws SQLException {
  Connection c = JDBCUtil.getConnection();
  PreparedStatement pstms = null;
  ResultSet rs = null;
  String maNhaCungCap = null;
  try {
      String sql = "SELECT MaNhaCungCap FROM NhaCungCap WHERE TenNhaCungCap = ?";
      pstms = c.prepareStatement(sql);
      pstms.setString(1, tenNhaCungCap);
      rs = pstms.executeQuery();
      if (rs.next()) {
          maNhaCungCap = rs.getString("MaNhaCungCap");
      }
  } catch (SQLException e) {
      e.printStackTrace();
  } finally {
      if (rs != null) rs.close();
      if (pstms != null) pstms.close();
      JDBCUtil.closeConnection(c);
  }
  return maNhaCungCap;
}
// public void loadChiTietPhieuNhapToTable(JTable table, String maPhieuNhap) {
//   if (table == null) {
//       throw new IllegalArgumentException("Table is null");
//   }
//   ArrayList<Object[]> data = phieuNhapDAO.getChiTietPhieuNhap(maPhieuNhap);
//   DefaultTableModel model = (DefaultTableModel) table.getModel();
//   model.setRowCount(0); // Clear existing data
//   for (Object[] row : data) {
//       // String maPhieuNhap = (String) row[0];
//       String maNguyenLieu = (String) row[0];
//       double khoiLuong = (double) row[1];
//       int donGia = (int) row[2];
//       int thanhTien = (int) row[3];
      
//       model.addRow(new Object[]{ maNguyenLieu, khoiLuong, donGia, thanhTien,});
//   }
// }
public void loadChiTietPhieuNhapToTable(JTable table, String maPhieuNhap) {
  if (table == null) {
      throw new IllegalArgumentException("Table is null");
  }
  ArrayList<Object[]> data = phieuNhapDAO.getChiTietPhieuNhap(maPhieuNhap);
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
public void searchPhieuNhapByMa(JTable table, String maPhieuNhap) {
  if (table == null) {
      throw new IllegalArgumentException("Table is null");
  }
  ArrayList<Object[]> data = phieuNhapDAO.searchPhieuNhapByMa(maPhieuNhap);
  DefaultTableModel model = (DefaultTableModel) table.getModel();
  model.setRowCount(0); // Clear existing data
  for (Object[] row : data) {
      String maPhieuNhapResult = (String) row[0];
      Date ngayLapPhieuNhap = (Date) row[1];
      int tongTien = (int) row[2];
      String maNhanVien = (String) row[3];
      String maNhaCungCap = (String) row[4];

      model.addRow(new Object[]{maPhieuNhapResult, ngayLapPhieuNhap, tongTien, maNhanVien, maNhaCungCap});
  }
}
// public void searchPhieuNhapByNgayVaGia(JTable table, Date tuNgay, Date denNgay, int giaTu, int giaDen) {
//   if (table == null) {
//       throw new IllegalArgumentException("Table is null");
//   }
//   ArrayList<Object[]> data = phieuNhapDAO.searchPhieuNhapByNgayVaGia(tuNgay, denNgay, giaTu, giaDen);
//   DefaultTableModel model = (DefaultTableModel) table.getModel();
//   model.setRowCount(0); // Clear existing data
//   for (Object[] row : data) {
//       String maPhieuNhap = (String) row[0];
//       Date ngayLapPhieuNhap = (Date) row[1];
//       int tongTien = (int) row[2];
//       String maNhanVien = (String) row[3];
//       String maNhaCungCap = (String) row[4];

//       model.addRow(new Object[]{maPhieuNhap, ngayLapPhieuNhap, tongTien, maNhanVien, maNhaCungCap});
//   }
// }
public void searchPhieuNhapByNgayVaGia(JTable table, Date tuNgay, Date denNgay, int giaTu, int giaDen) {
        if (table == null) {
            throw new IllegalArgumentException("Table is null");
        }
        ArrayList<PhieuNhapDTO> data = phieuNhapDAO.searchPhieuNhapByNgayVaGia(tuNgay, denNgay, giaTu, giaDen);
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Clear existing data
        for (PhieuNhapDTO pn : data) {
            model.addRow(new Object[]{
                pn.getMaPhieuNhap(),
                pn.getNgayLapPhieuNhap(),
                pn.getTongTienPhieuNhap(),
                pn.getMaNhanVien(),
                pn.getMaNhaCungCap()
            });
        }
    }



 
}