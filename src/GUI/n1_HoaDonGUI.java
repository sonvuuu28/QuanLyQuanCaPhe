package GUI;

import Util.TableCustom;
import java.awt.BorderLayout;
import java.awt.Color;

public class n1_HoaDonGUI extends javax.swing.JPanel {

    public n1_HoaDonGUI() {
        initComponents();
        TableCustom.apply(ScrollPane, TableCustom.TableType.MULTI_LINE);
        nhomNutChucNang();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTong = new javax.swing.JPanel();
        PanelHoaDon = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PanelBanHang = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        PanelThongTinHoaDon = new javax.swing.JPanel();
        LblTieuDe = new javax.swing.JLabel();
        PanelTimKiemTheoMa = new javax.swing.JPanel();
        LblTimKiemTheoMa = new javax.swing.JLabel();
        LblMaHoaDon = new javax.swing.JLabel();
        TextFieldMaHoaDon = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btn_TaiLai = new javax.swing.JButton();
        btn_TimKiem = new javax.swing.JButton();
        PanelTimKiemHoaDon = new javax.swing.JPanel();
        LblTimKiemHoaDon = new javax.swing.JLabel();
        TextFieldTuNgay = new javax.swing.JTextField();
        TextFieldDenNgay = new javax.swing.JTextField();
        TextFieldGiaTu = new javax.swing.JTextField();
        TextFieldDenGia = new javax.swing.JTextField();
        LblTuNgay = new javax.swing.JLabel();
        LblDenNgay = new javax.swing.JLabel();
        LblGiaTu = new javax.swing.JLabel();
        LblDenGia = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        ScrollPane = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(1125, 667));
        setMinimumSize(new java.awt.Dimension(1125, 667));
        setPreferredSize(new java.awt.Dimension(1125, 667));

        PanelTong.setBackground(new java.awt.Color(255, 255, 255));
        PanelTong.setPreferredSize(new java.awt.Dimension(125, 658));

        PanelHoaDon.setBackground(new java.awt.Color(219, 189, 142));
        PanelHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        PanelHoaDon.setMaximumSize(new java.awt.Dimension(195, 44));
        PanelHoaDon.setMinimumSize(new java.awt.Dimension(195, 44));
        PanelHoaDon.setPreferredSize(new java.awt.Dimension(195, 44));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("Hóa Đơn");

