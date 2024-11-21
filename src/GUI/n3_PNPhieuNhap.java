package GUI;

import Util.TableCustom;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane; 

import javax.swing.JScrollBar;
import javax.swing.JTable;

import com.toedter.calendar.JDateChooser;

import BUS.PhieuNhapBUS;
import BUS.PhieuNhapBUS.NonEditableTableModel;
import java.util.Date;


public class n3_PNPhieuNhap extends javax.swing.JPanel {
    private PhieuNhapBUS phieuNhapBUS;
    private JTable chiTietPhieuNhapTable;
    private JScrollPane chiTietPhieuNhapScrollPane;
    private n3_PNChiTietPhieuNhap chiTietPhieuNhapPanel;
    public n3_PNPhieuNhap() {
        initComponents();
        TableCustom.apply(ScrollPane, TableCustom.TableType.MULTI_LINE);
        phieuNhapBUS = new PhieuNhapBUS();
        phieuNhapBUS.loadDataToTable_PhieuNhap(Table);

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP_NoiDungPhieuNhap = new javax.swing.JPanel();
        jL_ThongTinPhieuNhap = new javax.swing.JLabel();
        jP_NoiDungNhap = new javax.swing.JPanel();
        jP_TimKiemMaPN = new javax.swing.JPanel();
        jL_TimKiemMaPN = new javax.swing.JLabel();
        jP_TimKiem = new javax.swing.JPanel();
        jL_MaPN = new javax.swing.JLabel();
        jT_TimKiem = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btn_TimKiem = new javax.swing.JButton();
        btn_TaiLai = new javax.swing.JButton();
        jP_TimKiemPhieuNhap = new javax.swing.JPanel();
        jL_TimKiemPN = new javax.swing.JLabel();
        jP_NhapThongTin = new javax.swing.JPanel();
        jP_TuNgay = new javax.swing.JPanel();
        jL_TuNgay = new javax.swing.JLabel();
        // jT_TuNgay = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jP_DenNgay = new javax.swing.JPanel();
        jL_DenNgay = new javax.swing.JLabel();
        // jT_DenNgay = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jP_GiaDen = new javax.swing.JPanel();
        jL_GiaDen = new javax.swing.JLabel();
        jT_GiaDen = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jP_GiaTu = new javax.swing.JPanel();
        jL_GiaTu = new javax.swing.JLabel();
        jT_GiaTu = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        ScrollPane = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        chiTietPhieuNhapTable = new javax.swing.JTable();
        chiTietPhieuNhapScrollPane = new javax.swing.JScrollPane();
        chiTietPhieuNhapPanel = new n3_PNChiTietPhieuNhap();

        setMaximumSize(new java.awt.Dimension(1100, 600));
        setMinimumSize(new java.awt.Dimension(1100, 600));
        setPreferredSize(new java.awt.Dimension(1100, 600));

        jP_NoiDungPhieuNhap.setBackground(new java.awt.Color(219, 189, 142));
        jP_NoiDungPhieuNhap.setMaximumSize(new java.awt.Dimension(1100, 600));
        jP_NoiDungPhieuNhap.setMinimumSize(new java.awt.Dimension(1100, 600));
        jP_NoiDungPhieuNhap.setPreferredSize(new java.awt.Dimension(1100, 600));

        jL_ThongTinPhieuNhap.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jL_ThongTinPhieuNhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_ThongTinPhieuNhap.setText("Thông Tin Phiếu Nhập");

        jP_NoiDungNhap.setBackground(new java.awt.Color(219, 189, 142));
        jP_NoiDungNhap.setMaximumSize(new java.awt.Dimension(1100, 570));
        jP_NoiDungNhap.setMinimumSize(new java.awt.Dimension(1100, 570));
        jP_NoiDungNhap.setPreferredSize(new java.awt.Dimension(1102, 600));

        jP_TimKiemMaPN.setBackground(new java.awt.Color(255, 255, 255));
        jP_TimKiemMaPN.setMaximumSize(new java.awt.Dimension(630, 250));
        jP_TimKiemMaPN.setMinimumSize(new java.awt.Dimension(630, 250));
        jP_TimKiemMaPN.setPreferredSize(new java.awt.Dimension(630, 250));

        jL_TimKiemMaPN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jL_TimKiemMaPN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_TimKiemMaPN.setText("Tìm Kiếm Mã Phiếu Nhập");

        jP_TimKiem.setBackground(new java.awt.Color(255, 255, 255));

        jL_MaPN.setBackground(new java.awt.Color(255, 255, 255));
        jL_MaPN.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jL_MaPN.setText("Mã Phiếu Nhập");
        jL_MaPN.setOpaque(true);

        jT_TimKiem.setToolTipText("");
        jT_TimKiem.setBorder(null);
        jT_TimKiem.setMaximumSize(new java.awt.Dimension(200, 20));
        jT_TimKiem.setMinimumSize(new java.awt.Dimension(200, 20));
        jT_TimKiem.setPreferredSize(new java.awt.Dimension(200, 20));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setMaximumSize(new java.awt.Dimension(300, 5));
        jSeparator1.setMinimumSize(new java.awt.Dimension(300, 5));
        jSeparator1.setPreferredSize(new java.awt.Dimension(300, 5));

        javax.swing.GroupLayout jP_TimKiemLayout = new javax.swing.GroupLayout(jP_TimKiem);
        jP_TimKiem.setLayout(jP_TimKiemLayout);
        jP_TimKiemLayout.setHorizontalGroup(
            jP_TimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_TimKiemLayout.createSequentialGroup()
                .addGroup(jP_TimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP_TimKiemLayout.createSequentialGroup()
                        .addComponent(jL_MaPN, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jT_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_TimKiemLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jP_TimKiemLayout.setVerticalGroup(
            jP_TimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_TimKiemLayout.createSequentialGroup()
                .addGroup(jP_TimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_MaPN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btn_TimKiem.setBackground(new java.awt.Color(0, 0, 0));
        btn_TimKiem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_TimKiem.setForeground(new java.awt.Color(255, 255, 255));
        btn_TimKiem.setText("Tìm Kiếm");
        btn_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // btn_TimKiemActionPerformed(evt);
                btn_TimKiemNgayGiaActionPerformed(evt);
            }
        });
        btn_TimKiem.setMaximumSize(new java.awt.Dimension(100, 24));
        btn_TimKiem.setMinimumSize(new java.awt.Dimension(100, 24));
        btn_TimKiem.setPreferredSize(new java.awt.Dimension(100, 24));

        btn_TaiLai.setBackground(new java.awt.Color(0, 0, 0));
        btn_TaiLai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_TaiLai.setForeground(new java.awt.Color(255, 255, 255));
        btn_TaiLai.setText("Tải Lại");
        btn_TaiLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TaiLaiActionPerformed(evt);
            }
        });

