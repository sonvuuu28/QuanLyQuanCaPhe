
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Util.JDBCUtil;

public class NhapHangDAO {
    public NhapHangDAO() {
    }

    public ArrayList<Object[]> getDataFromDatabase() {
        ArrayList<Object[]> data = new ArrayList<>();
        try (Connection c = JDBCUtil.getConnection()) {
            Statement stmt = c.createStatement();
            String loadDataTable_KhoHang = "select MaNguyenLieu, TenNguyenLieu, KhoiLuongNguyenLieu from NguyenLieu";
            ResultSet rs = stmt.executeQuery(loadDataTable_KhoHang);

            while (rs.next()) {
                String maNguyenLieu = rs.getString("MaNguyenLieu");
                String tenNguyenLieu = rs.getString("TenNguyenLieu");
                double khoiLuong = rs.getDouble("KhoiLuongNguyenLieu");
                data.add(new Object[]{maNguyenLieu, tenNguyenLieu, khoiLuong});
            }

            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
   
    public ArrayList<Object[]> searchNguyenLieuByTen(String tenNguyenLieu) {
        ArrayList<Object[]> data = new ArrayList<>();
        try (Connection c = JDBCUtil.getConnection()) {
            String sql = "SELECT MaNguyenLieu, TenNguyenLieu, KhoiLuongNguyenLieu " +
                        "FROM NguyenLieu " +
                        "WHERE TenNguyenLieu LIKE ? " +
                        "ORDER BY CAST(SUBSTRING(MaNguyenLieu, 3, LEN(MaNguyenLieu) - 2) AS INT)";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, "%" + tenNguyenLieu + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String maNguyenLieu = rs.getString("MaNguyenLieu");
                String tenNguyenLieuResult = rs.getString("TenNguyenLieu");
                double khoiLuongNguyenLieu = rs.getDouble("KhoiLuongNguyenLieu");
                data.add(new Object[]{maNguyenLieu, tenNguyenLieuResult, khoiLuongNguyenLieu});
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return data;
    }
          
}
