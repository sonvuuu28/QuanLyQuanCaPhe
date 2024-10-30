package DAO;

import Util.JDBCUtil;
import DTO.TaiKhoanDTO;

import java.sql.*;

public class n0_LoginDAO {

    public TaiKhoanDTO checkLogin(String username, String password) {
        TaiKhoanDTO account = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * from TaiKhoan WHERE TenDangNhap = ? AND MatKhau = ? and TrangThaiTaiKhoan = 1";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, username);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String maTaiKhoan = rs.getString("MaTaiKhoan");
                String tenDangNhap = rs.getString("TenDangNhap");
                String matKhau = rs.getString("MatKhau");
                String maPhanQuyen = rs.getString("MaPhanQuyen");
                String maNhanVien = rs.getString("MaNhanVien");
                boolean trangThaiTaiKhoan = rs.getBoolean("TrangThaiTaiKhoan");
                account = new TaiKhoanDTO(maTaiKhoan, tenDangNhap, matKhau, maPhanQuyen, maNhanVien, trangThaiTaiKhoan);
            }
            rs.close();
            pst.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return account;
    }

    public static void main(String[] args) {
        n0_LoginDAO login = new n0_LoginDAO();

    }
}
