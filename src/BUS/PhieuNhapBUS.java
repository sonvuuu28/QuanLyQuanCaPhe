package BUS;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.Locale;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


import Util.JDBCUtil;


import DAO.PhieuNhapDAO;
public class PhieuNhapBUS {

        private PhieuNhapDAO phieuNhapDAO;
        SimpleDateFormat ngayThangNam = new SimpleDateFormat("dd-MM-yyyy");
        // NumberFormat numberFormat = NumberFormat.getNumberInstance(new Locale("vi", "VN")); // Format for Vietnam locale
        Locale locale = new Locale.Builder().setLanguage("vi").setRegion("VN").build();
        NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);




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
          String ngayLapPhieuNhapStr = ngayThangNam.format(ngayLapPhieuNhap);
          int tongTien = (int) row[2];
          String tongTienStr = numberFormat.format(tongTien) + "đ"; // Format the number with thousand separator
          String maNhanVien = (String) row[3];
          String maNhaCungCap = (String) row[4];

            // System.out.println("maPhieuNhap: " + maPhieuNhap + ", ngayLapPhieuNhap: " + ngayLapPhieuNhap + ", tongTien: " + tongTien + ", maNhanVien: " + maNhanVien + ", maNhaCungCap: " + maNhaCungCap);

          model.addRow(new Object[]{maPhieuNhap, ngayLapPhieuNhapStr, tongTienStr, maNhanVien, maNhaCungCap});
            // System.out.println("Number of rows retrieved: " + data.size());
            // System.out.println("Tổng các dòng trong bảng: " + model.getRowCount());
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
   
        try{
          maPhieuNhap = taoMaPhieuNhapNew();
          maNhanVien = getMaNhanVien(maNhanVien);
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
    public String getMaNhanVien (String MaNhanVien) throws SQLException{
      Connection c = JDBCUtil.getConnection();
      PreparedStatement pstms = null;
      ResultSet rs = null;
      String maNhanVien = null;
      try{
        String sql = "SELECT MaNhanVien FROM NhanVien WHERE MaNhanVien = ?";
        pstms = c.prepareStatement(sql);
        pstms.setString(1, MaNhanVien);
        rs = pstms.executeQuery();
        if(rs.next()){
          maNhanVien = rs.getString("MaNhanVien");
        }
      }catch(SQLException e){
        e.printStackTrace();
      }finally{
        if(rs != null) rs.close();
        if(pstms != null) pstms.close();
        JDBCUtil.closeConnection(c);
      }
      return maNhanVien;
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
          String ngayLapPhieuNhapStr = ngayThangNam.format(ngayLapPhieuNhap);
          int tongTien = (int) row[2];
          String tongTienStr = numberFormat.format(tongTien) + "đ"; 
          String maNhanVien = (String) row[3];
          String maNhaCungCap = (String) row[4];

          model.addRow(new Object[]{maPhieuNhapResult, ngayLapPhieuNhapStr, tongTienStr, maNhanVien, maNhaCungCap});
      }
    }


    public void searchPhieuNhap(JTable table, Date tuNgay, Date denNgay, Integer giaTu, Integer giaDen) {
      if (table == null) {
          throw new IllegalArgumentException("Table is null");
      }

      // Gọi hàm DAO để lấy dữ liệu
      ArrayList<Object[]> data = phieuNhapDAO.searchPhieuNhap(tuNgay, denNgay, giaTu, giaDen);

      // Hiển thị dữ liệu lên JTable
      DefaultTableModel model = (DefaultTableModel) table.getModel();
      model.setRowCount(0); // Xóa dữ liệu cũ
      for (Object[] row : data) {
          model.addRow(row);
      }
    }

 
}