        btn_TaiLai.setMaximumSize(new java.awt.Dimension(100, 24));
        btn_TaiLai.setMinimumSize(new java.awt.Dimension(100, 24));
        btn_TaiLai.setPreferredSize(new java.awt.Dimension(100, 24));

        javax.swing.GroupLayout jP_TimKiemMaPNLayout = new javax.swing.GroupLayout(jP_TimKiemMaPN);
        jP_TimKiemMaPN.setLayout(jP_TimKiemMaPNLayout);
        jP_TimKiemMaPNLayout.setHorizontalGroup(
            jP_TimKiemMaPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jL_TimKiemMaPN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jP_TimKiemMaPNLayout.createSequentialGroup()
                .addGroup(jP_TimKiemMaPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP_TimKiemMaPNLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jP_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jP_TimKiemMaPNLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(btn_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btn_TaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jP_TimKiemMaPNLayout.setVerticalGroup(
            jP_TimKiemMaPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_TimKiemMaPNLayout.createSequentialGroup()
                .addComponent(jL_TimKiemMaPN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jP_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jP_TimKiemMaPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_TaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        jP_TimKiemPhieuNhap.setBackground(new java.awt.Color(255, 255, 255));
        jP_TimKiemPhieuNhap.setMaximumSize(new java.awt.Dimension(450, 250));
        jP_TimKiemPhieuNhap.setMinimumSize(new java.awt.Dimension(450, 250));

        jL_TimKiemPN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jL_TimKiemPN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_TimKiemPN.setText("Tìm Kiếm Phiếu Nhập");

        jP_NhapThongTin.setBackground(new java.awt.Color(255, 255, 255));

        jP_TuNgay.setBackground(new java.awt.Color(255, 255, 255));

        jL_TuNgay.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jL_TuNgay.setText("Từ Ngày:");

       
        jdc_TuNgay = new JDateChooser();
        jdc_TuNgay.setMaximumSize(new java.awt.Dimension(260, 25));
        jdc_TuNgay.setMinimumSize(new java.awt.Dimension(260, 25));
        jdc_TuNgay.setPreferredSize(new java.awt.Dimension(260, 25));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setMaximumSize(new java.awt.Dimension(260, 5));
        jSeparator2.setMinimumSize(new java.awt.Dimension(260, 5));
        jSeparator2.setPreferredSize(new java.awt.Dimension(260, 5));

        javax.swing.GroupLayout jP_TuNgayLayout = new javax.swing.GroupLayout(jP_TuNgay);
        jP_TuNgay.setLayout(jP_TuNgayLayout);
        jP_TuNgayLayout.setHorizontalGroup(
            jP_TuNgayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_TuNgayLayout.createSequentialGroup()
                .addComponent(jL_TuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jP_TuNgayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdc_TuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jP_TuNgayLayout.setVerticalGroup(
            jP_TuNgayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_TuNgayLayout.createSequentialGroup()
                .addGroup(jP_TuNgayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_TuNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jdc_TuNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jP_DenNgay.setBackground(new java.awt.Color(255, 255, 255));

        jL_DenNgay.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jL_DenNgay.setText("Đến Ngày:");

        
       jdc_DenNgay = new JDateChooser();
        jdc_DenNgay.setMaximumSize(new java.awt.Dimension(260, 25));
        jdc_DenNgay.setMinimumSize(new java.awt.Dimension(260, 25));
        jdc_DenNgay.setPreferredSize(new java.awt.Dimension(260, 25));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setMaximumSize(new java.awt.Dimension(260, 5));
        jSeparator3.setMinimumSize(new java.awt.Dimension(260, 5));
        jSeparator3.setPreferredSize(new java.awt.Dimension(260, 5));

        javax.swing.GroupLayout jP_DenNgayLayout = new javax.swing.GroupLayout(jP_DenNgay);
        jP_DenNgay.setLayout(jP_DenNgayLayout);
        jP_DenNgayLayout.setHorizontalGroup(
            jP_DenNgayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_DenNgayLayout.createSequentialGroup()
                .addComponent(jL_DenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jP_DenNgayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdc_DenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jP_DenNgayLayout.setVerticalGroup(
            jP_DenNgayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_DenNgayLayout.createSequentialGroup()
                .addGroup(jP_DenNgayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_DenNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jdc_DenNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jP_GiaDen.setBackground(new java.awt.Color(255, 255, 255));

        jL_GiaDen.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jL_GiaDen.setText("Giá Đến:");

        jT_GiaDen.setBorder(null);
        jT_GiaDen.setMaximumSize(new java.awt.Dimension(260, 25));
        jT_GiaDen.setMinimumSize(new java.awt.Dimension(260, 25));
        jT_GiaDen.setPreferredSize(new java.awt.Dimension(260, 25));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator5.setMaximumSize(new java.awt.Dimension(260, 5));
        jSeparator5.setMinimumSize(new java.awt.Dimension(260, 5));
        jSeparator5.setPreferredSize(new java.awt.Dimension(260, 5));

        javax.swing.GroupLayout jP_GiaDenLayout = new javax.swing.GroupLayout(jP_GiaDen);
        jP_GiaDen.setLayout(jP_GiaDenLayout);
        jP_GiaDenLayout.setHorizontalGroup(
            jP_GiaDenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_GiaDenLayout.createSequentialGroup()
                .addComponent(jL_GiaDen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jP_GiaDenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_GiaDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jP_GiaDenLayout.setVerticalGroup(
            jP_GiaDenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_GiaDenLayout.createSequentialGroup()
                .addGroup(jP_GiaDenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_GiaDen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jT_GiaDen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jP_GiaTu.setBackground(new java.awt.Color(255, 255, 255));

        jL_GiaTu.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jL_GiaTu.setText("Giá Từ:");

        jT_GiaTu.setBorder(null);
        jT_GiaTu.setMaximumSize(new java.awt.Dimension(260, 25));
        jT_GiaTu.setMinimumSize(new java.awt.Dimension(260, 25));
        jT_GiaTu.setPreferredSize(new java.awt.Dimension(260, 25));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator4.setMaximumSize(new java.awt.Dimension(260, 5));
        jSeparator4.setMinimumSize(new java.awt.Dimension(260, 5));
        jSeparator4.setPreferredSize(new java.awt.Dimension(260, 5));

        javax.swing.GroupLayout jP_GiaTuLayout = new javax.swing.GroupLayout(jP_GiaTu);
        jP_GiaTu.setLayout(jP_GiaTuLayout);
        jP_GiaTuLayout.setHorizontalGroup(
            jP_GiaTuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_GiaTuLayout.createSequentialGroup()
                .addGroup(jP_GiaTuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jP_GiaTuLayout.createSequentialGroup()
                        .addComponent(jL_GiaTu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jT_GiaTu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jP_GiaTuLayout.setVerticalGroup(
            jP_GiaTuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_GiaTuLayout.createSequentialGroup()
                .addGroup(jP_GiaTuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_GiaTu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jT_GiaTu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jP_NhapThongTinLayout = new javax.swing.GroupLayout(jP_NhapThongTin);
        jP_NhapThongTin.setLayout(jP_NhapThongTinLayout);
        jP_NhapThongTinLayout.setHorizontalGroup(
            jP_NhapThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_NhapThongTinLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jP_NhapThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jP_TuNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jP_DenNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jP_GiaDen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jP_GiaTu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        jP_NhapThongTinLayout.setVerticalGroup(
            jP_NhapThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_NhapThongTinLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jP_TuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jP_DenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jP_GiaTu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jP_GiaDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jP_TimKiemPhieuNhapLayout = new javax.swing.GroupLayout(jP_TimKiemPhieuNhap);
        jP_TimKiemPhieuNhap.setLayout(jP_TimKiemPhieuNhapLayout);
        jP_TimKiemPhieuNhapLayout.setHorizontalGroup(
            jP_TimKiemPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jL_TimKiemPN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_TimKiemPhieuNhapLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jP_NhapThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jP_TimKiemPhieuNhapLayout.setVerticalGroup(
            jP_TimKiemPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_TimKiemPhieuNhapLayout.createSequentialGroup()
                .addComponent(jL_TimKiemPN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jP_NhapThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(1090, 250));
        jPanel3.setMinimumSize(new java.awt.Dimension(1090, 250));
        jPanel3.setPreferredSize(new java.awt.Dimension(1090, 250));
        jPanel3.setRequestFocusEnabled(false);

        Table.setModel( new NonEditableTableModel(
            new Object [][] {},
            new String [] {
                "Mã PN", "Ngày Lập", "Tổng Tiền", "Mã NV", "Mã NCC"
            }
        ));
        Table.setFillsViewportHeight(true);
        Table.setRowHeight(25); // Thiết lập độ cao dòng


        // Table.setMaximumSize(new java.awt.Dimension(1090, 250));
        // Table.setMinimumSize(new java.awt.Dimension(1090, 250));
        // Table.setPreferredSize(new java.awt.Dimension(1090, 250));
        ScrollPane.setViewportView(Table);
        // ScrollPane.setPreferredSize(new Dimension(1090, 500)); // Tăng chiều cao nếu cần
        // ScrollPane.setPreferredSize(new Dimension(1090, 600));



        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                // int row = Table.getSelectedRow();
                // if (row != -1) {
                //     Object maPNObj = Table.getValueAt(row, 0);
                //     Object ngayLapObj = Table.getValueAt(row, 1);
                //     Object tongTienObj = Table.getValueAt(row, 2);
                //     Object maNVObj = Table.getValueAt(row, 3);
                //     Object maNCCObj = Table.getValueAt(row, 4);
        
                //     if (maPNObj == null || ngayLapObj == null || tongTienObj == null || maNVObj == null || maNCCObj == null) {
                //         JOptionPane.showMessageDialog(null, "Dữ liệu không hợp lệ trong bảng.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                //         return;
                //     }
        
                    // String maPN = maPNObj.toString();
                    // String ngayLap = ngayLapObj.toString();
                    // int tongTien = Integer.parseInt(tongTienObj.toString());
                    // String maNV = maNVObj.toString();
                    // String maNCC = maNCCObj.toString();
        
                    // PhieuNhapBUS phieuNhapBUS = new PhieuNhapBUS();
                    // Thực hiện các thao tác với phieuNhapBUS nếu cần
                // }
                int row = Table.getSelectedRow();
                if (row != -1) {
                    Object maPNObj = Table.getValueAt(row, 0);
                    if (maPNObj != null) {
                        String maPN = maPNObj.toString();
                        phieuNhapBUS.loadChiTietPhieuNhapToTable(chiTietPhieuNhapTable, maPN);
                        showChiTietPhieuNhapPanel(maPN);
                    }
                }
            }
        });
        // chiTietPhieuNhapTable.setModel( new NonEditableTableModel(
        //     new Object [][] {},
        //     new String [] {
        //         "Mã PN", "Mã NL", "Đơn Giá", "Thành Tiền", "Khối Lượng"
        //     }
        // ));
        // chiTietPhieuNhapScrollPane.setViewportView(chiTietPhieuNhapTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(ScrollPane)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jP_NoiDungNhapLayout = new javax.swing.GroupLayout(jP_NoiDungNhap);
        jP_NoiDungNhap.setLayout(jP_NoiDungNhapLayout);
        jP_NoiDungNhapLayout.setHorizontalGroup(
            jP_NoiDungNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_NoiDungNhapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_NoiDungNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jP_NoiDungNhapLayout.createSequentialGroup()
                        .addComponent(jP_TimKiemMaPN, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jP_TimKiemPhieuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jP_NoiDungNhapLayout.setVerticalGroup(
            jP_NoiDungNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_NoiDungNhapLayout.createSequentialGroup()
                .addGroup(jP_NoiDungNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jP_TimKiemPhieuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jP_TimKiemMaPN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jP_NoiDungPhieuNhapLayout = new javax.swing.GroupLayout(jP_NoiDungPhieuNhap);
        jP_NoiDungPhieuNhap.setLayout(jP_NoiDungPhieuNhapLayout);
        jP_NoiDungPhieuNhapLayout.setHorizontalGroup(
            jP_NoiDungPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_NoiDungPhieuNhapLayout.createSequentialGroup()
                .addGroup(jP_NoiDungPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP_NoiDungPhieuNhapLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jL_ThongTinPhieuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 1088, Short.MAX_VALUE))
                    .addComponent(jP_NoiDungNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 1094, Short.MAX_VALUE))
                .addContainerGap())
        );
        jP_NoiDungPhieuNhapLayout.setVerticalGroup(
            jP_NoiDungPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_NoiDungPhieuNhapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_ThongTinPhieuNhap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jP_NoiDungNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_NoiDungPhieuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_NoiDungPhieuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    private void btn_TaiLaiActionPerformed(java.awt.event.ActionEvent evt) {
        phieuNhapBUS.loadDataToTable_PhieuNhap(Table);
        jT_TimKiem.setText("");
        // jD_TuNgay.setDate(null); // Xóa nội dung của JDateChooser khi bấm nút Tải lại
        // jD_DenNgay.setDate(null); // Xóa nội dung của JDateChooser khi bấm nút Tải lại
        jT_GiaTu.setText(""); // Xóa nội dung của JTextField khi bấm nút Tải lại
        jT_GiaDen.setText(""); 
        // jdc_TuNgay.setDate(null); // Xóa nội dung của JDateChooser khi bấm nút Tải lại
        // jdc_DenNgay.setDate(null);
    }
    private void btn_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {
        String maPhieuNhap = jT_TimKiem.getText().trim();
        if (maPhieuNhap.matches("[a-zA-Z0-9]+")) { // Kiểm tra điều kiện nhập vào
            phieuNhapBUS.searchPhieuNhapByMa(Table, maPhieuNhap);
        } else {
            JOptionPane.showMessageDialog(this, "Mã phiếu nhập chỉ được chứa chữ và số, không chứa khoảng trắng hoặc ký tự đặc biệt.", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
        }
    }
    // private void btn_TimKiemNgayGiaActionPerformed(java.awt.event.ActionEvent evt) {
    //     Date tuNgay = jdc_TuNgay.getDate();
    //     Date denNgay = jdc_DenNgay.getDate();
    //     int giaTu = Integer.parseInt(jT_GiaTu.getText().trim());
    //     int giaDen = Integer.parseInt(jT_GiaDen.getText().trim());

    //     phieuNhapBUS.searchPhieuNhapByNgayVaGia(Table, tuNgay, denNgay, giaTu, giaDen);
    // }
    // private void btn_TimKiemNgayGiaActionPerformed(java.awt.event.ActionEvent evt) {
    //     Date tuNgay = jdc_TuNgay.getDate();
    //     Date denNgay = jdc_DenNgay.getDate();
    //     String giaTuStr = jT_GiaTu.getText().trim();
    //     String giaDenStr = jT_GiaDen.getText().trim();
    
    //     int giaTu = 0; // Giá trị mặc định nếu trường giá từ trống
    //     int giaDen = Integer.MAX_VALUE; // Giá trị mặc định nếu trường giá đến trống
    
    //     try {
    //         if (!giaTuStr.isEmpty()) {
    //             giaTu = Integer.parseInt(giaTuStr);
    //         }
    //         if (!giaDenStr.isEmpty()) {
    //             giaDen = Integer.parseInt(giaDenStr);
    //         }
    
    //         if (tuNgay != null && denNgay != null) {
    //             // Tìm kiếm theo khoảng ngày và khoảng giá
    //             phieuNhapBUS.searchPhieuNhapByNgayVaGia(Table, tuNgay, denNgay, giaTu, giaDen);
    //         } else if (tuNgay != null) {
    //             // Tìm kiếm từ ngày đến hiện tại và khoảng giá
    //             Date today = new Date();
    //             phieuNhapBUS.searchPhieuNhapByNgayVaGia(Table, tuNgay, today, giaTu, giaDen);
    //         } else if (denNgay != null) {
    //             // Tìm kiếm từ quá khứ đến ngày và khoảng giá
    //             Date past = new Date(0); // Ngày bắt đầu từ epoch
    //             phieuNhapBUS.searchPhieuNhapByNgayVaGia(Table, past, denNgay, giaTu, giaDen);
    //         } else {
    //             // Tìm kiếm theo khoảng giá
    //             phieuNhapBUS.searchPhieuNhapByNgayVaGia(Table, new Date(0), new Date(), giaTu, giaDen);
    //         }
    //     } catch (NumberFormatException e) {
    //         JOptionPane.showMessageDialog(this, "Giá trị nhập vào phải là số nguyên.", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
    //     }
    // }
    // private void btn_TimKiemNgayGiaActionPerformed(java.awt.event.ActionEvent evt) {
    //     Date tuNgay = jdc_TuNgay.getDate();
    //     Date denNgay = jdc_DenNgay.getDate();
    //     String giaTuStr = jT_GiaTu.getText().trim();
    //     String giaDenStr = jT_GiaDen.getText().trim();

    //     if (tuNgay == null || denNgay == null || giaTuStr.isEmpty() || giaDenStr.isEmpty()) {
    //         JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin ngày và giá.", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
    //         return;
    //     }

    //     try {
    //         int giaTu = Integer.parseInt(giaTuStr);
    //         int giaDen = Integer.parseInt(giaDenStr);

    //         phieuNhapBUS.searchPhieuNhapByNgayVaGia(Table, tuNgay, denNgay, giaTu, giaDen);
    //     } catch (NumberFormatException e) {
    //         JOptionPane.showMessageDialog(this, "Giá trị nhập vào phải là số nguyên.", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
    //     }
    // }
    private void btn_TimKiemNgayGiaActionPerformed(java.awt.event.ActionEvent evt) {
        Date tuNgay = jdc_TuNgay.getDate();
        Date denNgay = jdc_DenNgay.getDate();
        String giaTuStr = jT_GiaTu.getText().trim();
        String giaDenStr = jT_GiaDen.getText().trim();
    
        if (tuNgay == null || denNgay == null || giaTuStr.isEmpty() || giaDenStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin ngày và giá.", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return;
        }
    
        try {
            int giaTu = Integer.parseInt(giaTuStr);
            int giaDen = Integer.parseInt(giaDenStr);
            System.out.println("From: " + tuNgay);
            System.out.println("To: " + denNgay);
            System.out.println("Price From: " + giaTu);
            System.out.println("Price To: " + giaDen);
    
            phieuNhapBUS.searchPhieuNhapByNgayVaGia(Table, tuNgay, denNgay, giaTu, giaDen);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Giá trị nhập vào phải là số nguyên.", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void showChiTietPhieuNhapPanel(String maPhieuNhap){
        JDialog dialog = new JDialog();
        dialog.setTitle("Chi Tiết Phiếu Nhập");
        dialog.setSize(800, 600);
        dialog.setLocationRelativeTo(null);
        dialog.setModal(true);

        n3_PNChiTietPhieuNhap chiTietPhieuNhapPanel = new n3_PNChiTietPhieuNhap();
        chiTietPhieuNhapPanel.loadChiTietPhieuNhap(maPhieuNhap);

        dialog.add(chiTietPhieuNhapPanel);
        dialog.setVisible(true);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JTable Table;
    private javax.swing.JButton btn_TaiLai;
    private javax.swing.JButton btn_TimKiem;
    private javax.swing.JLabel jL_DenNgay;
    private javax.swing.JLabel jL_GiaDen;
    private javax.swing.JLabel jL_GiaTu;
    private javax.swing.JLabel jL_MaPN;
    private javax.swing.JLabel jL_ThongTinPhieuNhap;
    private javax.swing.JLabel jL_TimKiemMaPN;
    private javax.swing.JLabel jL_TimKiemPN;
    private javax.swing.JLabel jL_TuNgay;
    private javax.swing.JPanel jP_DenNgay;
    private javax.swing.JPanel jP_GiaDen;
    private javax.swing.JPanel jP_GiaTu;
    private javax.swing.JPanel jP_NhapThongTin;
    private javax.swing.JPanel jP_NoiDungNhap;
    private javax.swing.JPanel jP_NoiDungPhieuNhap;
    private javax.swing.JPanel jP_TimKiem;
    private javax.swing.JPanel jP_TimKiemMaPN;
    private javax.swing.JPanel jP_TimKiemPhieuNhap;
    private javax.swing.JPanel jP_TuNgay;
    private javax.swing.JPanel jPanel3;
    private JDateChooser jdc_TuNgay;

    private JDateChooser jdc_DenNgay;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jT_GiaDen;
    private javax.swing.JTextField jT_GiaTu;
    private javax.swing.JTextField jT_TimKiem;
    // End of variables declaration//GEN-END:variables
}
