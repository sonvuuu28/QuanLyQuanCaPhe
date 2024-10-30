package BUS;

import DAO.n6_CaLamDAO;
import DTO.CaLamDTO;
import javax.swing.JOptionPane;

public class CaLamBUS {

    public static CaLamBUS getInstance() {
        return new CaLamBUS();
    }

    public void insert(CaLamDTO ca_dto) {
        n6_CaLamDAO ca_dao = n6_CaLamDAO.getInstance();
        Boolean ca_dao_insert = ca_dao.insert(ca_dto);
        if (ca_dao_insert) {
            JOptionPane.showMessageDialog(null, "Tạo ca làm thành công");
        } else {
            JOptionPane.showMessageDialog(null, "Trùng mã ca làm!");
        }
    }
    
    public void update(CaLamDTO ca_dto) {
        n6_CaLamDAO ca_dao = n6_CaLamDAO.getInstance();
        Boolean ca_dao_update = ca_dao.update(ca_dto);
        if (ca_dao_update) {
            JOptionPane.showMessageDialog(null, "Tạo ca làm thành công");
        } else {
            JOptionPane.showMessageDialog(null, "Trùng mã ca làm!");
        }
    }

    public static void main(String args[]) {
        CaLamBUS ca_bus = CaLamBUS.getInstance();
        n6_CaLamDAO ca_dao = n6_CaLamDAO.getInstance();
        CaLamDTO ca_DTO = new CaLamDTO(ca_dao.taoMaCaLam(), "Ca D", "10:00", "14:00", true);
        ca_bus.insert(ca_DTO);
    }
}
