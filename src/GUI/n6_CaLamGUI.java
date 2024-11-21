package GUI;

import Util.TableCustom;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class n6_CaLamGUI extends javax.swing.JPanel {

    public n6_CaLamGUI() {
        initComponents();
        nhomNutChucNang();
        TableCustom.apply(ScrollPane, TableCustom.TableType.MULTI_LINE);
        testData(Table);
    }

        private void testData(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addRow(new Object[]{1, "Chai", "Beverages", 18, true});
        model.addRow(new Object[]{2, "Chang", "Beverages", 19, false});
        model.addRow(new Object[]{3, "Aniseed Syrup", "Beverages", 18, 39});
        model.addRow(new Object[]{4, "Chef Anton's Cajun Seasoning", "Beverages", 19, 39});
        model.addRow(new Object[]{5, "Chef Anton's Gumbo Mix", "Beverages", 18, 39});
        model.addRow(new Object[]{6, "Grandma's Boysenberry Spread", "Beverages", 19, 39});
        model.addRow(new Object[]{7, "Uncle Bob's Organic Dried Pears", "Beverages", 18, 39});
        model.addRow(new Object[]{8, "Northwoods Cranberry Sauce", "Beverages", 19, 39});
        model.addRow(new Object[]{9, "Mishi Kobe Niku", "Beverages", 18, 39});
        model.addRow(new Object[]{10, "Ikura", "Beverages", 19, 39});
        model.addRow(new Object[]{11, "Queso Cabrales", "Beverages", 18, 39});
        model.addRow(new Object[]{12, "Queso Manchego La Pastora", "Beverages", 19, 39});
        model.addRow(new Object[]{13, "Konbu", "Beverages", 18, 39});
        model.addRow(new Object[]{14, "Tofu", "Seafood", 19, 39});
        model.addRow(new Object[]{15, "Genen Shouyu", "Seafood", 18, 39});
        model.addRow(new Object[]{16, "Pavlova", "Seafood", 19, 39});
        model.addRow(new Object[]{17, "Alice Mutton", "Seafood", 18, 39});
        model.addRow(new Object[]{18, "Carnarvon Tigers", "Seafood", 19, 39});
        model.addRow(new Object[]{19, "Teatime Chocolate Biscuits", "Seafood", 19, 39});
        model.addRow(new Object[]{20, "Sir Rodney's Marmalade", "Seafood", 19, 39});
        model.addRow(new Object[]{21, "Sir Rodney's Scones", "Seafood", 19, 39});
        model.addRow(new Object[]{22, "Gustaf's Knäckebröd", "Seafood", 19, 39});
        model.addRow(new Object[]{23, "Tunnbröd", "Seafood", 19, 39});
        model.addRow(new Object[]{24, "Guaraná Fantástica", "Seafood", 19, 39});
        model.addRow(new Object[]{25, "NuNuCa Nuß-Nougat-Creme", "Seafood", 19, 39});
        model.addRow(new Object[]{26, "Gumbär Gummibärchen", "Seafood", 19, 39});
        model.addRow(new Object[]{27, "Schoggi Schokolade", "Seafood", 19, 39});
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        PanelLichLam = new Util.PanelRound();
        PanelCaLam = new Util.PanelRound();
        PanelThongTin = new Util.PanelRound();
        PanelNoiDungThongTin = new Util.PanelRound();
        PanelSua = new Util.PanelRound();
        PanelTaiLai = new Util.PanelRound();
        PanelTao = new Util.PanelRound();
        PanelXoa = new Util.PanelRound();
        PanelTong = new Util.PanelRound();
        PanelTimKiem = new Util.PanelRound();
        
        LichLam = new javax.swing.JLabel();
        CaLam = new javax.swing.JLabel();
        PanelInput = new javax.swing.JPanel();
        LabelTieuDe = new javax.swing.JLabel();
        PanelThuocTinh = new javax.swing.JPanel();
        MaCa = new javax.swing.JLabel();
        TenCa = new javax.swing.JLabel();
        ThoiGianVao = new javax.swing.JLabel();
        ThoiGianRa = new javax.swing.JLabel();
        TrangThai = new javax.swing.JLabel();
        PanelCacText = new javax.swing.JPanel();
        TextMaCa = new javax.swing.JTextField();
        TextTenCa = new javax.swing.JTextField();
        TextThoiGianVao = new javax.swing.JTextField();
        TextThoiGianRa = new javax.swing.JTextField();
        comboboxTrangThai = new javax.swing.JComboBox<>();
        line1 = new javax.swing.JSeparator();
        line2 = new javax.swing.JSeparator();
        line3 = new javax.swing.JSeparator();
        line4 = new javax.swing.JSeparator();
        Sua = new javax.swing.JLabel();
        Tao = new javax.swing.JLabel();
        Xoa = new javax.swing.JLabel();
        LabelTaiLai = new javax.swing.JLabel();
        ScrollPane = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        LabelTenBang = new javax.swing.JLabel();
        LabelTimKiem = new javax.swing.JLabel();

        setBackground(new java.awt.Color(122, 74, 74));
        setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        setMinimumSize(new java.awt.Dimension(1125, 667));
        setPreferredSize(new java.awt.Dimension(1125, 667));

        PanelTong.setBackground(new java.awt.Color(255, 255, 255));
        PanelTong.setMaximumSize(new java.awt.Dimension(1125, 658));
        PanelTong.setMinimumSize(new java.awt.Dimension(1125, 658));
        PanelTong.setPreferredSize(new java.awt.Dimension(1125, 658));

        PanelLichLam.setBackground(new java.awt.Color(219, 189, 142));
        PanelLichLam.setMaximumSize(new java.awt.Dimension(195, 44));
        PanelLichLam.setMinimumSize(new java.awt.Dimension(195, 44));
        PanelLichLam.setPreferredSize(new java.awt.Dimension(195, 44));
        PanelLichLam.setLayout(new java.awt.GridBagLayout());

        LichLam.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LichLam.setText("LỊCH LÀM");
        PanelLichLam.add(LichLam, new java.awt.GridBagConstraints());

        PanelCaLam.setBackground(new java.awt.Color(219, 189, 142));
        PanelCaLam.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        PanelCaLam.setMaximumSize(new java.awt.Dimension(195, 44));
        PanelCaLam.setMinimumSize(new java.awt.Dimension(195, 44));
        PanelCaLam.setPreferredSize(new java.awt.Dimension(195, 44));
        PanelCaLam.setLayout(new java.awt.GridBagLayout());

        CaLam.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        CaLam.setText("CA LÀM");
        PanelCaLam.add(CaLam, new java.awt.GridBagConstraints());

        PanelInput.setBackground(new java.awt.Color(255, 255, 255));

        PanelThongTin.setBackground(new java.awt.Color(219, 189, 142));
        PanelThongTin.setPreferredSize(new java.awt.Dimension(237, 277));

        PanelNoiDungThongTin.setBackground(new java.awt.Color(255, 255, 255));
        PanelNoiDungThongTin.setMinimumSize(new java.awt.Dimension(255, 266));
        PanelNoiDungThongTin.setPreferredSize(new java.awt.Dimension(225, 266));

        LabelTieuDe.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LabelTieuDe.setText("Thông Tin Ca Làm");

        PanelThuocTinh.setBackground(new java.awt.Color(255, 255, 255));
        PanelThuocTinh.setLayout(new java.awt.GridLayout(5, 0));

        MaCa.setBackground(new java.awt.Color(255, 255, 255));
        MaCa.setText("Mã Ca");
        PanelThuocTinh.add(MaCa);

        TenCa.setBackground(new java.awt.Color(255, 255, 255));
        TenCa.setText("Tên Ca");
        PanelThuocTinh.add(TenCa);

        ThoiGianVao.setBackground(new java.awt.Color(255, 255, 255));
        ThoiGianVao.setText("Thời gian vào");
        PanelThuocTinh.add(ThoiGianVao);

        ThoiGianRa.setBackground(new java.awt.Color(255, 255, 255));
        ThoiGianRa.setText("Thời Gian Ra");
        PanelThuocTinh.add(ThoiGianRa);

        TrangThai.setBackground(new java.awt.Color(255, 255, 255));
        TrangThai.setText("Trạng Thái");
        PanelThuocTinh.add(TrangThai);

        PanelCacText.setBackground(new java.awt.Color(255, 255, 255));

        TextMaCa.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        TextMaCa.setText("C001");
        TextMaCa.setBorder(null);

        TextTenCa.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        TextTenCa.setText("Ca A");
        TextTenCa.setBorder(null);

        TextThoiGianVao.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        TextThoiGianVao.setText("14:00");
        TextThoiGianVao.setBorder(null);

        TextThoiGianRa.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        TextThoiGianRa.setText("06:00");
        TextThoiGianRa.setBorder(null);

        comboboxTrangThai.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        comboboxTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bật", "Tắt" }));
        comboboxTrangThai.setBorder(null);
        comboboxTrangThai.setPreferredSize(new java.awt.Dimension(93, 25));

        line1.setForeground(new java.awt.Color(0, 0, 0));

        line2.setForeground(new java.awt.Color(0, 0, 0));

        line3.setForeground(new java.awt.Color(0, 0, 0));

        line4.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout PanelCacTextLayout = new javax.swing.GroupLayout(PanelCacText);
        PanelCacText.setLayout(PanelCacTextLayout);
        PanelCacTextLayout.setHorizontalGroup(
            PanelCacTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCacTextLayout.createSequentialGroup()
                .addGroup(PanelCacTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboboxTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelCacTextLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelCacTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextTenCa, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextMaCa, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(line1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(line2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextThoiGianRa, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(line3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextThoiGianVao, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(line4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelCacTextLayout.setVerticalGroup(
            PanelCacTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCacTextLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(TextMaCa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(line1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(TextTenCa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(line2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(TextThoiGianRa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(line3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(TextThoiGianVao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(line4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(comboboxTrangThai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelNoiDungThongTinLayout = new javax.swing.GroupLayout(PanelNoiDungThongTin);
        PanelNoiDungThongTin.setLayout(PanelNoiDungThongTinLayout);
        PanelNoiDungThongTinLayout.setHorizontalGroup(
            PanelNoiDungThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNoiDungThongTinLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(PanelThuocTinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(PanelCacText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(PanelNoiDungThongTinLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(LabelTieuDe)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelNoiDungThongTinLayout.setVerticalGroup(
            PanelNoiDungThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNoiDungThongTinLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(LabelTieuDe)
                .addGap(29, 29, 29)
                .addGroup(PanelNoiDungThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelThuocTinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelNoiDungThongTinLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(PanelCacText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        PanelThongTin.add(PanelNoiDungThongTin);

        PanelSua.setBackground(new java.awt.Color(0, 0, 0));
        PanelSua.setPreferredSize(new java.awt.Dimension(65, 25));

        Sua.setBackground(new java.awt.Color(0, 0, 0));
        Sua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Sua.setForeground(new java.awt.Color(255, 255, 255));
        Sua.setText("Sửa");
        Sua.setOpaque(true);
        PanelSua.add(Sua);

        PanelTao.setBackground(new java.awt.Color(0, 0, 0));
        PanelTao.setPreferredSize(new java.awt.Dimension(65, 25));

        Tao.setBackground(new java.awt.Color(0, 0, 0));
        Tao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Tao.setForeground(new java.awt.Color(255, 255, 255));
        Tao.setText("Tạo");
        Tao.setOpaque(true);
        PanelTao.add(Tao);

        PanelXoa.setBackground(new java.awt.Color(0, 0, 0));
        PanelXoa.setPreferredSize(new java.awt.Dimension(65, 25));

        Xoa.setBackground(new java.awt.Color(0, 0, 0));
        Xoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Xoa.setForeground(new java.awt.Color(255, 255, 255));
        Xoa.setText("Xóa");
        Xoa.setOpaque(true);
        PanelXoa.add(Xoa);

        PanelTaiLai.setBackground(new java.awt.Color(0, 0, 0));
        PanelTaiLai.setMaximumSize(new java.awt.Dimension(34, 34));
        PanelTaiLai.setMinimumSize(new java.awt.Dimension(34, 34));
        PanelTaiLai.setPreferredSize(new java.awt.Dimension(34, 34));

        LabelTaiLai.setBackground(new java.awt.Color(0, 0, 0));
        LabelTaiLai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelTaiLai.setForeground(new java.awt.Color(255, 255, 255));
        LabelTaiLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/reload.png"))); // NOI18N
        LabelTaiLai.setOpaque(true);

        javax.swing.GroupLayout PanelTaiLaiLayout = new javax.swing.GroupLayout(PanelTaiLai);
        PanelTaiLai.setLayout(PanelTaiLaiLayout);
        PanelTaiLaiLayout.setHorizontalGroup(
            PanelTaiLaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTaiLaiLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(LabelTaiLai)
                .addContainerGap(5, Short.MAX_VALUE))
        );
        PanelTaiLaiLayout.setVerticalGroup(
            PanelTaiLaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTaiLaiLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(LabelTaiLai))
        );

        javax.swing.GroupLayout PanelInputLayout = new javax.swing.GroupLayout(PanelInput);
        PanelInput.setLayout(PanelInputLayout);
        PanelInputLayout.setHorizontalGroup(
            PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInputLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(PanelThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInputLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelInputLayout.createSequentialGroup()
                        .addComponent(PanelTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(PanelXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(PanelSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInputLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(PanelTaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)))
                .addGap(22, 22, 22))
        );
        PanelInputLayout.setVerticalGroup(
            PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInputLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PanelThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(PanelTaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        ScrollPane.setPreferredSize(new java.awt.Dimension(800, 440));

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Ca", "Tên Ca", "Giờ Vào Ca", "Giờ Ra Ca", "Trạng Thái"
            }
        ));
        ScrollPane.setViewportView(Table);

        LabelTenBang.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        LabelTenBang.setText("BẢNG CA");

        PanelTimKiem.setBackground(new java.awt.Color(0, 0, 0));
        PanelTimKiem.setPreferredSize(new java.awt.Dimension(65, 25));

        LabelTimKiem.setBackground(new java.awt.Color(0, 0, 0));
        LabelTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        LabelTimKiem.setText("Tìm Kiếm");
        LabelTimKiem.setOpaque(true);
        PanelTimKiem.add(LabelTimKiem);

        javax.swing.GroupLayout PanelTongLayout = new javax.swing.GroupLayout(PanelTong);
        PanelTong.setLayout(PanelTongLayout);
        PanelTongLayout.setHorizontalGroup(
            PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTongLayout.createSequentialGroup()
                .addGroup(PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTongLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(PanelLichLam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(PanelCaLam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelTongLayout.createSequentialGroup()
                        .addComponent(PanelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelTongLayout.createSequentialGroup()
                                .addGap(350, 350, 350)
                                .addComponent(LabelTenBang))
                            .addGroup(PanelTongLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(PanelTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelTongLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        PanelTongLayout.setVerticalGroup(
            PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTongLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelLichLam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelCaLam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTongLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PanelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelTongLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(LabelTenBang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PanelTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        PanelLichLam.setRoundBottomRight(40);
        PanelLichLam.setRoundTopLeft(40);

        PanelCaLam.setRoundBottomRight(40);
        PanelCaLam.setRoundTopLeft(40);

        PanelThongTin.setRoundBottomRight(20);
        PanelThongTin.setRoundTopLeft(20);
        PanelThongTin.setRoundTopRight(20);
        PanelThongTin.setRoundBottomLeft(20);

        PanelNoiDungThongTin.setRoundBottomRight(20);
        PanelNoiDungThongTin.setRoundTopLeft(20);
        PanelNoiDungThongTin.setRoundTopRight(20);
        PanelNoiDungThongTin.setRoundBottomLeft(20);

        PanelTao.setRoundBottomRight(20);
        PanelTao.setRoundTopLeft(20);
        PanelTao.setRoundTopRight(20);
        PanelTao.setRoundBottomLeft(20);

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
        
        PanelTimKiem.setRoundBottomRight(20);
        PanelTimKiem.setRoundTopLeft(20);
        PanelTimKiem.setRoundTopRight(20);
        PanelTimKiem.setRoundBottomLeft(20);

        PanelTaiLai.setRoundBottomRight(50);
        PanelTaiLai.setRoundTopLeft(50);
        PanelTaiLai.setRoundTopRight(50);
        PanelTaiLai.setRoundBottomLeft(50);

    }                     

    public void nhomNutChucNang() {
        PanelCaLam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelCaLam.setBackground(new Color(199, 159, 95));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelCaLam.setBackground(new Color(219, 189, 142));
            }
        });
        PanelLichLam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelLichLam.setBackground(new Color(199, 159, 95));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelLichLam.setBackground(new Color(219, 189, 142));
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelTong.removeAll();
                n6_LichLamGUI lich = new n6_LichLamGUI();
                PanelTong.setLayout(new BorderLayout());
                PanelTong.add(lich, BorderLayout.CENTER); // Adjust the layout constraint as needed
                PanelTong.revalidate();
                PanelTong.repaint();
            }
        });

        PanelTao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelTao.setBackground(new Color(106, 105, 105));
                Tao.setOpaque(true);
                Tao.setBackground(new Color(106, 105, 105));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelTao.setBackground(new Color(0, 0, 0));
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

        PanelTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelTimKiem.setBackground(new Color(106, 105, 105));
                LabelTimKiem.setOpaque(true);
                LabelTimKiem.setBackground(new Color(106, 105, 105));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelTimKiem.setBackground(new Color(0, 0, 0));
                LabelTimKiem.setOpaque(true);
                LabelTimKiem.setBackground(new Color(0, 0, 0));
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
    private Util.PanelRound PanelCaLam;
    private Util.PanelRound PanelLichLam;
    private Util.PanelRound PanelNoiDungThongTin;
    private Util.PanelRound PanelSua;
    private Util.PanelRound PanelTaiLai;
    private Util.PanelRound PanelTao;
    private Util.PanelRound PanelThongTin;
    private Util.PanelRound PanelXoa;
    private Util.PanelRound PanelTong;
    private Util.PanelRound PanelTimKiem;
    
    private javax.swing.JLabel CaLam;
    private javax.swing.JLabel LabelTaiLai;
    private javax.swing.JLabel LabelTenBang;
    private javax.swing.JLabel LabelTieuDe;
    private javax.swing.JLabel LabelTimKiem;
    private javax.swing.JLabel LichLam;
    private javax.swing.JLabel MaCa;
    private javax.swing.JPanel PanelCacText;
    private javax.swing.JPanel PanelInput;
    private javax.swing.JPanel PanelThuocTinh;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JLabel Sua;
    private javax.swing.JTable Table;
    private javax.swing.JLabel Tao;
    private javax.swing.JLabel TenCa;
    private javax.swing.JTextField TextMaCa;
    private javax.swing.JTextField TextTenCa;
    private javax.swing.JTextField TextThoiGianRa;
    private javax.swing.JTextField TextThoiGianVao;
    private javax.swing.JLabel ThoiGianRa;
    private javax.swing.JLabel ThoiGianVao;
    private javax.swing.JLabel TrangThai;
    private javax.swing.JLabel Xoa;
    private javax.swing.JComboBox<String> comboboxTrangThai;
    private javax.swing.JSeparator line1;
    private javax.swing.JSeparator line2;
    private javax.swing.JSeparator line3;
    private javax.swing.JSeparator line4;
}
