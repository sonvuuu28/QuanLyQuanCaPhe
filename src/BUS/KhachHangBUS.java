package BUS;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import DAO.KhachHangDAO;
import DAO.NhanVienDAO;
import DTO.KhachHangDTO;
import DTO.NhanVienDTO;
import Util.InputValidator;
import Util.dialog;

public class KhachHangBUS {
    private ArrayList<KhachHangDTO> listKH = null;
    private KhachHangDAO khDAO = new KhachHangDAO();

   public KhachHangBUS() {
       docDanhSach();
   }

   public void docDanhSach() {
       listKH = khDAO.getDanhSachKhachHang();
   }

   public ArrayList<KhachHangDTO> getlistKH() {
       if (listKH == null) {
           docDanhSach();
       }
       return listKH;
   }

   public KhachHangDTO getById(String maKH) {
       return khDAO.getKhachHangByMaKH(maKH);
   }

   public boolean themKhachHang(String ten, Date ngaysinh, String gioitinh, String dienThoai, int chiTieu) {
        ten = ten.trim();
        dienThoai = dienThoai.trim();
        KhachHangDTO kh = new KhachHangDTO();
        kh.setTenKhachHang(ten);
        kh.setGioiTinhKhachHang(gioitinh);
        kh.setSoDienThoaiKhachHang(dienThoai);
        kh.setNgaySinhKhachHang(ngaysinh);
        kh.setChiTieuKhachHang(chiTieu);
        boolean flag = khDAO.themKhachHang(kh);
        if (flag) {
                new dialog("Thêm thành công!", dialog.SUCCESS_DIALOG);
        } else {
                new dialog("Thêm thất bại!", dialog.ERROR_DIALOG);
        }
        return flag;
   }

   public void loadDataTblNhanVien(JTable tbl){
        DefaultTableModel model = new DefaultTableModel(
            new String[] {
                "Mã KH", "Tên KH", "Giới tính", "Số điện thoại", "Ngày sinh",  "Tổng Chi tiêu"
            }, 
            0 // Bắt đầu với 0 hàng
        );
        tbl.setModel(model);
        docDanhSach();
        ArrayList<KhachHangDTO> dsnv = getlistKH();

        for (KhachHangDTO nv : dsnv) {
            Vector<Object> vec = new Vector<>();
            vec.add(nv.getMaKhachHang());
            vec.add(nv.getTenKhachHang());
            vec.add(nv.getGioiTinhKhachHang());
            vec.add(nv.getSoDienThoaiKhachHang());
            vec.add(nv.getNgaySinhKhachHang());
            vec.add(nv.getChiTieuKhachHang());
            model.addRow(vec);
        }
    }
}
