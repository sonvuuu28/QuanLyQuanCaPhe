package BUS;

import DAO.n6_CaLamDAO;
import DAO.n6_LichLamDAO;
import DTO.LichLamDTO;
import javax.swing.JOptionPane;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class LichLamBUS {

    public static LichLamBUS getInstance() {
        return new LichLamBUS();
    }

    public void hienThi_NgayHienTai(JLabel LabelNgay) {
        LocalDate today = LocalDate.now();

        Date date = Date.valueOf(today);
        List<Date> tuan = Util.LichLam_CaLam.DauTuan_CuoiTuan(date);

        String DauTuan = Util.LichLam_CaLam.yyyy_mm_dd__to__dd_mm_yyyy(String.valueOf(tuan.get(0)));
        String CuoiTuan = Util.LichLam_CaLam.yyyy_mm_dd__to__dd_mm_yyyy(String.valueOf(tuan.get(1)));

        String period = "Từ " + DauTuan + " đến " + CuoiTuan;
        LabelNgay.setText(period);
    }

    public void Khoi_tao_ngay_lam(String Ngay) {
        Date NgayDate = Date.valueOf(Ngay);

        n6_LichLamDAO dao = n6_LichLamDAO.getInstance();
        Boolean dao_insert = dao.tao_LichLam_TheoNgay(NgayDate);
        if (dao_insert) {
            JOptionPane.showMessageDialog(null, "Khởi tạo thành công");
        } else {
            JOptionPane.showMessageDialog(null, "Khởi tạo thất bại");
        }
    }

    public void Dieu_chinh(String TenCaLam, String TenNhanVien, String Ngay) {
        n6_LichLamDAO dao = n6_LichLamDAO.getInstance();

        String MaCaLam = dao.tim_maCaLam_theo_TenCaLam(TenCaLam);
        String MaNhanVien = dao.tim_maNhanVien_theo_TenNhanVien(TenNhanVien);
        System.out.println(MaCaLam + " " + MaNhanVien);
        Date NgayDate = Date.valueOf(Ngay);
        System.out.println(Ngay);

        LichLamDTO dto = new LichLamDTO(MaCaLam, MaNhanVien, NgayDate);

        Boolean dao_update = dao.update(dto);
        if (dao_update) {
            JOptionPane.showMessageDialog(null, "Điều chỉnh thành công");
        } else {
            JOptionPane.showMessageDialog(null, "Điều chỉnh thất bại");
        }
    }

    public void Xoa(String TenNhanVien, String Ngay) {
        n6_LichLamDAO dao = n6_LichLamDAO.getInstance();

        String MaNhanVien = dao.tim_maNhanVien_theo_TenNhanVien(TenNhanVien);
        Date NgayDate = Date.valueOf(Ngay);

        LichLamDTO dto = new LichLamDTO("", MaNhanVien, NgayDate);

        Boolean dao_update = dao.delete(dto);
        if (dao_update) {
            JOptionPane.showMessageDialog(null, "Tắt lịch làm thành công");
        } else {
            JOptionPane.showMessageDialog(null, "Tắt lịch làm thất bại");
        }
    }

    public String TimKiem(String Ngay_Str_preformatted) {
        String Ngay_Str_formatted = "";
        try {
            Ngay_Str_formatted = Util.LichLam_CaLam.dd_mm_yyyy__to__yyyy_mm_dd(Ngay_Str_preformatted);
//            System.out.println("Ngày đã format: " + Ngay_Str_formatted);

            Date Ngay_Date = Date.valueOf(Ngay_Str_formatted);

            List<Date> tuan = Util.LichLam_CaLam.DauTuan_CuoiTuan(Ngay_Date);

            String DauTuan = Util.LichLam_CaLam.yyyy_mm_dd__to__dd_mm_yyyy(String.valueOf(tuan.get(0)));
            String CuoiTuan = Util.LichLam_CaLam.yyyy_mm_dd__to__dd_mm_yyyy(String.valueOf(tuan.get(1)));

            ArrayList<LichLamDTO> list = n6_LichLamDAO.getInstance().TimKiem_theoNgay(Date.valueOf("2024-10-31"));
            for (LichLamDTO lich : list) {
                System.out.println(lich.toString());
            }

            String period = "Từ " + DauTuan + " đến " + CuoiTuan;
            return period;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đúng định dạng. Ví dụ: 01-01-2024");
            System.out.println("Lỗi khi xử lý ngày: " + e.getMessage());
            return null; // Hoặc có thể trả về một thông báo lỗi khác
        }
    }

    public void data(JTable table, String dateStr) {
        n6_CaLamDAO.getInstance().taoMaCaLam_off();
        Date date = Date.valueOf(dateStr);

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); 
        
        ArrayList<String> dsLichLam = n6_LichLamDAO.getInstance().showAll(date);

        for (String row : dsLichLam) {
            String[] rowData = row.split(", ");
            model.addRow(rowData);
        }
    }
}
