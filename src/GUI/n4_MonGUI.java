package GUI;

import Util.TableCustom;

public class n4_MonGUI extends javax.swing.JPanel {

    public n4_MonGUI() {
        initComponents();
        TableCustom.apply(jScrollPane1, TableCustom.TableType.MULTI_LINE);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTong = new javax.swing.JPanel();
        PanelTimKiem = new javax.swing.JPanel();
        TextFieldTimKiem = new javax.swing.JTextField();
        LabelAnhTimKiem = new javax.swing.JLabel();
        lb_QuanLyMon = new java.awt.Label();
        btn_TimKiem = new javax.swing.JButton();
        btn_TaiLai = new javax.swing.JButton();
        PanelChuaThongTin_Cam = new javax.swing.JPanel();
        PanelChuaThongTinTrang = new javax.swing.JPanel();
        lb_ThongTinMonAn = new java.awt.Label();
        lb_MaMon = new java.awt.Label();
        lb_TenMon = new java.awt.Label();
        lb_LoaiMon = new java.awt.Label();
        lb_DonGia = new java.awt.Label();
        tf_MaMon = new javax.swing.JTextField();
        tf_TenMon = new javax.swing.JTextField();
        tf_LoaiMon = new javax.swing.JTextField();
        tf_DonGia = new javax.swing.JTextField();
        btn_TaoCongThuc = new javax.swing.JButton();
        btn_ChonAnh = new javax.swing.JButton();
        lb_HinhAnhMonAn = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_DanhSachMon = new javax.swing.JTable();
        PanelChuaNut = new javax.swing.JPanel();
        btn_Sua = new javax.swing.JButton();
        btn_Them = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();
        btn_XuatExcel = new javax.swing.JButton();
        comboboxTrangThai = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(122, 74, 74));
        setMaximumSize(new java.awt.Dimension(1125, 667));
        setMinimumSize(new java.awt.Dimension(1125, 667));

        PanelTong.setBackground(new java.awt.Color(255, 255, 255));
        PanelTong.setMaximumSize(new java.awt.Dimension(1125, 658));
        PanelTong.setMinimumSize(new java.awt.Dimension(1125, 658));
        PanelTong.setPreferredSize(new java.awt.Dimension(1125, 658));

        PanelTimKiem.setBackground(new java.awt.Color(219, 189, 142));
        PanelTimKiem.setMaximumSize(new java.awt.Dimension(314, 32));
        PanelTimKiem.setMinimumSize(new java.awt.Dimension(314, 32));

        TextFieldTimKiem.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        LabelAnhTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/search.png"))); // NOI18N

        javax.swing.GroupLayout PanelTimKiemLayout = new javax.swing.GroupLayout(PanelTimKiem);
        PanelTimKiem.setLayout(PanelTimKiemLayout);
        PanelTimKiemLayout.setHorizontalGroup(
            PanelTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTimKiemLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(TextFieldTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LabelAnhTimKiem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelTimKiemLayout.setVerticalGroup(
            PanelTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTimKiemLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(PanelTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelAnhTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextFieldTimKiem))
                .addGap(4, 4, 4))
        );

        lb_QuanLyMon.setAlignment(java.awt.Label.CENTER);
        lb_QuanLyMon.setBackground(new java.awt.Color(219, 189, 142));
        lb_QuanLyMon.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lb_QuanLyMon.setMaximumSize(new java.awt.Dimension(206, 42));
        lb_QuanLyMon.setText("QUẢN LÝ MÓN");

        btn_TimKiem.setBackground(new java.awt.Color(0, 0, 0));
        btn_TimKiem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_TimKiem.setForeground(new java.awt.Color(255, 255, 255));
        btn_TimKiem.setLabel("Tìm Kiếm");
        btn_TimKiem.setMaximumSize(new java.awt.Dimension(100, 24));
        btn_TimKiem.setMinimumSize(new java.awt.Dimension(100, 24));
        btn_TimKiem.setPreferredSize(new java.awt.Dimension(100, 24));

        btn_TaiLai.setBackground(new java.awt.Color(0, 0, 0));
        btn_TaiLai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_TaiLai.setForeground(new java.awt.Color(255, 255, 255));
        btn_TaiLai.setText("Tải Lại");
        btn_TaiLai.setMaximumSize(new java.awt.Dimension(100, 24));
        btn_TaiLai.setMinimumSize(new java.awt.Dimension(100, 24));
        btn_TaiLai.setPreferredSize(new java.awt.Dimension(100, 24));

        PanelChuaThongTin_Cam.setBackground(new java.awt.Color(219, 189, 142));

        PanelChuaThongTinTrang.setBackground(new java.awt.Color(255, 255, 255));
        PanelChuaThongTinTrang.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lb_ThongTinMonAn.setAlignment(java.awt.Label.CENTER);
        lb_ThongTinMonAn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_ThongTinMonAn.setText("Thông Tin Món Ăn");

