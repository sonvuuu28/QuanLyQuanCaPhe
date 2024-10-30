package BUS;

import Util.InputValidator;
import DAO.NhanVienDAO;
import DTO.NhanVienDTO;
import Util.dialog;
import java.util.ArrayList;

public class NhanVienBUS {

    private ArrayList<NhanVienDTO> listNV = null;
    private NhanVienDAO nvDAO = new NhanVienDAO();

    public NhanVienBUS() {
        docDanhSach();
    }

    public void docDanhSach() {
        listNV = nvDAO.getDanhSachNhanVien();
    }

    public ArrayList<NhanVienDTO> getlistNV() {
        if (listNV == null) {
            docDanhSach();
        }
        return listNV;
    }

    public NhanVienDTO getById(String maNV) {
        return nvDAO.getNhanVien(maNV);
    }

    public boolean themNhanVien(String ho, String ten, String gioiTinh, String dienThoai,int luong, int trangThai) {
        ho = ho.trim();
        ten = ten.trim();
        dienThoai = dienThoai.trim();
        int tThai = trangThai;
        if (ten.equals("")) {
            new dialog("Tên không được để trống!", dialog.ERROR_DIALOG);
            return false;
        }
        if (!InputValidator.isValidName(ho) || !InputValidator.isValidName(ten)) {
            new dialog("Họ hoặc tên không hợp lệ", dialog.ERROR_DIALOG);
            return false;
        }
        if (dienThoai.equals("")) {
            new dialog("Điện thoại không được để trống!", dialog.ERROR_DIALOG);
            return false;
        }
        if (!InputValidator.isValidPhoneNumber(dienThoai)) {
            new dialog("Số điện thoại không hợp lệ", dialog.ERROR_DIALOG);
            return false;
        }
        NhanVienDTO nv = new NhanVienDTO();
        nv.setHo(ho);
        nv.setTen(ten);
        nv.setGioiTinh(gioiTinh);
        nv.setDienThoai(dienThoai);
        nv.setLuong(luong);
        nv.setTrangThai(tThai);
        boolean flag = nvDAO.themNhanVien(nv);
        if (flag) {
            new dialog("Thêm thất bại!", dialog.ERROR_DIALOG);
        } else {
            new dialog("Thêm thành công!", dialog.SUCCESS_DIALOG);
        }
        return flag;
    }

    public boolean updateNhanVien(String ma, String ho, String ten, String gioiTinh, String dienThoai, int luong) {
        int maNV = Integer.parseInt(ma);
        ho = ho.trim();
        ten = ten.trim();
        dienThoai = dienThoai.trim();

        if (ten.equals("")) {
            new dialog("Tên không được để trống!", dialog.ERROR_DIALOG);
            return false;
        }
        if (dienThoai.equals("")) {
            new dialog("Điện thoại không được để trống!", dialog.ERROR_DIALOG);
            return false;
        }
        NhanVienDTO nv = new NhanVienDTO();
        nv.setMaNV(maNV);
        nv.setHo(ho);
        nv.setTen(ten);
        nv.setGioiTinh(gioiTinh);
        nv.setDienThoai(dienThoai);
        nv.setLuong(luong);
        boolean flag = nvDAO.updateInfoNhanVien(nv);
        if (flag) {
            new dialog("Cập nhập thất bại!", dialog.ERROR_DIALOG);
        } else {
            new dialog("Cập nhập thành công!", dialog.SUCCESS_DIALOG);
        }
        return flag;
    }

    public ArrayList<NhanVienDTO> timNhanVien(String tuKhoa) {
        tuKhoa = tuKhoa.toLowerCase();
        ArrayList<NhanVienDTO> dsnv = new ArrayList<>();
        for (NhanVienDTO nv : listNV) {
            if (nv.getHo().toLowerCase().contains(tuKhoa) || nv.getTen().toLowerCase().contains(tuKhoa)
                    || nv.getGioiTinh().toLowerCase().contains(tuKhoa) || nv.getDienThoai().contains(tuKhoa)) {
                dsnv.add(nv);
            }
        }
        return dsnv;
    }

    public boolean xoaNhanVien(String ma) {
        try {
            int maNV = Integer.parseInt(ma);
            dialog dlg = new dialog("Bạn có chắc chắn muốn xoá không?", dialog.WARNING_DIALOG);
            boolean flag = false;
            if (dlg.getAction() == dialog.OK_OPTION) {
                flag = nvDAO.deleteNhanVien(maNV);
                if (flag) {
                    new dialog("Xoá thành công!", dialog.SUCCESS_DIALOG);
                } else {
                    new dialog("Xoá thất bại!", dialog.ERROR_DIALOG);
                }
            }
            return flag;
        } catch (Exception e) {
            new dialog("Bạn chưa chọn nhân viên!", dialog.ERROR_DIALOG);
        }
        return false;
    }

    public boolean xoaFKHoadon_PhieuNhap_NV() {
        nvDAO.deletaFKHoandon_PhieuNhap();
        boolean ketqua = nvDAO.deletaFKHoandon_PhieuNhap();
        return ketqua;
    }

    public boolean updateFKHoadon_PhieuNhap_NV() {
        nvDAO.updateFKHoandon_PhieuNhap();
        boolean ketqua = nvDAO.updateFKHoandon_PhieuNhap();
        return ketqua;
    }

    public boolean xoaAllNhanVien() {
        nvDAO.xoaAllInfor();
        boolean ketqua = nvDAO.xoaAllInfor();
        return ketqua;
    }

    public boolean nhapExcel(String manv, String ho, String ten, String gioiTinh, String dienThoai,String luong, int trangThai) {
        int tThai = trangThai;
        // int maNV = Integer.parseInt(manv);
        int Luong = Integer.parseInt(luong);
        NhanVienDTO nv = new NhanVienDTO();
        nv.setMaNhanVien(manv);
        nv.setTenNhanVien(ho);
        nv.setGioiTinhNhanVien(ten);
        nv.setGioiTinh(gioiTinh);
        nv.setDienThoai(dienThoai);
        nv.setLuong(Luong);
        nv.setTrangThai(tThai);
        boolean flag = nvDAO.importNhanVienFromExcel(nv);
        return flag;
    }

    public void CapNhatChucVu(NhanVienDTO nv) {
        if (!nvDAO.capNhatChucVu(nv)) {
            new dialog("Cập nhật chức vụ thất bại", dialog.ERROR_DIALOG);
        }
    }
}
