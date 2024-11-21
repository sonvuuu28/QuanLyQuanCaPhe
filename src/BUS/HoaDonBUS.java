package BUS;

import Util.InputValidator;
import Util.dialog;
import DAO.n1_HoaDonDAO;
import DTO.HoaDonDTO;

import java.security.PublicKey;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

public class HoaDonBUS {

    private n1_HoaDonDAO HDDAO = new n1_HoaDonDAO();
    private ArrayList <HoaDonDTO> currentList = new ArrayList<>();
    private HoaDonDTO HD = new HoaDonDTO();
    DefaultTableModel modelTmp ;

    public ArrayList<HoaDonDTO> getlistHD() {
        return HDDAO.getListHoaDon();
    }


    public ArrayList<HoaDonDTO> getlistHDtheoDateVaTongTien(Date DateMin, Date DateMax, int TongTienMin, int TongTienMax) {
        if (DateMin.after(DateMax)) {
            new dialog("Khoảng ngày không hợp lệ!", dialog.ERROR_DIALOG);
            return null;
        }
        if (TongTienMin > TongTienMax) {
            new dialog("Khoảng tiền không hợp lệ", dialog.ERROR_DIALOG);
        }
        return HDDAO.getListHoaDonTheoDateVaTongTien((java.sql.Date) DateMin, (java.sql.Date) DateMax, TongTienMin, TongTienMax);
    }

    public HoaDonDTO getlisttheoMHD(String MHD) {
        if (HDDAO.getHoaDonTheoMHD(MHD) == null) {
            return null;
        }
        return HDDAO.getHoaDonTheoMHD(MHD);
    }

    public ArrayList<HoaDonDTO> getListHD_Price_Date(Date Min, Date Max, String GiaMin, String GiaMax) throws SQLException {
        if (currentList == null){
            currentList = HDDAO.getListHoaDon();
        }
        GiaMin = GiaMin.trim();
        GiaMax = GiaMax.trim();
        java.sql.Date sqlMin = new java.sql.Date(Min.getTime());
        java.sql.Date sqlMax = new java.sql.Date(Max.getTime());
        if (!Min.after(Max)) {
            if (InputValidator.IsEmpty(GiaMin) && InputValidator.IsEmpty(GiaMax)) {
                currentList = HDDAO.getListHoaDonTheoDate(sqlMin, sqlMax);
                return currentList;
            }

            if (InputValidator.IsEmpty(GiaMax)){
                try {
                    int PriceMin = Integer.parseInt(GiaMin);
                    int PriceMax = HDDAO.getMaxTongTien();
                    currentList = HDDAO.getListHoaDonTheoDateVaTongTien(sqlMin,sqlMax,PriceMin,PriceMax);
                    return currentList;

                }
                catch (Exception e){
                    new dialog("Vui lòng nhập đúng định dạng", dialog.ERROR_DIALOG);
                    return currentList;
                }
            }
            if (InputValidator.IsEmpty(GiaMin)){
                try {
                    int PriceMax = Integer.parseInt(GiaMax);
                    currentList = HDDAO.getListHoaDonTheoDateVaTongTien(sqlMin,sqlMax,0,PriceMax);
                    return currentList;
                }
                catch (Exception e){
                    new dialog("Vui lòng nhập đúng định dạng", dialog.ERROR_DIALOG);
                    return currentList;
                }

            }
            if (!InputValidator.IsEmpty(GiaMin) && !InputValidator.IsEmpty(GiaMax)) {
                try{
                    int PriceMin = Integer.parseInt(GiaMin);
                    int PriceMax = Integer.parseInt(GiaMax);
                    if (PriceMin > PriceMax || PriceMin < 0 || PriceMax < 0) {
                        new dialog("Vui lòng nhập khoảng giá hợp lệ", dialog.ERROR_DIALOG);
                        return currentList;
                    } else {
                        return currentList = HDDAO.getListHoaDonTheoDateVaTongTien(sqlMin, sqlMax, PriceMin, PriceMax);
                    }
                }
                catch (Exception e){
                    new dialog("Vui lòng nhập đúng định dạng", dialog.ERROR_DIALOG);
                    return currentList;
                }
            }
        } else {
            new dialog("Vui lòng nhập đúng khoảng ngày!", dialog.ERROR_DIALOG);
            return currentList;
        }
        System.out.println("test");
        return currentList;
    }

    public String getNewId() {
        return HDDAO.getNewId();
    }