        lb_MaMon.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lb_MaMon.setText("Mã Món");

        lb_TenMon.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lb_TenMon.setText("Tên Món");

        lb_LoaiMon.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lb_LoaiMon.setText("Loại Món");

        lb_DonGia.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lb_DonGia.setText("Đơn Giá");

        tf_MaMon.setBorder(null);
        tf_MaMon.setMaximumSize(new java.awt.Dimension(230, 24));
        tf_MaMon.setMinimumSize(new java.awt.Dimension(230, 24));
        tf_MaMon.setPreferredSize(new java.awt.Dimension(230, 24));

        tf_TenMon.setBorder(null);
        tf_TenMon.setMaximumSize(new java.awt.Dimension(230, 24));
        tf_TenMon.setMinimumSize(new java.awt.Dimension(230, 24));
        tf_TenMon.setPreferredSize(new java.awt.Dimension(230, 24));

        tf_LoaiMon.setBorder(null);
        tf_LoaiMon.setMaximumSize(new java.awt.Dimension(230, 24));
        tf_LoaiMon.setMinimumSize(new java.awt.Dimension(230, 24));
        tf_LoaiMon.setPreferredSize(new java.awt.Dimension(230, 24));

        tf_DonGia.setBorder(null);
        tf_DonGia.setMaximumSize(new java.awt.Dimension(230, 24));
        tf_DonGia.setMinimumSize(new java.awt.Dimension(230, 24));
        tf_DonGia.setPreferredSize(new java.awt.Dimension(230, 24));

        btn_TaoCongThuc.setBackground(new java.awt.Color(219, 189, 142));
        btn_TaoCongThuc.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_TaoCongThuc.setText("Công Thức");
        btn_TaoCongThuc.setMaximumSize(new java.awt.Dimension(150, 24));
        btn_TaoCongThuc.setMinimumSize(new java.awt.Dimension(150, 24));
        btn_TaoCongThuc.setPreferredSize(new java.awt.Dimension(150, 24));

        btn_ChonAnh.setBackground(new java.awt.Color(219, 189, 142));
        btn_ChonAnh.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_ChonAnh.setText("Chọn Ảnh");
        btn_ChonAnh.setPreferredSize(new java.awt.Dimension(150, 24));