        javax.swing.GroupLayout PanelHoaDonLayout = new javax.swing.GroupLayout(PanelHoaDon);
        PanelHoaDon.setLayout(PanelHoaDonLayout);
        PanelHoaDonLayout.setHorizontalGroup(
            PanelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelHoaDonLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(61, 61, 61))
        );
        PanelHoaDonLayout.setVerticalGroup(
            PanelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelBanHang.setBackground(new java.awt.Color(219, 189, 142));
        PanelBanHang.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        PanelBanHang.setMaximumSize(new java.awt.Dimension(195, 44));
        PanelBanHang.setMinimumSize(new java.awt.Dimension(195, 44));
        PanelBanHang.setPreferredSize(new java.awt.Dimension(195, 44));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("Bán Hàng");

        javax.swing.GroupLayout PanelBanHangLayout = new javax.swing.GroupLayout(PanelBanHang);
        PanelBanHang.setLayout(PanelBanHangLayout);
        PanelBanHangLayout.setHorizontalGroup(
            PanelBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBanHangLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(55, 55, 55))
        );
        PanelBanHangLayout.setVerticalGroup(
            PanelBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBanHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelThongTinHoaDon.setBackground(new java.awt.Color(219, 189, 142));
        PanelThongTinHoaDon.setEnabled(false);
        PanelThongTinHoaDon.setMaximumSize(new java.awt.Dimension(1125, 575));
        PanelThongTinHoaDon.setMinimumSize(new java.awt.Dimension(1125, 575));
        PanelThongTinHoaDon.setPreferredSize(new java.awt.Dimension(1125, 575));

        LblTieuDe.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        LblTieuDe.setText("Thông tin hóa đơn");

        PanelTimKiemTheoMa.setBackground(new java.awt.Color(255, 255, 255));

        LblTimKiemTheoMa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblTimKiemTheoMa.setForeground(new java.awt.Color(153, 102, 0));
        LblTimKiemTheoMa.setText("Tìm kiếm theo mã");

        LblMaHoaDon.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        LblMaHoaDon.setForeground(new java.awt.Color(153, 102, 0));
        LblMaHoaDon.setText("Mã hóa đơn:");

        TextFieldMaHoaDon.setBorder(null);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        btn_TaiLai.setBackground(new java.awt.Color(0, 0, 0));
        btn_TaiLai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_TaiLai.setForeground(new java.awt.Color(255, 255, 255));
        btn_TaiLai.setText("Tải Lại");
        btn_TaiLai.setMaximumSize(new java.awt.Dimension(100, 24));
        btn_TaiLai.setMinimumSize(new java.awt.Dimension(100, 24));
        btn_TaiLai.setPreferredSize(new java.awt.Dimension(100, 24));

        btn_TimKiem.setBackground(new java.awt.Color(0, 0, 0));
        btn_TimKiem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_TimKiem.setForeground(new java.awt.Color(255, 255, 255));
        btn_TimKiem.setLabel("Tìm Kiếm");
        btn_TimKiem.setMaximumSize(new java.awt.Dimension(100, 24));
        btn_TimKiem.setMinimumSize(new java.awt.Dimension(100, 24));
        btn_TimKiem.setPreferredSize(new java.awt.Dimension(100, 24));

        javax.swing.GroupLayout PanelTimKiemTheoMaLayout = new javax.swing.GroupLayout(PanelTimKiemTheoMa);
        PanelTimKiemTheoMa.setLayout(PanelTimKiemTheoMaLayout);
        PanelTimKiemTheoMaLayout.setHorizontalGroup(
            PanelTimKiemTheoMaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTimKiemTheoMaLayout.createSequentialGroup()
                .addGroup(PanelTimKiemTheoMaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTimKiemTheoMaLayout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(LblTimKiemTheoMa))
                    .addGroup(PanelTimKiemTheoMaLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(PanelTimKiemTheoMaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelTimKiemTheoMaLayout.createSequentialGroup()
                                .addComponent(LblMaHoaDon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelTimKiemTheoMaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator1)
                                    .addComponent(TextFieldMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelTimKiemTheoMaLayout.createSequentialGroup()
                                .addComponent(btn_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btn_TaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        PanelTimKiemTheoMaLayout.setVerticalGroup(
            PanelTimKiemTheoMaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTimKiemTheoMaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblTimKiemTheoMa)
                .addGap(36, 36, 36)
                .addGroup(PanelTimKiemTheoMaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblMaHoaDon))
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelTimKiemTheoMaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_TaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        PanelTimKiemHoaDon.setBackground(new java.awt.Color(255, 255, 255));

        LblTimKiemHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblTimKiemHoaDon.setForeground(new java.awt.Color(153, 102, 0));
        LblTimKiemHoaDon.setText("Tìm kiếm hóa đơn");

        TextFieldTuNgay.setBorder(null);
        TextFieldTuNgay.setMaximumSize(new java.awt.Dimension(2147483647, 24));
        TextFieldTuNgay.setMinimumSize(new java.awt.Dimension(64, 24));
        TextFieldTuNgay.setPreferredSize(new java.awt.Dimension(64, 24));

        TextFieldDenNgay.setBorder(null);
        TextFieldDenNgay.setMaximumSize(new java.awt.Dimension(2147483647, 24));
        TextFieldDenNgay.setMinimumSize(new java.awt.Dimension(64, 24));
        TextFieldDenNgay.setPreferredSize(new java.awt.Dimension(64, 24));

        TextFieldGiaTu.setBorder(null);
        TextFieldGiaTu.setMaximumSize(new java.awt.Dimension(2147483647, 24));
        TextFieldGiaTu.setMinimumSize(new java.awt.Dimension(64, 24));
        TextFieldGiaTu.setPreferredSize(new java.awt.Dimension(64, 24));

        TextFieldDenGia.setBorder(null);
        TextFieldDenGia.setMaximumSize(new java.awt.Dimension(2147483647, 24));
        TextFieldDenGia.setMinimumSize(new java.awt.Dimension(64, 24));
        TextFieldDenGia.setPreferredSize(new java.awt.Dimension(64, 24));

        LblTuNgay.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        LblTuNgay.setForeground(new java.awt.Color(153, 102, 0));
        LblTuNgay.setText("Từ ngày:");

        LblDenNgay.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        LblDenNgay.setForeground(new java.awt.Color(153, 102, 0));
        LblDenNgay.setText("Đến ngày:");

        LblGiaTu.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        LblGiaTu.setForeground(new java.awt.Color(153, 102, 0));
        LblGiaTu.setText("Giá từ:");

        LblDenGia.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        LblDenGia.setForeground(new java.awt.Color(153, 102, 0));
        LblDenGia.setText("Đến giá:");

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout PanelTimKiemHoaDonLayout = new javax.swing.GroupLayout(PanelTimKiemHoaDon);
        PanelTimKiemHoaDon.setLayout(PanelTimKiemHoaDonLayout);
        PanelTimKiemHoaDonLayout.setHorizontalGroup(
            PanelTimKiemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTimKiemHoaDonLayout.createSequentialGroup()
                .addGroup(PanelTimKiemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTimKiemHoaDonLayout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(LblTimKiemHoaDon))
                    .addGroup(PanelTimKiemHoaDonLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(PanelTimKiemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblTuNgay)
                            .addComponent(LblDenNgay)
                            .addComponent(LblGiaTu)
                            .addComponent(LblDenGia))
                        .addGap(50, 50, 50)
                        .addGroup(PanelTimKiemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextFieldTuNgay, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(TextFieldDenNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextFieldGiaTu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextFieldDenGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator6)
                            .addComponent(jSeparator4)
                            .addComponent(jSeparator3)
                            .addComponent(jSeparator2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelTimKiemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelTimKiemHoaDonLayout.createSequentialGroup()
                    .addGap(0, 267, Short.MAX_VALUE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 267, Short.MAX_VALUE)))
        );
        PanelTimKiemHoaDonLayout.setVerticalGroup(
            PanelTimKiemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTimKiemHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblTimKiemHoaDon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(PanelTimKiemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldTuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblTuNgay))
                .addGap(3, 3, 3)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(PanelTimKiemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldDenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblDenNgay))
                .addGap(7, 7, 7)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(PanelTimKiemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldGiaTu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblGiaTu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(PanelTimKiemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldDenGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblDenGia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(PanelTimKiemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelTimKiemHoaDonLayout.createSequentialGroup()
                    .addGap(0, 103, Short.MAX_VALUE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 104, Short.MAX_VALUE)))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã hóa đơn", "Ngày lập", "Mã nhân viên", "Mã khuyến mãi", "Mã khách hàng", "Mã ưu đãi", "Tổng tiền"
            }
        ));
        ScrollPane.setViewportView(jTable1);

        javax.swing.GroupLayout PanelThongTinHoaDonLayout = new javax.swing.GroupLayout(PanelThongTinHoaDon);
        PanelThongTinHoaDon.setLayout(PanelThongTinHoaDonLayout);
        PanelThongTinHoaDonLayout.setHorizontalGroup(
            PanelThongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelThongTinHoaDonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LblTieuDe)
                .addGap(448, 448, 448))
            .addGroup(PanelThongTinHoaDonLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PanelThongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1097, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelThongTinHoaDonLayout.createSequentialGroup()
                        .addComponent(PanelTimKiemTheoMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanelTimKiemHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        PanelThongTinHoaDonLayout.setVerticalGroup(
            PanelThongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelThongTinHoaDonLayout.createSequentialGroup()
                .addComponent(LblTieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelThongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelTimKiemTheoMa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelTimKiemHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelTongLayout = new javax.swing.GroupLayout(PanelTong);
        PanelTong.setLayout(PanelTongLayout);
        PanelTongLayout.setHorizontalGroup(
            PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTongLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(PanelBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(PanelHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelTongLayout.createSequentialGroup()
                .addComponent(PanelThongTinHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelTongLayout.setVerticalGroup(
            PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTongLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(PanelThongTinHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTong, javax.swing.GroupLayout.DEFAULT_SIZE, 1125, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTong, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    private void nhomNutChucNang() {
        PanelBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelBanHang.setBackground(new Color(199, 159, 95));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelBanHang.setBackground(new Color(219, 189, 142));
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelTong.removeAll();
                n1_BanHangGUI bh = new n1_BanHangGUI();
                PanelTong.setLayout(new BorderLayout());
                PanelTong.add(bh, BorderLayout.CENTER); // Adjust the layout constraint as needed
                PanelTong.revalidate();
                PanelTong.repaint();
            }
        });
        PanelHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelHoaDon.setBackground(new Color(199, 159, 95));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelHoaDon.setBackground(new Color(219, 189, 142));
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelTong.removeAll();
                n1_HoaDonGUI bh = new n1_HoaDonGUI();
                PanelTong.setLayout(new BorderLayout());
                PanelTong.add(bh, BorderLayout.CENTER); // Adjust the layout constraint as needed
                PanelTong.revalidate();
                PanelTong.repaint();
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblDenGia;
    private javax.swing.JLabel LblDenNgay;
    private javax.swing.JLabel LblGiaTu;
    private javax.swing.JLabel LblMaHoaDon;
    private javax.swing.JLabel LblTieuDe;
    private javax.swing.JLabel LblTimKiemHoaDon;
    private javax.swing.JLabel LblTimKiemTheoMa;
    private javax.swing.JLabel LblTuNgay;
    private javax.swing.JPanel PanelBanHang;
    private javax.swing.JPanel PanelHoaDon;
    private javax.swing.JPanel PanelThongTinHoaDon;
    private javax.swing.JPanel PanelTimKiemHoaDon;
    private javax.swing.JPanel PanelTimKiemTheoMa;
    private javax.swing.JPanel PanelTong;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JTextField TextFieldDenGia;
    private javax.swing.JTextField TextFieldDenNgay;
    private javax.swing.JTextField TextFieldGiaTu;
    private javax.swing.JTextField TextFieldMaHoaDon;
    private javax.swing.JTextField TextFieldTuNgay;
    private javax.swing.JButton btn_TaiLai;
    private javax.swing.JButton btn_TimKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
