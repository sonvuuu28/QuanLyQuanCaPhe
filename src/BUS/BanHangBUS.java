package BUS;

import DAO.LoaiMonDAO;
import DAO.NhanVienDAO;
import DAO.n1_CTHoaDonDAO;
import DAO.n1_HoaDonDAO;
import DAO.n4_MonDAO;
import DAO.n6_CaLamDAO;
import DTO.ChiTietHoaDonDTO;
import DTO.HoaDonDTO;
import DTO.KhachHangDTO;
import DTO.KhuyenMaiDTO;
import DTO.MonDTO;
import DTO.NhanVienDTO;
import DTO.UuDaiThanhVienDTO;
import java.util.ArrayList;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class BanHangBUS {

    public static BanHangBUS getInstance() {
        return new BanHangBUS();
    }

    public ArrayList<MonDTO> listMon() {
        ArrayList<MonDTO> listMon = n4_MonDAO.getInstance().getAll();
        return listMon;
    }

    public void get_All_TenLoaiMon(JComboBox ComboBoxLoaiSP) {
        ArrayList<String> ds = LoaiMonDAO.getInstance().get_All_TenLoaiMon();
        ds.add(0, "Tất Cả");
        for (String ca : ds) {
            ComboBoxLoaiSP.addItem(ca);
        }
    }

    public ArrayList<MonDTO> list_Mon_TenLoaiMon(String tenLoaiMon) {
        ArrayList<MonDTO> listMon = new ArrayList<>();
        if (tenLoaiMon.equals("Tất Cả")) {
            listMon = n4_MonDAO.getInstance().getAll();
        } else {
            String MaLoaiMon = LoaiMonDAO.getInstance().getMaLoaiMon_theo_TenLoaiMon(tenLoaiMon);
            listMon = n6_CaLamDAO.getInstance().getAll_theo_LoaiMon(MaLoaiMon);

        }
        return listMon;
    }

    public String getTenLoaiMon_theo_MaLoaiMon(String maLoaiMon) {
        return LoaiMonDAO.getInstance().getTenLoaiMon_theo_MaLoaiMon(maLoaiMon);
    }

    public ArrayList<MonDTO> getAll_theo_TimKiem(String ten) {
        ArrayList<MonDTO> listMon = new ArrayList<>();
        listMon = n6_CaLamDAO.getInstance().getAll_theo_TimKiem_Mon(ten);
        return listMon;
    }

    public int tinh_SoLuong_MonCon(String Ma) {
        int sl = n6_CaLamDAO.getInstance().tinh_SoLuong_MonCon(Ma);
        return sl;
    }

    public boolean check_Sl(String sl, String sl_kho) {
        try {
            int soLuong = Integer.parseInt(sl);
            int soLuong_kho = Integer.parseInt(sl_kho);

            if (soLuong > soLuong_kho) {
                JOptionPane.showMessageDialog(null, "Không đủ hàng trong kho!");
                return false;
            }

            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Nhập số lượng không phù hợp !");
            return false;
        }
    }

    public String getTenNV(String ma) {
        NhanVienDAO dao = new NhanVienDAO();
        NhanVienDTO nv = dao.getNhanVien(ma);
        String ten = nv.getTenNhanVien();
        return ten;
    }

    public ArrayList<KhuyenMaiDTO> getAll_KhuyenMai(int tongTien, String date, JComboBox box) {
        ArrayList<KhuyenMaiDTO> ds = n6_CaLamDAO.getInstance().getAll_KhuyenMai(tongTien, Date.valueOf(date));

        for (KhuyenMaiDTO km : ds) {
            box.addItem(km.getTenKhuyenMai());
        }

        return ds;
    }

    public KhuyenMaiDTO get_KhuyenMai_theoTen(int tongTien, String date, String ten) {
        KhuyenMaiDTO khuyenmai = n6_CaLamDAO.getInstance().get_KhuyenMai_theoTen(tongTien, Date.valueOf(date), ten);
        return khuyenmai;
    }

    public MonDTO getMon_theo_MaMon(String MaMon) {
        MonDTO mon = n4_MonDAO.getInstance().getMonById(MaMon);
        return mon;
    }

    public void showData_KhachHang(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int rows = model.getRowCount();
        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        ArrayList<KhachHangDTO> ds = n6_CaLamDAO.getInstance().getData_KhachHang();
        for (KhachHangDTO kh : ds) {
            model.addRow(new Object[]{kh.getMaKhachHang(), kh.getTenKhachHang(), kh.getSoDienThoaiKhachHang(),
                Util.LichLam_CaLam.yyyy_mm_dd__to__dd_mm_yyyy(String.valueOf(kh.getNgaySinhKhachHang()))
            });
        }
    }

    public void showData_KhachHang_theoTen(JTable table, String ten) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int rows = model.getRowCount();
        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        ArrayList<KhachHangDTO> ds = n6_CaLamDAO.getInstance().getData_KhachHang_theoTen(ten);
        for (KhachHangDTO kh : ds) {
            model.addRow(new Object[]{kh.getMaKhachHang(), kh.getTenKhachHang(), kh.getSoDienThoaiKhachHang(),
                Util.LichLam_CaLam.yyyy_mm_dd__to__dd_mm_yyyy(String.valueOf(kh.getNgaySinhKhachHang()))
            });
        }
    }

    public void get_khachHang_theoMa(String ma, JLabel ten) {
        KhachHangDTO kh = n6_CaLamDAO.getInstance().get_khachHang_theoMa(ma);
        ten.setText(kh.getTenKhachHang());
    }

    public KhachHangDTO get_khachHang_theoMa(String ma) {
        KhachHangDTO kh = n6_CaLamDAO.getInstance().get_khachHang_theoMa(ma);
        return kh;
    }

    public UuDaiThanhVienDTO get_UuDai_theoMa(String ma) {
        UuDaiThanhVienDTO kh = n6_CaLamDAO.getInstance().get_UuDai_theoMa(ma);
        return kh;
    }

    public String set_UuDaiThanhVien(int chiTieu, JLabel uuDai) {
        String today = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        Date date = Date.valueOf(today);
        System.out.println("Bán hàng bus" + chiTieu + "" + date);
        UuDaiThanhVienDTO dto = n6_CaLamDAO.getInstance().get_UuDai_theoChiTieu(chiTieu, date);
        uuDai.setText(dto.getTenUuDai());
        return dto.getMaUuDai();
    }

    public boolean insert_hoaDon(String maHoaDon, java.sql.Date ngayLapHoaDon, int tien, String maNhanVien, String maKhachHang, String maUuDai, String maKhuyenMai) {
        HoaDonDTO hd = new HoaDonDTO(maHoaDon, ngayLapHoaDon, tien, maNhanVien, maKhachHang, maUuDai, maKhuyenMai);
        boolean tao_thanhCong = false;
        try {
            tao_thanhCong = n1_HoaDonDAO.getInstance().addHoaDon(hd);
            JOptionPane.showMessageDialog(null, "Thanh toán thành công !", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Thanh toán thất bại !", "FAIL", JOptionPane.ERROR);
        }

        return tao_thanhCong;
    }

    public void update_reload_NguyenLieu(ArrayList<Object[]> listCart) {
        n6_CaLamDAO.getInstance().update_reload_NguyenLieu(listCart);
    }

    public void update_tru_NguyenLieu(Object[] item) {
        n6_CaLamDAO.getInstance().update_Tru_NguyenLieu(item);
    }
    
    public void update_cong_NguyenLieu(Object[] item) {
        n6_CaLamDAO.getInstance().update_Cong_NguyenLieu(item);
    }

    public void insert_chiTietHoaDon(String maHoaDon, String maMon, int donGia, int thanhTien, int soLuong) {
        ChiTietHoaDonDTO cthd = new ChiTietHoaDonDTO(maHoaDon, maMon, donGia, thanhTien, soLuong);
        n1_CTHoaDonDAO dao = new n1_CTHoaDonDAO();
        dao.addCTHoaDon(cthd);
    }

    public static void main(String[] args) {
        BanHangBUS.getInstance().check_Sl("44", "10");
    }
}
