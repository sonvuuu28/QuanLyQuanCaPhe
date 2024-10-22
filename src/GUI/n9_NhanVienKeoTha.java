package GUI;

import Util.TableCustom;
import java.awt.BorderLayout;
import java.awt.Color;

/**
 *
 * @author phuoc
 */
public class n9_NhanVienKeoTha extends javax.swing.JPanel {

    public n9_NhanVienKeoTha() {
        initComponents();
        nhomNutChucNang();
        TableCustom.apply(ScrTable, TableCustom.TableType.MULTI_LINE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTong = new javax.swing.JPanel();
        JScrNhanVien = new javax.swing.JScrollPane();
        PanelNhanVien = new javax.swing.JPanel();
        BtnQLNhanVien = new javax.swing.JPanel();
        LbNhanVien = new javax.swing.JLabel();
        BtnQLPhanQuyen = new javax.swing.JPanel();
        LbPhanQuyen = new javax.swing.JLabel();
        PanelChuaNut = new javax.swing.JPanel();
        BtnThongTinTK = new javax.swing.JPanel();
        LblThongTinTK = new javax.swing.JLabel();
        BtnThem = new javax.swing.JPanel();
        LblThem = new javax.swing.JLabel();
        BtnSua = new javax.swing.JPanel();
        LblSua = new javax.swing.JLabel();
        BtnKhoaTK = new javax.swing.JPanel();
        LblKhoaTK = new javax.swing.JLabel();
        BtnXuat = new javax.swing.JPanel();
        LblXuat = new javax.swing.JLabel();
        BtnNhap = new javax.swing.JPanel();
        LblNhap = new javax.swing.JLabel();
        PanelInput = new javax.swing.JPanel();
        LblTieuDe = new javax.swing.JLabel();
        BtnRefresh = new javax.swing.JPanel();
        LblRefresh = new javax.swing.JLabel();
        PanelTruongThongTin = new javax.swing.JPanel();
        LbeMa = new javax.swing.JLabel();
        LblTen = new javax.swing.JLabel();
        LbeGioiTinh = new javax.swing.JLabel();
        LbeSDT = new javax.swing.JLabel();
        LbeNgaySinh = new javax.swing.JLabel();
        LbeDiaChi = new javax.swing.JLabel();
        LbeChucVu = new javax.swing.JLabel();
        LbeLuong = new javax.swing.JLabel();
        LbeTimKiem = new javax.swing.JLabel();
        PanelChuaTextField = new javax.swing.JPanel();
        PanelTimKiem = new javax.swing.JPanel();
        JTFTimKiem = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Ma = new javax.swing.JTextField();
        Ten = new javax.swing.JTextField();
        SDT = new javax.swing.JTextField();
        NgaySinh = new javax.swing.JTextField();
        DiaChi = new javax.swing.JTextField();
        Luong = new javax.swing.JTextField();
        BoxGioiTinh = new javax.swing.JComboBox<>();
        BoxNhanVien = new javax.swing.JComboBox<>();
        Line1 = new javax.swing.JSeparator();
        Line2 = new javax.swing.JSeparator();
        Line3 = new javax.swing.JSeparator();
        Line4 = new javax.swing.JSeparator();
        Line5 = new javax.swing.JSeparator();
        Line6 = new javax.swing.JSeparator();
        BtnThemTaiKhoan = new javax.swing.JPanel();
        LblThemTK = new javax.swing.JLabel();
        ScrTable = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();

        setBackground(new java.awt.Color(122, 74, 74));
        setMaximumSize(new java.awt.Dimension(1125, 667));
        setMinimumSize(new java.awt.Dimension(1125, 667));
        setPreferredSize(new java.awt.Dimension(1125, 667));

        PanelTong.setBackground(new java.awt.Color(255, 255, 255));
        PanelTong.setMaximumSize(new java.awt.Dimension(1125, 658));
        PanelTong.setMinimumSize(new java.awt.Dimension(1125, 658));
        PanelTong.setPreferredSize(new java.awt.Dimension(1125, 658));

        JScrNhanVien.setBorder(null);
        JScrNhanVien.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        JScrNhanVien.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        JScrNhanVien.setMaximumSize(new java.awt.Dimension(1113, 646));
        JScrNhanVien.setMinimumSize(new java.awt.Dimension(1113, 646));
        JScrNhanVien.setPreferredSize(new java.awt.Dimension(1113, 646));

        PanelNhanVien.setBackground(new java.awt.Color(255, 255, 255));
        PanelNhanVien.setMaximumSize(new java.awt.Dimension(1114, 1100));
        PanelNhanVien.setMinimumSize(new java.awt.Dimension(1114, 1100));

        BtnQLNhanVien.setBackground(new java.awt.Color(219, 189, 142));
        BtnQLNhanVien.setMaximumSize(new java.awt.Dimension(195, 44));
        BtnQLNhanVien.setMinimumSize(new java.awt.Dimension(195, 44));

        LbNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LbNhanVien.setText("Nhân viên");

        javax.swing.GroupLayout BtnQLNhanVienLayout = new javax.swing.GroupLayout(BtnQLNhanVien);
        BtnQLNhanVien.setLayout(BtnQLNhanVienLayout);
        BtnQLNhanVienLayout.setHorizontalGroup(
            BtnQLNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnQLNhanVienLayout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(LbNhanVien)
                .addGap(56, 56, 56))
        );
        BtnQLNhanVienLayout.setVerticalGroup(
            BtnQLNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LbNhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        BtnQLPhanQuyen.setBackground(new java.awt.Color(219, 189, 142));
        BtnQLPhanQuyen.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BtnQLPhanQuyen.setMaximumSize(new java.awt.Dimension(195, 44));
        BtnQLPhanQuyen.setMinimumSize(new java.awt.Dimension(195, 44));

        LbPhanQuyen.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LbPhanQuyen.setText("Phân quyền");

        javax.swing.GroupLayout BtnQLPhanQuyenLayout = new javax.swing.GroupLayout(BtnQLPhanQuyen);
        BtnQLPhanQuyen.setLayout(BtnQLPhanQuyenLayout);
        BtnQLPhanQuyenLayout.setHorizontalGroup(
            BtnQLPhanQuyenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnQLPhanQuyenLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(LbPhanQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        BtnQLPhanQuyenLayout.setVerticalGroup(
            BtnQLPhanQuyenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LbPhanQuyen, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        PanelChuaNut.setBackground(new java.awt.Color(255, 255, 255));

        BtnThongTinTK.setBackground(new java.awt.Color(0, 0, 0));
        BtnThongTinTK.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        BtnThongTinTK.setPreferredSize(new java.awt.Dimension(130, 35));

        LblThongTinTK.setBackground(new java.awt.Color(255, 255, 255));
        LblThongTinTK.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LblThongTinTK.setForeground(new java.awt.Color(255, 255, 255));
        LblThongTinTK.setText("Thông tin TK");
        BtnThongTinTK.add(LblThongTinTK);

        BtnThem.setBackground(new java.awt.Color(0, 0, 0));
        BtnThem.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        BtnThem.setPreferredSize(new java.awt.Dimension(100, 35));

        LblThem.setBackground(new java.awt.Color(255, 255, 255));
        LblThem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LblThem.setForeground(new java.awt.Color(255, 255, 255));
        LblThem.setText("Thêm");
        BtnThem.add(LblThem);

        BtnSua.setBackground(new java.awt.Color(0, 0, 0));
        BtnSua.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        BtnSua.setPreferredSize(new java.awt.Dimension(100, 35));

        LblSua.setBackground(new java.awt.Color(255, 255, 255));
        LblSua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LblSua.setForeground(new java.awt.Color(255, 255, 255));
        LblSua.setText("Sửa");
        BtnSua.add(LblSua);

        BtnKhoaTK.setBackground(new java.awt.Color(0, 0, 0));
        BtnKhoaTK.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        BtnKhoaTK.setPreferredSize(new java.awt.Dimension(100, 35));

        LblKhoaTK.setBackground(new java.awt.Color(255, 255, 255));
        LblKhoaTK.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LblKhoaTK.setForeground(new java.awt.Color(255, 255, 255));
        LblKhoaTK.setText("Khóa TK");
        BtnKhoaTK.add(LblKhoaTK);

        BtnXuat.setBackground(new java.awt.Color(0, 0, 0));
        BtnXuat.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        BtnXuat.setPreferredSize(new java.awt.Dimension(100, 35));

        LblXuat.setBackground(new java.awt.Color(255, 255, 255));
        LblXuat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LblXuat.setForeground(new java.awt.Color(255, 255, 255));
        LblXuat.setText("Xuất");
        BtnXuat.add(LblXuat);

        BtnNhap.setBackground(new java.awt.Color(0, 0, 0));
        BtnNhap.setForeground(new java.awt.Color(51, 51, 51));
        BtnNhap.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        BtnNhap.setPreferredSize(new java.awt.Dimension(100, 35));

        LblNhap.setBackground(new java.awt.Color(255, 255, 255));
        LblNhap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LblNhap.setForeground(new java.awt.Color(255, 255, 255));
        LblNhap.setText("Nhập");
        BtnNhap.add(LblNhap);

        javax.swing.GroupLayout PanelChuaNutLayout = new javax.swing.GroupLayout(PanelChuaNut);
        PanelChuaNut.setLayout(PanelChuaNutLayout);
        PanelChuaNutLayout.setHorizontalGroup(
            PanelChuaNutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelChuaNutLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(PanelChuaNutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnThongTinTK, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelChuaNutLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(BtnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(BtnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(BtnKhoaTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(BtnXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(BtnNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        PanelChuaNutLayout.setVerticalGroup(
            PanelChuaNutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelChuaNutLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PanelChuaNutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnKhoaTK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnThongTinTK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        PanelInput.setBackground(new java.awt.Color(255, 255, 255));

        LblTieuDe.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        LblTieuDe.setText("Quản Lí Nhân Viên ");

        BtnRefresh.setBackground(new java.awt.Color(0, 0, 0));
        BtnRefresh.setMaximumSize(new java.awt.Dimension(34, 34));
        BtnRefresh.setMinimumSize(new java.awt.Dimension(34, 34));
        BtnRefresh.setPreferredSize(new java.awt.Dimension(34, 34));

        LblRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/reload.png"))); // NOI18N
        BtnRefresh.add(LblRefresh);

        PanelTruongThongTin.setBackground(new java.awt.Color(255, 255, 255));

        LbeMa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LbeMa.setText("Mã NV");

        LblTen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LblTen.setText("Tên NV");

        LbeGioiTinh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LbeGioiTinh.setText("Giới tính");

        LbeSDT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LbeSDT.setText("Số điện thoại");

        LbeNgaySinh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LbeNgaySinh.setText("Ngày sinh");

        LbeDiaChi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LbeDiaChi.setText("Địa chỉ");

        LbeChucVu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LbeChucVu.setText("Chức vụ");

        LbeLuong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LbeLuong.setText("Lương");

        LbeTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LbeTimKiem.setText("Tìm Kiếm");

        javax.swing.GroupLayout PanelTruongThongTinLayout = new javax.swing.GroupLayout(PanelTruongThongTin);
        PanelTruongThongTin.setLayout(PanelTruongThongTinLayout);
        PanelTruongThongTinLayout.setHorizontalGroup(
            PanelTruongThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LbeMa, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(LblTen, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(LbeGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(LbeSDT)
            .addComponent(LbeNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(LbeDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(LbeChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(LbeLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(LbeTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        PanelTruongThongTinLayout.setVerticalGroup(
            PanelTruongThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTruongThongTinLayout.createSequentialGroup()
                .addComponent(LbeMa)
                .addGap(25, 25, 25)
                .addComponent(LblTen)
                .addGap(25, 25, 25)
                .addComponent(LbeGioiTinh)
                .addGap(25, 25, 25)
                .addComponent(LbeSDT)
                .addGap(25, 25, 25)
                .addComponent(LbeNgaySinh)
                .addGap(25, 25, 25)
                .addComponent(LbeDiaChi)
                .addGap(25, 25, 25)
                .addComponent(LbeChucVu)
                .addGap(25, 25, 25)
                .addComponent(LbeLuong)
                .addGap(25, 25, 25)
                .addComponent(LbeTimKiem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelChuaTextField.setBackground(new java.awt.Color(255, 255, 255));

        PanelTimKiem.setBackground(new java.awt.Color(219, 189, 142));
        PanelTimKiem.setMaximumSize(new java.awt.Dimension(314, 32));
        PanelTimKiem.setMinimumSize(new java.awt.Dimension(314, 32));
        PanelTimKiem.setPreferredSize(new java.awt.Dimension(314, 32));

        JTFTimKiem.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/search.png"))); // NOI18N

        javax.swing.GroupLayout PanelTimKiemLayout = new javax.swing.GroupLayout(PanelTimKiem);
        PanelTimKiem.setLayout(PanelTimKiemLayout);
        PanelTimKiemLayout.setHorizontalGroup(
            PanelTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTimKiemLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(JTFTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelTimKiemLayout.setVerticalGroup(
            PanelTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTimKiemLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(PanelTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JTFTimKiem))
                .addContainerGap())
        );

        Ma.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Ma.setMaximumSize(new java.awt.Dimension(359, 20));
        Ma.setMinimumSize(new java.awt.Dimension(359, 20));
        Ma.setPreferredSize(new java.awt.Dimension(359, 20));

        Ten.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Ten.setMaximumSize(new java.awt.Dimension(359, 20));
        Ten.setMinimumSize(new java.awt.Dimension(359, 20));
        Ten.setPreferredSize(new java.awt.Dimension(359, 20));

        SDT.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SDT.setMaximumSize(new java.awt.Dimension(359, 20));
        SDT.setMinimumSize(new java.awt.Dimension(359, 20));
        SDT.setPreferredSize(new java.awt.Dimension(359, 20));

        NgaySinh.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        NgaySinh.setMaximumSize(new java.awt.Dimension(359, 20));
        NgaySinh.setMinimumSize(new java.awt.Dimension(359, 20));
        NgaySinh.setPreferredSize(new java.awt.Dimension(359, 20));

        DiaChi.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        DiaChi.setMaximumSize(new java.awt.Dimension(359, 20));
        DiaChi.setMinimumSize(new java.awt.Dimension(359, 20));
        DiaChi.setPreferredSize(new java.awt.Dimension(359, 20));

        Luong.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Luong.setMaximumSize(new java.awt.Dimension(359, 20));
        Luong.setMinimumSize(new java.awt.Dimension(359, 20));
        Luong.setPreferredSize(new java.awt.Dimension(359, 20));

        BoxGioiTinh.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        BoxGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        BoxGioiTinh.setMaximumSize(new java.awt.Dimension(90, 20));
        BoxGioiTinh.setMinimumSize(new java.awt.Dimension(90, 20));
        BoxGioiTinh.setPreferredSize(new java.awt.Dimension(90, 20));

        BoxNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        BoxNhanVien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhân viên", "Quản lý" }));
        BoxNhanVien.setMaximumSize(new java.awt.Dimension(90, 20));
        BoxNhanVien.setMinimumSize(new java.awt.Dimension(90, 20));
        BoxNhanVien.setPreferredSize(new java.awt.Dimension(90, 20));

        Line1.setForeground(new java.awt.Color(0, 0, 0));
        Line1.setMaximumSize(new java.awt.Dimension(359, 5));
        Line1.setMinimumSize(new java.awt.Dimension(359, 5));
        Line1.setPreferredSize(new java.awt.Dimension(359, 5));

        Line2.setForeground(new java.awt.Color(0, 0, 0));
        Line2.setMaximumSize(new java.awt.Dimension(359, 5));
        Line2.setMinimumSize(new java.awt.Dimension(359, 5));
        Line2.setPreferredSize(new java.awt.Dimension(359, 5));

        Line3.setForeground(new java.awt.Color(0, 0, 0));
        Line3.setMaximumSize(new java.awt.Dimension(359, 5));
        Line3.setMinimumSize(new java.awt.Dimension(359, 5));
        Line3.setPreferredSize(new java.awt.Dimension(359, 5));

        Line4.setForeground(new java.awt.Color(0, 0, 0));
        Line4.setMaximumSize(new java.awt.Dimension(359, 5));
        Line4.setMinimumSize(new java.awt.Dimension(359, 5));
        Line4.setPreferredSize(new java.awt.Dimension(359, 5));

        Line5.setForeground(new java.awt.Color(0, 0, 0));
        Line5.setMaximumSize(new java.awt.Dimension(359, 5));
        Line5.setMinimumSize(new java.awt.Dimension(359, 5));
        Line5.setPreferredSize(new java.awt.Dimension(359, 5));

        Line6.setForeground(new java.awt.Color(0, 0, 0));
        Line6.setMaximumSize(new java.awt.Dimension(359, 5));
        Line6.setMinimumSize(new java.awt.Dimension(359, 5));
        Line6.setPreferredSize(new java.awt.Dimension(359, 5));

        javax.swing.GroupLayout PanelChuaTextFieldLayout = new javax.swing.GroupLayout(PanelChuaTextField);
        PanelChuaTextField.setLayout(PanelChuaTextFieldLayout);
        PanelChuaTextFieldLayout.setHorizontalGroup(
            PanelChuaTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelChuaTextFieldLayout.createSequentialGroup()
                .addGroup(PanelChuaTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Ma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Ten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Luong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BoxGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BoxNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Line1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Line2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Line3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Line4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Line5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Line6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 46, Short.MAX_VALUE))
        );
        PanelChuaTextFieldLayout.setVerticalGroup(
            PanelChuaTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelChuaTextFieldLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Ma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(Line1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(Ten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(Line2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(BoxGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(SDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(Line3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(NgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(Line4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(DiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(Line5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(BoxNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(Luong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(Line6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(PanelTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        BtnThemTaiKhoan.setBackground(new java.awt.Color(219, 189, 142));
        BtnThemTaiKhoan.setForeground(new java.awt.Color(51, 51, 51));
        BtnThemTaiKhoan.setPreferredSize(new java.awt.Dimension(130, 35));

        LblThemTK.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LblThemTK.setText("Thêm tài khoản");

        javax.swing.GroupLayout BtnThemTaiKhoanLayout = new javax.swing.GroupLayout(BtnThemTaiKhoan);
        BtnThemTaiKhoan.setLayout(BtnThemTaiKhoanLayout);
        BtnThemTaiKhoanLayout.setHorizontalGroup(
            BtnThemTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnThemTaiKhoanLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(LblThemTK)
                .addContainerGap())
        );
        BtnThemTaiKhoanLayout.setVerticalGroup(
            BtnThemTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LblThemTK, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelInputLayout = new javax.swing.GroupLayout(PanelInput);
        PanelInput.setLayout(PanelInputLayout);
        PanelInputLayout.setHorizontalGroup(
            PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInputLayout.createSequentialGroup()
                .addGap(466, 466, 466)
                .addComponent(LblTieuDe)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInputLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelTruongThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(PanelChuaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelInputLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(BtnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelInputLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(BtnThemTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(256, 256, 256))
        );
        PanelInputLayout.setVerticalGroup(
            PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInputLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(LblTieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelTruongThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelChuaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(PanelInputLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(BtnThemTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        Table.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã NV", "Tên NV", "Giới tính", "Số điện thoại", "Ngày sinh", "Địa chỉ", "Chức vụ", "Lương", "Trạng thái"
            }
        ));
        ScrTable.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(0).setPreferredWidth(40);
        }

        javax.swing.GroupLayout PanelNhanVienLayout = new javax.swing.GroupLayout(PanelNhanVien);
        PanelNhanVien.setLayout(PanelNhanVienLayout);
        PanelNhanVienLayout.setHorizontalGroup(
            PanelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelNhanVienLayout.createSequentialGroup()
                .addGroup(PanelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelNhanVienLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(BtnQLNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(BtnQLPhanQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelNhanVienLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(PanelChuaNut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelNhanVienLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(ScrTable, javax.swing.GroupLayout.PREFERRED_SIZE, 967, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        PanelNhanVienLayout.setVerticalGroup(
            PanelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNhanVienLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PanelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnQLPhanQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnQLNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(PanelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelChuaNut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrTable, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        JScrNhanVien.setViewportView(PanelNhanVien);

        javax.swing.GroupLayout PanelTongLayout = new javax.swing.GroupLayout(PanelTong);
        PanelTong.setLayout(PanelTongLayout);
        PanelTongLayout.setHorizontalGroup(
            PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JScrNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelTongLayout.setVerticalGroup(
            PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JScrNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    public void nhomNutChucNang() {
        BtnQLNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnQLNhanVien.setBackground(new Color(199, 159, 95));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnQLNhanVien.setBackground(new Color(219, 189, 142));
            }
        });
        BtnQLPhanQuyen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnQLPhanQuyen.setBackground(new Color(199, 159, 95));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnQLPhanQuyen.setBackground(new Color(219, 189, 142));
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelTong.removeAll();
                n9_PhanQuyenGUI lich = new n9_PhanQuyenGUI();
                PanelTong.setLayout(new BorderLayout());
                PanelTong.add(lich, BorderLayout.CENTER); // Adjust the layout constraint as needed
                PanelTong.revalidate();
                PanelTong.repaint();
            }
        });

        BtnThongTinTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnThongTinTK.setBackground(new Color(106, 105, 105));
                LblThongTinTK.setOpaque(true);
                LblThongTinTK.setBackground(new Color(106, 105, 105));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnThongTinTK.setBackground(new Color(0, 0, 0));
                LblThongTinTK.setOpaque(true);
                LblThongTinTK.setBackground(new Color(0, 0, 0));
            }
        });
        BtnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnThem.setBackground(new Color(106, 105, 105));
                LblThem.setOpaque(true);
                LblThem.setBackground(new Color(106, 105, 105));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnThem.setBackground(new Color(0, 0, 0));
                LblThem.setOpaque(true);
                LblThem.setBackground(new Color(0, 0, 0));
            }
        });

        BtnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnSua.setBackground(new Color(106, 105, 105));
                LblSua.setOpaque(true);
                LblSua.setBackground(new Color(106, 105, 105));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnSua.setBackground(new Color(0, 0, 0));
                LblSua.setOpaque(true);
                LblSua.setBackground(new Color(0, 0, 0));
            }
        });

        BtnNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnNhap.setBackground(new Color(106, 105, 105));
                LblNhap.setOpaque(true);
                LblNhap.setBackground(new Color(106, 105, 105));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnNhap.setBackground(new Color(0, 0, 0));
                LblNhap.setOpaque(true);
                LblNhap.setBackground(new Color(0, 0, 0));
            }
        });
        
        BtnXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnXuat.setBackground(new Color(106, 105, 105));
                LblXuat.setOpaque(true);
                LblXuat.setBackground(new Color(106, 105, 105));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnXuat.setBackground(new Color(0, 0, 0));
                LblXuat.setOpaque(true);
                LblXuat.setBackground(new Color(0, 0, 0));
            }
        });
        
        BtnKhoaTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnKhoaTK.setBackground(new Color(106, 105, 105));
                LblKhoaTK.setOpaque(true);
                LblKhoaTK.setBackground(new Color(106, 105, 105));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnKhoaTK.setBackground(new Color(0, 0, 0));
                LblKhoaTK.setOpaque(true);
                LblKhoaTK.setBackground(new Color(0, 0, 0));
            }
        });
        
        BtnThemTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnThemTaiKhoan.setBackground(new Color(199, 159, 95));
                LblThemTK.setOpaque(true);
                LblThemTK.setBackground(new Color(199, 159, 95));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnThemTaiKhoan.setBackground(new Color(219, 189, 142));
                LblThemTK.setOpaque(true);
                LblThemTK.setBackground(new Color(219, 189, 142));
            }
        });

        BtnRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnRefresh.setBackground(new Color(106, 105, 105));
                LblRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/reload_hover.png")));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnRefresh.setBackground(new Color(0, 0, 0));
                LblRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/reload.png")));
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxGioiTinh;
    private javax.swing.JComboBox<String> BoxNhanVien;
    private javax.swing.JPanel BtnKhoaTK;
    private javax.swing.JPanel BtnNhap;
    private javax.swing.JPanel BtnQLNhanVien;
    private javax.swing.JPanel BtnQLPhanQuyen;
    private javax.swing.JPanel BtnRefresh;
    private javax.swing.JPanel BtnSua;
    private javax.swing.JPanel BtnThem;
    private javax.swing.JPanel BtnThemTaiKhoan;
    private javax.swing.JPanel BtnThongTinTK;
    private javax.swing.JPanel BtnXuat;
    private javax.swing.JTextField DiaChi;
    private javax.swing.JScrollPane JScrNhanVien;
    private javax.swing.JTextField JTFTimKiem;
    private javax.swing.JLabel LbNhanVien;
    private javax.swing.JLabel LbPhanQuyen;
    private javax.swing.JLabel LbeChucVu;
    private javax.swing.JLabel LbeDiaChi;
    private javax.swing.JLabel LbeGioiTinh;
    private javax.swing.JLabel LbeLuong;
    private javax.swing.JLabel LbeMa;
    private javax.swing.JLabel LbeNgaySinh;
    private javax.swing.JLabel LbeSDT;
    private javax.swing.JLabel LbeTimKiem;
    private javax.swing.JLabel LblKhoaTK;
    private javax.swing.JLabel LblNhap;
    private javax.swing.JLabel LblRefresh;
    private javax.swing.JLabel LblSua;
    private javax.swing.JLabel LblTen;
    private javax.swing.JLabel LblThem;
    private javax.swing.JLabel LblThemTK;
    private javax.swing.JLabel LblThongTinTK;
    private javax.swing.JLabel LblTieuDe;
    private javax.swing.JLabel LblXuat;
    private javax.swing.JSeparator Line1;
    private javax.swing.JSeparator Line2;
    private javax.swing.JSeparator Line3;
    private javax.swing.JSeparator Line4;
    private javax.swing.JSeparator Line5;
    private javax.swing.JSeparator Line6;
    private javax.swing.JTextField Luong;
    private javax.swing.JTextField Ma;
    private javax.swing.JTextField NgaySinh;
    private javax.swing.JPanel PanelChuaNut;
    private javax.swing.JPanel PanelChuaTextField;
    private javax.swing.JPanel PanelInput;
    private javax.swing.JPanel PanelNhanVien;
    private javax.swing.JPanel PanelTimKiem;
    private javax.swing.JPanel PanelTong;
    private javax.swing.JPanel PanelTruongThongTin;
    private javax.swing.JTextField SDT;
    private javax.swing.JScrollPane ScrTable;
    private javax.swing.JTable Table;
    private javax.swing.JTextField Ten;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
