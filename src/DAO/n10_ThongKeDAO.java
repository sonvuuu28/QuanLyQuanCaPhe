package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import DTO.HoaDonDTO;
import GUI.dlgCapTaiKhoan;
import Util.JDBCUtil;

public class n10_ThongKeDAO {

    ///////////////////////////////thống kê mặc định
    public int TongtienHoadonngay(Date date) {
        int tongTienTatCaHoaDon = 0; // Khởi tạo biến trả về
        date.toLocalDate();
        try {
            // Sử dụng điều kiện ngày
            String sql = "SELECT SUM(TongTienHoaDon) AS TongTienTatCaHoaDon FROM HoaDon WHERE NgayLapHoaDon = ?";
            
            Connection c = JDBCUtil.getConnection();
            PreparedStatement pstmt = c.prepareStatement(sql);
            pstmt.setDate(1, date); // Đặt giá trị ngày vào câu truy vấn
    
            ResultSet rs = pstmt.executeQuery();
    
            if (rs.next()) {
                tongTienTatCaHoaDon = rs.getInt("TongTienTatCaHoaDon");
                // System.out.println("Tổng tiền hóa đơn trong ngày " + date + " là: " + tongTienTatCaHoaDon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
        return tongTienTatCaHoaDon;
    }
    public int TongtienHoadonThangHienTai() {
    int tongTienTatCaHoaDon = 0; // Khởi tạo biến trả về
    LocalDate currentDate = LocalDate.now(); // Lấy ngày hiện tại
    int currentMonth = currentDate.getMonthValue(); // Lấy tháng hiện tại
    int currentYear = currentDate.getYear(); // Lấy năm hiện tại

    try {
        // Sử dụng điều kiện tháng và năm
        String sql = "SELECT SUM(TongTienHoaDon) AS TongTienTatCaHoaDon FROM HoaDon " +
                     "WHERE MONTH(NgayLapHoaDon) = ? AND YEAR(NgayLapHoaDon) = ?";
        
        Connection c = JDBCUtil.getConnection();
        PreparedStatement pstmt = c.prepareStatement(sql);
        pstmt.setInt(1, currentMonth); // Đặt giá trị tháng vào câu truy vấn
        pstmt.setInt(2, currentYear); // Đặt giá trị năm vào câu truy vấn

        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            tongTienTatCaHoaDon = rs.getInt("TongTienTatCaHoaDon");
            
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return tongTienTatCaHoaDon;
}   
    
    public int SoluongKHmoi (){
        int SoluongKH = 0;
        try {
            String sql = "SELECT COUNT(*) AS SoLuongKhachHang FROM KhachHang";
            Connection c = JDBCUtil.getConnection();
            PreparedStatement pstmt = c.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                SoluongKH = rs.getInt("SoLuongKhachHang");
            }
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        return SoluongKH;
    }
    public int Soluongnvien (){
        int SoluongNV = 0;
        try {
            String sql = "SELECT COUNT(*) AS SoLuongNhanVien FROM NhanVien";
            Connection c = JDBCUtil.getConnection();
            PreparedStatement pstmt = c.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                SoluongNV = rs.getInt("SoLuongNhanVien");
            }
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        return SoluongNV;
    }
    public int Soluongncc (){
        int Soluongncc = 0;
        try {
            String sql = "SELECT COUNT(*) AS SoLuongNhaCungCap FROM NhaCungCap";
            Connection c = JDBCUtil.getConnection();
            PreparedStatement pstmt = c.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                Soluongncc = rs.getInt("SoLuongNhaCungCap");
            }
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        return Soluongncc;
    }
    public int SoluongNguyenlieu (){
        int SoluongNL = 0;
        try {
            String sql = "SELECT COUNT(*) AS SoLuongNL FROM NguyenLieu";
            Connection c = JDBCUtil.getConnection();
            PreparedStatement pstmt = c.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                SoluongNL = rs.getInt("SoLuongNL");
            }
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        return SoluongNL;
    }
    public int SoluongPhieuNhapTrongThangHienTai() {
        int soluongPhieuNhap = 0;
    
        // Lấy tháng và năm hiện tại
        LocalDate currentDate = LocalDate.now();
        int currentMonth = currentDate.getMonthValue();
        int currentYear = currentDate.getYear();
    
        String sql = "SELECT COUNT(*) AS SoLuongPhieuNhap " +
                     "FROM PhieuNhap " +
                     "WHERE MONTH(NgayLapPhieuNhap) = ? AND YEAR(NgayLapPhieuNhap) = ?";
    
        try (Connection c = JDBCUtil.getConnection();
             PreparedStatement pstmt = c.prepareStatement(sql)) {
            
            // Đặt giá trị cho tháng và năm hiện tại
            pstmt.setInt(1, currentMonth);
            pstmt.setInt(2, currentYear);
            
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    soluongPhieuNhap = rs.getInt("SoLuongPhieuNhap");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
        return soluongPhieuNhap;
    }
    
    public int SoluongHDmoi (Date date){
        date.toLocalDate();
        int SoluongKH = 0;
        try {
            String sql = "SELECT COUNT(*) AS SoLuongHoaDon FROM HoaDon WHERE NgayLapHoaDon = ?";
            Connection c = JDBCUtil.getConnection();
            PreparedStatement pstmt = c.prepareStatement(sql);
            pstmt.setDate(1, date);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                SoluongKH = rs.getInt("SoLuongHoaDon");
            }
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        return SoluongKH;
    }
    public int Tongmondaban(Date date) {
        int SlmonTrongngay = 0; // Khởi tạo biến trả về
    
        try {
            // Sử dụng JOIN giữa ChiTietHoaDon và HoaDon để lọc theo ngày
            String sql = "SELECT SUM(ChiTietHoaDon.Soluong) AS Soluongmon " +
                         "FROM ChiTietHoaDon " +
                         "JOIN HoaDon ON ChiTietHoaDon.MaHoaDon = HoaDon.MaHoaDon " +
                         "WHERE HoaDon.NgayLapHoaDon = ?";
            
            Connection c = JDBCUtil.getConnection();
            PreparedStatement pstmt = c.prepareStatement(sql);
            pstmt.setDate(1, date); // Đặt giá trị ngày vào câu truy vấn
    
            ResultSet rs = pstmt.executeQuery();
    
            if (rs.next()) {
                SlmonTrongngay = rs.getInt("Soluongmon");
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
        return SlmonTrongngay;
    }
    public Double[] getTongTienHoaDonTrongTuan() {

        Double[] tongTienTrongTuan = new Double[7];
        Arrays.fill(tongTienTrongTuan, 0.0); // Khởi tạo giá trị ban đầu là 0 cho mỗi ngày trong tuần

        String query = "SELECT DATEPART(WEEKDAY, NgayLapHoaDon) AS ThuTrongTuan, SUM(TongTienHoaDon) AS TongTien " +
                       "FROM HoaDon " +
                       "WHERE DATEPART(WEEK, NgayLapHoaDon) = DATEPART(WEEK, GETDATE()) " +
                       "AND DATEPART(YEAR, NgayLapHoaDon) = DATEPART(YEAR, GETDATE()) " +
                       "GROUP BY DATEPART(WEEKDAY, NgayLapHoaDon) " +
                       "ORDER BY ThuTrongTuan";

        try (Connection c = JDBCUtil.getConnection();
             Statement statement = c.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                int thuTrongTuan = resultSet.getInt("ThuTrongTuan");
                double tongTien = resultSet.getDouble("TongTien");

                // DAYOFWEEK trả về 1 (Chủ Nhật) đến 7 (Thứ Bảy), nên cần điều chỉnh chỉ số mảng
                int index = (thuTrongTuan == 1) ? 6 : thuTrongTuan - 2; // Đưa Chủ Nhật vào cuối mảng
                tongTienTrongTuan[index] = tongTien;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tongTienTrongTuan;
    }
    ///////////////////////////mặc định
    public Double[] getTongtienHoadonTheoQuy(){
        Double[] tongTienTheoQuy = new Double[4];
        int namHienTai = LocalDate.now().getYear();
        String sql = "SELECT " +
        "SUM(CASE WHEN MONTH(NgayLapHoaDon) BETWEEN 1 AND 3 THEN TongTienHoaDon ELSE 0 END) AS Quy1, " +
        "SUM(CASE WHEN MONTH(NgayLapHoaDon) BETWEEN 4 AND 6 THEN TongTienHoaDon ELSE 0 END) AS Quy2, " +
        "SUM(CASE WHEN MONTH(NgayLapHoaDon) BETWEEN 7 AND 9 THEN TongTienHoaDon ELSE 0 END) AS Quy3, " +
        "SUM(CASE WHEN MONTH(NgayLapHoaDon) BETWEEN 10 AND 12 THEN TongTienHoaDon ELSE 0 END) AS Quy4 " +
        "FROM HoaDon " +
        "WHERE YEAR(NgayLapHoaDon) = ?";
        try (Connection c = JDBCUtil.getConnection();
        PreparedStatement statement = c.prepareStatement(sql);
        ) {

            // Gán giá trị năm vào câu lệnh SQL
            statement.setInt(1, namHienTai);
            
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    tongTienTheoQuy[0] = resultSet.getDouble("Quy1");
                    tongTienTheoQuy[1] = resultSet.getDouble("Quy2");
                    tongTienTheoQuy[2] = resultSet.getDouble("Quy3");
                    tongTienTheoQuy[3] = resultSet.getDouble("Quy4");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return tongTienTheoQuy;
    

    }
    // ///////////////////////lấy dthu theo tháng
    public Double[] getTongTienTheoThang() {
        // Lấy năm hiện tại
        int namHienTai = LocalDate.now().getYear();

        String sql = "SELECT " +
                     "SUM(CASE WHEN MONTH(NgayLapHoaDon) = 1 THEN TongTienHoaDon ELSE 0 END) AS Thang1, " +
                     "SUM(CASE WHEN MONTH(NgayLapHoaDon) = 2 THEN TongTienHoaDon ELSE 0 END) AS Thang2, " +
                     "SUM(CASE WHEN MONTH(NgayLapHoaDon) = 3 THEN TongTienHoaDon ELSE 0 END) AS Thang3, " +
                     "SUM(CASE WHEN MONTH(NgayLapHoaDon) = 4 THEN TongTienHoaDon ELSE 0 END) AS Thang4, " +
                     "SUM(CASE WHEN MONTH(NgayLapHoaDon) = 5 THEN TongTienHoaDon ELSE 0 END) AS Thang5, " +
                     "SUM(CASE WHEN MONTH(NgayLapHoaDon) = 6 THEN TongTienHoaDon ELSE 0 END) AS Thang6, " +
                     "SUM(CASE WHEN MONTH(NgayLapHoaDon) = 7 THEN TongTienHoaDon ELSE 0 END) AS Thang7, " +
                     "SUM(CASE WHEN MONTH(NgayLapHoaDon) = 8 THEN TongTienHoaDon ELSE 0 END) AS Thang8, " +
                     "SUM(CASE WHEN MONTH(NgayLapHoaDon) = 9 THEN TongTienHoaDon ELSE 0 END) AS Thang9, " +
                     "SUM(CASE WHEN MONTH(NgayLapHoaDon) = 10 THEN TongTienHoaDon ELSE 0 END) AS Thang10, " +
                     "SUM(CASE WHEN MONTH(NgayLapHoaDon) = 11 THEN TongTienHoaDon ELSE 0 END) AS Thang11, " +
                     "SUM(CASE WHEN MONTH(NgayLapHoaDon) = 12 THEN TongTienHoaDon ELSE 0 END) AS Thang12 " +
                     "FROM HoaDon " +
                     "WHERE YEAR(NgayLapHoaDon) = ?";

        Double[] tongTienTheoThang = new Double[12];

        try (Connection c = JDBCUtil.getConnection();
        PreparedStatement statement = c.prepareStatement(sql);
        ) {

            // Gán giá trị năm vào câu lệnh SQL
            statement.setInt(1, namHienTai);;
            
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    for (int i = 0; i < 12; i++) {
                        tongTienTheoThang[i] = resultSet.getDouble("Thang" + (i + 1));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return tongTienTheoThang;
    }
    
    public Double[] getTongtienPhieunhap(){
        int namHienTai = LocalDate.now().getYear();

        String sql = "SELECT " +
                     "SUM(CASE WHEN MONTH(NgayLapPhieuNhap) = 1 THEN TongTienPhieuNhap ELSE 0 END) AS Thang1, " +
                     "SUM(CASE WHEN MONTH(NgayLapPhieuNhap) = 2 THEN TongTienPhieuNhap ELSE 0 END) AS Thang2, " +
                     "SUM(CASE WHEN MONTH(NgayLapPhieuNhap) = 3 THEN TongTienPhieuNhap ELSE 0 END) AS Thang3, " +
                     "SUM(CASE WHEN MONTH(NgayLapPhieuNhap) = 4 THEN TongTienPhieuNhap ELSE 0 END) AS Thang4, " +
                     "SUM(CASE WHEN MONTH(NgayLapPhieuNhap) = 5 THEN TongTienPhieuNhap ELSE 0 END) AS Thang5, " +
                     "SUM(CASE WHEN MONTH(NgayLapPhieuNhap) = 6 THEN TongTienPhieuNhap ELSE 0 END) AS Thang6, " +
                     "SUM(CASE WHEN MONTH(NgayLapPhieuNhap) = 7 THEN TongTienPhieuNhap ELSE 0 END) AS Thang7, " +
                     "SUM(CASE WHEN MONTH(NgayLapPhieuNhap) = 8 THEN TongTienPhieuNhap ELSE 0 END) AS Thang8, " +
                     "SUM(CASE WHEN MONTH(NgayLapPhieuNhap) = 9 THEN TongTienPhieuNhap ELSE 0 END) AS Thang9, " +
                     "SUM(CASE WHEN MONTH(NgayLapPhieuNhap) = 10 THEN TongTienPhieuNhap ELSE 0 END) AS Thang10, " +
                     "SUM(CASE WHEN MONTH(NgayLapPhieuNhap) = 11 THEN TongTienPhieuNhap ELSE 0 END) AS Thang11, " +
                     "SUM(CASE WHEN MONTH(NgayLapPhieuNhap) = 12 THEN TongTienPhieuNhap ELSE 0 END) AS Thang12 " +
                     "FROM PhieuNhap " +
                     "WHERE YEAR(NgayLapPhieuNhap) = ?";

        Double[] tongTienTheoThang = new Double[12];

        try (Connection c = JDBCUtil.getConnection();
        PreparedStatement statement = c.prepareStatement(sql);
        ) {

            // Gán giá trị năm vào câu lệnh SQL
            statement.setInt(1, namHienTai);;
            
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    for (int i = 0; i < 12; i++) {
                        tongTienTheoThang[i] = resultSet.getDouble("Thang" + (i + 1));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return tongTienTheoThang;
    }
    public Double[] getTongTienPhieuNhapTheoQuy() {
        int namHienTai = LocalDate.now().getYear();
    
        String sql = "SELECT " +
                     "SUM(CASE WHEN MONTH(NgayLapPhieuNhap) BETWEEN 1 AND 3 THEN TongTienPhieuNhap ELSE 0 END) AS Quy1, " +
                     "SUM(CASE WHEN MONTH(NgayLapPhieuNhap) BETWEEN 4 AND 6 THEN TongTienPhieuNhap ELSE 0 END) AS Quy2, " +
                     "SUM(CASE WHEN MONTH(NgayLapPhieuNhap) BETWEEN 7 AND 9 THEN TongTienPhieuNhap ELSE 0 END) AS Quy3, " +
                     "SUM(CASE WHEN MONTH(NgayLapPhieuNhap) BETWEEN 10 AND 12 THEN TongTienPhieuNhap ELSE 0 END) AS Quy4 " +
                     "FROM PhieuNhap " +
                     "WHERE YEAR(NgayLapPhieuNhap) = ?";
    
        Double[] tongTienTheoQuy = new Double[4];
    
        try (Connection c = JDBCUtil.getConnection();
             PreparedStatement statement = c.prepareStatement(sql)) {
    
            // Gán giá trị năm vào câu lệnh SQL
            statement.setInt(1, namHienTai);
    
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    for (int i = 0; i < 4; i++) {
                        tongTienTheoQuy[i] = resultSet.getDouble("Quy" + (i + 1));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        return tongTienTheoQuy;
    }
    
    ///////////////
    public int TongtienPhieuNhapThangHienTai() {
        int tongTienTatCaPhieuNhap = 0; // Khởi tạo biến trả về
        LocalDate currentDate = LocalDate.now(); // Lấy ngày hiện tại
        int currentMonth = currentDate.getMonthValue(); // Lấy tháng hiện tại
        int currentYear = currentDate.getYear(); // Lấy năm hiện tại
    
        try {
            // Sử dụng điều kiện tháng và năm
            String sql = "SELECT SUM(TongTienPhieuNhap) AS TongTienTatCaPhieuNhap FROM PhieuNhap " +
                         "WHERE MONTH(NgayLapPhieuNhap) = ? AND YEAR(NgayLapPhieuNhap) = ?";
            
            Connection c = JDBCUtil.getConnection();
            PreparedStatement pstmt = c.prepareStatement(sql);
            pstmt.setInt(1, currentMonth); // Đặt giá trị tháng vào câu truy vấn
            pstmt.setInt(2, currentYear); // Đặt giá trị năm vào câu truy vấn
    
            ResultSet rs = pstmt.executeQuery();
    
            if (rs.next()) {
                tongTienTatCaPhieuNhap = rs.getInt("TongTienTatCaPhieuNhap");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
        return tongTienTatCaPhieuNhap;
    }
    
    public Double[] getLuongTheoThang(String maNhanVien) {
        Double[] luongTheoThang = new Double[12];
        Arrays.fill(luongTheoThang, 0.0);  // Khởi tạo mảng với giá trị 0 cho các tháng
    
        int namHienTai = Year.now().getValue();  // Lấy năm hiện tại
        int thangHienTai = LocalDate.now().getMonthValue();  // Lấy tháng hiện tại
    
        String sql = "SELECT LuongNhanVien, NgayNhanViec, NgayNghiViec " +
                     "FROM NhanVien " +
                     "WHERE MaNhanVien = ?";
    
        try (Connection c = JDBCUtil.getConnection();
             PreparedStatement stmt = c.prepareStatement(sql)) {
    
            stmt.setString(1, maNhanVien);
    
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    double luong = rs.getDouble("LuongNhanVien");
                    Date ngayNhanViec = rs.getDate("NgayNhanViec");
                    Date ngayNghiViec = rs.getDate("NgayNghiViec");
    
                    int namBatDau = ngayNhanViec.toLocalDate().getYear();
                    int thangBatDau = ngayNhanViec.toLocalDate().getMonthValue();
                    int namKetThuc, thangKetThuc;
    
                    // Nếu nhân viên chưa nghỉ việc, tính lương đến tháng hiện tại
                    if (ngayNghiViec == null) {
                        namKetThuc = namHienTai;
                        thangKetThuc = thangHienTai;
                    } else {  // Nếu có ngày nghỉ việc, chỉ tính đến tháng của ngày nghỉ việc
                        namKetThuc = ngayNghiViec.toLocalDate().getYear();
                        thangKetThuc = ngayNghiViec.toLocalDate().getMonthValue();
                    }
    
                    // Tính lương từ tháng bắt đầu đến tháng kết thúc
                    if (namBatDau == namKetThuc) {
                        // Nếu ngày bắt đầu và ngày kết thúc trong cùng một năm
                        for (int i = thangBatDau - 1; i < thangKetThuc; i++) {
                            luongTheoThang[i] = luong;
                        }
                    } else if (namBatDau < namKetThuc) {
                        // Nếu nhân viên làm qua nhiều năm
                        // Tính từ tháng bắt đầu trong năm bắt đầu
                        for (int i = thangBatDau - 1; i < 12; i++) {
                            luongTheoThang[i] = luong;
                        }
                        // Tính từ tháng 1 đến tháng kết thúc trong năm kết thúc
                        for (int i = 0; i < thangKetThuc; i++) {
                            luongTheoThang[i] = luong;
                        }
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
        return luongTheoThang;
    }
    public Double getTongLuongNhanVienThangHienTai() {
        Double tongLuongThangHienTai = 0.0;
        int thangHienTai = LocalDate.now().getMonthValue(); // Tháng hiện tại
        int namHienTai = LocalDate.now().getYear(); // Năm hiện tại
    
        String sql = "SELECT LuongNhanVien, NgayNhanViec, NgayNghiViec " +
                     "FROM NhanVien";
    
        try (Connection c = JDBCUtil.getConnection();
             PreparedStatement stmt = c.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
    
            while (rs.next()) {
                double luong = rs.getDouble("LuongNhanVien");
                Date ngayNhanViec = rs.getDate("NgayNhanViec");
                Date ngayNghiViec = rs.getDate("NgayNghiViec");
    
                LocalDate ngayNhanViecLocal = ngayNhanViec.toLocalDate();
                int namBatDau = ngayNhanViecLocal.getYear();
                int thangBatDau = ngayNhanViecLocal.getMonthValue();
    
                // Xác định năm và tháng kết thúc dựa trên ngày nghỉ việc
                int namKetThuc, thangKetThuc;
                if (ngayNghiViec == null) {
                    namKetThuc = namHienTai;
                    thangKetThuc = thangHienTai;
                } else {
                    LocalDate ngayNghiViecLocal = ngayNghiViec.toLocalDate();
                    namKetThuc = ngayNghiViecLocal.getYear();
                    thangKetThuc = ngayNghiViecLocal.getMonthValue();
                }
    
                // Kiểm tra nếu tháng hiện tại nằm trong khoảng thời gian làm việc của nhân viên
                if ((namBatDau < namHienTai || (namBatDau == namHienTai && thangBatDau <= thangHienTai)) &&
                    (namKetThuc > namHienTai || (namKetThuc == namHienTai && thangKetThuc >= thangHienTai))) {
                    // Cộng lương của nhân viên vào tổng lương tháng hiện tại
                    tongLuongThangHienTai += luong;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
        return tongLuongThangHienTai;
    }
    public Double[] getTongLuongTheoThangTrongNamHienTai() {
        Double[] tongLuongTheoThang = new Double[12];
        Arrays.fill(tongLuongTheoThang, 0.0); // Khởi tạo mảng với giá trị 0 cho mỗi tháng
    
        int namHienTai = LocalDate.now().getYear(); // Năm hiện tại
    
        String sql = "SELECT LuongNhanVien, NgayNhanViec, NgayNghiViec " +
                     "FROM NhanVien";
    
        try (Connection c = JDBCUtil.getConnection();
             PreparedStatement stmt = c.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
    
            while (rs.next()) {
                double luong = rs.getDouble("LuongNhanVien");
                Date ngayNhanViec = rs.getDate("NgayNhanViec");
                Date ngayNghiViec = rs.getDate("NgayNghiViec");
    
                LocalDate ngayNhanViecLocal = ngayNhanViec.toLocalDate();
                int namBatDau = ngayNhanViecLocal.getYear();
                int thangBatDau = ngayNhanViecLocal.getMonthValue();
    
                // Xác định tháng và năm kết thúc dựa trên ngày nghỉ việc
                int namKetThuc, thangKetThuc;
                if (ngayNghiViec == null) {
                    namKetThuc = namHienTai;
                    thangKetThuc = 12; // Nếu chưa nghỉ việc, tính đến tháng 12 của năm hiện tại
                } else {
                    LocalDate ngayNghiViecLocal = ngayNghiViec.toLocalDate();
                    namKetThuc = ngayNghiViecLocal.getYear();
                    thangKetThuc = ngayNghiViecLocal.getMonthValue();
                }
    
                // Chỉ tính các tháng trong năm hiện tại và khi nhân viên vẫn đang làm việc hoặc đã nghỉ trong năm nay
                if (namBatDau <= namHienTai && namKetThuc >= namHienTai) {
                    int thangBatDauHienTai = (namBatDau == namHienTai) ? thangBatDau : 1;
                    int thangKetThucHienTai = (namKetThuc == namHienTai) ? thangKetThuc : 12;
    
                    // Cộng lương vào mỗi tháng làm việc trong khoảng từ thangBatDauHienTai đến thangKetThucHienTai
                    for (int i = thangBatDauHienTai - 1; i < thangKetThucHienTai; i++) {
                        tongLuongTheoThang[i] += luong;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
        return tongLuongTheoThang;
    }
    public Double[] getTongLuongTheoQuyTrongNamHienTai() {
        Double[] tongLuongTheoQuy = new Double[4];
        Arrays.fill(tongLuongTheoQuy, 0.0); // Khởi tạo mảng với giá trị 0 cho mỗi quý
    
        int namHienTai = LocalDate.now().getYear(); // Năm hiện tại
    
        String sql = "SELECT LuongNhanVien, NgayNhanViec, NgayNghiViec " +
                     "FROM NhanVien";
    
        try (Connection c = JDBCUtil.getConnection();
             PreparedStatement stmt = c.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
    
            while (rs.next()) {
                double luong = rs.getDouble("LuongNhanVien");
                Date ngayNhanViec = rs.getDate("NgayNhanViec");
                Date ngayNghiViec = rs.getDate("NgayNghiViec");
    
                LocalDate ngayNhanViecLocal = ngayNhanViec.toLocalDate();
                int namBatDau = ngayNhanViecLocal.getYear();
                int thangBatDau = ngayNhanViecLocal.getMonthValue();
    
                // Xác định tháng và năm kết thúc dựa trên ngày nghỉ việc
                int namKetThuc, thangKetThuc;
                if (ngayNghiViec == null) {
                    namKetThuc = namHienTai;
                    thangKetThuc = 12; // Nếu chưa nghỉ việc, tính đến tháng 12 của năm hiện tại
                } else {
                    LocalDate ngayNghiViecLocal = ngayNghiViec.toLocalDate();
                    namKetThuc = ngayNghiViecLocal.getYear();
                    thangKetThuc = ngayNghiViecLocal.getMonthValue();
                }
    
                // Chỉ tính các tháng trong năm hiện tại và khi nhân viên vẫn đang làm việc hoặc đã nghỉ trong năm nay
                if (namBatDau <= namHienTai && namKetThuc >= namHienTai) {
                    int thangBatDauHienTai = (namBatDau == namHienTai) ? thangBatDau : 1;
                    int thangKetThucHienTai = (namKetThuc == namHienTai) ? thangKetThuc : 12;
    
                    // Cộng lương vào các quý tương ứng
                    for (int i = thangBatDauHienTai; i <= thangKetThucHienTai; i++) {
                        if (i >= 1 && i <= 3) {
                            tongLuongTheoQuy[0] += luong; // Quý 1
                        } else if (i >= 4 && i <= 6) {
                            tongLuongTheoQuy[1] += luong; // Quý 2
                        } else if (i >= 7 && i <= 9) {
                            tongLuongTheoQuy[2] += luong; // Quý 3
                        } else if (i >= 10 && i <= 12) {
                            tongLuongTheoQuy[3] += luong; // Quý 4
                        }
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
        return tongLuongTheoQuy;
    }
    
    
        
    
    
    
    
    

    public static void main(String[] args) {
        n10_ThongKeDAO list= new n10_ThongKeDAO();
        Date date = Date.valueOf("2024-10-03");
        Double[] weeknow = list.getTongTienHoaDonTrongTuan();
        Double [] quy = list.getTongtienHoadonTheoQuy();
        Double [] luong = list.getLuongTheoThang("NV001");

        double listq = list.TongtienHoadonngay(date);
        int ds = list.Tongmondaban(date);
        double tongthang = list.TongtienHoadonThangHienTai();
        
        for (int i = 0; i < 7; i++) {
            System.out.println(weeknow[i]+"");
        }
        for(int i= 0; i<4;i++){
            System.out.println(quy[i]+", ");
        }
        for(int i= 0; i<12;i++){
            System.out.println(luong[i]+", ");
        }
    }
}