        lb_HinhAnhMonAn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_HinhAnhMonAn.setText("Hình Ảnh");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout PanelChuaThongTinTrangLayout = new javax.swing.GroupLayout(PanelChuaThongTinTrang);
        PanelChuaThongTinTrang.setLayout(PanelChuaThongTinTrangLayout);
        PanelChuaThongTinTrangLayout.setHorizontalGroup(
            PanelChuaThongTinTrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelChuaThongTinTrangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelChuaThongTinTrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_ThongTinMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelChuaThongTinTrangLayout.createSequentialGroup()
                        .addGroup(PanelChuaThongTinTrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lb_DonGia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_MaMon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_TenMon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_LoaiMon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelChuaThongTinTrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_TaoCongThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelChuaThongTinTrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tf_MaMon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_TenMon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_LoaiMon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_DonGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator1)
                                .addComponent(jSeparator2)
                                .addComponent(jSeparator3)
                                .addComponent(jSeparator5)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(PanelChuaThongTinTrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_HinhAnhMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelChuaThongTinTrangLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btn_ChonAnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54))
        );
        PanelChuaThongTinTrangLayout.setVerticalGroup(
            PanelChuaThongTinTrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelChuaThongTinTrangLayout.createSequentialGroup()
                .addGroup(PanelChuaThongTinTrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelChuaThongTinTrangLayout.createSequentialGroup()
                        .addComponent(lb_ThongTinMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(PanelChuaThongTinTrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_MaMon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelChuaThongTinTrangLayout.createSequentialGroup()
                                .addComponent(tf_MaMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelChuaThongTinTrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb_TenMon, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelChuaThongTinTrangLayout.createSequentialGroup()
                                .addComponent(tf_TenMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelChuaThongTinTrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_LoaiMon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelChuaThongTinTrangLayout.createSequentialGroup()
                                .addComponent(tf_LoaiMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addComponent(btn_TaoCongThuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                    .addGroup(PanelChuaThongTinTrangLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(lb_HinhAnhMonAn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_ChonAnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelChuaThongTinTrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_DonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelChuaThongTinTrangLayout.createSequentialGroup()
                        .addComponent(tf_DonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        PanelChuaThongTin_Cam.add(PanelChuaThongTinTrang);

        tb_DanhSachMon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tb_DanhSachMon);

        PanelChuaNut.setBackground(new java.awt.Color(255, 255, 255));

        btn_Sua.setBackground(new java.awt.Color(0, 0, 0));
        btn_Sua.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_Sua.setForeground(new java.awt.Color(255, 255, 255));
        btn_Sua.setText("Sửa");
        btn_Sua.setMaximumSize(new java.awt.Dimension(100, 26));
        btn_Sua.setMinimumSize(new java.awt.Dimension(100, 26));
        btn_Sua.setPreferredSize(new java.awt.Dimension(100, 26));

        btn_Them.setBackground(new java.awt.Color(0, 0, 0));
        btn_Them.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_Them.setForeground(new java.awt.Color(255, 255, 255));
        btn_Them.setText("Thêm");
        btn_Them.setMaximumSize(new java.awt.Dimension(100, 26));
        btn_Them.setMinimumSize(new java.awt.Dimension(100, 26));
        btn_Them.setPreferredSize(new java.awt.Dimension(100, 26));

        btn_Xoa.setBackground(new java.awt.Color(0, 0, 0));
        btn_Xoa.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_Xoa.setForeground(new java.awt.Color(255, 255, 255));
        btn_Xoa.setText("Xóa");
        btn_Xoa.setMaximumSize(new java.awt.Dimension(100, 26));
        btn_Xoa.setMinimumSize(new java.awt.Dimension(100, 26));
        btn_Xoa.setPreferredSize(new java.awt.Dimension(100, 26));

        btn_XuatExcel.setBackground(new java.awt.Color(0, 0, 0));
        btn_XuatExcel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_XuatExcel.setForeground(new java.awt.Color(255, 255, 255));
        btn_XuatExcel.setText("Xuất Excel");
        btn_XuatExcel.setMaximumSize(new java.awt.Dimension(100, 26));
        btn_XuatExcel.setMinimumSize(new java.awt.Dimension(100, 26));
        btn_XuatExcel.setPreferredSize(new java.awt.Dimension(100, 26));

        javax.swing.GroupLayout PanelChuaNutLayout = new javax.swing.GroupLayout(PanelChuaNut);
        PanelChuaNut.setLayout(PanelChuaNutLayout);
        PanelChuaNutLayout.setHorizontalGroup(
            PanelChuaNutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelChuaNutLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(PanelChuaNutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_XuatExcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        PanelChuaNutLayout.setVerticalGroup(
            PanelChuaNutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelChuaNutLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btn_XuatExcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        comboboxTrangThai.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        comboboxTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã Món", "Tên Món" }));
        comboboxTrangThai.setBorder(null);
        comboboxTrangThai.setMaximumSize(new java.awt.Dimension(100, 22));
        comboboxTrangThai.setMinimumSize(new java.awt.Dimension(100, 22));
        comboboxTrangThai.setPreferredSize(new java.awt.Dimension(100, 22));

        javax.swing.GroupLayout PanelTongLayout = new javax.swing.GroupLayout(PanelTong);
        PanelTong.setLayout(PanelTongLayout);
        PanelTongLayout.setHorizontalGroup(
            PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_QuanLyMon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelTongLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTongLayout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(PanelChuaThongTin_Cam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1045, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTongLayout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelChuaNut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelTongLayout.createSequentialGroup()
                        .addComponent(PanelTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(comboboxTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btn_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btn_TaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(241, 241, 241))
        );
        PanelTongLayout.setVerticalGroup(
            PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTongLayout.createSequentialGroup()
                .addComponent(lb_QuanLyMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTongLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(PanelTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTongLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_TaiLai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(comboboxTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTongLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(PanelChuaThongTin_Cam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTongLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelChuaNut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelAnhTimKiem;
    private javax.swing.JPanel PanelChuaNut;
    private javax.swing.JPanel PanelChuaThongTinTrang;
    private javax.swing.JPanel PanelChuaThongTin_Cam;
    private javax.swing.JPanel PanelTimKiem;
    private javax.swing.JPanel PanelTong;
    private javax.swing.JTextField TextFieldTimKiem;
    private javax.swing.JButton btn_ChonAnh;
    private javax.swing.JButton btn_Sua;
    private javax.swing.JButton btn_TaiLai;
    private javax.swing.JButton btn_TaoCongThuc;
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_TimKiem;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.JButton btn_XuatExcel;
    private javax.swing.JComboBox<String> comboboxTrangThai;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private java.awt.Label lb_DonGia;
    private javax.swing.JLabel lb_HinhAnhMonAn;
    private java.awt.Label lb_LoaiMon;
    private java.awt.Label lb_MaMon;
    private java.awt.Label lb_QuanLyMon;
    private java.awt.Label lb_TenMon;
    private java.awt.Label lb_ThongTinMonAn;
    private javax.swing.JTable tb_DanhSachMon;
    private javax.swing.JTextField tf_DonGia;
    private javax.swing.JTextField tf_LoaiMon;
    private javax.swing.JTextField tf_MaMon;
    private javax.swing.JTextField tf_TenMon;
    // End of variables declaration//GEN-END:variables
}
