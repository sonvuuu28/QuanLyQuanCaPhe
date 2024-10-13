package GUI;

import Util.TableCustom;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author ACER
 */
public class BanHangGUI extends javax.swing.JPanel {

    /**
     * Creates new form BanHangKeoTha
     */
    public BanHangGUI() {
        initComponents();
        scrollPane();
        TableCustom.apply(scrollPaneTable, TableCustom.TableType.MULTI_LINE);
    }

    private JPanel productContainer;
    private JScrollPane scrollPane;

    public void addProduct(JPanel product, JLabel labelAnh, JLabel labelTenMon, JLabel labelGia) {
        labelTenMon.setPreferredSize(new Dimension(20, 180));
        labelTenMon.setFont(new Font("", Font.BOLD, 14));
        labelGia.setPreferredSize(new Dimension(20, 180));
        labelTenMon.setHorizontalAlignment(SwingConstants.CENTER);
        labelTenMon.setVerticalAlignment(SwingConstants.CENTER);

        product.setPreferredSize(new Dimension(150, 180)); // Kích thước cố định cho mỗi sản phẩm
        product.setBackground(Color.WHITE);
        product.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        // Sử dụng GridBagLayout cho JPanel product
        product.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1; // Ô labelAnh sẽ chiếm 3 cột
        gbc.gridheight = 1; // Ô labelAnh sẽ chiếm 1 hàng
        gbc.anchor = GridBagConstraints.CENTER; // Căn giữa nội dung của labelAnh
        gbc.ipady = 5;
        product.add(labelAnh, gbc);

        // Thiết lập kích thước và vị trí cho labelTenMon
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.anchor = GridBagConstraints.CENTER; // Căn giữa nội dung của labelTenMon
        gbc.ipady = 5;
        product.add(labelTenMon, gbc);

        // Thiết lập kích thước và vị trí cho labelGia
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.anchor = GridBagConstraints.CENTER; // Căn giữa nội dung của labelGia
        gbc.ipady = 5;
        product.add(labelGia, gbc);

        productContainer.add(product);
        productContainer.revalidate();
        productContainer.repaint();
    }

