package GUI;

import BUS.BanHangBUS;
import DTO.KhachHangDTO;
import Util.TableCustom;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

public class n1_BanHang_ThanhToan_chonKhachHang extends javax.swing.JFrame {

    private n1_BanHang_ThanhToan thanhToanFrame;

    public n1_BanHang_ThanhToan_chonKhachHang(n1_BanHang_ThanhToan frame) {
        this.thanhToanFrame = frame;
        initComponents();
        setLocationRelativeTo(null);
        TableCustom.apply(ScrollPane, TableCustom.TableType.MULTI_LINE);
        nhomNutChucNang();
    }

    private void showData_KhachHang() {
        BanHangBUS.getInstance().showData_KhachHang(Table);
    }

    private void nhomNutChucNang() {
        showData_KhachHang();
        huyBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dispose();
            }
        });

        xacNhanBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int count = Table.getSelectedRow();
                TableModel model = Table.getModel();

                if (count == -1) {
                    JOptionPane.showMessageDialog(null, "Hãy chọn khách hàng trước khi xác nhận !");
                    return;
                }
                String maKhachHang = model.getValueAt(count, 0) + "";
//                System.out.println("Mã khách hàng: " + model.getValueAt(count, 0));
                thanhToanFrame.set_info_khachHang(maKhachHang);
                KhachHangDTO kh = BanHangBUS.getInstance().get_khachHang_theoMa(maKhachHang);
                thanhToanFrame.set_UuDaiThanhVien(kh.getChiTieuKhachHang());
//                System.out.println("Chi tiêu thật: " + kh.getChiTieuKhachHang());
                dispose();
            }
        });

        TimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    BanHangBUS.getInstance().showData_KhachHang_theoTen(Table, TimKiem.getText());
                }
            }
        });

        TaiLai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showData_KhachHang();
                TimKiem.setText("");
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelKhung = new javax.swing.JPanel();
        PanelNoiDung = new javax.swing.JPanel();
        PanelTool = new javax.swing.JPanel();
        PanelTimKiem = new javax.swing.JPanel();
        TimKiem = new javax.swing.JTextField();
        LabelAnhTimKiem = new javax.swing.JLabel();
        TaiLai = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        xacNhanBtn = new javax.swing.JButton();
        huyBtn = new javax.swing.JButton();
        ScrollPane = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();

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

        PanelTool.setBackground(new java.awt.Color(255, 255, 255));
        PanelTool.setMaximumSize(new java.awt.Dimension(50, 50));
        PanelTool.setMinimumSize(new java.awt.Dimension(50, 50));
        PanelTool.setPreferredSize(new java.awt.Dimension(50, 50));
        PanelTool.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 15, 5));

        PanelTimKiem.setBackground(new java.awt.Color(219, 189, 142));
        PanelTimKiem.setMaximumSize(new java.awt.Dimension(314, 32));
        PanelTimKiem.setMinimumSize(new java.awt.Dimension(314, 32));
        PanelTimKiem.setPreferredSize(new java.awt.Dimension(270, 32));

        TimKiem.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        LabelAnhTimKiem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelAnhTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/search.png"))); // NOI18N

        javax.swing.GroupLayout PanelTimKiemLayout = new javax.swing.GroupLayout(PanelTimKiem);
        PanelTimKiem.setLayout(PanelTimKiemLayout);
        PanelTimKiemLayout.setHorizontalGroup(
            PanelTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTimKiemLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(LabelAnhTimKiem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelTimKiemLayout.setVerticalGroup(
            PanelTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTimKiemLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(PanelTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelAnhTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TimKiem))
                .addGap(4, 4, 4))
        );

        PanelTool.add(PanelTimKiem);

        TaiLai.setBackground(new java.awt.Color(51, 51, 51));
        TaiLai.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        TaiLai.setForeground(new java.awt.Color(255, 255, 255));
        TaiLai.setText("Tải Lại");
        TaiLai.setMaximumSize(new java.awt.Dimension(90, 25));
        TaiLai.setMinimumSize(new java.awt.Dimension(90, 25));
        TaiLai.setPreferredSize(new java.awt.Dimension(90, 25));
        PanelTool.add(TaiLai);

        Title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Danh sách khách hàng");

        xacNhanBtn.setBackground(new java.awt.Color(51, 51, 51));
        xacNhanBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        xacNhanBtn.setForeground(new java.awt.Color(255, 255, 255));
        xacNhanBtn.setText("Xác Nhận");
        xacNhanBtn.setMaximumSize(new java.awt.Dimension(90, 25));
        xacNhanBtn.setMinimumSize(new java.awt.Dimension(90, 25));
        xacNhanBtn.setPreferredSize(new java.awt.Dimension(90, 25));

        huyBtn.setBackground(new java.awt.Color(255, 51, 51));
        huyBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        huyBtn.setForeground(new java.awt.Color(255, 255, 255));
        huyBtn.setText("Hủy");
        huyBtn.setMaximumSize(new java.awt.Dimension(90, 25));
        huyBtn.setMinimumSize(new java.awt.Dimension(90, 25));
        huyBtn.setPreferredSize(new java.awt.Dimension(90, 25));

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Tên", "Số điện thoại", "Ngày sinh"
            }
        ));
        ScrollPane.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(0).setPreferredWidth(30);
        }

        javax.swing.GroupLayout PanelNoiDungLayout = new javax.swing.GroupLayout(PanelNoiDung);
        PanelNoiDung.setLayout(PanelNoiDungLayout);
        PanelNoiDungLayout.setHorizontalGroup(
            PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelNoiDungLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelNoiDungLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(xacNhanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(huyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 133, Short.MAX_VALUE))
            .addGroup(PanelNoiDungLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                    .addComponent(PanelTool, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelNoiDungLayout.setVerticalGroup(
            PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNoiDungLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Title)
                .addGap(29, 29, 29)
                .addComponent(PanelTool, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xacNhanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(huyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        PanelKhung.add(PanelNoiDung);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelKhung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelKhung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelAnhTimKiem;
    private javax.swing.JPanel PanelKhung;
    private javax.swing.JPanel PanelNoiDung;
    private javax.swing.JPanel PanelTimKiem;
    private javax.swing.JPanel PanelTool;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JTable Table;
    private javax.swing.JButton TaiLai;
    private javax.swing.JTextField TimKiem;
    private javax.swing.JLabel Title;
    private javax.swing.JButton huyBtn;
    private javax.swing.JButton xacNhanBtn;
    // End of variables declaration//GEN-END:variables
}
