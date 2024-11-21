package BUS;

import java.lang.reflect.Array;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

import org.apache.poi.hslf.record.DocInfoListContainer;

//import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import DAO.KhachHangDAO;
import DAO.NhanVienDAO;
import DAO.n1_HoaDonDAO;
import DTO.HoaDonDTO;
import DTO.KhachHangDTO;
import DTO.NhanVienDTO;
import DAO.n10_ThongKeDAO;

public class ThongkeBUS {
    HoaDonDTO hd = new HoaDonDTO();
    n1_HoaDonDAO HoaDon = new n1_HoaDonDAO();
    n10_ThongKeDAO TK = new n10_ThongKeDAO();
    NhanVienBUS listnv = new NhanVienBUS();
    ArrayList<NhanVienDTO> list = listnv.getlistNV();
    NhanVienDTO nv = new NhanVienDTO();
    NhanVienDAO listNhanVienDAO = new NhanVienDAO();
    KhachHangDTO kh = new KhachHangDTO();
    public ThongkeBUS (){
    }

    /////////////////////////////mặc định
    public int getTongTienHoaDonngay (Date date){
        int Tong = 0;
        Tong = TK.TongtienHoadonngay(date);
        return Tong;
    }
    public int getTongTienHoaDonthang (){
        int Tong = 0;
        Tong = TK.TongtienHoadonThangHienTai();
        return Tong;
    }
    public int getTongTienPhieunhapthang (){
        int Tong = 0;
        Tong = TK.TongtienPhieuNhapThangHienTai();
        return Tong;
    }
    public Double getTongTienLuongthang (){
        Double Tong = 0.0;
        Tong = TK.getTongLuongNhanVienThangHienTai();
        return Tong;
    }
    public int getsoluongKH(){
        int Soluong = 0;
        Soluong = TK.SoluongKHmoi();
        return Soluong;
    }
    public int getsoluongNV(){
        int Soluong = 0;
        Soluong = TK.Soluongnvien();
        return Soluong;
    }
    public int getsoluongPN(){
        int Soluong = 0;
        Soluong = TK.SoluongPhieuNhapTrongThangHienTai();
        return Soluong;
    }
    public int getsluongNL(){
        int Soluong=0;
        Soluong=TK.SoluongNguyenlieu();
        return Soluong;
    }
    public int getsluongNCC(){
        int Soluong=0;
        Soluong=TK.Soluongncc();
        return Soluong;
    }

    public int getsoluongHD(Date date){
        int Soluong = 0;
        Soluong = TK.SoluongHDmoi(date);
        return Soluong;
    }
    public int getSoluongMon(Date date){
        int Soluong=0;
        Soluong= TK.Tongmondaban(date);
        return Soluong;
    }
    public ArrayList<Double> getArrayDoanhthuTuan(){
        ArrayList<Double> Dthutuan = new ArrayList<>();
        Double[] a = TK.getTongTienHoaDonTrongTuan();
        for (Double d : a) {
            Dthutuan.add(d);
        }
        return Dthutuan;
    }
    ////////////////////mặc định
    /// loaddata
    //////////////lấy hóa đơn theo quý
    public ArrayList<Double> getArrayDoanhthuquy(){
        ArrayList<Double> Dthuquy = new ArrayList<>();
        Double[] a = TK.getTongtienHoadonTheoQuy();
        for (Double d : a) {
            Dthuquy.add(d);
        }
        return Dthuquy;
    }
    /////////////////lấy hóa đơn quý hiện tại
    public double getTongDoanhthuQuyHientai() {
        ArrayList<Double> doanhThuQuy = getArrayDoanhthuquy();
        int quyHientai = (java.time.LocalDate.now().getMonthValue()+2)/3; // Tính quý hiện tại
        if (quyHientai > 0 && quyHientai <= doanhThuQuy.size()) {
            return doanhThuQuy.get(quyHientai - 1); // Lấy doanh thu của quý hiện tại
        }
        return 0;
    }
    ///////////lấy doanh thu theo tháng
    public ArrayList<Double> getArrayDoanhthunam(){
        ArrayList<Double> Dthunam = new ArrayList<>();
        Double[] a = TK.getTongTienTheoThang();
        for (Double d : a) {
            Dthunam.add(d);
        }
        return Dthunam;
    }
    public Double getTongDthunam(){
        Double tongtien=0.0;
        Double[] a=TK.getTongTienTheoThang();
        for(int i=0;i<12;i++){
            tongtien = tongtien + a[i];
        }
        return tongtien;
    }
    //////////////lấy giá trị phiếu nhập theo tháng trong năm hiện tại
    public ArrayList<Double> getArrayphieunhapnam(){
        ArrayList<Double> Phieunhapnam = new ArrayList<>();
        Double[] a = TK.getTongtienPhieunhap();
        for (Double d : a) {
            Phieunhapnam.add(d);
        }
        return Phieunhapnam;
    }
    public ArrayList<Double> getArrayphieunhapnamtheoquy(){
        ArrayList<Double> Phieunhaptheoquy = new ArrayList<>();
        Double[] a = TK.getTongTienPhieuNhapTheoQuy();
        for (Double d : a) {
            Phieunhaptheoquy.add(d);
        }
        return Phieunhaptheoquy;
    }
    ///////////lấy giá trị lương nhân viên theo tháng
    public ArrayList<Double> getArrayLuongnhanvien(String MaNV){
        ArrayList<Double> luongTheoThang = new ArrayList<>();
        Double[] a = TK.getLuongTheoThang(MaNV);
        for (Double d : a) {
            luongTheoThang.add(d);
        }
        return luongTheoThang;

    }
    public ArrayList<Double> getArrayTongLuongnhanvientheothang(){
        ArrayList<Double> tongluongTheoThang = new ArrayList<>();
        Double[] a = TK.getTongLuongTheoThangTrongNamHienTai();
        for (Double d : a) {
            tongluongTheoThang.add(d);
        }
        return tongluongTheoThang;

    }
    public Double getTongLuongnhanviennam(){
        Double tong =0.0;
        Double[] a = TK.getTongLuongTheoThangTrongNamHienTai();
        for (Double d : a) {
            tong= tong+d;
        }
        return tong;

    }

