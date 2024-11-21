package DAO;

import DTO.KhuyenMaiDTO;
import Util.JDBCUtil;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Nguyen Khoi
 */
public class n7_KhuyenMaiDAO {

    public static n7_KhuyenMaiDAO getInstance() {
        return new n7_KhuyenMaiDAO();
    }

    public ArrayList<KhuyenMaiDTO> getListKhuyenMai() {
        ArrayList<KhuyenMaiDTO> dskm = new ArrayList<>();
        try {
            String sql = "SELECT * FROM KhuyenMai ORDER BY MaKhuyenMai DESC";
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                KhuyenMaiDTO km = new KhuyenMaiDTO(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getDate(3),
                        rs.getDate(4),
                        rs.getFloat(5),
                        rs.getInt(6));
                dskm.add(km);
            }
        } catch (SQLException ex) {
            return null;
        }
        return dskm;
    }

    public KhuyenMaiDTO getKhuyenMaiById(String maKM) {
        KhuyenMaiDTO km = null;
        try {
            Connection connection = JDBCUtil.getConnection();
            String sql = "SELECT * FROM KhuyenMai WHERE MaKhuyenMai = ?";
            PreparedStatement pre = connection.prepareStatement(sql);
            pre.setString(1, maKM);

            ResultSet rs = pre.executeQuery();

            if (rs.next()) {
                km = new KhuyenMaiDTO(); // Khởi tạo đối tượng khi có kết quả
                km.setMaKhuyenMai(rs.getString("MaKhuyenMai"));
                km.setTenKhuyenMai(rs.getString("TenKhuyenMai"));
                km.setNgayBatDauKhuyenMai(rs.getDate("NgayBatDauKhuyenMai"));
                km.setNgayKetThucKhuyenMai(rs.getDate("NgayKetThucKhuyenMai"));
                km.setPhanTramKhuyenMai(rs.getFloat("PhanTramKhuyenMai"));
                km.setDieuKienKhuyenMai(rs.getInt("DieuKienKhuyenMai"));
            }
        } catch (SQLException e) {
            e.printStackTrace(); // In lỗi để dễ dàng kiểm tra
        }
        return km;
    }

    public ArrayList<KhuyenMaiDTO> getListKhuyenMai_theoTen(String ten) {
        ArrayList<KhuyenMaiDTO> dskm = new ArrayList<>();
        try {
            String sql = "SELECT * FROM KhuyenMai where TenKhuyenMai like ? ORDER BY MaKhuyenMai DESC";
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1,"%" + ten + "%");
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                KhuyenMaiDTO km = new KhuyenMaiDTO(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getDate(3),
                        rs.getDate(4),
                        rs.getFloat(5),
                        rs.getInt(6));
                dskm.add(km);
            }
        } catch (SQLException ex) {
            return null;
        }
        return dskm;
    }

    public String taoMaKhuyenMai() {
        String Ma = "";
        try {
            Connection c = JDBCUtil.getConnection();
            Statement st = c.createStatement();
            String sql = "SELECT COUNT(*) AS total FROM KhuyenMai";
            ResultSet rs = st.executeQuery(sql);

            int num = 0;
            if (rs.next()) {
                num = rs.getInt("total") + 1;
            }

            if (num < 10 && num > 0) {
                Ma = "KM00" + num;
            } else if (num < 100 && num > 9) {
                Ma = "KM0" + num;
            } else if (num >= 100) {
                Ma = "KM" + num;
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Tạo mã khuyến mãi thất bại (DAO)");
        }
        return Ma;
    }

    public boolean insert_khuyenMai(KhuyenMaiDTO dto) {
        String sql = "INSERT INTO KhuyenMai\n"
                + "           (MaKhuyenMai\n"
                + "           ,TenKhuyenMai\n"
                + "           ,NgayBatDauKhuyenMai\n"
                + "           ,NgayKetThucKhuyenMai\n"
                + "           ,PhanTramKhuyenMai\n"
                + "           ,DieuKienKhuyenMai)\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?)";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);

            st.setString(1, dto.getMaKhuyenMai());
            st.setString(2, dto.getTenKhuyenMai());
            st.setDate(3, (Date) dto.getNgayBatDauKhuyenMai());
            st.setDate(4, (Date) dto.getNgayKetThucKhuyenMai());
            st.setFloat(5, dto.getPhanTramKhuyenMai());
            st.setInt(6, dto.getDieuKienKhuyenMai());

            st.executeUpdate();
            System.out.println("Tạo khuyến mãi thành công (DAO)");
            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("Trùng mã khuyến mãi (DAO) !");
            return false;
        }
        return true;
    }

    public boolean update_khuyenMai(KhuyenMaiDTO dto) {
        String sql = "UPDATE KhuyenMai\n"
                + "   SET TenKhuyenMai = ?\n,"
                + "   NgayBatDauKhuyenMai = ?\n,"
                + "   NgayKetThucKhuyenMai = ?\n,"
                + "   PhanTramKhuyenMai = ?\n,"
                + "   DieuKienKhuyenMai = ?\n"
                + " WHERE MaKhuyenMai = ?";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);

            st.setString(1, dto.getTenKhuyenMai());
            st.setDate(2, (Date) dto.getNgayBatDauKhuyenMai());
            st.setDate(3, (Date) dto.getNgayKetThucKhuyenMai());
            st.setFloat(4, dto.getPhanTramKhuyenMai());
            st.setInt(5, dto.getDieuKienKhuyenMai());
            st.setString(6, dto.getMaKhuyenMai());

            int kq = st.executeUpdate();
            JDBCUtil.closeConnection(c);
            if (kq == 0) {
                System.out.println("Sửa thất khuyến mãi ! (DAO)");
                return false;

            } else {
                System.out.println("Sửa thành công khuyến mãi (DAO) !");
                return true;
            }
        } catch (SQLException e) {
//            System.out.println(e);
            System.out.println("Sửa thất bại khuyến mãi, mã khuyến mãi không tồn tại (DAO) !");
            return false;
        }
    }

    public static void main(String[] args) {
//        Date ngay = Date.valueOf("2024-11-19");
//        Date end = Date.valueOf("2025-11-19");

                ArrayList<KhuyenMaiDTO> list = n7_KhuyenMaiDAO.getInstance().getListKhuyenMai_theoTen("u");
                for (KhuyenMaiDTO a : list) {
                    System.out.println(a.toString());
                }
        //        System.out.println(n7_KhuyenMaiDAO.getInstance().taoMaKhuyenMai());
//        KhuyenMaiDTO dto = new KhuyenMaiDTO("KM007", "KM kết thúc năm", ngay, end, 50, 5000000);
//        n7_KhuyenMaiDAO.getInstance().insert(dto);
//        n7_KhuyenMaiDAO.getInstance().update(dto);
//        System.out.println(new java.sql.Date((new java.util.Date()).getTime()));

    }
}