    public void scrollPane() {
        PanelProduct.setLayout(new BorderLayout());
        productContainer = new JPanel();
        productContainer.setLayout(new GridLayout(0, 4, 10, 10)); // 4 cột, khoảng cách giữa các sản phẩm
        productContainer.setBackground(new Color(219, 189, 142));
        productContainer.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Cuộn sản phẩm
        scrollPane = new JScrollPane(productContainer);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        scrollPane.setPreferredSize(new Dimension(980, 224));
        scrollPane.setBorder(new EmptyBorder(0, 0, 0, 0));
        PanelProduct.add(scrollPane, BorderLayout.CENTER);

        for (int i = 1; i <= 12; i++) {
            JPanel product = new JPanel();
            JLabel labelAnh = new JLabel();
            labelAnh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/SanPham/caPheMuoi1.jpg")));
            JLabel labelTenMon = new JLabel();
            labelTenMon.setText("Cà phê muối");
            JLabel LabelGia = new JLabel();
            LabelGia.setText("50.000 VNĐ");
            addProduct(product, labelAnh, labelTenMon, LabelGia);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        PanelTong = new Util.PanelRound();
        PanelHoaDon = new Util.PanelRound();
        LabelHoaDon = new javax.swing.JLabel();
        PanelBanHang = new Util.PanelRound();
        LabelBanHang = new javax.swing.JLabel();
        PanelNoiDung = new javax.swing.JPanel();
        LabelMenu = new javax.swing.JLabel();
        PanelTimKiem = new Util.PanelRound();
        TextFieldTimKiem = new javax.swing.JTextField();
        LabelAnhTimKiem = new javax.swing.JLabel();
        LabelLoaiSP = new javax.swing.JLabel();
        ComboBoxLoaiSP = new javax.swing.JComboBox<>();
        PanelProduct = new Util.PanelRound();
        PanelGioHang = new javax.swing.JPanel();
        PanelThanhToan = new Util.PanelRound();
        Tao = new javax.swing.JLabel();
        PanelXoa = new Util.PanelRound();
        Xoa = new javax.swing.JLabel();
        PanelSua = new Util.PanelRound();
        Sua = new javax.swing.JLabel();
        scrollPaneTable = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        LabelGioHang = new javax.swing.JLabel();
        PanelTaiLai = new Util.PanelRound();
        LabelTaiLai = new javax.swing.JLabel();

        setBackground(new java.awt.Color(122, 74, 74));
        setMaximumSize(new java.awt.Dimension(1125, 667));
        setMinimumSize(new java.awt.Dimension(1125, 667));
        setPreferredSize(new java.awt.Dimension(1125, 667));

        PanelTong.setBackground(new java.awt.Color(255, 255, 255));
        PanelTong.setMaximumSize(new java.awt.Dimension(1125, 667));
        PanelTong.setMinimumSize(new java.awt.Dimension(1125, 667));
        PanelTong.setPreferredSize(new java.awt.Dimension(1125, 667));

        PanelHoaDon.setBackground(new java.awt.Color(219, 189, 142));
        PanelHoaDon.setPreferredSize(new java.awt.Dimension(195, 50));
        PanelHoaDon.setLayout(new java.awt.GridBagLayout());

        LabelHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LabelHoaDon.setText("HÓA ĐƠN");
        PanelHoaDon.add(LabelHoaDon, new java.awt.GridBagConstraints());

        PanelBanHang.setBackground(new java.awt.Color(219, 189, 142));
        PanelBanHang.setPreferredSize(new java.awt.Dimension(195, 50));
        PanelBanHang.setLayout(new java.awt.GridBagLayout());

        LabelBanHang.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LabelBanHang.setText("BÁN HÀNG");
        PanelBanHang.add(LabelBanHang, new java.awt.GridBagConstraints());

        PanelNoiDung.setBackground(new java.awt.Color(255, 255, 255));

        LabelMenu.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        LabelMenu.setText("Thực đơn");

        PanelTimKiem.setBackground(new java.awt.Color(219, 189, 142));
        PanelTimKiem.setMaximumSize(new java.awt.Dimension(360, 30));
        PanelTimKiem.setMinimumSize(new java.awt.Dimension(360, 30));
        PanelTimKiem.setPreferredSize(new java.awt.Dimension(360, 30));

        TextFieldTimKiem.setText("Tìm Kiếm");
        TextFieldTimKiem.setPreferredSize(new java.awt.Dimension(355, 24));

        LabelAnhTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/search.png"))); // NOI18N

        javax.swing.GroupLayout PanelTimKiemLayout = new javax.swing.GroupLayout(PanelTimKiem);
        PanelTimKiem.setLayout(PanelTimKiemLayout);
        PanelTimKiemLayout.setHorizontalGroup(
                PanelTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelTimKiemLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(TextFieldTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelAnhTimKiem)
                                .addContainerGap(11, Short.MAX_VALUE))
        );
        PanelTimKiemLayout.setVerticalGroup(
                PanelTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelTimKiemLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(PanelTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(LabelAnhTimKiem)
                                        .addComponent(TextFieldTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LabelLoaiSP.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        LabelLoaiSP.setText("Loại Sản Phẩm");

        ComboBoxLoaiSP.setBackground(new java.awt.Color(219, 189, 142));
        ComboBoxLoaiSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Tất Cả", "Cà Phê", "Sinh Tố"}));

        PanelProduct.setBackground(new java.awt.Color(219, 189, 142));
        PanelProduct.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        PanelProduct.setMaximumSize(new java.awt.Dimension(1100, 244));
        PanelProduct.setMinimumSize(new java.awt.Dimension(1100, 244));
        PanelProduct.setPreferredSize(new java.awt.Dimension(1100, 244));

        javax.swing.GroupLayout PanelProductLayout = new javax.swing.GroupLayout(PanelProduct);
        PanelProduct.setLayout(PanelProductLayout);
        PanelProductLayout.setHorizontalGroup(
                PanelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelProductLayout.setVerticalGroup(
                PanelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 416, Short.MAX_VALUE)
        );

        PanelGioHang.setBackground(new java.awt.Color(255, 255, 255));

        PanelThanhToan.setBackground(new java.awt.Color(0, 0, 0));
        PanelThanhToan.setPreferredSize(new java.awt.Dimension(65, 25));

        Tao.setBackground(new java.awt.Color(0, 0, 0));
        Tao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Tao.setForeground(new java.awt.Color(255, 255, 255));
        Tao.setText("Thanh Toán");
        Tao.setOpaque(true);
        PanelThanhToan.add(Tao);

        PanelXoa.setBackground(new java.awt.Color(0, 0, 0));
        PanelXoa.setPreferredSize(new java.awt.Dimension(65, 25));

        Xoa.setBackground(new java.awt.Color(0, 0, 0));
        Xoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Xoa.setForeground(new java.awt.Color(255, 255, 255));
        Xoa.setText("Xóa");
        Xoa.setOpaque(true);
        PanelXoa.add(Xoa);

        PanelSua.setBackground(new java.awt.Color(0, 0, 0));
        PanelSua.setPreferredSize(new java.awt.Dimension(65, 25));

        Sua.setBackground(new java.awt.Color(0, 0, 0));
        Sua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Sua.setForeground(new java.awt.Color(255, 255, 255));
        Sua.setText("Sửa");
        Sua.setOpaque(true);
        PanelSua.add(Sua);

        Table.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {"M001", "Cà phê muối", "50.000", "3", "150.000"}
                },
                new String[]{
                    "Mã", "Tên", "Đơn Giá", "Số Lượng", "Thành Tiền"
                }
        ));
        scrollPaneTable.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(0).setPreferredWidth(25);
            Table.getColumnModel().getColumn(1).setPreferredWidth(70);
            Table.getColumnModel().getColumn(2).setPreferredWidth(50);
            Table.getColumnModel().getColumn(3).setPreferredWidth(55);
        }

