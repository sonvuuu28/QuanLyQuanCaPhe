package DAO;

import DTO.CaLamDTO;
import java.sql.PreparedStatement;
import java.sql.*;
import Util.JDBCUtil;
import java.util.ArrayList;

public class n6_CaLamDAO {

    public static n6_CaLamDAO getInstance() {
        return new n6_CaLamDAO();
    }

    public void taoMaCaLam_off() {
        String sql = "IF NOT EXISTS (\n"
                + "    SELECT MaCaLam\n"
                + "    FROM CaLam\n"
                + "    WHERE MaCaLam = 'CLOff'\n"
                + "    GROUP BY MaCaLam\n"
                + "    HAVING COUNT(*) = 0\n"
                + ")\n"
                + "BEGIN\n"
                + "    INSERT INTO CaLam (MaCaLam, TenCaLam, ThoiGianVaoCaLam, ThoiGianRaCaLam, TrangThaiCaLam)\n"
                + "    VALUES ('CL000', 'off', '00:00', '00:00', 1);\n"
                + "END";
        try {
            Connection c = JDBCUtil.getConnection();
            Statement st = c.createStatement();
            int rowsAffected = st.executeUpdate(sql);

            if (rowsAffected > 0) {
                System.out.println("Đã tạo mã ca off (DAO) ");
            } else {
                System.out.println("Mã ca off đã tồn tại (DAO)");
            }

            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Tạo mã off thất bại (DAO)");
        }
    }

    public String taoMaCaLam() {
        String MaCaLam = "";
        try {
            Connection c = JDBCUtil.getConnection();
            Statement st = c.createStatement();
            String sql = "SELECT COUNT(*) AS total FROM CaLam";
            ResultSet rs = st.executeQuery(sql);

            int num = 0;
            if (rs.next()) {
                if (rs.getInt("total") == 0) {
                    taoMaCaLam_off();
                }
                num = rs.getInt("total") + 1;
            }

            if (num < 10 && num > 0) {
                MaCaLam = "CL00" + num;
            } else if (num < 100 && num > 9) {
                MaCaLam = "CL0" + num;
            } else if (num >= 100) {
                MaCaLam = "CL" + num;
            }
            System.out.println("Tạo mã thành công (DAO): " + MaCaLam);
            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Tạo mã thất bại (DAO)");
        }
        return MaCaLam;
    }

    public boolean insert(CaLamDTO calam) {
        String sql = "INSERT INTO CaLam\n"
                + "           (MaCaLam\n"
                + "           ,TenCaLam\n"
                + "           ,ThoiGianVaoCaLam\n"
                + "           ,ThoiGianRaCalam\n"
                + "           ,TrangThaiCaLam)\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?)";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);

            st.setString(1, calam.getMaCaLam());
            st.setString(2, calam.getTenCaLam());
            st.setString(3, calam.getThoiGianVaoCaLam());
            st.setString(4, calam.getThoiGianRaCaLam());
            st.setBoolean(5, calam.getTrangThaiCaLam());

