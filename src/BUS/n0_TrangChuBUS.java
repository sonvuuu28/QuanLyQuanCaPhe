package BUS;

import DAO.n0_TrangChuDAO;
import DTO.NhanVienDTO;

public class n0_TrangChuBUS {
      private n0_TrangChuDAO trangChuDAO;
      public n0_TrangChuBUS(){
            this.trangChuDAO = new n0_TrangChuDAO();
      }
      public NhanVienDTO getById(String maNhanVien) {
            return trangChuDAO.getById(maNhanVien);
      }
}