        LabelGioHang.setBackground(new java.awt.Color(255, 255, 255));
        LabelGioHang.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        LabelGioHang.setText("Giỏ hàng");
        LabelGioHang.setOpaque(true);

        PanelTaiLai.setBackground(new java.awt.Color(0, 0, 0));
        PanelTaiLai.setPreferredSize(new java.awt.Dimension(65, 25));

        LabelTaiLai.setBackground(new java.awt.Color(0, 0, 0));
        LabelTaiLai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelTaiLai.setForeground(new java.awt.Color(255, 255, 255));
        LabelTaiLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/reload.png"))); // 
        LabelTaiLai.setOpaque(true);
        PanelTaiLai.add(LabelTaiLai);

        javax.swing.GroupLayout PanelGioHangLayout = new javax.swing.GroupLayout(PanelGioHang);
        PanelGioHang.setLayout(PanelGioHangLayout);
        PanelGioHangLayout.setHorizontalGroup(
                PanelGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelGioHangLayout.createSequentialGroup()
                                .addContainerGap(74, Short.MAX_VALUE)
                                .addComponent(PanelThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(PanelXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(PanelSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68))
                        .addGroup(PanelGioHangLayout.createSequentialGroup()
                                .addComponent(scrollPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(PanelGioHangLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(LabelGioHang)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PanelTaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        PanelGioHangLayout.setVerticalGroup(
                PanelGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelGioHangLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(PanelGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PanelGioHangLayout.createSequentialGroup()
                                                .addComponent(LabelGioHang)
                                                .addGap(27, 27, 27))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelGioHangLayout.createSequentialGroup()
                                                .addComponent(PanelTaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(scrollPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PanelGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(PanelSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PanelThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PanelXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(86, 86, 86))
        );

        javax.swing.GroupLayout PanelNoiDungLayout = new javax.swing.GroupLayout(PanelNoiDung);
        PanelNoiDung.setLayout(PanelNoiDungLayout);
        PanelNoiDungLayout.setHorizontalGroup(
                PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelNoiDungLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(PanelProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 689, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelNoiDungLayout.createSequentialGroup()
                                                .addGroup(PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(LabelMenu)
                                                        .addComponent(PanelTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                                .addComponent(LabelLoaiSP)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ComboBoxLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PanelGioHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelNoiDungLayout.setVerticalGroup(
                PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelNoiDungLayout.createSequentialGroup()
                                .addComponent(PanelGioHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelNoiDungLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(LabelMenu)
                                .addGap(28, 28, 28)
                                .addGroup(PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(LabelLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ComboBoxLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PanelTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 34, Short.MAX_VALUE)
                                .addComponent(PanelProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout PanelTongLayout = new javax.swing.GroupLayout(PanelTong);
        PanelTong.setLayout(PanelTongLayout);
        PanelTongLayout.setHorizontalGroup(
                PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelTongLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(PanelBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(PanelHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(PanelNoiDung, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelTongLayout.setVerticalGroup(
                PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelTongLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(PanelBanHang, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                                        .addComponent(PanelHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(6, 6, 6)
                                .addComponent(PanelNoiDung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(PanelTong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(PanelTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        PanelBanHang.setRoundBottomRight(40);
        PanelBanHang.setRoundTopLeft(40);

        PanelHoaDon.setRoundBottomRight(40);
        PanelHoaDon.setRoundTopLeft(40);

        PanelTimKiem.setRoundBottomRight(20);
        PanelTimKiem.setRoundTopLeft(20);
        PanelTimKiem.setRoundTopRight(20);
        PanelTimKiem.setRoundBottomLeft(20);

        PanelProduct.setRoundBottomRight(20);
        PanelProduct.setRoundTopLeft(20);
        PanelProduct.setRoundTopRight(20);
        PanelProduct.setRoundBottomLeft(20);

        PanelThanhToan.setRoundBottomRight(20);
        PanelThanhToan.setRoundTopLeft(20);
        PanelThanhToan.setRoundTopRight(20);
        PanelThanhToan.setRoundBottomLeft(20);

        PanelXoa.setRoundBottomRight(20);
        PanelXoa.setRoundTopLeft(20);
        PanelXoa.setRoundTopRight(20);
        PanelXoa.setRoundBottomLeft(20);

        PanelSua.setRoundBottomRight(20);
        PanelSua.setRoundTopLeft(20);
        PanelSua.setRoundTopRight(20);
        PanelSua.setRoundBottomLeft(20);

        PanelTong.setRoundBottomRight(20);
        PanelTong.setRoundTopLeft(20);
        PanelTong.setRoundTopRight(20);
        PanelTong.setRoundBottomLeft(20);

        PanelTaiLai.setRoundBottomRight(50);
        PanelTaiLai.setRoundTopLeft(50);
        PanelTaiLai.setRoundTopRight(50);
        PanelTaiLai.setRoundBottomLeft(50);
        nhomNutChucNang();
    }// </editor-fold>                        

    public void nhomNutChucNang() {
        PanelBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelBanHang.setBackground(new Color(199, 159, 95));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelBanHang.setBackground(new Color(219, 189, 142));
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelTong.removeAll();
                BanHangGUI bh = new BanHangGUI();
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
        });

        PanelThanhToan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelThanhToan.setBackground(new Color(106, 105, 105));
                Tao.setOpaque(true);
                Tao.setBackground(new Color(106, 105, 105));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelThanhToan.setBackground(new Color(0, 0, 0));
                Tao.setOpaque(true);
                Tao.setBackground(new Color(0, 0, 0));
            }
        });
        PanelSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelSua.setBackground(new Color(106, 105, 105));
                Sua.setOpaque(true);
                Sua.setBackground(new Color(106, 105, 105));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelSua.setBackground(new Color(0, 0, 0));
                Sua.setOpaque(true);
                Sua.setBackground(new Color(0, 0, 0));
            }
        });

        PanelXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelXoa.setBackground(new Color(106, 105, 105));
                Xoa.setOpaque(true);
                Xoa.setBackground(new Color(106, 105, 105));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelXoa.setBackground(new Color(0, 0, 0));
                Xoa.setOpaque(true);
                Xoa.setBackground(new Color(0, 0, 0));
            }
        });

        PanelTaiLai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelTaiLai.setBackground(new Color(106, 105, 105));
                LabelTaiLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/reload_hover.png")));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelTaiLai.setBackground(new Color(0, 0, 0));
                LabelTaiLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/reload.png")));
            }
        });
    }
    
    // Variables declaration - do not modify  
    private Util.PanelRound PanelBanHang;
    private Util.PanelRound PanelHoaDon;
    private Util.PanelRound PanelTimKiem;
    private Util.PanelRound PanelProduct;
    private Util.PanelRound PanelThanhToan;
    private Util.PanelRound PanelSua;
    private Util.PanelRound PanelXoa;
    private Util.PanelRound PanelTong;
    private Util.PanelRound PanelTaiLai;

    private javax.swing.JComboBox<String> ComboBoxLoaiSP;
    private javax.swing.JLabel LabelAnhTimKiem;
    private javax.swing.JLabel LabelBanHang;
    private javax.swing.JLabel LabelGioHang;
    private javax.swing.JLabel LabelHoaDon;
    private javax.swing.JLabel LabelLoaiSP;
    private javax.swing.JLabel LabelMenu;
    private javax.swing.JLabel LabelTaiLai;
    private javax.swing.JPanel PanelGioHang;
    private javax.swing.JPanel PanelNoiDung;
    private javax.swing.JLabel Sua;
    private javax.swing.JTable Table;
    private javax.swing.JLabel Tao;
    private javax.swing.JTextField TextFieldTimKiem;
    private javax.swing.JLabel Xoa;
    private javax.swing.JScrollPane scrollPaneTable;
    // End of variables declaration                   
}