            st.executeUpdate();
            System.out.println("Tạo ca làm thành công (DAO)");
            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("Trùng mã ca làm (DAO) !");
            return false;
        }
        return true;
    }

    public boolean update(CaLamDTO calam) {
        String sql = "UPDATE CaLam\n"
                + "   SET TenCaLam = ?\n,"
                + "   ThoiGianVaoCaLam = ?\n,"
                + "   ThoiGianRaCaLam = ?\n"
                + " WHERE MaCaLam = ?";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);

            st.setString(1, calam.getTenCaLam());
            st.setString(2, calam.getThoiGianVaoCaLam());
            st.setString(3, calam.getThoiGianRaCaLam());
            st.setString(4, calam.getMaCaLam());
            int kq = st.executeUpdate();
            JDBCUtil.closeConnection(c);
            if (kq == 0) {
                System.out.println("Sửa thất bại ca làm! (DAO)");
                return false;

            } else {
                System.out.println("Sửa thành công ca làm (DAO) !");
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("Sửa thất bại ca làm, mã ca không tồn tại (DAO) !");
            return false;
        }
    }

    public boolean delete(CaLamDTO calam) {
        String sql = "UPDATE CaLam\n"
                + "   SET TrangThaiCaLam = ?\n"
                + " WHERE MaCaLam = ?";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);

            st.setString(1, "0");
            st.setString(2, calam.getMaCaLam());
            int kq = st.executeUpdate();
            JDBCUtil.closeConnection(c);
            if (kq == 0) {
                System.out.println("Xóa thất bại ca làm, mã ca không tồn tại (DAO)");
                return false;

            } else {
                System.out.println("Xóa thành công ca làm (DAO) !");
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("Xóa thất bại ca làm, mã ca không tồn tại (DAO) !");
            return false;
        }
    }

    public ArrayList<CaLamDTO> showAll() {
        ArrayList<CaLamDTO> list = new ArrayList<>();
        String sql = "SELECT *\n"
                + "  FROM CaLam where TrangThaiCaLam = 1";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                CaLamDTO calamDTO = new CaLamDTO(rs.getString("MaCaLam"), rs.getString("TenCaLam"),
                        rs.getString("ThoiGianVaoCaLam"), rs.getString("ThoiGianRaCaLam"),
                        rs.getBoolean("TrangThaiCaLam"));
                list.add(calamDTO);
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("Không lấy được dữ liệu tất các ca làm (DAO)");
        }
        return list;
    }

    public ArrayList<CaLamDTO> search(CaLamDTO calam) {
        ArrayList<CaLamDTO> list = new ArrayList<>();
        String sql = "select * from CaLam where MaCaLam like ? and TenCaLam like ? and "
                + "ThoiGianVaoCaLam like ? and ThoiGianRaCaLam like ? and TrangThaiCaLam like 1";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, "%" + calam.getMaCaLam() + "%");
            st.setString(2, "%" + calam.getTenCaLam() + "%");
            st.setString(3, "%" + calam.getThoiGianVaoCaLam() + "%");
            st.setString(4, "%" + calam.getThoiGianRaCaLam() + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                CaLamDTO calamDTO = new CaLamDTO(rs.getString("MaCaLam"), rs.getString("TenCaLam"),
                        rs.getString("ThoiGianVaoCaLam"), rs.getString("ThoiGianRaCaLam"), true);
                list.add(calamDTO);
            }
        } catch (Exception e) {
            System.out.println("Không lấy được dữ liệu cần tìm của ca làm (DAO)");
            System.out.println(e);
        }

        return list;
    }

    public static void main(String args[]) {
        n6_CaLamDAO ca_DAO = new n6_CaLamDAO().getInstance();
        // Tạo Mã tự động
        String taoMaCa = ca_DAO.taoMaCaLam();
        // insert
        CaLamDTO ca_DTO = new CaLamDTO(taoMaCa, "Ca D", "10:00", "14:00", true);
        ca_DAO.insert(ca_DTO);
        // update
//        CaLamDTO ca_DTO_update = new CaLamDTO("CL005", "Ca E1", "07:30", "10:30", true);
//        Boolean ca_DAO_update = ca_DAO.update(ca_DTO_update);
//        if (ca_DAO_update == true) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
        // delete
//        CaLamDTO ca_DTO_delete = new CaLamDTO("CL0052", "Ca E1", "07:30", "10:30", true);
//        Boolean ca_DAO_delete = ca_DAO.delete(ca_DTO_delete);
        // show dữ liệu
//        System.out.println("Danh sách ca làm");
//        ArrayList<CaLamDTO> list_CaLamDTO = ca_DAO.showAll();
//        for (CaLamDTO calam_dto : list_CaLamDTO) {
//            System.out.println(calam_dto.toString());
//        }

        //show dữ liệu tìm kiếm
        CaLamDTO ca_DTO_timKiem = new CaLamDTO("", "", "", "", true);
        System.out.println("Danh sách ca làm tìm kiếm");
        ArrayList<CaLamDTO> list_CaLamDTO = ca_DAO.search(ca_DTO_timKiem);
        for (CaLamDTO calam_dto : list_CaLamDTO) {
            System.out.println(calam_dto.toString());
        }
    }
}
