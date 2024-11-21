package BUS;

import DAO.n0_LoginDAO;
import DTO.TaiKhoanDTO;
import GUI.n0_LoginGUI;
import GUI.n0_TrangChuGUI;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class n0_LoginBUS {

    private n0_LoginDAO loginDAO;

    public static n0_LoginBUS getInstance() {
        return new n0_LoginBUS();
    }

    public n0_LoginBUS() {
        this.loginDAO = new n0_LoginDAO();
    }

    public TaiKhoanDTO checkLogin(JTextField ten, JTextField mk, n0_LoginGUI login) {
        String username = ten.getText();
        String password = mk.getText();
        TaiKhoanDTO dto = null;
        try {
            dto = loginDAO.checkLogin(username, password);
            System.out.println(dto.toString());
            login.dispose();
            n0_TrangChuGUI trang_mau = new n0_TrangChuGUI(dto.getMaNhanVien());
            trang_mau.setVisible(true);
            trang_mau.setLocationRelativeTo(null);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không tồn tại tài khoản đã nhập !", "Thông báo", JOptionPane.ERROR_MESSAGE);
//            ten.setText("");
            mk.setText("");
            mk.requestFocus();

        }
        return dto;
    }

//    public static void main(String[] args) {
//        n0_LoginBUS bus = new n0_LoginBUS();
//        bus.checkLogin("user11", "password1");
//    }
}
