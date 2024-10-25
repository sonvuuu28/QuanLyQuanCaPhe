package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DTO.NguyenLieuDTO;
import Util.JDBCUtil;

public class n5_NguyenLieuDAO {
      public ArrayList<NguyenLieuDTO> getAll() {
            ArrayList<NguyenLieuDTO> listNguyenLieu = new ArrayList<>();
            try {
                  String sql = "SELECT * FROM NguyenLieu WHERE TrangThaiNguyenLieu = 1";
                  Connection c = JDBCUtil.getConnection();
                  PreparedStatement pre = c.prepareStatement(sql);
                  ResultSet rs = pre.executeQuery();
                  while (rs.next()) {

                        String maNguyenLieu = rs.getString(1);
                        String tenNguyenLieu = rs.getString(2);
                        Double khoiLuongNguyenLieu = rs.getDouble(3);
                        int donGiaNguyenLieu = rs.getInt(4);
                        boolean trangThaiNguyenLieu = rs.getBoolean(5);

                        NguyenLieuDTO nguyenLieu = new NguyenLieuDTO(maNguyenLieu, tenNguyenLieu, khoiLuongNguyenLieu, donGiaNguyenLieu, trangThaiNguyenLieu);
                        listNguyenLieu.add(nguyenLieu);
                  }
            } catch (SQLException ex) {
                  System.err.println(ex.getMessage());
            }
            return listNguyenLieu;
      }

      public NguyenLieuDTO getNguyenLieuById(String maNguyenLieu) {
            NguyenLieuDTO nguyenLieu = null;
            try {
                  String sql = "SELECT * FROM NguyenLieu WHERE MaNguyenLieu = ?";
                  Connection c = JDBCUtil.getConnection();
                  PreparedStatement pre = c.prepareStatement(sql);
                  pre.setString(1, maNguyenLieu);
                  ResultSet rs = pre.executeQuery();
                  if (rs.next()) {

                        String tenNguyenLieu = rs.getString(2);
                        Double khoiLuongNguyenLieu = rs.getDouble(3);
                        int donGiaNguyenLieu = rs.getInt(4);
                        boolean trangThaiNguyenLieu = rs.getBoolean(5);

                        nguyenLieu = new NguyenLieuDTO(maNguyenLieu, tenNguyenLieu, khoiLuongNguyenLieu, donGiaNguyenLieu, trangThaiNguyenLieu);
                  }
            } catch (SQLException ex) {
                  System.err.println(ex.getMessage());
            }
            return nguyenLieu;
      }

      public boolean addNguyenLieu(NguyenLieuDTO nguyenLieu) {
            boolean result = false;
            try {
                  Connection c = JDBCUtil.getConnection();
                  String sql = "INSERT INTO NguyenLieu VALUES(?,?,?,?,?,?,?)";
                  PreparedStatement prep = c.prepareStatement(sql);
                  prep.setString(1, nguyenLieu.getMaNguyenLieu());
                  prep.setString(2, nguyenLieu.getTenNguyenLieu());
                  prep.setDouble(3, nguyenLieu.getKhoiLuongNguyenLieu());
                  prep.setInt(4, nguyenLieu.getDonGiaNguyenLieu());
                  prep.setBoolean(5, nguyenLieu.getTrangThaiNguyenLieu());

                  if(prep.executeUpdate() > 0) {
                        return true;
                  }
                  JDBCUtil.closeConnection(c);
            } catch (SQLException ex) {
                  System.err.println(ex.getMessage());
            }
            return result;
      }

      public boolean deleteNguyenLieu(String maNguyenLieu) {
            boolean result = false;
            try {
                  Connection c = JDBCUtil.getConnection();
                  String sql = "UPDATE NguyenLieu SET TrangThaiNguyenLieu = 0 WHERE MaNguyenLieu= ? ";
                  PreparedStatement prep = c.prepareStatement(sql);
                  prep.setString(1, maNguyenLieu);

                  if (prep.executeUpdate() > 0) {
                        result = true;
                  }
                  JDBCUtil.closeConnection(c);
            } catch (SQLException ex) {
                  System.err.println(ex.getMessage());
            }
            return result;
      }

      public boolean updateNguyenLieu(NguyenLieuDTO nguyenLieu) {
            boolean result = false;
            try {
                  Connection c = JDBCUtil.getConnection();
                  String sql = "UPDATE NguyenLieu SET TenNguyenLieu=?, KhoiLuongNguyenLieu=?, DonGiaNguyenLieu=?, TrangThaiNguyenLieu=? WHERE MaNguyenLieu=?";
                  PreparedStatement prep = c.prepareStatement(sql);
                  prep.setString(1, nguyenLieu.getTenNguyenLieu());
                  prep.setDouble(2, nguyenLieu.getKhoiLuongNguyenLieu());
                  prep.setInt(3, nguyenLieu.getDonGiaNguyenLieu());
                  prep.setBoolean(4, nguyenLieu.getTrangThaiNguyenLieu());
                  prep.setString(5, nguyenLieu.getMaNguyenLieu());
                  
                  if (prep.executeUpdate() > 0) {
                        result = true;
                  }
                  JDBCUtil.closeConnection(c);
            } catch (SQLException ex) {
                  System.err.println(ex.getMessage());
            }
            return result;
      }
      
}
