package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.Objects;

import DTO.HoaDonDTO;
import DTO.KhachHangDTO;
import Util.JDBCUtil;
////////////////////////////getlist

public class n1_HoaDonDAO {

    public static n1_HoaDonDAO getInstance(){
        return new n1_HoaDonDAO();
    }
    
    public ArrayList<HoaDonDTO> getListHoaDon() {
        ArrayList<HoaDonDTO> dshd = new ArrayList<>();
        try {
            String sql = "SELECT * FROM HoaDon ORDER BY MaHoaDon DESC";
            Statement stmt = Objects.requireNonNull(JDBCUtil.getConnection()).createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                HoaDonDTO hd = new HoaDonDTO();
                hd.setMaHoaDon(rs.getString(1));
                hd.setNgayLapHoaDon(rs.getDate(2));
                hd.setTongTienHoaDon(rs.getInt(3));
                hd.setMaNhanVien(rs.getString(4));
                hd.setMaKhachHang(rs.getString(5));
                hd.setMaUuDai(rs.getString(6));
                hd.setMaKhuyenMai(rs.getString(7));
                dshd.add(hd);
            }
        } catch (SQLException ex) {
            return null;
        }
        return dshd;
    }

    //////////////////thêm hóa đơn
    public boolean addHoaDon(HoaDonDTO hd) {
        boolean result = false;
        String sql = "INSERT INTO HoaDon(maHoaDon, ngayLapHoaDon, tongTienHoaDon, maNhanVien, maKhachHang, maUuDai, maKhuyenMai) VALUES(?, ?, ?, ?, ?, ?, ?)";

        try (Connection c = JDBCUtil.getConnection(); 
                PreparedStatement prep = c.prepareStatement(sql)) {

            // Thiết lập các giá trị cho câu lệnh SQL
            prep.setString(1, hd.getMaHoaDon());
            prep.setTimestamp(2, new java.sql.Timestamp(new java.util.Date().getTime()));  // Ngày hiện tại
            prep.setInt(3, hd.getTongTienHoaDon());
            prep.setString(4, hd.getMaNhanVien());
            prep.setString(5, hd.getMaKhachHang());
            prep.setString(6, hd.getMaUuDai());
            prep.setString(7, hd.getMaKhuyenMai());

            // Thực thi câu lệnh và kiểm tra kết quả
            result = prep.executeUpdate() > 0;

        } catch (SQLException ex) {
            ex.printStackTrace();  // In lỗi để debug nếu cần
            result = false;
        }

        return result;
    }

    public HoaDonDTO getHoaDonTheoMHD(String maHD) {
        HoaDonDTO hd = new HoaDonDTO();
        try {
            // Sử dụng PreparedStatement thay vì Statement
            String sql = "SELECT * FROM HoaDon WHERE MaHoaDon = ?";
            PreparedStatement pstmt = JDBCUtil.getConnection().prepareStatement(sql);
            pstmt.setString(1, maHD);  // Truyền giá trị maHD vào câu truy vấn

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                hd.setMaHoaDon(rs.getString(1));
                hd.setNgayLapHoaDon(rs.getDate(2));
                hd.setTongTienHoaDon(rs.getInt(3));
                hd.setMaNhanVien(rs.getString(4));
                hd.setMaKhachHang(rs.getString(5));
                hd.setMaUuDai(rs.getString(6));
                hd.setMaKhuyenMai(rs.getString(7));
            }

            rs.close();
            pstmt.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace(); // In ra lỗi để dễ dàng kiểm tra
        }
        return hd;
    }

    public ArrayList<HoaDonDTO> getlistHD() {
        return getListHoaDon();
    }

    public ArrayList<HoaDonDTO> getListHoaDonTheoDateVaTongTien(Date dateMin, Date dateMax, int tongtienMin, int tongtienMax) { // lấy list dshd theo ngày và tổng tiền
        try {
            Connection c = JDBCUtil.getConnection();
            //String sql = "SELECT * FROM hoadon WHERE (NgayLap BETWEEN ? AND ?) AND (tongTien BETWEEN ? AND ?)";
            String sql = "SELECT * FROM HoaDon WHERE (ngayLapHoaDon BETWEEN ? AND ?) AND (tongTienHoaDon BETWEEN ? AND ?) ORDER BY maHoaDon DESC";
            PreparedStatement pre = c.prepareStatement(sql);
            pre.setDate(1, dateMin);
            pre.setDate(2, dateMax);
            pre.setInt(3, tongtienMin);
            pre.setInt(4, tongtienMax);
            ResultSet rs = pre.executeQuery();
            ArrayList<HoaDonDTO> dshd = new ArrayList<>();
            while (rs.next()) {
                HoaDonDTO hd = new HoaDonDTO();
                hd.setMaHoaDon(rs.getString(1));
                hd.setNgayLapHoaDon(rs.getDate(2));
                hd.setTongTienHoaDon(rs.getInt(3));
                hd.setMaNhanVien(rs.getString(4));
                hd.setMaKhachHang(rs.getString(5));
                hd.setMaUuDai(rs.getString(6));
                hd.setMaKhuyenMai(rs.getString(7));
                dshd.add(hd);
            }
            return dshd;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<HoaDonDTO> getListHoaDonTheoDate(Date dateMin, Date dateMax) { // lấy list dshd theo ngày và tổng tiền
        try {
            Connection c = JDBCUtil.getConnection();
            String sql = "SELECT * FROM HoaDon WHERE (NgayLapHoaDon BETWEEN CAST(? AS DATE) AND CAST(? AS DATE)) ORDER BY MaHoaDon DESC";
            PreparedStatement pre = c.prepareStatement(sql);
            pre.setDate(1, dateMin);
            pre.setDate(2, dateMax);
            ResultSet rs = pre.executeQuery();
            ArrayList<HoaDonDTO> dshd = new ArrayList<>();
            while (rs.next()) {
                HoaDonDTO hd = new HoaDonDTO();
                hd.setMaHoaDon(rs.getString(1));
                hd.setNgayLapHoaDon(rs.getDate(2));
                hd.setTongTienHoaDon(rs.getInt(3));
                hd.setMaNhanVien(rs.getString(4));
                hd.setMaKhachHang(rs.getString(5));
                hd.setMaUuDai(rs.getString(6));
                hd.setMaKhuyenMai(rs.getString(7));
                dshd.add(hd);
            }
            return dshd;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getNewId() {
        String maHD = "HD001"; // Giá trị mặc định khi không có hóa đơn trong CSDL
        try {
            Connection c = JDBCUtil.getConnection();
            String sql = "SELECT MAX(maHoaDon) AS maHD FROM HoaDon"; // Câu truy vấn để lấy mã hóa đơn lớn nhất
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                String lastMaHD = rs.getString("maHD");
                if (lastMaHD != null) {
                    // Tách phần số ra khỏi mã hóa đơn (VD: từ "HD005" -> "005")
                    String numberPart = lastMaHD.substring(2); // Lấy phần số từ vị trí thứ 3
                    int number = Integer.parseInt(numberPart); // Chuyển đổi thành số nguyên
                    number++; // Tăng giá trị số lên 1

                    // Đảm bảo mã mới có định dạng HD + 3 chữ số
                    maHD = String.format("HD%03d", number); // Định dạng lại thành HDXXX
                }
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return maHD; // Trả về mã hóa đơn mới
    }

    public int getMaxTongTien() {
        int max = 0;
        Connection c = null;
        try {
            c = JDBCUtil.getConnection();
            String sql = "select max(TongTienHoaDon) as Max from HoaDon";
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                max = rs.getInt("Max");
            } else {
                System.out.println("No records found in HoaDon table.");
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } finally {
            if (c != null) {
                JDBCUtil.closeConnection(c);
            }
        }
        return max;
    }
    // public static void main(String[] args) {
    //     n1_HoaDonDAO list = new n1_HoaDonDAO();
    //     Date currentDate = new Date(System.currentTimeMillis());

    //     HoaDonDTO hd1 = new HoaDonDTO(list.getNewId(), currentDate, 3, "NV001", "KH001", "UD001", "KM001");

    //     list.addHoaDon(hd1);
    //     ArrayList<HoaDonDTO> listhd = list.getListHoaDon();
    //     ArrayList<HoaDonDTO> listhd1 = list.getHoaDonTheoMHD("hd001");
    //     ArrayList<HoaDonDTO> listhd2 = list.getListHoaDonTheoDateVaTongTien(currentDate, currentDate, 0, 100000000);
    //     ArrayList<HoaDonDTO> listhd3 = list.getListHoaDonTheoDate(currentDate, currentDate);
    //     System.out.println("1-            " + listhd);
    //     System.out.println("2-            " + listhd1);
    //     System.out.println("3-            " + listhd2);
    //     System.out.println("4-            " + listhd3);
    // }
}
