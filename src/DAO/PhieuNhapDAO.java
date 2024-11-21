package DAO;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import DTO.PhieuNhapDTO;
import Util.JDBCUtil;
import Util.*;

import java.sql.Statement;

public class PhieuNhapDAO {

    public PhieuNhapDAO() {
    }

    // Hàm này trả về một danh sách các mảng Object[], mỗi mảng Object[] chứa thông tin của một phiếu nhập
    public ArrayList<Object[]> getDataFromDatabase() {
        ArrayList<Object[]> data = new ArrayList<>();
        try (Connection c = JDBCUtil.getConnection()) {
            Statement stmt = c.createStatement();
            // String sql = "SELECT MaPhieuNhap, NgayLapPhieuNhap, TongTienPhieuNhap, MaNhanVien, MaNhaCungCap FROM PhieuNhap";
            
            String sql = "SELECT MaPhieuNhap, NgayLapPhieuNhap, TongTienPhieuNhap, MaNhanVien, MaNhaCungCap " +
                         "FROM PhieuNhap " +
                         "ORDER BY CAST(SUBSTRING(MaPhieuNhap, 3, LEN(MaPhieuNhap) - 2) AS INT) DESC";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String maPhieuNhap = rs.getString("MaPhieuNhap");
                Date ngayLapPhieuNhap = rs.getDate("NgayLapPhieuNhap");
                int tongTienPhieuNhap = rs.getInt("TongTienPhieuNhap");
                String maNhanVien = rs.getString("MaNhanVien");
                String maNhaCungCap = rs.getString("MaNhaCungCap");
                data.add(new Object[]{maPhieuNhap, ngayLapPhieuNhap, tongTienPhieuNhap, maNhanVien, maNhaCungCap});
                System.out.println("maPhieuNhap: " + maPhieuNhap);
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
    // Hàm này trả về thông tin chi tiết phiếu nhập của một phiếu nhập
    public ArrayList<Object[]> getChiTietPhieuNhap(String maPhieuNhap) {
        ArrayList<Object[]> data = new ArrayList<>();
        try (Connection c = JDBCUtil.getConnection()) {
            Statement stmt = c.createStatement();
            String sql = "SELECT ct.MaNguyenLieu, nl.TenNguyenLieu, ct.KhoiLuong, ct.DonGia, ct.ThanhTien " +
                         "FROM ChiTietPhieuNhap ct " +
                         "JOIN NguyenLieu nl ON ct.MaNguyenLieu = nl.MaNguyenLieu " +
                         "WHERE ct.MaPhieuNhap = '" + maPhieuNhap + "'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String maNguyenLieu = rs.getString("MaNguyenLieu");
                String tenNguyenLieu = rs.getString("TenNguyenLieu");
                double khoiLuong = rs.getDouble("KhoiLuong");
                int donGia = rs.getInt("DonGia");
                int thanhTien = rs.getInt("ThanhTien");
                data.add(new Object[]{maNguyenLieu, tenNguyenLieu, khoiLuong, donGia, thanhTien});
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    public ArrayList<Object[]> searchPhieuNhapByMa(String maPhieuNhap) {
        ArrayList<Object[]> data = new ArrayList<>();
        try (Connection c = JDBCUtil.getConnection()) {
            Statement stmt = c.createStatement();
            String sql = "SELECT MaPhieuNhap, NgayLapPhieuNhap, TongTienPhieuNhap, MaNhanVien, MaNhaCungCap " +
                         "FROM PhieuNhap " +
                         "WHERE MaPhieuNhap LIKE '%" + maPhieuNhap + "%' " +
                         "ORDER BY CAST(SUBSTRING(MaPhieuNhap, 3, LEN(MaPhieuNhap) - 2) AS INT) DESC";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String maPhieuNhapResult = rs.getString("MaPhieuNhap");
                Date ngayLapPhieuNhap = rs.getDate("NgayLapPhieuNhap");
                int tongTienPhieuNhap = rs.getInt("TongTienPhieuNhap");
                String maNhanVien = rs.getString("MaNhanVien");
                String maNhaCungCap = rs.getString("MaNhaCungCap");
                data.add(new Object[]{maPhieuNhapResult, ngayLapPhieuNhap, tongTienPhieuNhap, maNhanVien, maNhaCungCap});
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }


    public ArrayList<PhieuNhapDTO> searchPhieuNhapByNgayVaGia(Date tuNgay, Date denNgay, int giaTu, int giaDen) {
        ArrayList<PhieuNhapDTO> data = new ArrayList<>();
        try (Connection c = JDBCUtil.getConnection()) {
            String sql = "SELECT MaPhieuNhap, NgayLapPhieuNhap, TongTienPhieuNhap, MaNhanVien, MaNhaCungCap " +
                         "FROM PhieuNhap " +
                         "WHERE NgayLapPhieuNhap BETWEEN ? AND ? " +
                         "AND TongTienPhieuNhap BETWEEN ? AND ?";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setDate(1, new java.sql.Date(tuNgay.getTime()));
            stmt.setDate(2, new java.sql.Date(denNgay.getTime()));
            stmt.setInt(3, giaTu);
            stmt.setInt(4, giaDen);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                PhieuNhapDTO pn = new PhieuNhapDTO();
                pn.setMaPhieuNhap(rs.getString("MaPhieuNhap"));
                pn.setNgayLapPhieuNhap(rs.getDate("NgayLapPhieuNhap"));
                pn.setTongTienPhieuNhap(rs.getInt("TongTienPhieuNhap"));
                pn.setMaNhanVien(rs.getString("MaNhanVien"));
                pn.setMaNhaCungCap(rs.getString("MaNhaCungCap"));
                data.add(pn);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return data;
    }
}
