package DAO;

import DTO.CaLamDTO;
import DTO.LichLamDTO;
import java.sql.PreparedStatement;
import java.sql.*;
import Util.JDBCUtil;
import Util.LichLam_CaLam;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class n6_LichLamDAO {

    public static n6_LichLamDAO getInstance() {
        return new n6_LichLamDAO();
    }

    public ArrayList<String> ds_MaNhanVien() {
        ArrayList<String> list = new ArrayList<>();
        String sql = "select MaNhanVien from NhanVien where TrangThaiNhanVien = 1";
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

    public void data_isEmpty() {
        String now = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        tao_LichLam_TheoNgay(Date.valueOf(now));
    }

    public boolean tao_LichLam_TheoNgay(Date ngayLam) {
        ArrayList<String> list = ds_MaNhanVien();
        boolean isInserted = false; // Biến theo dõi xem có dòng nào được chèn hay không
        List<Date> weekDays = Util.LichLam_CaLam.seven_Days(ngayLam);
        for (Date ngay : weekDays) {
//            System.out.println(ngay);
            for (String nv : list) {
//                System.out.println(ngay);
                String sql = "IF NOT EXISTS (\n"
                        + "    SELECT *\n"
                        + "    FROM LichLam\n"
                        + "    WHERE MaNhanVien = ? AND NgayLam = ?\n"
                        + ")\n"
                        + "BEGIN\n"
                        + "    INSERT INTO LichLam (MaCaLam, MaNhanVien, NgayLam)\n"
                        + "    VALUES (?, ?, ?);\n"
                        + "END";

                try (Connection c = JDBCUtil.getConnection(); PreparedStatement st = c.prepareStatement(sql)) {

                    st.setString(1, nv);
                    st.setDate(2, ngay);
                    st.setString(3, "CL000");
                    st.setString(4, nv);
                    st.setDate(5, ngay);

                    // Thực hiện câu lệnh
                    int rowsAffected = st.executeUpdate();
                    if (rowsAffected > 0) {
                        isInserted = true; // Nếu có dòng được chèn
//                        System.out.println("Tạo lịch làm thành công (DAO)");
                    }
                } catch (SQLException ex) {
                    System.out.println(ex);
                    return false;
                }
            }
        }

        return isInserted; // Trả về true nếu có ít nhất một dòng được chèn, false nếu không
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

    public String tim_maNhanVien_theo_TenNhanVien(String TenNhanVien) {
        String Ma = null;
        String sql = "select MaNhanVien from NhanVien where TenNhanVien = ? and TrangThaiNhanvien = 1";

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);

            st.setString(1, TenNhanVien);
            ResultSet kq = st.executeQuery();

            if (kq.next()) {
                Ma = kq.getString("MaNhanVien");
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("không tìm được mã nhân viên !");
        }

        return Ma;
    }

    public String tim_TenNhanVien_theo_MaNhanVien(String TenNhanVien) {
        String Ma = null;
        String sql = "select TenNhanVien from NhanVien where MaNhanVien = ? and TrangThaiNhanVien = 1";

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);

            st.setString(1, TenNhanVien);
            ResultSet kq = st.executeQuery();

            if (kq.next()) {
                Ma = kq.getString("TenNhanVien");
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("không tìm được mã nhân viên !");
        }

        return Ma;
    }

    public String tim_maCaLam_theo_TenCaLam(String TenCaLam) {
        String Ma = null;
        String sql = "select MaCaLam from CaLam where TenCaLam = ?";

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);

            st.setString(1, TenCaLam);
            ResultSet kq = st.executeQuery();

            if (kq.next()) {
                Ma = kq.getString("MaCaLam");
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("không tìm được mã ca làm !");
        }

        return Ma;
    }

    public ArrayList<LichLamDTO> TimKiem_theoNgay(Date Ngay) {
        ArrayList<LichLamDTO> list = new ArrayList<>();

        List<Date> tuan = LichLam_CaLam.DauTuan_CuoiTuan(Ngay);
        String sql = "select * from LichLam where NgayLam between ? and ?";

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);

            st.setDate(1, tuan.get(0));
            st.setDate(2, tuan.get(1));

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                LichLamDTO lichLam = new LichLamDTO(rs.getString("MaCaLam"), rs.getString("MaNhanVien"),
                        rs.getDate("NgayLam"));
                list.add(lichLam);
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("không tìm được mã ca làm !");
        }

        return list;
    }

    public ArrayList<String> combobox_TenCaLam() {
        ArrayList<String> list = new ArrayList<>();

        String sql = "select TenCaLam from CaLam where [TrangThaiCaLam] = 1";

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String Ten = rs.getString("TenCalam");
                list.add(Ten);
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("không tìm được ds ca làm !");
        }

        return list;
    }

    public ArrayList<String> combobox_TenNhanVien() {
        ArrayList<String> list = new ArrayList<>();

        String sql = "select TenNhanVien from NhanVien where [TrangThaiNhanVien] = 1";

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String Ten = rs.getString("TenNhanVien");
                list.add(Ten);
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("không tìm được ds tên nhân viên!");
        }

        return list;
    }

