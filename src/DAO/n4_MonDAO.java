package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DTO.MonDTO;
import Util.JDBCUtil;

public class n4_MonDAO {
      public ArrayList<MonDTO> getAll() {
            ArrayList<MonDTO> listMon = new ArrayList<>();
            try {
                  String sql = "SELECT * FROM Mon WHERE TrangThaiMon = 1";
                  Connection c = JDBCUtil.getConnection();
                  PreparedStatement pre = c.prepareStatement(sql);
                  ResultSet rs = pre.executeQuery();
                  while (rs.next()) {

                        String maMon = rs.getString(1);
                        String maLoaiMon = rs.getString(2);
                        String tenMon = rs.getString(3);
                        String hinhAnh = rs.getString(4);
                        String maCongThuc = rs.getString(5);
                        int donGiaMon = rs.getInt(6);
                        boolean trangThaiMon = rs.getBoolean(7);

                        MonDTO mon = new MonDTO(maMon, maLoaiMon, tenMon, hinhAnh, maCongThuc, donGiaMon, trangThaiMon);
                        listMon.add(mon);
                  }
            } catch (SQLException ex) {
                  System.err.println(ex.getMessage());
            }
            return listMon;
      }

      public MonDTO getMonById(String maMon) {
            MonDTO mon = null;
            try {
                  String sql = "SELECT * FROM Mon WHERE MaMon = ?";
                  Connection c = JDBCUtil.getConnection();
                  PreparedStatement pre = c.prepareStatement(sql);
                  pre.setString(1, maMon);
                  ResultSet rs = pre.executeQuery();
                  if (rs.next()) {

                        String maLoaiMon = rs.getString(2);
                        String tenMon = rs.getString(3);
                        String hinhAnh = rs.getString(4);
                        String maCongThuc = rs.getString(5);
                        int donGiaMon = rs.getInt(6);
                        boolean trangThaiMon = rs.getBoolean(7);

                        mon = new MonDTO(maMon, maLoaiMon, tenMon, hinhAnh, maCongThuc, donGiaMon, trangThaiMon);
                  }
            } catch (SQLException ex) {
                  System.err.println(ex.getMessage());
            }
            return mon;
      }

      public boolean addMon(MonDTO mon) {
            boolean result = false;
            try {
                  Connection c = JDBCUtil.getConnection();
                  String sql = "INSERT INTO Mon VALUES(?,?,?,?,?,?,?)";
                  PreparedStatement prep = c.prepareStatement(sql);
                  prep.setString(1, mon.getMaMon());
                  prep.setString(2, mon.getMaLoaiMon());
                  prep.setString(3, mon.getTenMon());
                  prep.setString(4, mon.getHinhAnh());
                  prep.setString(5, mon.getMaCongThuc());
                  prep.setInt(6, mon.getDonGiaMon());
                  prep.setBoolean(7, mon.getTrangThaiMon());

                  if(prep.executeUpdate() > 0) {
                        return true;
                  }
                  JDBCUtil.closeConnection(c);
            } catch (SQLException ex) {
                  System.err.println(ex.getMessage());
            }
            return result;
      }

      public boolean deleteMon(String maMon) {
            boolean result = false;
            try {
                  Connection c = JDBCUtil.getConnection();
                  String sql = "UPDATE Mon SET trangThaiMon=0 WHERE MaMon= ? ";
                  PreparedStatement prep = c.prepareStatement(sql);
                  prep.setString(1, maMon);
                  if (prep.executeUpdate() > 0) {
                        result = true;
                  }
                  JDBCUtil.closeConnection(c);
            } catch (SQLException ex) {
                  System.err.println(ex.getMessage());
            }
            return result;
      }

      public boolean updateMon(MonDTO mon) {
            boolean result = false;
            try {
                  Connection c = JDBCUtil.getConnection();
                  String sql = "UPDATE Mon SET MaLoaiMon=?, TenMon=?, HinhAnh=?, MaCongThuc=?, DonGiaMon=?, TrangThaiMon=? WHERE MaMon=?";
                  PreparedStatement prep = c.prepareStatement(sql);
                  prep.setString(1, mon.getMaLoaiMon());
                  prep.setString(2, mon.getTenMon());
                  prep.setString(3, mon.getHinhAnh());
                  prep.setString(4, mon.getMaCongThuc());
                  prep.setInt(5, mon.getDonGiaMon());
                  prep.setBoolean(6, mon.getTrangThaiMon());
                  prep.setString(7, mon.getMaMon());
                  if (prep.executeUpdate() > 0) {
                        result = true;
                  }
                  JDBCUtil.closeConnection(c);
            } catch (SQLException ex) {
                  System.err.println(ex.getMessage());
            }
            return result;
      }
      public String getNewId() {
            String maMon = "M001"; // Giá trị mặc định khi không có món trong CSDL
            try {
                Connection c = JDBCUtil.getConnection();
                String sql = "SELECT MAX(MaMon) FROM Mon"; // Câu truy vấn để lấy mã món lớn nhất
                Statement st = c.createStatement();
                ResultSet rs = st.executeQuery(sql);
                
                if (rs.next()) {
                    String lastMaHD = rs.getString("maMon");
                    if (lastMaHD != null) {
                        // Tách phần số ra khỏi mã món (VD: từ "HD005" -> "005")
                        String numberPart = lastMaHD.substring(1); // Lấy phần số từ vị trí thứ 3
                        int number = Integer.parseInt(numberPart); // Chuyển đổi thành số nguyên
                        number++; // Tăng giá trị số lên 1
                        
                        // Đảm bảo mã mới có định dạng HD + 3 chữ số
                        maMon = String.format("M%03d", number); // Định dạng lại thành HDXXX
                    }
                }
                JDBCUtil.closeConnection(c);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return maMon; // Trả về mã món mới
      }
}
