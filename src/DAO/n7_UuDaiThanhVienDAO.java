package DAO;

import DTO.UuDaiThanhVienDTO;
import Util.JDBCUtil;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Nguyen Khoi
 */
public class n7_UuDaiThanhVienDAO {

    public static n7_UuDaiThanhVienDAO getInstance() {
        return new n7_UuDaiThanhVienDAO();
    }

    public ArrayList<UuDaiThanhVienDTO> getListUuDai() {
        ArrayList<UuDaiThanhVienDTO> dskm = new ArrayList<>();
        try {
            String sql = "SELECT * FROM UuDaiThanhVien ORDER BY MaUuDai DESC";
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                UuDaiThanhVienDTO km = new UuDaiThanhVienDTO(
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

    public ArrayList<UuDaiThanhVienDTO> search(UuDaiThanhVienDTO dto) {
        ArrayList<UuDaiThanhVienDTO> dskm = new ArrayList<>();
        try {
            // Câu SQL cơ bản
            String sql = "SELECT * FROM UuDaiThanhVien WHERE MaUuDai LIKE ? AND TenUuDai LIKE ?";

            // Danh sách tham số cho PreparedStatement
            ArrayList<Object> params = new ArrayList<>();
            params.add("%" + dto.getMaUuDai() + "%");
            params.add("%" + dto.getTenUuDai() + "%");

            // Xử lý ngày bắt đầu
            if (dto.getNgayBatDauUuDai() != null) {
                if (!dto.getNgayBatDauUuDai().toString().equals("1900-01-01")) {
                    sql += " AND NgayBatDauUuDai >= ?";
                    params.add(dto.getNgayBatDauUuDai());
                } else {
                    // Nếu ngày bắt đầu là 1900-01-01, lấy từ ngày nhỏ nhất trong hệ thống
                    sql += " AND NgayBatDauUuDai >= (SELECT MIN(NgayBatDauUuDai) FROM UuDaiThanhVien)";
                }
            }

            // Xử lý ngày kết thúc
            if (dto.getNgayKetThucUuDai() != null) {
                if (!dto.getNgayKetThucUuDai().toString().equals("1900-01-01")) {
                    sql += " AND NgayKetThucUuDai <= ?";
                    params.add(dto.getNgayKetThucUuDai());
                } else {
                    // Nếu ngày kết thúc là 1900-01-01, lấy đến ngày lớn nhất trong hệ thống
                    sql += " AND NgayKetThucUuDai <= (SELECT MAX(NgayKetThucUuDai) FROM UuDaiThanhVien)";
                }
            }

            if (dto.getPhanTramUuDai() != -1) {
                sql += " AND PhanTramUuDai = ?";
                params.add(dto.getPhanTramUuDai());
            }

            if (dto.getDieuKienUuDai() != -1) {
                sql += " AND DieuKienUuDai = ?";
                params.add(dto.getDieuKienUuDai());
            }

            sql += " ORDER BY MaUuDai DESC";

            // Kết nối và thực thi
            Connection c = JDBCUtil.getConnection();
            PreparedStatement pre = c.prepareStatement(sql);

            // Gán tham số
            for (int i = 0; i < params.size(); i++) {
                if (params.get(i) instanceof java.util.Date) {
                    pre.setDate(i + 1, new java.sql.Date(((java.util.Date) params.get(i)).getTime()));
                } else {
                    pre.setObject(i + 1, params.get(i));
                }
            }

            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                UuDaiThanhVienDTO km = new UuDaiThanhVienDTO(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getDate(3),
                        rs.getDate(4),
                        rs.getFloat(5),
                        rs.getInt(6));
                dskm.add(km);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
        return dskm;
    }

    public UuDaiThanhVienDTO getUuDaiById(String maKM) {
        UuDaiThanhVienDTO km = null;
        try {
            Connection connection = JDBCUtil.getConnection();
            String sql = "SELECT * FROM UuDaiThanhVien WHERE MaUuDai = ?";
            PreparedStatement pre = connection.prepareStatement(sql);
            pre.setString(1, maKM);

            ResultSet rs = pre.executeQuery();

            if (rs.next()) {
                km = new UuDaiThanhVienDTO(); // Khởi tạo đối tượng khi có kết quả
                km.setMaUuDai(rs.getString("MaUuDai"));
                km.setTenUuDai(rs.getString("TenUuDai"));
                km.setNgayBatDauUuDai(rs.getDate("NgayBatDauUuDai"));
                km.setNgayKetThucUuDai(rs.getDate("NgayKetThucUuDai"));
                km.setPhanTramUuDai(rs.getFloat("PhanTramUuDai"));
                km.setDieuKienUuDai(rs.getInt("DieuKienUuDai"));
            }
        } catch (SQLException e) {
            e.printStackTrace(); // In lỗi để dễ dàng kiểm tra
        }
        return km;
    }

    public ArrayList<UuDaiThanhVienDTO> getListUuDai_theoTen(String ten) {
        ArrayList<UuDaiThanhVienDTO> dskm = new ArrayList<>();
        try {
            String sql = "SELECT * FROM UuDaiThanhVien where TenUuDai like ? ORDER BY MaUuDai DESC";
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, "%" + ten + "%");
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                UuDaiThanhVienDTO km = new UuDaiThanhVienDTO(
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
    
    public ArrayList<UuDaiThanhVienDTO> getListUuDai_theoMa(String ten) {
        ArrayList<UuDaiThanhVienDTO> dskm = new ArrayList<>();
        try {
            String sql = "SELECT * FROM UuDaiThanhVien where MaUuDai like ? ORDER BY MaUuDai DESC";
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, "%" + ten + "%");
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                UuDaiThanhVienDTO km = new UuDaiThanhVienDTO(
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

    public String taoMaUuDai() {
        String Ma = "";
        try {
            Connection c = JDBCUtil.getConnection();
            Statement st = c.createStatement();
            String sql = "SELECT COUNT(*) AS total FROM UuDaiThanhVien";
            ResultSet rs = st.executeQuery(sql);

            int num = 0;
            if (rs.next()) {
                num = rs.getInt("total") + 1;
            }

            if (num < 10 && num > 0) {
                Ma = "UD00" + num;
            } else if (num < 100 && num > 9) {
                Ma = "UD0" + num;
            } else if (num >= 100) {
                Ma = "UD" + num;
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Tạo mã khuyến mãi thất bại (DAO)");
        }
        return Ma;
    }

    public boolean insert_uuDai(UuDaiThanhVienDTO dto) {
        String sql = "INSERT INTO UuDaiThanhVien\n"
                + "           (MaUuDai\n"
                + "           ,TenUuDai\n"
                + "           ,NgayBatDauUuDai\n"
                + "           ,NgayKetThucUuDai\n"
                + "           ,PhanTramUuDai\n"
                + "           ,DieuKienUuDai)\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?)";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);

            st.setString(1, dto.getMaUuDai());
            st.setString(2, dto.getTenUuDai());
            st.setDate(3, (Date) dto.getNgayBatDauUuDai());
            st.setDate(4, (Date) dto.getNgayKetThucUuDai());
            st.setFloat(5, dto.getPhanTramUuDai());
            st.setInt(6, dto.getDieuKienUuDai());

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

    public boolean update_uuDai(UuDaiThanhVienDTO dto) {
        String sql = "UPDATE UuDaiThanhVien\n"
                + "   SET TenUuDai = ?\n,"
                + "   NgayBatDauUuDai = ?\n,"
                + "   NgayKetThucUuDai = ?\n,"
                + "   PhanTramUuDai = ?\n,"
                + "   DieuKienUuDai = ?\n"
                + " WHERE MaUuDai = ?";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);

            st.setString(1, dto.getTenUuDai());
            st.setDate(2, (Date) dto.getNgayBatDauUuDai());
            st.setDate(3, (Date) dto.getNgayKetThucUuDai());
            st.setFloat(4, dto.getPhanTramUuDai());
            st.setInt(5, dto.getDieuKienUuDai());
            st.setString(6, dto.getMaUuDai());

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
        n7_UuDaiThanhVienDAO.getInstance().getListUuDai();
        ArrayList<UuDaiThanhVienDTO> list = n7_UuDaiThanhVienDAO.getInstance().getListUuDai();
        for (UuDaiThanhVienDTO a : list) {
            System.out.println(a.toString());
        }
    }
}
