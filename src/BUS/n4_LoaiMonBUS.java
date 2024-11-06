package BUS;

import java.util.ArrayList;

import DAO.n4_LoaiMonDAO;
import DTO.LoaiMonDTO;

public class n4_LoaiMonBUS {
      private n4_LoaiMonDAO loaiMonDAO;
      public n4_LoaiMonBUS() {
            loaiMonDAO = new n4_LoaiMonDAO();
      }
      public ArrayList<LoaiMonDTO> getAll() {
            return loaiMonDAO.getAll();
      }
      public LoaiMonDTO getLoaiMonById(String maLoaiMon) {
            return loaiMonDAO.getLoaiMonById(maLoaiMon);
      }
      public boolean addLoaiMon(LoaiMonDTO mon) {
            return loaiMonDAO.addLoaiMon(mon);
      }

      public boolean deleteLoaiMon(String maMon) {
            return loaiMonDAO.deleteLoaiMon(maMon);
      }

      public boolean updateLoaiMon(LoaiMonDTO mon) {
            return loaiMonDAO.updateLoaiMon(mon);
      }
}