//    public ArrayList<String[][]> layCaLam_Tuan_theoTenNhanVien(Date ngay) {
//        ArrayList<String[][]> dsLichLam2D = new ArrayList<>();
//        List<Date> ds7ngay = Util.LichLam_CaLam.seven_Days(ngay);
//        List<String> dsMaNhanVien = ds_MaNhanVien();
//
//        String t2 = Util.LichLam_CaLam.chuyen_Date_sang_String(ds7ngay.get(0));
//        String cn = Util.LichLam_CaLam.chuyen_Date_sang_String(ds7ngay.get(ds7ngay.size() - 1));
//
//        String sql = "SELECT TenCaLam\n"
//                + "FROM \n"
//                + "    (SELECT * \n"
//                + "     FROM LichLam \n"
//                + "     WHERE NgayLam BETWEEN ? AND ? AND MaNhanVien = ?) AS t1\n"
//                + "JOIN \n"
//                + "    (SELECT MaCaLam, TenCaLam\n"
//                + "     FROM CaLam\n"
//                + "     WHERE TrangThaiCaLam = 1) AS t2\n"
//                + "ON t1.MaCaLam = t2.MaCaLam\n"
//                + "JOIN \n"
//                + "    (SELECT MaNhanVien, TenNhanVien\n"
//                + "     FROM NhanVien\n"
//                + "     WHERE TrangThaiNhanVien = 1) AS t3\n"
//                + "ON t1.MaNhanVien = t3.MaNhanVien";
//
//        for (String ma : dsMaNhanVien) {
//            data_isEmpty();
//            ArrayList<String> dsCaLam = new ArrayList<>();
//
//            // Chỉ thêm tên nhân viên nếu dsCaLam rỗng
//            if (dsCaLam.isEmpty()) {
//                String tenNV = tim_TenNhanVien_theo_MaNhanVien(ma);
//                dsCaLam.add(tenNV);
//            }
//
//            try (Connection c = JDBCUtil.getConnection(); PreparedStatement st = c.prepareStatement(sql)) {
//                // Thiết lập tham số cho câu lệnh SQL
//                st.setString(1, t2);
//                st.setString(2, cn);
//                st.setString(3, ma);
//
//                ResultSet rs = st.executeQuery();
//                while (rs.next()) {
//                    String ten = rs.getString("TenCaLam");
//                    dsCaLam.add(ten);
//                }
//
//                // Tạo mảng một chiều để lưu tên ca làm của nhân viên
//                String[] col = new String[dsCaLam.size()]; // Cộng thêm 1 để chứa tên nhân viên
////                col[0] = dsCaLam.get(0); // Gán tên nhân viên vào dòng đầu tiên
//
//                // Gán các tên ca làm vào mảng bắt đầu từ vị trí 1
//                for (int i = 0; i < dsCaLam.size(); i++) {
//                    col[i] = dsCaLam.get(i); // Gán từng phần tử vào mảng
//                }
//
//                dsLichLam2D.add(new String[][]{col}); // Thêm vào danh sách dưới dạng mảng hai chiều
//            } catch (SQLException e) {
//                System.err.println("Lỗi khi truy vấn dữ liệu: " + e.getMessage());
//            }
//        }
//
//        return dsLichLam2D;
//    }
    public ArrayList<String[][]> layCaLam_Tuan_theoTenNhanVien(Date ngay) {
        ArrayList<String[][]> dsLichLam2D = new ArrayList<>();
        List<Date> ds7ngay = Util.LichLam_CaLam.seven_Days(ngay);

        String t2 = Util.LichLam_CaLam.chuyen_Date_sang_String(ds7ngay.get(0));
        String cn = Util.LichLam_CaLam.chuyen_Date_sang_String(ds7ngay.get(ds7ngay.size() - 1));

        String sql = "SELECT t3.TenNhanVien, t2.TenCaLam\n"
                + "FROM LichLam AS t1\n"
                + "JOIN CaLam AS t2 ON t1.MaCaLam = t2.MaCaLam AND t2.TrangThaiCaLam = 1\n"
                + "JOIN NhanVien AS t3 ON t1.MaNhanVien = t3.MaNhanVien AND t3.TrangThaiNhanVien = 1\n"
                + "WHERE t1.NgayLam BETWEEN ? AND ?";

        try (Connection c = JDBCUtil.getConnection(); PreparedStatement st = c.prepareStatement(sql)) {
            st.setString(1, t2);
            st.setString(2, cn);

            ResultSet rs = st.executeQuery();

            // Sử dụng Map để lưu dữ liệu của từng nhân viên
            Map<String, List<String>> lichLamTheoNhanVien = new HashMap<>();

            while (rs.next()) {
                String tenNV = rs.getString("TenNhanVien");
                String tenCaLam = rs.getString("TenCaLam");

                lichLamTheoNhanVien.computeIfAbsent(tenNV, k -> new ArrayList<>()).add(tenCaLam);
            }

            // Duyệt qua Map để tạo mảng 2D
            for (Map.Entry<String, List<String>> entry : lichLamTheoNhanVien.entrySet()) {
                String tenNV = entry.getKey();
                List<String> dsCaLam = entry.getValue();
                dsCaLam.add(0, tenNV); // Thêm tên nhân viên ở đầu danh sách

                String[] col = dsCaLam.toArray(new String[0]);
                dsLichLam2D.add(new String[][]{col});
            }
        } catch (SQLException e) {
            System.err.println("Lỗi khi truy vấn dữ liệu: " + e.getMessage());
        }

        return dsLichLam2D;
    }

    public static void main(String args[]) {

    }
}
