package DAO;

import java.sql.Date;
import java.sql.*;
import java.util.*;

import DTO.NhanVienDTO;
import Util.JDBCUtil;

public class n0_TrangChuDAO {
      public NhanVienDTO getById(String maNhanVien) {
            NhanVienDTO account = null;
            try {
                  Connection con = JDBCUtil.getConnection();
                  String sql = "SELECT * from NhanVien WHERE MaNhanVien = ? and TrangThaiNhanVien = 1";
                  PreparedStatement pst = con.prepareStatement(sql);
                  pst.setString(1, maNhanVien);
                  ResultSet rs = pst.executeQuery();
                  if (rs.next()) {
                        String MaNhanVien = rs.getString("MaNhanVien");
                        String TenNhanVien = rs.getString("TenNhanVien");
                        String GioiTinhNhanVien = rs.getString("GioiTinhNhanVien");
                        String SoDienThoaiNhanVien = rs.getString("SoDienThoaiNhanVien");
                        Date NgaySinhNhanVien = rs.getDate("NgaySinhNhanVien");
                        String ChucVuNhanVien = rs.getString("ChucVuNhanVien");
                        String DiaChi = rs.getString("DiaChi");
                        int LuongNhanVien = rs.getInt("LuongNhanVien");
                        int TrangThaiNhanVien = rs.getInt("TrangThaiNhanVien");
                        account = new NhanVienDTO(MaNhanVien, TenNhanVien, GioiTinhNhanVien, SoDienThoaiNhanVien, NgaySinhNhanVien, ChucVuNhanVien, DiaChi, LuongNhanVien, TrangThaiNhanVien);
                  }
                  rs.close();
                  pst.close();
                  con.close();
            } catch (Exception e) {
                  e.printStackTrace();
            }
            return account;
    }
}
