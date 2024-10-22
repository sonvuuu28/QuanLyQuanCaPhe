package GUI;

import Util.TableCustom;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class n6_LichLamGUI extends javax.swing.JPanel {

    public n6_LichLamGUI() {
        initComponents();
        nhomNutChucNang();
        TableCustom.apply(ScrollPane, TableCustom.TableType.MULTI_LINE);
        testData(Table);
    }
    
    private void testData(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addRow(new Object[]{"Trần Thị B", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "off"});
        model.addRow(new Object[]{"Trần Thị B", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "off"});
        model.addRow(new Object[]{"Trần Thị B", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "off"});
        model.addRow(new Object[]{"Trần Thị B", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "off"});
        model.addRow(new Object[]{"Trần Thị B", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "off"});
        model.addRow(new Object[]{"Trần Thị B", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "off"});
        model.addRow(new Object[]{"Trần Thị B", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "off"});
        model.addRow(new Object[]{"Trần Thị B", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "off"});
        model.addRow(new Object[]{"Trần Thị B", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "off"});
        model.addRow(new Object[]{"Trần Thị B", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "off"});
        model.addRow(new Object[]{"Trần Thị B", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "off"});
        model.addRow(new Object[]{"Trần Thị B", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "off"});
        model.addRow(new Object[]{"Trần Thị B", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "off"});
        model.addRow(new Object[]{"Trần Thị B", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "off"});
        model.addRow(new Object[]{"Trần Thị B", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "off"});
        model.addRow(new Object[]{"Trần Thị B", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "off"});
        model.addRow(new Object[]{"Trần Thị B", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "off"});
        model.addRow(new Object[]{"Trần Thị B", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "off"});
        model.addRow(new Object[]{"Trần Thị B", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "off"});
        model.addRow(new Object[]{"Trần Thị B", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "A (06:00 - 14:00)", "B (14:00 - 22:00)", "off"});
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTong = new javax.swing.JPanel();
        PanelLichLam = new javax.swing.JPanel();
        LichLam = new javax.swing.JLabel();
        PanelCaLam = new javax.swing.JPanel();
        CaLam = new javax.swing.JLabel();
        PanelInput = new javax.swing.JPanel();
        PanelSua = new javax.swing.JPanel();
        Sua = new javax.swing.JLabel();
        PanelTaiLai = new javax.swing.JPanel();
        LabelTaiLai = new javax.swing.JLabel();
        PanelTao = new javax.swing.JPanel();
        Tao = new javax.swing.JLabel();
        PanelXoa = new javax.swing.JPanel();
        Xoa = new javax.swing.JLabel();
        PanelThongTin = new javax.swing.JPanel();
        PanelNoiDungThongTin = new javax.swing.JPanel();
        LabelTieuDe = new javax.swing.JLabel();
        PanelThuocTinh = new javax.swing.JPanel();
        comboboxCaLam = new javax.swing.JComboBox<>();
        LabelNhanVien = new javax.swing.JLabel();
        comboboxNhanVien = new javax.swing.JComboBox<>();
        LabelNgayLam = new javax.swing.JLabel();
        LabelCaLam = new javax.swing.JLabel();
        TextNgay = new javax.swing.JTextField();
        line1 = new javax.swing.JSeparator();
        ScrollPane = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        PanelThoiGian = new javax.swing.JPanel();
        LabelNgay = new javax.swing.JLabel();
        PanelTimKiem = new javax.swing.JPanel();
        LabelTimKiem = new javax.swing.JLabel();
        LabelTenBang = new javax.swing.JLabel();
        PanelTimKiem1 = new javax.swing.JPanel();
        TextFieldTimKiem = new javax.swing.JTextField();
        LabelAnhTimKiem = new javax.swing.JLabel();

        setBackground(new java.awt.Color(122, 74, 74));
        setMaximumSize(new java.awt.Dimension(1125, 667));
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

        PanelSua.setBackground(new java.awt.Color(0, 0, 0));
        PanelSua.setPreferredSize(new java.awt.Dimension(65, 25));

        Sua.setBackground(new java.awt.Color(0, 0, 0));
        Sua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Sua.setForeground(new java.awt.Color(255, 255, 255));
        Sua.setText("Sửa");
        Sua.setOpaque(true);
        PanelSua.add(Sua);

        PanelTaiLai.setBackground(new java.awt.Color(0, 0, 0));
        PanelTaiLai.setMaximumSize(new java.awt.Dimension(34, 34));
        PanelTaiLai.setPreferredSize(new java.awt.Dimension(34, 34));

        LabelTaiLai.setBackground(new java.awt.Color(0, 0, 0));
        LabelTaiLai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelTaiLai.setForeground(new java.awt.Color(255, 255, 255));
        LabelTaiLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/reload.png"))); // NOI18N
        LabelTaiLai.setOpaque(true);
        PanelTaiLai.add(LabelTaiLai);

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

        PanelThongTin.setBackground(new java.awt.Color(219, 189, 142));
        PanelThongTin.setPreferredSize(new java.awt.Dimension(237, 277));

        PanelNoiDungThongTin.setBackground(new java.awt.Color(255, 255, 255));
        PanelNoiDungThongTin.setMinimumSize(new java.awt.Dimension(255, 266));
        PanelNoiDungThongTin.setPreferredSize(new java.awt.Dimension(225, 266));

        LabelTieuDe.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LabelTieuDe.setText("Thông Tin Lịch Làm");

        PanelThuocTinh.setBackground(new java.awt.Color(255, 255, 255));

        comboboxCaLam.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        comboboxCaLam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "B1", "A2" }));
        comboboxCaLam.setBorder(null);
        comboboxCaLam.setPreferredSize(new java.awt.Dimension(93, 25));

        LabelNhanVien.setBackground(new java.awt.Color(255, 255, 255));
        LabelNhanVien.setText("Nhân Viên");

        comboboxNhanVien.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        comboboxNhanVien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nguyễn Văn A", "Trần Thị B" }));
        comboboxNhanVien.setBorder(null);
        comboboxNhanVien.setPreferredSize(new java.awt.Dimension(93, 25));

        LabelNgayLam.setBackground(new java.awt.Color(255, 255, 255));
        LabelNgayLam.setText("Ngày");

        LabelCaLam.setBackground(new java.awt.Color(255, 255, 255));
        LabelCaLam.setText("Ca Làm");

        TextNgay.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        TextNgay.setText("10/10/2024");
        TextNgay.setBorder(null);

        line1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout PanelThuocTinhLayout = new javax.swing.GroupLayout(PanelThuocTinh);
        PanelThuocTinh.setLayout(PanelThuocTinhLayout);
        PanelThuocTinhLayout.setHorizontalGroup(
            PanelThuocTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelThuocTinhLayout.createSequentialGroup()
                .addComponent(LabelNgayLam, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelThuocTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelThuocTinhLayout.createSequentialGroup()
                        .addComponent(line1)
                        .addContainerGap())
                    .addGroup(PanelThuocTinhLayout.createSequentialGroup()
                        .addComponent(TextNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(PanelThuocTinhLayout.createSequentialGroup()
                .addGroup(PanelThuocTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelThuocTinhLayout.createSequentialGroup()
                        .addComponent(LabelNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboboxNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelThuocTinhLayout.createSequentialGroup()
                        .addComponent(LabelCaLam, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboboxCaLam, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelThuocTinhLayout.setVerticalGroup(
            PanelThuocTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelThuocTinhLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(PanelThuocTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCaLam)
                    .addComponent(comboboxCaLam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(PanelThuocTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNhanVien)
                    .addComponent(comboboxNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(PanelThuocTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNgayLam)
                    .addComponent(TextNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(line1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout PanelNoiDungThongTinLayout = new javax.swing.GroupLayout(PanelNoiDungThongTin);
        PanelNoiDungThongTin.setLayout(PanelNoiDungThongTinLayout);
        PanelNoiDungThongTinLayout.setHorizontalGroup(
            PanelNoiDungThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNoiDungThongTinLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(LabelTieuDe)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelNoiDungThongTinLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(PanelThuocTinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(91, 91, 91))
        );
        PanelNoiDungThongTinLayout.setVerticalGroup(
            PanelNoiDungThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNoiDungThongTinLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(LabelTieuDe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(PanelThuocTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        PanelThongTin.add(PanelNoiDungThongTin);

        javax.swing.GroupLayout PanelInputLayout = new javax.swing.GroupLayout(PanelInput);
        PanelInput.setLayout(PanelInputLayout);
        PanelInputLayout.setHorizontalGroup(
            PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInputLayout.createSequentialGroup()
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelInputLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(PanelThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInputLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(PanelTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(PanelXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(PanelSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInputLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PanelTaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
        PanelInputLayout.setVerticalGroup(
            PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInputLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(PanelTaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        ScrollPane.setPreferredSize(new java.awt.Dimension(800, 440));

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nhân Viên", "Thứ 2", "Thứ 3", "Thứ 4", "Thứ 5", "Thứ 6", "Chủ Nhật"
            }
        ));
        Table.setRowHeight(50);
        ScrollPane.setViewportView(Table);

        PanelThoiGian.setBackground(new java.awt.Color(239, 219, 203));
        PanelThoiGian.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        LabelNgay.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        LabelNgay.setText("10/10/2024 - 17/10/2024");

        javax.swing.GroupLayout PanelThoiGianLayout = new javax.swing.GroupLayout(PanelThoiGian);
        PanelThoiGian.setLayout(PanelThoiGianLayout);
        PanelThoiGianLayout.setHorizontalGroup(
            PanelThoiGianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelThoiGianLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(LabelNgay)
                .addGap(57, 57, 57))
        );
        PanelThoiGianLayout.setVerticalGroup(
            PanelThoiGianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelThoiGianLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelNgay)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelTimKiem.setBackground(new java.awt.Color(0, 0, 0));
        PanelTimKiem.setPreferredSize(new java.awt.Dimension(65, 25));

        LabelTimKiem.setBackground(new java.awt.Color(0, 0, 0));
        LabelTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        LabelTimKiem.setText("Tìm Kiếm");
        LabelTimKiem.setOpaque(true);
        PanelTimKiem.add(LabelTimKiem);

        LabelTenBang.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        LabelTenBang.setText("LỊCH LÀM");

        PanelTimKiem1.setBackground(new java.awt.Color(219, 189, 142));
        PanelTimKiem1.setMaximumSize(new java.awt.Dimension(314, 32));
        PanelTimKiem1.setMinimumSize(new java.awt.Dimension(314, 32));

        TextFieldTimKiem.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        LabelAnhTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/search.png"))); // NOI18N

        javax.swing.GroupLayout PanelTimKiem1Layout = new javax.swing.GroupLayout(PanelTimKiem1);
        PanelTimKiem1.setLayout(PanelTimKiem1Layout);
        PanelTimKiem1Layout.setHorizontalGroup(
            PanelTimKiem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTimKiem1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(TextFieldTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LabelAnhTimKiem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelTimKiem1Layout.setVerticalGroup(
            PanelTimKiem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTimKiem1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(PanelTimKiem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelAnhTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextFieldTimKiem))
                .addGap(4, 4, 4))
        );

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PanelTongLayout.createSequentialGroup()
                                .addComponent(PanelTimKiem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(PanelTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PanelThoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTongLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LabelTenBang)
                .addGap(396, 396, 396))
        );
        PanelTongLayout.setVerticalGroup(
            PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTongLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelLichLam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelCaLam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(LabelTenBang)
                .addGroup(PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTongLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PanelThoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTongLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTongLayout.createSequentialGroup()
                                .addComponent(PanelTimKiem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTongLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PanelTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTongLayout.createSequentialGroup()
                        .addComponent(PanelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTongLayout.createSequentialGroup()
                        .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
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
        PanelCaLam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelCaLam.setBackground(new Color(199, 159, 95));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelCaLam.setBackground(new Color(219, 189, 142));
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelTong.removeAll();
                n6_CaLamGUI ca = new n6_CaLamGUI();
                PanelTong.setLayout(new BorderLayout());
                PanelTong.add(ca, BorderLayout.CENTER); // Adjust the layout constraint as needed
                PanelTong.revalidate();
                PanelTong.repaint();
            }
        });
        PanelLichLam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelLichLam.setBackground(new Color(199, 159, 95));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelLichLam.setBackground(new Color(219, 189, 142));
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
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CaLam;
    private javax.swing.JLabel LabelAnhTimKiem;
    private javax.swing.JLabel LabelCaLam;
    private javax.swing.JLabel LabelNgay;
    private javax.swing.JLabel LabelNgayLam;
    private javax.swing.JLabel LabelNhanVien;
    private javax.swing.JLabel LabelTaiLai;
    private javax.swing.JLabel LabelTenBang;
    private javax.swing.JLabel LabelTieuDe;
    private javax.swing.JLabel LabelTimKiem;
    private javax.swing.JLabel LichLam;
    private javax.swing.JPanel PanelCaLam;
    private javax.swing.JPanel PanelInput;
    private javax.swing.JPanel PanelLichLam;
    private javax.swing.JPanel PanelNoiDungThongTin;
    private javax.swing.JPanel PanelSua;
    private javax.swing.JPanel PanelTaiLai;
    private javax.swing.JPanel PanelTao;
    private javax.swing.JPanel PanelThoiGian;
    private javax.swing.JPanel PanelThongTin;
    private javax.swing.JPanel PanelThuocTinh;
    private javax.swing.JPanel PanelTimKiem;
    private javax.swing.JPanel PanelTimKiem1;
    private javax.swing.JPanel PanelTong;
    private javax.swing.JPanel PanelXoa;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JLabel Sua;
    private javax.swing.JTable Table;
    private javax.swing.JLabel Tao;
    private javax.swing.JTextField TextFieldTimKiem;
    private javax.swing.JTextField TextNgay;
    private javax.swing.JLabel Xoa;
    private javax.swing.JComboBox<String> comboboxCaLam;
    private javax.swing.JComboBox<String> comboboxNhanVien;
    private javax.swing.JSeparator line1;
    // End of variables declaration//GEN-END:variables
}
