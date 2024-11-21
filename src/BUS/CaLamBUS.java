package BUS;

import DAO.n6_CaLamDAO;
import DTO.CaLamDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CaLamBUS {

    public static CaLamBUS getInstance() {
        return new CaLamBUS();
    }

    public String MaTuDong() {
        String ma = n6_CaLamDAO.getInstance().taoMaCaLam();
        return ma;
    }

    public void insert(String MaCaLam, String TenCaLam, String ThoiGianVaoCaLam, String ThoiGianRaCaLam) {
        CaLamDTO ca_dto = new CaLamDTO(MaCaLam, TenCaLam, ThoiGianVaoCaLam, ThoiGianRaCaLam, true);
        Boolean ca_dao_insert = n6_CaLamDAO.getInstance().insert(ca_dto);
        if (ca_dao_insert) {
            JOptionPane.showMessageDialog(null, "Tạo ca làm thành công");
        } else {
            JOptionPane.showMessageDialog(null, "Trùng mã ca làm!");
        }
    }

    public void update(String MaCaLam, String TenCaLam, String ThoiGianVaoCaLam, String ThoiGianRaCaLam) {
        CaLamDTO ca_dto = new CaLamDTO(MaCaLam, TenCaLam, ThoiGianVaoCaLam, ThoiGianRaCaLam, true);
        Boolean ca_dao_update = n6_CaLamDAO.getInstance().update(ca_dto);
        if (ca_dao_update) {
            JOptionPane.showMessageDialog(null, "Sửa ca làm thành công");
        } else {
            JOptionPane.showMessageDialog(null, "Không tồn tại mã ca làm!");
        }
    }

    public void delete(String MaCaLam) {
        Boolean ca_dao_delete = n6_CaLamDAO.getInstance().delete(MaCaLam);
        if (ca_dao_delete) {
            JOptionPane.showMessageDialog(null, "Xóa ca làm thành công");
        } else {
            JOptionPane.showMessageDialog(null, "Không tồn tại mã ca làm!");
        }
    }

    public void data(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<CaLamDTO> ds = n6_CaLamDAO.getInstance().showAll();
        int i = 1;
        for (CaLamDTO ca : ds) {
            model.addRow(new Object[]{i, ca.getMaCaLam(), ca.getTenCaLam(), Util.LichLam_CaLam.time_sql_sang_hhmm(ca.getThoiGianVaoCaLam()),
                Util.LichLam_CaLam.time_sql_sang_hhmm(ca.getThoiGianRaCaLam())
            });
            i++;
        }
    }
    
    public void TimKiem(JTable table, String MaCaLam, String TenCaLam, String ThoiGianVaoCaLam, String ThoiGianRaCaLam) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<CaLamDTO> ds = n6_CaLamDAO.getInstance().search(MaCaLam, TenCaLam, ThoiGianVaoCaLam, ThoiGianRaCaLam);
        int i = 1;
        for (CaLamDTO ca : ds) {
            model.addRow(new Object[]{i, ca.getMaCaLam(), ca.getTenCaLam(), Util.LichLam_CaLam.time_sql_sang_hhmm(ca.getThoiGianVaoCaLam()),
                Util.LichLam_CaLam.time_sql_sang_hhmm(ca.getThoiGianRaCaLam())
            });
            i++;
        }
    }

    public static void main(String args[]) {
        CaLamBUS ca_bus = CaLamBUS.getInstance();
        n6_CaLamDAO ca_dao = n6_CaLamDAO.getInstance();
        CaLamDTO ca_DTO = new CaLamDTO(ca_dao.taoMaCaLam(), "Ca D", "10:00", "14:00", true);
    }
}
