package DAO;

import DTO.CaLamDTO;
import DTO.LichLamDTO;
import java.sql.PreparedStatement;
import java.sql.*;
import Util.JDBCUtil;
import java.util.ArrayList;

public class n6_LichLamDAO {

    public static n6_LichLamDAO getInstance() {
        return new n6_LichLamDAO();
    }

    public ArrayList<String> danh_sach_nv() {
        ArrayList<String> list = new ArrayList<>();
        String sql = "select MaNhanVien from NhanVien";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String MaNhanVien = rs.getString("MaNhanVien");
                list.add(MaNhanVien);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public boolean tao_LichLam_TheoNgay(Date ngayLam) {
        ArrayList<String> list = danh_sach_nv();
        for (String nv : list) {
            System.out.println(nv);

            String sql = "IF NOT EXISTS (\n"
                    + "    SELECT *\n"
                    + "    FROM LichLam\n"
                    + "    WHERE MaNhanVien = ? AND NgayLam = ?\n"
                    + ")\n"
                    + "BEGIN\n"
                    + "    INSERT INTO LichLam (MaCaLam, MaNhanVien, NgayLam)\n"
                    + "    VALUES (?, ?, ?);\n"
                    + "END";

            try {
                Connection c = JDBCUtil.getConnection();
                PreparedStatement st = c.prepareStatement(sql);

                st.setString(1, nv);
                st.setDate(2, ngayLam);
                st.setString(3, "CL000");
                st.setString(4, nv);
                st.setDate(5, ngayLam);

                st.executeUpdate();
                System.out.println("Tạo lịch làm thành công (DAO)");
                JDBCUtil.closeConnection(c);
            } catch (SQLException ex) {
                System.out.println(ex);
                return false;
            }
        }
        return true;
    }

    public boolean update(LichLamDTO lichLam) {
        String sql = "UPDATE LichLam\n"
                + "   SET MaCaLam = ?\n"
                + " WHERE MaNhanVien = ? and NgayLam = ?";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);

            st.setString(1, lichLam.getMaCaLam());
            st.setString(2, lichLam.getMaNhanVien());
            st.setDate(3, lichLam.getNgayLam());
            int kq = st.executeUpdate();
            JDBCUtil.closeConnection(c);
            if (kq == 0) {
                System.out.println("Sửa thất bại lịch làm! (DAO)");
                return false;

            } else {
                System.out.println("Sửa thành công lịch làm (DAO) !");
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("Sửa thất bại lịch làm, lịch làm không tồn tại (DAO) !");
            return false;
        }
    }

    public boolean delete(LichLamDTO lichLam) {
        String sql = "UPDATE LichLam\n"
                + "   SET MaCaLam = ?\n"
                + " WHERE MaNhanVien = ? and NgayLam = ?";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);

            st.setString(1, "CL000");
            st.setString(2, lichLam.getMaNhanVien());
            st.setDate(3, lichLam.getNgayLam());
            int kq = st.executeUpdate();
            JDBCUtil.closeConnection(c);
            if (kq == 0) {
                System.out.println("Sửa thất bại lịch làm! (DAO)");
                return false;

            } else {
                System.out.println("Sửa thành công lịch làm (DAO) !");
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("Sửa thất bại lịch làm, lịch làm không tồn tại (DAO) !");
            return false;
        }
    }

    public ArrayList<LichLamDTO> showAll() {
        ArrayList<LichLamDTO> list = new ArrayList<>();
        String sql = "SELECT *\n"
                + "  FROM LichLam";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                LichLamDTO lichLam = new LichLamDTO(rs.getString("MaCaLam"), rs.getString("MaNhanVien"),
                        rs.getDate("NgayLam"));
                list.add(lichLam);
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("Không lấy được dữ liệu tất các lịch làm (DAO)");
        }
        return list;
    }

    public static void main(String args[]) {
        n6_LichLamDAO ca_DAO = new n6_LichLamDAO().getInstance();
//        ca_DAO.tao_LichLam_TheoNgay(Date.valueOf("2024-10-21"));
//        // update
//        LichLamDTO lichLamDTO = new LichLamDTO("CL001", "NV001", Date.valueOf("2024-10-21"));
//        ca_DAO.update(lichLamDTO);
        
//        // delete
//        LichLamDTO lichLamDTO_delete = new LichLamDTO("CL001", "NV001", Date.valueOf("2024-10-21"));
//        ca_DAO.delete(lichLamDTO_delete);
        
        // show all
        System.out.println("Danh sách lịch làm ngày ");
        ArrayList<LichLamDTO> list = ca_DAO.showAll();
        for (LichLamDTO lich : list) {
            System.out.println(lich.toString());
        }
    }
}
