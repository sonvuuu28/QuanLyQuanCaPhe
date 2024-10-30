package BUS;

import Util.dialog;
import DAO.PhanQuyenDAO;
import DTO.PhanQuyenDTO;
import java.util.ArrayList;

public class PhanQuyenBUS {

    public static PhanQuyenDTO currentQuyen = null;
    private PhanQuyenDAO phanQuyenDAO = new PhanQuyenDAO();

    public PhanQuyenBUS() {
    }

    private boolean checkDuplicateName(String tenQuyen) {
        ArrayList<PhanQuyenDTO> phanQuyens = phanQuyenDAO.selectAll();
        for (PhanQuyenDTO phanQuyen : phanQuyens) {
            if (phanQuyen.getTenQuyen().equals(tenQuyen.strip())) {
                new dialog("Tên quyền đã tồn tại", dialog.ERROR_DIALOG);
                return true;
            }
        }
        return false;
    }

    public boolean Insert(String tenQuyen) {
        if (checkDuplicateName(tenQuyen)) {
            return false;
        }
        String maQuyen = getNextMaQuyen();
        if (phanQuyenDAO.insert(new PhanQuyenDTO(maQuyen, tenQuyen, 0, 0, 0, 0, 0, 1)) == 0) {
            new dialog("Không thể thêm quyền", dialog.ERROR_DIALOG);
            return false;
        }
        new dialog("Thêm quyền thành công", dialog.SUCCESS_DIALOG);
        return true;
    }

    public boolean Update(PhanQuyenDTO t) {
        if (phanQuyenDAO.update(t) == 0) {
            new dialog("Không thể sửa quyền", dialog.ERROR_DIALOG);
            return false;
        }
        new dialog("Sửa quyền thành công", dialog.SUCCESS_DIALOG);
        return true;
    }

    public boolean Delete(String ma) {
        if (phanQuyenDAO.delete(ma) == 0) {
            new dialog("Không thể xóa", dialog.ERROR_DIALOG);
            return false;
        }
        new dialog("Xóa thành công", dialog.SUCCESS_DIALOG);
        return true;
    }

    public PhanQuyenDTO getById(String ma) {
        return phanQuyenDAO.selectById(new PhanQuyenDTO(ma, null, 0, 0, 0, 0, 0, 0));
    }

    public ArrayList<PhanQuyenDTO> getList() {
        return phanQuyenDAO.selectAll();
    }

    public void UpdateCurrentQuyen() {
        if (DangNhapBUS.taiKhoanLogin == null) {
            return;
        }
        String maQuyen = DangNhapBUS.taiKhoanLogin.getMaQuyen();
        PhanQuyenDTO phanQuyentmp = new PhanQuyenDTO();
        phanQuyentmp.setMaPhanQuyen(maQuyen);
        currentQuyen = phanQuyenDAO.selectById(phanQuyentmp);
    }

    private int getNextMaQuyen() {
        return phanQuyenDAO.getNewMa() + 1;
    }
}
