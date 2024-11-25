package DAO;

import java.sql.Connection;
import java.util.Date;
import java.util.Locale;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import DTO.PhieuNhapDTO;
import Util.JDBCUtil;
import Util.*;

import java.sql.Statement;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;

public class PhieuNhapDAO {

    public PhieuNhapDAO() {
    }

    // Hàm này trả về một danh sách các mảng Object[], mỗi mảng Object[] chứa thông tin của một phiếu nhập
    public ArrayList<Object[]> getDataFromDatabase() {
        ArrayList<Object[]> data = new ArrayList<>();
        try (Connection c = JDBCUtil.getConnection()) {
            Statement stmt = c.createStatement();
            
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


    ///////tìm kiếm phiếu nhập theo ngày và giá
    public ArrayList<Object[]> searchPhieuNhap(Date tuNgay, Date denNgay, Integer giaTu, Integer giaDen) {
        ArrayList<Object[]> data = new ArrayList<>();
        StringBuilder sql = new StringBuilder("SELECT MaPhieuNhap, NgayLapPhieuNhap, TongTienPhieuNhap, MaNhanVien, MaNhaCungCap FROM PhieuNhap WHERE 1=1");
    
        // Thêm điều kiện động dựa trên các tham số không null
        if (tuNgay != null) {
            sql.append(" AND NgayLapPhieuNhap >= ?");
        }
        if (denNgay != null) {
            sql.append(" AND NgayLapPhieuNhap <= ?");
        }
        if (giaTu != null) {
            sql.append(" AND TongTienPhieuNhap >= ?");
        }
        if (giaDen != null) {
            sql.append(" AND TongTienPhieuNhap <= ?");
        }
    
        sql.append(" ORDER BY CAST(SUBSTRING(MaPhieuNhap, 3, LEN(MaPhieuNhap) - 2) AS INT) DESC");
    
        try (Connection c = JDBCUtil.getConnection();
             PreparedStatement pstmt = c.prepareStatement(sql.toString())) {
    
            int paramIndex = 1;
            if (tuNgay != null) {
                pstmt.setDate(paramIndex++, new java.sql.Date(tuNgay.getTime()));
            }
            if (denNgay != null) {
                pstmt.setDate(paramIndex++, new java.sql.Date(denNgay.getTime()));
            }
            if (giaTu != null) {
                pstmt.setInt(paramIndex++, giaTu);
            }
            if (giaDen != null) {
                pstmt.setInt(paramIndex, giaDen);
            }
    
            ResultSet rs = pstmt.executeQuery();
            SimpleDateFormat ngayThangNam = new SimpleDateFormat("dd-MM-yyyy");
            Locale locale = new Locale.Builder().setLanguage("vi").setRegion("VN").build();
            NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);



            while (rs.next()) {
                String maPhieuNhap = rs.getString("MaPhieuNhap");
                Date ngayLapPhieuNhap = rs.getDate("NgayLapPhieuNhap");
                String ngayLapPhieuNhapStr = ngayThangNam.format(ngayLapPhieuNhap);
                int tongTienPhieuNhap = rs.getInt("TongTienPhieuNhap");
                String tongTienPhieuNhapStr = numberFormat.format(tongTienPhieuNhap) + "đ";
                String maNhanVien = rs.getString("MaNhanVien");
                String maNhaCungCap = rs.getString("MaNhaCungCap");
                data.add(new Object[]{maPhieuNhap, ngayLapPhieuNhapStr, tongTienPhieuNhapStr, maNhanVien, maNhaCungCap});
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
    
    
}
