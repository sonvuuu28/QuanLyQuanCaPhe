/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import BUS.NhanVienBUS;
import BUS.PhanQuyenBUS;
import BUS.TaiKhoanBUS;
import DTO.PhanQuyenDTO;
import DTO.NhanVienDTO;

/**
 *
 * @author phuoc
 */
public class dlgCapTaiKhoan extends javax.swing.JPanel {
    private String ma;
    /**
     * Creates new form dlgCapTaiKhoan
     */
    public dlgCapTaiKhoan(String ma) {
        this.ma = ma;
        initComponents();
        txtMa.setText(ma);
        loadDataCmbQuyen();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnCapTaiKhoan = new javax.swing.JPanel();
        txtTenDN = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lbMa = new javax.swing.JLabel();
        lbTenDN = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        lbQuyen = new javax.swing.JLabel();
        BoxQuyen = new javax.swing.JComboBox<>();
        btnXacNhanThaydoiquyen = new javax.swing.JPanel();
        lbXacNhanThayDoiTT = new javax.swing.JLabel();

        PnCapTaiKhoan.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Cấp tài khoản");

        lbMa.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbMa.setText("Mã Nhân viên");

        lbTenDN.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbTenDN.setText("Tên đăng nhập");

        txtMa.setEditable(false);
        txtMa.setBackground(new java.awt.Color(255, 255, 255));

        lbQuyen.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbQuyen.setText("Quyền");

        BoxQuyen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn Quyền" }));

        btnXacNhanThaydoiquyen.setBackground(new java.awt.Color(219, 189, 142));

        lbXacNhanThayDoiTT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbXacNhanThayDoiTT.setText("Xác nhận thay đổi");
        lbXacNhanThayDoiTT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbXacNhanThayDoiTTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnXacNhanThaydoiquyenLayout = new javax.swing.GroupLayout(btnXacNhanThaydoiquyen);
        btnXacNhanThaydoiquyen.setLayout(btnXacNhanThaydoiquyenLayout);
        btnXacNhanThaydoiquyenLayout.setHorizontalGroup(
            btnXacNhanThaydoiquyenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnXacNhanThaydoiquyenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbXacNhanThayDoiTT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnXacNhanThaydoiquyenLayout.setVerticalGroup(
            btnXacNhanThaydoiquyenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnXacNhanThaydoiquyenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbXacNhanThayDoiTT, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PnCapTaiKhoanLayout = new javax.swing.GroupLayout(PnCapTaiKhoan);
        PnCapTaiKhoan.setLayout(PnCapTaiKhoanLayout);
        PnCapTaiKhoanLayout.setHorizontalGroup(
            PnCapTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnCapTaiKhoanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
            .addGroup(PnCapTaiKhoanLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(PnCapTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PnCapTaiKhoanLayout.createSequentialGroup()
                        .addGroup(PnCapTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbTenDN)
                            .addComponent(lbMa))
                        .addGap(18, 18, 18)
                        .addGroup(PnCapTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnXacNhanThaydoiquyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PnCapTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtMa, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                .addComponent(txtTenDN)
                                .addComponent(BoxQuyen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        PnCapTaiKhoanLayout.setVerticalGroup(
            PnCapTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnCapTaiKhoanLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(PnCapTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMa))
                .addGap(38, 38, 38)
                .addGroup(PnCapTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenDN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTenDN))
                .addGap(35, 35, 35)
                .addGroup(PnCapTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BoxQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnXacNhanThaydoiquyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnCapTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnCapTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lbXacNhanThayDoiTTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbXacNhanThayDoiTTMouseClicked
        ThemTaiKhoan();
        // this.setVisible(false);
    }//GEN-LAST:event_lbXacNhanThayDoiTTMouseClicked

    private void ThemTaiKhoan(){
        if(BoxQuyen.getSelectedItem().equals("Quản Trị Viên")){
            JOptionPane.showMessageDialog(null, "Đã tồn tại 1 tài khoản có quyền quản trị viên,\n không thể thêm tài khoản khác!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return ;            
        }
        TKBUS.themTaiKhoan(txtMa.getText(),
        txtTenDN.getText(),
        BoxQuyen.getSelectedItem() + "");
        NhanVienDTO nv = new NhanVienDTO();
        nv.setMaNhanVien(txtMa.getText());
        nv.setChucVuNhanVien((String) BoxQuyen.getSelectedItem());
        NVBUS.CapNhatChucVu(nv);
    }

    private void loadDataCmbQuyen() {
        BoxQuyen.removeAllItems();
        ArrayList<PhanQuyenDTO> dsq = PQBUS.getList();
        for (PhanQuyenDTO pq : dsq) {
            BoxQuyen.addItem(pq.getTenQuyen());
        }
    }

    private PhanQuyenBUS PQBUS = new PhanQuyenBUS();
    private TaiKhoanBUS TKBUS = new TaiKhoanBUS();
    private NhanVienBUS NVBUS = new NhanVienBUS();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxQuyen;
    private javax.swing.JPanel PnCapTaiKhoan;
    private javax.swing.JPanel btnXacNhanThaydoiquyen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbMa;
    private javax.swing.JLabel lbQuyen;
    private javax.swing.JLabel lbTenDN;
    private javax.swing.JLabel lbXacNhanThayDoiTT;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtTenDN;
    // End of variables declaration//GEN-END:variables
}