    public boolean Insert(HoaDonDTO hoaDon) {
        if (HDDAO.addHoaDon(hoaDon)) {
            new dialog("Thanh toán thành công!", dialog.SUCCESS_DIALOG);
            return true;
        }
        new dialog("Thanh toán không thành công!", dialog.ERROR_DIALOG);
        return false;
    }

    public void loadData(JTable table){
        DefaultTableModel model = new DefaultTableModel(
            new String[] {
                "Mã hóa đơn", "Mã khách hàng", "Mã nhân viên", "Mã khuyến mãi","Mã ưu đãi", "Ngày lập", "Tổng tiền"
            }, 
            0 // Bắt đầu với 0 hàng
        );
        table.setModel(model);
        HoaDonBUS list = new HoaDonBUS();
        ArrayList<HoaDonDTO> listHD = list.getlistHD();
        for (int i = 0; i < list.getlistHD().size(); i++) {
            Object[] newRowData = {listHD.get(i).getMaHoaDon(), listHD.get(i).getMaKhachHang(), listHD.get(i).getMaNhanVien(), listHD.get(i).getMaKhuyenMai(), listHD.get(i).getMaUuDai(), listHD.get(i).getNgayLapHoaDon(), listHD.get(i).getTongTienHoaDon()};
            model.addRow(newRowData);
        }
        modelTmp = model;
    }

    public void TimHoaDonTheoMa(JTable table, JTextField txtMaHD){

        DefaultTableModel model = new DefaultTableModel(
            new String[] {
                "Mã hóa đơn", "Ngày lập", "Mã nhân viên", "Mã khuyến mãi", "Mã khách hàng", "Mã ưu đãi", "Tổng tiền"
            }, 
            0 // Bắt đầu với 0 hàng
        );
        table.setModel(model);
        if (txtMaHD.getText().trim().isEmpty()){
                new dialog("Vui lòng nhập mã hóa đơn để tiến hành tìm kiếm.", 1);
        }
        else{
            
            // Duyệt qua tất cả các hàng hiện có trong bảng
            for (int i = 0; i < modelTmp.getRowCount(); i++) {
                String maHD = modelTmp.getValueAt(i, 0).toString(); // Cột "Mã hóa đơn" ở vị trí 0
                // So sánh mã hóa đơn nhập vào với mã trong bảng
                if (maHD.toLowerCase().contains(txtMaHD.getText())) {
                    Object[] rowData = new Object[modelTmp.getColumnCount()];
                    // Lấy toàn bộ dữ liệu của dòng có mã khớp
                    
                    for (int j = 0; j < modelTmp.getColumnCount(); j++) {
                        rowData[j] = modelTmp.getValueAt(i, j);
                    }
                    // model.setRowCount(0);
                    // Thêm dòng khớp vào filteredModel
                    model.addRow(rowData);
                    break; // Dừng khi tìm thấy mã hóa đơn
                }
            }
        }
    }

    public void TimKiemHoaDonTheoNgay_TongTien(JDateChooser JDTuNgay,JDateChooser JDDenNgay,JTextField TextFieldGiaTu,JTextField TextFieldDenGia,JTable TblHoaDon){
        DefaultTableModel model = new DefaultTableModel(
            new String[] {
                "Mã hóa đơn", "Ngày lập", "Mã nhân viên", "Mã khuyến mãi", "Mã khách hàng", "Mã ưu đãi", "Tổng tiền"
            }, 
            0 // Bắt đầu với 0 hàng
        );
        TblHoaDon.setModel(model);
        HoaDonBUS list = new HoaDonBUS();
        ArrayList<HoaDonDTO> listHD = null;
        try {
            listHD = list.getListHD_Price_Date(JDTuNgay.getDate(), JDDenNgay.getDate(), TextFieldGiaTu.getText(), TextFieldDenGia.getText());
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        if (listHD != null) {
            for (int i = 0; i < listHD.size(); i++) {
                Object[] newRowData = {listHD.get(i).getMaHoaDon(), listHD.get(i).getMaKhachHang(), listHD.get(i).getMaNhanVien(), listHD.get(i).getMaKhuyenMai(), listHD.get(i).getMaUuDai(), listHD.get(i).getNgayLapHoaDon(), listHD.get(i).getTongTienHoaDon()};
                model.addRow(newRowData);
            }
        }
    }

    public void clicktable(){

    }
}
