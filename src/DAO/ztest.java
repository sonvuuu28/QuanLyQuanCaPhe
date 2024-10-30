package DAO;

import DTO.HoaDonDTO;
import DTO.MonDTO;
import DTO.TaiKhoanDTO;
import java.util.ArrayList;
import java.sql.*;

public class ztest {

    public static void n0_login() {
        n0_LoginDAO login = new n0_LoginDAO();
        TaiKhoanDTO a = login.checkLogin("user1", "password1");
        System.out.println(a.toString());
    }

    public static void n1_HoaDon() {
        n1_HoaDonDAO hoa_don_DAO = new n1_HoaDonDAO();
        // getListHoaDon
//        ArrayList<HoaDonDTO> dshd = hoa_don_DAO.getListHoaDon();
//        for(HoaDonDTO a : dshd){
//            System.out.println(a.toString());
//        }
        // addHoaDon
//        HoaDonDTO hoa_don_DTO = new HoaDonDTO("HD007", Date.valueOf("2024-10-28"), 150000, "NV001", "KH001", "UD001", "KM001");
//        if (hoa_don_DAO.addHoaDon(hoa_don_DTO)) {
//            System.out.println("thêm thành công");
//        } else {
//            System.out.println("thêm thất bại");
//        }

        // getHoaDonTheoMHD
//        ArrayList<HoaDonDTO> dshd = hoa_don_DAO.getHoaDonTheoMHD("HD001");
//        for (HoaDonDTO a : dshd) {
//            System.out.println(a.toString());
//        }
        // getListHoaDonTheoDateVaTongTien
//        ArrayList<HoaDonDTO> dshd = hoa_don_DAO.getListHoaDonTheoDateVaTongTien(Date.valueOf("2024-10-04"),
//                Date.valueOf("2024-10-05"), 5500, 96000);
//        for (HoaDonDTO a : dshd) {
//            System.out.println(a.toString());
//        }
        
        System.out.println(hoa_don_DAO.getNewId());
        
    }

    public static void n4_Mon(){
        n4_MonDAO mon_dao = new n4_MonDAO();
//        ArrayList<MonDTO> ds = mon_dao.getAll();
//        for (MonDTO a : ds) {
//            System.out.println(a.toString());
//        }
        MonDTO mon_DTO = mon_dao.getMonById("M001");
        System.out.println(mon_DTO.toString());
    }
    
    public static void main(String args[]) {
//        n0_login();
//        n1_HoaDon();
        n4_Mon();
    }
}