    public ArrayList<Double> getArrayTongLuongnhanvientheoquy(){
        ArrayList<Double> tongluongTheoQuy = new ArrayList<>();
        Double[] a = TK.getTongLuongTheoQuyTrongNamHienTai();
        for (Double d : a) {
            tongluongTheoQuy.add(d);
        }
        return tongluongTheoQuy;

    }
    
    public Double[] tinhLuongTheoQuy(Double[] luongTheoThang) {
    Double[] luongTheoQuy = new Double[4];

    // Tính tổng lương cho từng quý
    luongTheoQuy[0] = luongTheoThang[0] + luongTheoThang[1] + luongTheoThang[2]; // Quý 1
    luongTheoQuy[1] = luongTheoThang[3] + luongTheoThang[4] + luongTheoThang[5]; // Quý 2
    luongTheoQuy[2] = luongTheoThang[6] + luongTheoThang[7] + luongTheoThang[8]; // Quý 3
    luongTheoQuy[3] = luongTheoThang[9] + luongTheoThang[10] + luongTheoThang[11]; // Quý 4

    return luongTheoQuy;
}

    public static void main(String[] args) {
        ThongkeBUS tk = new ThongkeBUS();
        NhanVienDAO nv = new NhanVienDAO();
        NhanVienBUS lnv = new NhanVienBUS();
        Date date = new Date(System.currentTimeMillis());
        int a=tk.getTongTienHoaDonngay(date);
        int b=tk.getTongTienHoaDonthang();
        int c=tk.getsoluongKH();
        int d =tk.getsoluongHD(date);
        int e = tk.getSoluongMon(date);
        Double t = tk.getTongDoanhthuQuyHientai();
        String z;
        ArrayList<NhanVienDTO> list = lnv.getlistNV();
        ArrayList<Double> f = tk.getArrayDoanhthuTuan();
        ArrayList<Double> i = tk.getArrayDoanhthuquy();
        ArrayList<Double>  h= tk.getArrayDoanhthunam();
        ArrayList<Double>  x= tk.getArrayphieunhapnam();

        for (int s=0; s<list.size();s++){
            z=list.get(s).getMaNhanVien();
            System.out.println( tk.getArrayLuongnhanvien(z));

            
        }
        

        System.out.println(a+","+b+","+c+","+d+","+e);
        System.out.println(f);
        System.out.println(i);
        System.out.println(h);
        System.out.println(x);
        System.out.println(list);
        System.out.println(t);

    }
}

