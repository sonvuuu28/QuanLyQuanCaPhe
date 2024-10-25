package DAO;

import DTO.NhanVienDTO;
import Util.JDBCUtil;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class NhanVienDAO {

    public ArrayList<NhanVienDTO> getDanhSachNhanVien() {
        try {
            Connection connection = JDBCUtil.getConnection();
            String sql = "select * from NhanVien where TrangThaiNhanVien=1";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            ArrayList<NhanVienDTO> listNV = new ArrayList<>();
            while (rs.next()) {
                NhanVienDTO nv = new NhanVienDTO();
                nv.setMaNhanVien(rs.getString(1));
                nv.setTenNhanVien(rs.getString(2));
                nv.setGioiTinhNhanVien(rs.getString(3));
                nv.setSoDienThoaiNhanVien(rs.getString(4));
                nv.setNgaySinhNhanVien(rs.getDate(5));
                nv.setChucVuNhanVien(rs.getString(6));
                nv.setDiaChi(rs.getString(7));
                nv.setLuongNhanVien(rs.getInt(8));
                nv.setLuongNhanVien(rs.getInt(8));
                nv.setTrangThaiNhanVien(rs.getInt(0));
                listNV.add(nv);
            }
            return listNV;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public boolean updateInfoNhanVien(NhanVienDTO nv) {
        boolean ketqua = false;
        try {
            Connection connection = JDBCUtil.getConnection();

            String sql = "update NhanVien set TenNhanVien=?, GioiTinhNhanVien=?, SoDienThoaiNhanVien=?, NgaySinhNhanVien=?, ChucVuNhanVien=?, DiaChi=? LuongNhanVien=? where MaNhanVien=?";
            PreparedStatement pre = connection.prepareStatement(sql);

            pre.setString(1, nv.getTenNhanVien());
            pre.setString(2, nv.getGioiTinhNhanVien());
            pre.setString(3, nv.getSoDienThoaiNhanVien());
            pre.setDate(4, nv.getNgaySinhNhanVien());
            pre.setString(5, nv.getChucVuNhanVien());
            pre.setString(6, nv.getDiaChi());
            pre.setInt(7, nv.getLuongNhanVien());
            pre.setString(8, nv.getMaNhanVien());
            ketqua = pre.executeUpdate() > 1;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ketqua;
    }

    public boolean capNhatChucVu(NhanVienDTO nv) {
        boolean ketqua = false;
        try {
            Connection connection = JDBCUtil.getConnection();

            String sql = "update NhanVien set ChucVu=? where MaNhanVien=?";
            PreparedStatement pre = connection.prepareStatement(sql);

            pre.setString(1, nv.getChucVuNhanVien());
            pre.setString(2, nv.getMaNhanVien());
            ketqua = pre.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ketqua;
    }

    public boolean deleteNhanVien(String MaNV) {
        try {
            Connection connection = JDBCUtil.getConnection();
            String sqlKhoaTK = "update TaiKhoan set TrangThaiTaiKhoan = 0 where MaNhanVien = ?"; // khóa tài khoản của nhân viên 
            PreparedStatement preparedStatement = connection.prepareStatement(sqlKhoaTK);
            preparedStatement.setString(1, MaNV);
            int rs = preparedStatement.executeUpdate();

            String sql = "update NhanVien set TrangThaiNhanVien=? where MaNhanVien=?";
            PreparedStatement pre = connection.prepareStatement(sql);
            pre.setInt(1, 0);
            pre.setString(2, MaNV);
            pre.executeUpdate();
            int rowsAffected = pre.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public String layMaNhanVienCuoiCung() {
        String maNV = "";
        try {
            Connection connection = JDBCUtil.getConnection();
            String sql = "SELECT TOP 1 MaNhanVien FROM NhanVien ORDER BY MaNhanVien DESC";
            PreparedStatement pre = connection.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                maNV = String.valueOf(Integer.parseInt(rs.getString("MaNhanVien").substring(2)) + 1);
                if(Integer.parseInt(maNV)<10){
                    maNV = "PQ00" + maNV;
                }else if(10 <= Integer.parseInt(maNV) && Integer.parseInt(maNV)<999){
                    maNV = "PQ0" + maNV;
                }
                else
                    maNV = "PQ" + maNV;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return maNV;
    }

    public boolean themNhanVien(NhanVienDTO nv) {
        boolean ketqua = false;
        try {
            Connection connection = JDBCUtil.getConnection();

            String sql = "insert into nhanvien(MaNhanvien, TenNhanVien, GioiTinhNhanVien, SoDienThoaiNhanVien, NgaySinhNhanVien, ChucVuNhanVien, DiaChi, LuongNhanVien, TrangThaiNhanVien)  values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pre = connection.prepareStatement(sql);
            int mcc = Integer.parseInt(layMaNhanVienCuoiCung()) + 1;
            String maNV = String.valueOf(mcc);
            pre.setString(1, maNV);
            pre.setString(2, nv.getTenNhanVien());
            pre.setString(3, nv.getGioiTinhNhanVien());
            pre.setString(4, nv.getSoDienThoaiNhanVien());
            pre.setDate(5, nv.getNgaySinhNhanVien());
            pre.setString(6, nv.getChucVuNhanVien());
            pre.setString(7, nv.getDiaChi());
            pre.setInt(8, nv.getLuongNhanVien());
            pre.setInt(9, nv.getTrangThaiNhanVien());
            ketqua = pre.executeUpdate() > 1;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketqua;
    }

    public NhanVienDTO getNhanVien(String maNV) {
        NhanVienDTO nv = null;
        try {
            Connection connection = JDBCUtil.getConnection();
            String sql = "select * from NhanVien where MaNhanVien = ? and TrangThaiNhanVien=1";
            PreparedStatement pre = connection.prepareStatement(sql);
            pre.setString(1, maNV);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                nv = new NhanVienDTO();
                nv.setMaNhanVien(maNV);
                nv.setTenNhanVien(rs.getString(2));
                nv.setGioiTinhNhanVien(rs.getString(3));
                nv.setSoDienThoaiNhanVien(rs.getString(4));
                nv.setNgaySinhNhanVien(rs.getDate(5));
                nv.setChucVuNhanVien(rs.getString(6));
                nv.setDiaChi(rs.getString(7));
                nv.setLuongNhanVien(rs.getInt(8));
            }

            return nv;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public NhanVienDTO getNhanVienTheoTen(String tenNV) {
        NhanVienDTO nv = null;
        try {
            Connection connection = JDBCUtil.getConnection();
            String slq = "select * from NhanVien where TenNhanVien = ? and TrangThaiNhanVien=1";
            PreparedStatement pre = connection.prepareStatement(slq);
            pre.setString(1, tenNV);
            ResultSet rs = pre.executeQuery();

            while (rs.next()) {
                nv = new NhanVienDTO();
                nv.setMaNhanVien(rs.getString(1));
                nv.setTenNhanVien(rs.getString(2));
                nv.setGioiTinhNhanVien(rs.getString(3));
                nv.setSoDienThoaiNhanVien(rs.getString(4));
                nv.setNgaySinhNhanVien(rs.getDate(5));
                nv.setChucVuNhanVien(rs.getString(6));
                nv.setDiaChi(rs.getString(7));
                nv.setLuongNhanVien(rs.getInt(8));
            }

            return nv;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean deletaFKHoandon_PhieuNhap() {
        try {
            Connection connection = JDBCUtil.getConnection();
            String sql = "ALTER TABLE HoaDon DROP CONSTRAINT FK_MaNhanVien_HoaDon;"
                    + "ALTER TABLE PhieuNhap DROP CONSTRAINT FK_MaNhanVien_PhieuNhap;";

            PreparedStatement pre = connection.prepareStatement(sql);
            pre.executeUpdate();
            return true;

        } catch (SQLException e) {

            return false;
        }
    }

    public boolean updateFKHoandon_PhieuNhap() {
        try {
            Connection connection = JDBCUtil.getConnection();
            String sql = "ALTER TABLE HoaDon ADD CONSTRAINT FK_MaNhanVien_HoaDon FOREIGN KEY (MaNhanVien) REFERENCES NhanVien(MaNhanVien);"
                    + "ALTER TABLE PhieuNhap ADD CONSTRAINT FK_MaNhanVien_PhieuNhap FOREIGN KEY (MaNhanVien) REFERENCES NhanVien(MaNhanVien);";

            PreparedStatement pre = connection.prepareStatement(sql);
            pre.executeUpdate();

            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean xoaAllInfor() {
        try {
            Connection connection = JDBCUtil.getConnection();
            String sql = "delete from NhanVien;";

            PreparedStatement pre = connection.prepareStatement(sql);
            pre.executeUpdate();

            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean importNhanVienFromExcel(NhanVienDTO nv) {
        try {
            Connection connection = JDBCUtil.getConnection();
            String sql = "INSERT INTO NhanVien(MaNhanVien, TenNhanVien, GioiTinhNhanVien, SoDienThoaiNhanVien, NgaySinhNhanVien, ChucVuNhanVien, DiaChi, LuongNhanVien) VALUES (?, ?, ?, ?, ?, ?,?,?);";

            PreparedStatement pre = connection.prepareStatement(sql);
            pre.setString(1, nv.getMaNhanVien());
            pre.setString(2, nv.getTenNhanVien());
            pre.setString(3, nv.getGioiTinhNhanVien());
            pre.setString(4, nv.getSoDienThoaiNhanVien());
            pre.setDate(5, nv.getNgaySinhNhanVien());
            pre.setString(6, nv.getChucVuNhanVien());
            pre.setString(7, nv.getDiaChi());
            pre.setInt(8, nv.getLuongNhanVien());

            pre.executeUpdate();

            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NhanVienDAO trang_mau = new NhanVienDAO();
                System.err.println(trang_mau.layMaNhanVienCuoiCung());

            }
        });
    }
}
