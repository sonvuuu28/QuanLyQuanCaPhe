package BUS;

import DAO.n7_KhuyenMaiDAO;
import DAO.n7_UuDaiThanhVienDAO;
import DTO.*;
import com.toedter.calendar.JDateChooser;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class n7_KhuyenMai_UuDaiBUS {

    public static n7_KhuyenMai_UuDaiBUS getInstance() {
        return new n7_KhuyenMai_UuDaiBUS();
    }

    public void search_KM(JTable table, String ma, String ten, Date ngayBD, Date ngayKT, Float phanTram, int DieuKien) {
        KhuyenMaiDTO dto_search = new KhuyenMaiDTO(ma, ten, ngayBD, ngayKT, phanTram, DieuKien);
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<KhuyenMaiDTO> ds = n7_KhuyenMaiDAO.getInstance().search(dto_search);
        int i = 1;
        for (KhuyenMaiDTO dto : ds) {
            model.addRow(new Object[]{dto.getMaKhuyenMai(), dto.getTenKhuyenMai(), yyyy_mm_dd__to__dd_mm_yyyy(dto.getNgayBatDauKhuyenMai()),
                yyyy_mm_dd__to__dd_mm_yyyy(dto.getNgayKetThucKhuyenMai()),
                dto.getPhanTramKhuyenMai(), set_Tien_VND(dto.getDieuKienKhuyenMai()), checkHan(dto.getNgayBatDauKhuyenMai(), dto.getNgayKetThucKhuyenMai())
            });
            i++;
        }
    }

    public void getListKhuyenMai(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<KhuyenMaiDTO> ds = n7_KhuyenMaiDAO.getInstance().getListKhuyenMai();
        int i = 1;
        for (KhuyenMaiDTO dto : ds) {
            model.addRow(new Object[]{dto.getMaKhuyenMai(), dto.getTenKhuyenMai(), yyyy_mm_dd__to__dd_mm_yyyy(dto.getNgayBatDauKhuyenMai()),
                yyyy_mm_dd__to__dd_mm_yyyy(dto.getNgayKetThucKhuyenMai()),
                dto.getPhanTramKhuyenMai(), set_Tien_VND(dto.getDieuKienKhuyenMai()), checkHan(dto.getNgayBatDauKhuyenMai(), dto.getNgayKetThucKhuyenMai())
            });
            i++;
        }
    }

    public void getListKhuyenMai_theoTen(JTable table, String ten) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<KhuyenMaiDTO> ds = n7_KhuyenMaiDAO.getInstance().getListKhuyenMai_theoTen(ten);
        int i = 1;
        for (KhuyenMaiDTO dto : ds) {
            model.addRow(new Object[]{dto.getMaKhuyenMai(), dto.getTenKhuyenMai(), yyyy_mm_dd__to__dd_mm_yyyy(dto.getNgayBatDauKhuyenMai()),
                yyyy_mm_dd__to__dd_mm_yyyy(dto.getNgayKetThucKhuyenMai()),
                dto.getPhanTramKhuyenMai(), set_Tien_VND(dto.getDieuKienKhuyenMai()), checkHan(dto.getNgayBatDauKhuyenMai(), dto.getNgayKetThucKhuyenMai())
            });
            i++;
        }
    }

    public void getListKhuyenMai_theoMa(JTable table, String ten) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<KhuyenMaiDTO> ds = n7_KhuyenMaiDAO.getInstance().getListKhuyenMai_theoMa(ten);
        int i = 1;
        for (KhuyenMaiDTO dto : ds) {
            model.addRow(new Object[]{dto.getMaKhuyenMai(), dto.getTenKhuyenMai(), yyyy_mm_dd__to__dd_mm_yyyy(dto.getNgayBatDauKhuyenMai()),
                yyyy_mm_dd__to__dd_mm_yyyy(dto.getNgayKetThucKhuyenMai()),
                dto.getPhanTramKhuyenMai(), set_Tien_VND(dto.getDieuKienKhuyenMai()), checkHan(dto.getNgayBatDauKhuyenMai(), dto.getNgayKetThucKhuyenMai())
            });
            i++;
        }
    }

    public String taoMaKhuyenMai() {
        return n7_KhuyenMaiDAO.getInstance().taoMaKhuyenMai();
    }

    public void insert_khuyenMai(String ma, String ten, Date ngayBD, Date ngayKT, Float phanTram, int DieuKien) {
        KhuyenMaiDTO dto = new KhuyenMaiDTO(ma, ten, ngayBD, ngayKT, phanTram, DieuKien);
        boolean dao = n7_KhuyenMaiDAO.getInstance().insert_khuyenMai(dto);
        if (dao) {
            JOptionPane.showMessageDialog(null, "Tạo khuyến mãi thành công");
        } else {
            JOptionPane.showMessageDialog(null, "Trùng mã khuyến mãi!");
        }
    }

    public void update_khuyenMai(String ma, String ten, Date ngayBD, Date ngayKT, Float phanTram, int DieuKien) {
        KhuyenMaiDTO dto = new KhuyenMaiDTO(ma, ten, ngayBD, ngayKT, phanTram, DieuKien);
        boolean dao = n7_KhuyenMaiDAO.getInstance().update_khuyenMai(dto);
        if (dao) {
            JOptionPane.showMessageDialog(null, "Sửa khuyến mãi thành công");
        } else {
            JOptionPane.showMessageDialog(null, "Không tồn tại mã khuyến mãi!");
        }
    }

    public void getListUuDai(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<UuDaiThanhVienDTO> ds = n7_UuDaiThanhVienDAO.getInstance().getListUuDai();
        int i = 1;
        for (UuDaiThanhVienDTO dto : ds) {
            model.addRow(new Object[]{dto.getMaUuDai(), dto.getTenUuDai(), yyyy_mm_dd__to__dd_mm_yyyy(dto.getNgayBatDauUuDai()),
                yyyy_mm_dd__to__dd_mm_yyyy(dto.getNgayKetThucUuDai()),
                dto.getPhanTramUuDai(), set_Tien_VND(dto.getDieuKienUuDai()), checkHan(dto.getNgayBatDauUuDai(), dto.getNgayKetThucUuDai())
            });
            i++;
        }
    }

    public void getListUuDai_theoTen(JTable table, String ten) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<UuDaiThanhVienDTO> ds = n7_UuDaiThanhVienDAO.getInstance().getListUuDai_theoTen(ten);
        int i = 1;
        for (UuDaiThanhVienDTO dto : ds) {
            model.addRow(new Object[]{dto.getMaUuDai(), dto.getTenUuDai(), yyyy_mm_dd__to__dd_mm_yyyy(dto.getNgayBatDauUuDai()),
                yyyy_mm_dd__to__dd_mm_yyyy(dto.getNgayKetThucUuDai()),
                dto.getPhanTramUuDai(), set_Tien_VND(dto.getDieuKienUuDai()), checkHan(dto.getNgayBatDauUuDai(), dto.getNgayKetThucUuDai())
            });
            i++;
        }
    }

    public void getListUuDai_theoMa(JTable table, String ten) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<UuDaiThanhVienDTO> ds = n7_UuDaiThanhVienDAO.getInstance().getListUuDai_theoMa(ten);
        int i = 1;
        for (UuDaiThanhVienDTO dto : ds) {
            model.addRow(new Object[]{dto.getMaUuDai(), dto.getTenUuDai(), yyyy_mm_dd__to__dd_mm_yyyy(dto.getNgayBatDauUuDai()),
                yyyy_mm_dd__to__dd_mm_yyyy(dto.getNgayKetThucUuDai()),
                dto.getPhanTramUuDai(), set_Tien_VND(dto.getDieuKienUuDai()), checkHan(dto.getNgayBatDauUuDai(), dto.getNgayKetThucUuDai())
            });
            i++;
        }
    }

    public String taoMaUuDai() {
        return n7_UuDaiThanhVienDAO.getInstance().taoMaUuDai();
    }

    public void insert_uuDai(String ma, String ten, Date ngayBD, Date ngayKT, Float phanTram, int DieuKien) {
        UuDaiThanhVienDTO dto = new UuDaiThanhVienDTO(ma, ten, ngayBD, ngayKT, phanTram, DieuKien);
        boolean dao = n7_UuDaiThanhVienDAO.getInstance().insert_uuDai(dto);
        if (dao) {
            JOptionPane.showMessageDialog(null, "Tạo ưu đãi thành công");
        } else {
            JOptionPane.showMessageDialog(null, "Trùng mã ưu đãi!");
        }
    }

    public void update_uuDai(String ma, String ten, Date ngayBD, Date ngayKT, Float phanTram, int DieuKien) {
        UuDaiThanhVienDTO dto = new UuDaiThanhVienDTO(ma, ten, ngayBD, ngayKT, phanTram, DieuKien);
        boolean dao = n7_UuDaiThanhVienDAO.getInstance().update_uuDai(dto);
        if (dao) {
            JOptionPane.showMessageDialog(null, "Sửa ưu đãi thành công");
        } else {
            JOptionPane.showMessageDialog(null, "Không tồn tại mã ưu đãi!");
        }
    }

    public void search(JTable table, String ma, String ten, Date ngayBD, Date ngayKT, Float phanTram, int DieuKien) {
        UuDaiThanhVienDTO dto_search = new UuDaiThanhVienDTO(ma, ten, ngayBD, ngayKT, phanTram, DieuKien);

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<UuDaiThanhVienDTO> ds = n7_UuDaiThanhVienDAO.getInstance().search(dto_search);
        int i = 1;
        for (UuDaiThanhVienDTO dto : ds) {
            model.addRow(new Object[]{dto.getMaUuDai(), dto.getTenUuDai(), yyyy_mm_dd__to__dd_mm_yyyy(dto.getNgayBatDauUuDai()),
                yyyy_mm_dd__to__dd_mm_yyyy(dto.getNgayKetThucUuDai()),
                dto.getPhanTramUuDai(), set_Tien_VND(dto.getDieuKienUuDai()), checkHan(dto.getNgayBatDauUuDai(), dto.getNgayKetThucUuDai())
            });
            i++;
        }
    }

    private String checkHan(Date start, Date end) {
        String thongTin = "Ngừng";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date currentDate = new Date(); // Lấy ngày hiện tại
        // Kiểm tra ngày hiện tại có nằm trong khoảng start và end
        if (!currentDate.before(start) && !currentDate.after(end)) {
            thongTin = "Hoạt động";
        }
        return thongTin;
    }

    public String yyyy_mm_dd__to__dd_mm_yyyy(Date ngayBanDau) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String ngayLucSau = dateFormat.format(ngayBanDau);

        return ngayLucSau;
    }

    // Chuyển từ dd-MM-yyyy (String) sang yyyy-MM-dd (Date)
    public Date dd_mm_yyyy__to__yyyy_mm_dd(String ngayBanDau) {
        Date ngayLucSau = null;
        SimpleDateFormat sdfInput = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat sdfOutput = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date intermediateDate = sdfInput.parse(ngayBanDau);
            String formattedDate = sdfOutput.format(intermediateDate);
            ngayLucSau = sdfOutput.parse(formattedDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return ngayLucSau;
    }

    public String set_Tien_VND(int gia) {
        DecimalFormat formatter = new DecimalFormat("#,###");
        String gia_str = formatter.format(gia);
        return gia_str;
    }

    public int set_Tien_VND_sang_int(String gia) {
        try {
            // Loại bỏ dấu phẩy khỏi chuỗi tiền tệ
            gia = gia.replace(".", "");
            // Chuyển chuỗi về số nguyên
            return Integer.parseInt(gia);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return 0; // Trả về 0 nếu có lỗi
        }
    }

    public boolean check_input_Rong(JTextField ma, JTextField ten, JDateChooser bd, JDateChooser kt, JTextField phanTram, JTextField dieuKien) {
        boolean check = true;
        if (ma.getText().equals("")) {
            ma.requestFocus();
            JOptionPane.showMessageDialog(null, "Vui lòng không bỏ trống mã!");
            check = false;
        }

        if (ten.getText().equals("") && check == true) {
            ten.requestFocus();
            JOptionPane.showMessageDialog(null, "Vui lòng không bỏ trống tên!");
            check = false;
        }

        if (bd.getDate() == null && check == true) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn ngày bắt đầu áp dụng chương trình !");
            check = false;
        }

        if (kt.getDate() == null && check == true) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn ngày kết thúc áp dụng chương trình !");
            check = false;
        }

        if (phanTram.getText().equals("") && check == true) {
            phanTram.requestFocus();
            JOptionPane.showMessageDialog(null, "Vui lòng không bỏ trống phần trăm giảm giá !");
            check = false;
        }

        if (dieuKien.getText().equals("") && check == true) {
            dieuKien.requestFocus();
            JOptionPane.showMessageDialog(null, "Vui lòng không bỏ trống điều kiện để áp mã!");
            check = false;
        }

        return check;
    }

}
