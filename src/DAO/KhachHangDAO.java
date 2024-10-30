package DAO;

import DTO.KhachHangDTO;
import Util.JDBCUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class KhachHangDAO {

    public List<KhachHangDTO> getDanhSachKhachHang() {
        try (Connection connection = JDBCUtil.getConnection();
             PreparedStatement stmt = connection.prepareStatement("SELECT * FROM KhachHang")) {
            ResultSet rs = stmt.executeQuery();
            List<KhachHangDTO> listKH = new ArrayList<>();
            while (rs.next()) {
                KhachHangDTO kh = new KhachHangDTO(
                        rs.getString("MaKhachHang"),
                        rs.getString("TenKhachHang"),
                        rs.getDate("NgaySinhKhachHang"), 
                        rs.getString("GioiTinhKhachHang"),
                        rs.getString("SoDienThoaiKhachHang"),
                        rs.getInt("ChiTieuKhachHang"),
                        rs.getString("MaUuDai")
                );
                listKH.add(kh);
            }
            return listKH;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean themKhachHang(KhachHangDTO kh) {
        try (Connection connection = JDBCUtil.getConnection();
             PreparedStatement stmt = connection.prepareStatement(
                     "INSERT INTO KhachHang (MaKhachHang, TenKhachHang, NgaySinhKhachHang, GioiTinhKhachHang, SoDienThoaiKhachHang, ChiTieuKhachHang, MaUuDai) VALUES (?, ?, ?, ?, ?, ?, ?)")) {
            stmt.setString(1, kh.getMaKhachHang());
            stmt.setString(2, kh.getTenKhachHang());
            stmt.setDate(3, new java.sql.Date(kh.getNgaySinhKhachHang().getTime())); 
            stmt.setString(4, kh.getGioiTinhKhachHang());
            stmt.setString(5, kh.getSoDienThoaiKhachHang());
            stmt.setInt(6, kh.getChiTieuKhachHang());
            stmt.setString(7, kh.getMaUuDai());
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateInfoKhachHang(KhachHangDTO kh) {
        try (Connection connection = JDBCUtil.getConnection();
             PreparedStatement stmt = connection.prepareStatement(
                     "UPDATE KhachHang SET TenKhachHang = ?, NgaySinhKhachHang = ?, GioiTinhKhachHang = ?, SoDienThoaiKhachHang = ?, ChiTieuKhachHang = ?, MaUuDai = ? WHERE MaKhachHang = ?")) {
            stmt.setString(1, kh.getTenKhachHang());
            stmt.setDate(2, new java.sql.Date(kh.getNgaySinhKhachHang().getTime()));
            stmt.setString(3, kh.getGioiTinhKhachHang());
            stmt.setString(4, kh.getSoDienThoaiKhachHang());
            stmt.setInt(5, kh.getChiTieuKhachHang());
            stmt.setString(6, kh.getMaUuDai());
            stmt.setString(7, kh.getMaKhachHang());
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deleteKhachHang(String maKH) {
        try (Connection connection = JDBCUtil.getConnection();
             PreparedStatement stmt = connection.prepareStatement("DELETE FROM KhachHang WHERE MaKhachHang = ?")) {
            stmt.setString(1, maKH);
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public KhachHangDTO getKhachHangByMaKH(String maKH) {
        try (Connection connection = JDBCUtil.getConnection();
             PreparedStatement stmt = connection.prepareStatement("SELECT * FROM KhachHang WHERE MaKhachHang = ?")) {
            stmt.setString(1, maKH);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                KhachHangDTO kh = new KhachHangDTO(
                        rs.getString("MaKhachHang"),
                        rs.getString("TenKhachHang"),
                        rs.getDate("NgaySinhKhachHang"),
                        rs.getString("GioiTinhKhachHang"),
                        rs.getString("SoDienThoaiKhachHang"),
                        rs.getInt("ChiTieuKhachHang"),
                        rs.getString("MaUuDai")
                );
                return kh;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

//    public String layMaKhachHangCuoiCung() {
//        String maKH = "";
//        try (Connection connection = JDBCUtil.getConnection();
//             PreparedStatement stmt = connection.prepareStatement("SELECT TOP 1 MaKhachHang FROM KhachHang ORDER BY MaKhachHang DESC")) {
//            ResultSet rs = stmt.executeQuery();
//            if (rs.next()) {
//                maKH = rs.getString("MaKhachHang");
//                int maKHInt = Integer.parseInt(maKH.substring(2)) + 1;
//                if (maKHInt < 10) {
//                    maKH = "KH00" + maKHInt;
//                } else if (10 <= maKHInt && maKHInt < 100) {
//                    maKH = "KH0" + maKHInt;
//                } else {
//                    maKH = "KH" + maKHInt;
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return maKH;
//    }
}