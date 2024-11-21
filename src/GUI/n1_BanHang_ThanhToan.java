package GUI;

import BUS.BanHangBUS;
import DAO.n1_HoaDonDAO;
import DTO.KhuyenMaiDTO;
import DTO.UuDaiThanhVienDTO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class n1_BanHang_ThanhToan extends javax.swing.JFrame {

    private n1_BanHangKeoTha banHangFrame;

    public n1_BanHang_ThanhToan(n1_BanHangKeoTha banHangFrame) {
        this.banHangFrame = banHangFrame;
        tien_Goc = banHangFrame.TongTien;
//        System.out.println(tien_Goc);
        initComponents();
        nhomNutChucNang();
        setLocationRelativeTo(null);
    }

    public void set_info_khachHang(String ma) {
        MaKhachHang_duocChon = ma;
//        System.out.println("Mã khách hàng của trang thanh toán: " + MaKhachHang_duocChon);

        BanHangBUS.getInstance().get_khachHang_theoMa(ma, kh);
    }

    public void set_UuDaiThanhVien(int chiTieu) {
        MaUuDai = BanHangBUS.getInstance().set_UuDaiThanhVien(chiTieu, uuDai);
        UuDaiThanhVienDTO uuDaiDTO = BanHangBUS.getInstance().get_UuDai_theoMa(MaUuDai);
        phanTramUuDai = uuDaiDTO.getPhanTramUuDai();
        tinh_GiamGia(tien_Goc, phanTramKhuyenMai, phanTramUuDai);
    }

    private void tinh_GiamGia(int tongTien, float khuyenmai, float uudai) {
//        System.out.println("khuyến mãi = " + khuyenmai);
//        System.out.println("ưu đãi = " + uudai);
//        System.out.println("tổng tiền = " + tongTien);

        float soTru = (uudai + khuyenmai) / 100 * tongTien;

        int tongTienSauGiam = (int) (tien_Goc - soTru);
        tong.setText(Util.BanHang.set_Tien_VND(tongTienSauGiam));
        tien_discount = tongTienSauGiam;
    }

    private void set_info() {
        // Mã Hóa Đơn
        String id = n1_HoaDonDAO.getInstance().getNewId();
        Ma.setText(id);

        // Ngày
        String today = LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        Ngay.setText(today);

        // Tên Nhân Viên
        String ten_nv = BanHangBUS.getInstance().getTenNV(banHangFrame.MaNhanVien);
        nv.setText(ten_nv);

        // Khuyến Mãi
        comboBox();

        // Tổng tiền
        tong.setText(Util.BanHang.set_Tien_VND(tien_Goc));
    }

    private void comboBox() {
        String today = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        BanHangBUS.getInstance().getAll_KhuyenMai(tien_Goc, today, km);
    }

    private void nhomNutChucNang() {
        set_info();
        huyBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dispose();
            }
        });

        km.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ngày
                String today = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

                // Lấy thông tin khuyến mãi và tính toán tổng tiền sau khuyến mãi
                KhuyenMaiDTO khuyenmai = BanHangBUS.getInstance().get_KhuyenMai_theoTen(
                        tien_Goc, today, km.getSelectedItem().toString()
                );
                MaKhuyenMai = khuyenmai.getMaKhuyenMai();
                phanTramKhuyenMai = khuyenmai.getPhanTramKhuyenMai();
                tinh_GiamGia(tien_Goc, phanTramKhuyenMai, phanTramUuDai);
            }
        });
        chonKhach.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1_BanHang_ThanhToan_chonKhachHang a = new n1_BanHang_ThanhToan_chonKhachHang(n1_BanHang_ThanhToan.this);
                a.setVisible(true);

            }
        });

        TaiLai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MaKhachHang_duocChon = null;
                MaUuDai = null;

                phanTramUuDai = 0f;
                phanTramKhuyenMai = 0f;

                tien_Goc = banHangFrame.TongTien;
                uuDai.setText("none");
                kh.setText("Anonymous");
                tien_Goc = banHangFrame.TongTien;
                tong.setText(Util.BanHang.set_Tien_VND(tien_Goc));
            }
        });

        thanhToanBtn.addActionListener(e -> {
            String maHoaDon = Ma.getText();
            java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());
            if (tien_discount == 0) {
                tien_discount = tien_Goc;
            }
            
            boolean taoHoaDon = BanHangBUS.getInstance().insert_hoaDon(maHoaDon, currentDate, tien_discount, banHangFrame.MaNhanVien,
                    MaKhachHang_duocChon, MaUuDai, MaKhuyenMai);
            
            if( taoHoaDon == false) {
                return;
            }

            for (Object[] a : banHangFrame.listCart) {
//                System.out.println(maHoaDon + a[0] + " " + a[2] + " " + a[4] + " " + a[3]);
                int value2 = (int) a[2];
                int value4 = (int) a[4];
                int value3 = (int) a[3];

                BanHangBUS.getInstance().insert_chiTietHoaDon(maHoaDon, (String) a[0], value2, value4, value3);
            }
            
            dispose();
            banHangFrame.reload_TaoHoaDon();
            
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelKhung = new javax.swing.JPanel();
        PanelNoiDung = new javax.swing.JPanel();
        PanelTenDauVao = new javax.swing.JPanel();
        LabelMa = new javax.swing.JLabel();
        LabelNgay = new javax.swing.JLabel();
        LabelNhanVien = new javax.swing.JLabel();
        LabelKhachHang = new javax.swing.JLabel();
        LabelUuDai = new javax.swing.JLabel();
        LabelKhuyenMai = new javax.swing.JLabel();
        LabelTongTien = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        PanelDauVao = new javax.swing.JPanel();
        Ma = new javax.swing.JLabel();
        Ngay = new javax.swing.JLabel();
        nv = new javax.swing.JLabel();
        kh = new javax.swing.JLabel();
        uuDai = new javax.swing.JLabel();
        km = new javax.swing.JComboBox<>();
        tong = new javax.swing.JLabel();
        thanhToanBtn = new javax.swing.JButton();
        huyBtn = new javax.swing.JButton();
        chonKhach = new javax.swing.JButton();
        TaiLai = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        PanelKhung.setBackground(new java.awt.Color(122, 74, 74));
        PanelKhung.setMaximumSize(new java.awt.Dimension(500, 490));
        PanelKhung.setMinimumSize(new java.awt.Dimension(500, 490));
        PanelKhung.setPreferredSize(new java.awt.Dimension(500, 490));

        PanelNoiDung.setBackground(new java.awt.Color(255, 255, 255));
        PanelNoiDung.setMaximumSize(new java.awt.Dimension(488, 478));
        PanelNoiDung.setMinimumSize(new java.awt.Dimension(488, 478));
        PanelNoiDung.setPreferredSize(new java.awt.Dimension(488, 478));

        PanelTenDauVao.setBackground(new java.awt.Color(255, 255, 255));
        PanelTenDauVao.setLayout(new java.awt.GridLayout(7, 0, 0, 30));

        LabelMa.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        LabelMa.setText("Mã HĐ");
        PanelTenDauVao.add(LabelMa);

        LabelNgay.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        LabelNgay.setText("Ngày Lập");
        PanelTenDauVao.add(LabelNgay);

        LabelNhanVien.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        LabelNhanVien.setText("Nhân Viên");
        PanelTenDauVao.add(LabelNhanVien);

        LabelKhachHang.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        LabelKhachHang.setText("Khách Hàng");
        PanelTenDauVao.add(LabelKhachHang);

        LabelUuDai.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        LabelUuDai.setText("Ưu Đãi Thành Viên");
        PanelTenDauVao.add(LabelUuDai);

        LabelKhuyenMai.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        LabelKhuyenMai.setText("Khuyến Mãi");
        PanelTenDauVao.add(LabelKhuyenMai);

        LabelTongTien.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        LabelTongTien.setText("Tổng Tiền");
        PanelTenDauVao.add(LabelTongTien);

        Title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("TẠO HÓA ĐƠN");

        PanelDauVao.setBackground(new java.awt.Color(255, 255, 255));
        PanelDauVao.setLayout(new java.awt.GridLayout(7, 0, 0, 30));

        Ma.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Ma.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PanelDauVao.add(Ma);

        Ngay.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Ngay.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PanelDauVao.add(Ngay);

        nv.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        nv.setForeground(new java.awt.Color(0, 102, 204));
        nv.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PanelDauVao.add(nv);

        kh.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        kh.setForeground(new java.awt.Color(255, 102, 0));
        kh.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        kh.setText("Anonymous");
        PanelDauVao.add(kh);

        uuDai.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        uuDai.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        uuDai.setText("None");
        PanelDauVao.add(uuDai);

        km.setMinimumSize(new java.awt.Dimension(72, 20));
        km.setOpaque(true);
        km.setPreferredSize(new java.awt.Dimension(72, 20));
        PanelDauVao.add(km);

        tong.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        tong.setForeground(new java.awt.Color(0, 153, 0));
        tong.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PanelDauVao.add(tong);

        thanhToanBtn.setBackground(new java.awt.Color(51, 51, 51));
        thanhToanBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        thanhToanBtn.setForeground(new java.awt.Color(255, 255, 255));
        thanhToanBtn.setText("Thanh toán");
        thanhToanBtn.setMaximumSize(new java.awt.Dimension(90, 25));
        thanhToanBtn.setMinimumSize(new java.awt.Dimension(90, 25));
        thanhToanBtn.setPreferredSize(new java.awt.Dimension(90, 25));

        huyBtn.setBackground(new java.awt.Color(255, 51, 51));
        huyBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        huyBtn.setForeground(new java.awt.Color(255, 255, 255));
        huyBtn.setText("Hủy");
        huyBtn.setMaximumSize(new java.awt.Dimension(90, 25));
        huyBtn.setMinimumSize(new java.awt.Dimension(90, 25));
        huyBtn.setPreferredSize(new java.awt.Dimension(90, 25));

        chonKhach.setBackground(new java.awt.Color(255, 102, 0));
        chonKhach.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        chonKhach.setForeground(new java.awt.Color(255, 255, 255));
        chonKhach.setText("...");
        chonKhach.setMaximumSize(new java.awt.Dimension(90, 25));
        chonKhach.setMinimumSize(new java.awt.Dimension(90, 25));
        chonKhach.setPreferredSize(new java.awt.Dimension(90, 25));

        TaiLai.setBackground(new java.awt.Color(51, 102, 255));
        TaiLai.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        TaiLai.setForeground(new java.awt.Color(255, 255, 255));
        TaiLai.setText("Tải Lại");
        TaiLai.setMaximumSize(new java.awt.Dimension(90, 25));
        TaiLai.setMinimumSize(new java.awt.Dimension(90, 25));
        TaiLai.setPreferredSize(new java.awt.Dimension(90, 25));

        javax.swing.GroupLayout PanelNoiDungLayout = new javax.swing.GroupLayout(PanelNoiDung);
        PanelNoiDung.setLayout(PanelNoiDungLayout);
        PanelNoiDungLayout.setHorizontalGroup(
            PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelNoiDungLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelNoiDungLayout.createSequentialGroup()
                .addGroup(PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelNoiDungLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(thanhToanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(huyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(TaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelNoiDungLayout.createSequentialGroup()
                        .addContainerGap(60, Short.MAX_VALUE)
                        .addComponent(PanelTenDauVao, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelDauVao, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chonKhach, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        PanelNoiDungLayout.setVerticalGroup(
            PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNoiDungLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Title)
                .addGroup(PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelNoiDungLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PanelTenDauVao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PanelDauVao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelNoiDungLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(chonKhach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thanhToanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(huyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        PanelKhung.add(PanelNoiDung);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelKhung, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelKhung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public float phanTramKhuyenMai = 0f;
    public float phanTramUuDai = 0f;
    public String MaKhachHang_duocChon = null;
    public String MaUuDai = null;
    public String MaKhuyenMai = null;

    private int tien_Goc;
    private int tien_discount;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelKhachHang;
    private javax.swing.JLabel LabelKhuyenMai;
    private javax.swing.JLabel LabelMa;
    private javax.swing.JLabel LabelNgay;
    private javax.swing.JLabel LabelNhanVien;
    private javax.swing.JLabel LabelTongTien;
    private javax.swing.JLabel LabelUuDai;
    private javax.swing.JLabel Ma;
    private javax.swing.JLabel Ngay;
    private javax.swing.JPanel PanelDauVao;
    private javax.swing.JPanel PanelKhung;
    private javax.swing.JPanel PanelNoiDung;
    private javax.swing.JPanel PanelTenDauVao;
    private javax.swing.JButton TaiLai;
    private javax.swing.JLabel Title;
    private javax.swing.JButton chonKhach;
    private javax.swing.JButton huyBtn;
    private javax.swing.JLabel kh;
    private javax.swing.JComboBox<String> km;
    private javax.swing.JLabel nv;
    private javax.swing.JButton thanhToanBtn;
    private javax.swing.JLabel tong;
    private javax.swing.JLabel uuDai;
    // End of variables declaration//GEN-END:variables
}