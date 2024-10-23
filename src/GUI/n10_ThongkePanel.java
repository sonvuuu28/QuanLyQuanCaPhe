package GUI;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import org.knowm.xchart.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author phanloc
 */
public class n10_ThongkePanel extends javax.swing.JPanel {

    /**
     * 
     */
    CardLayout cardLayout = new CardLayout();
    CardLayout cardLayout1 = new CardLayout();
    CardLayout cardLayout2 = new CardLayout();
    CardLayout cardLayout3 = new CardLayout();
    CardLayout cardLayout4 = new CardLayout();
    public n10_ThongkePanel() {
        initComponents();
        initUI();
        addControl();
    }
    private void initUI() {
        ////////////////////////////////biểu đồ đường mặc định
                List<Integer> xData = Arrays.asList(6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23);
                List<Double> yData = Arrays.asList(1.0, 4.0, 3.0, 5.0, 4.0, 3.0, 5.0, 4.0, 3.0, 5.0, 5.0, 4.0, 3.0, 1.0, 4.0, 3.0, 5.0, 4.0);
        
                // Tạo biểu đồ
                XYChart chartDefault = n10_ChartCreator.createLineChart(xData, yData, "doanh thu ngày", "giờ", "Doanh thu (trăm)");
                XChartPanel<XYChart> chartPanel = new XChartPanel<>(chartDefault);
                content_Panel.setLayout(new BorderLayout());
                content_Panel.add(chartPanel, BorderLayout.CENTER);
        ////////////////////////////////biểu đồ đường doanh thu
                List<Integer> xdataDthu = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
                List<Double> ydataDthu = Arrays.asList(1.0, 3.0, 2.0, 6.0, 2.0, 3.0, 4.0, 8.0, 10.0, 2.5, 4.5, 3.0);
                XYChart ChartDthu = n10_ChartCreator.createLineChart(xdataDthu, ydataDthu, "Biểu đồ doanh thu năm", "tháng", "doanh thu (Triệu)");
        
                XChartPanel<XYChart> ChartPanelDthu = new XChartPanel<XYChart>(ChartDthu);
                
                Main_DtPn1.setLayout(new BorderLayout());
                Main_DtPn1.add(ChartPanelDthu);
        //////////////////////////////////////biểu đồ cột chi phí
                List<String> xdataCphi = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12");
                List<Double> yDataCphi = Arrays.asList(1.0, 4.0, 3.0, 1.0, 4.0, 3.0, 5.0, 3.0, 5.0, 1.0, 4.0, 5.0);
                List<Double> yDataCphi2 = Arrays.asList(2.0, 3.0, 2.5, 6.0, 1.0, 4.0, 3.0, 5.0, 2.0, 3.0, 2.5, 6.0);
                CategoryChart ChartChiphi = n10_ChartCreator.createBarChart(xdataCphi, yDataCphi, yDataCphi2, "Biểu đồ chi phí", "Tháng", "Chi phí (Triệu)", "lương nhân viên", "nhập hàng");
                XChartPanel<CategoryChart> ChartChiphipanel = new XChartPanel<CategoryChart>(ChartChiphi);
                ContentCphi1.setLayout(new BorderLayout());
                ContentCphi1.add(ChartChiphipanel, BorderLayout.CENTER);
                //////////////////////////////////////biểu đồ cột chi phí
                List<String> xdataLoinhuan = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12");
                List<Double> yDataLoinhuan = Arrays.asList(1.0, 4.0, 3.0, 1.0, 4.0, 3.0, 5.0, 3.0, 5.0, 1.0, 4.0, 5.0);
                List<Double> yDataLoinhuan1 = Arrays.asList(2.0, 3.0, 2.5, 6.0, 1.0, 4.0, 3.0, 5.0, 2.0, 3.0, 2.5, 6.0);
                CategoryChart ChartLoinhuan = n10_ChartCreator.createBarChart(xdataCphi, yDataLoinhuan, yDataLoinhuan1, "Biểu đồ chi phí", "Tháng", "Chi phí (Triệu)", "lương nhân viên", "nhập hàng");
                XChartPanel<CategoryChart> ChartLoinhuanpanel = new XChartPanel<CategoryChart>(ChartLoinhuan);
                
                contentTKLnhuan1.setLayout(new BorderLayout());
                contentTKLnhuan1.add(ChartLoinhuanpanel, BorderLayout.CENTER);
                //////////////////////////////////////biểu đồ cột chi phí
                List<String> xdataCLuong = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12");
                List<Double> yDataCLuong = Arrays.asList(1.0, 4.0, 3.0, 1.0, 4.0, 3.0, 5.0, 3.0, 5.0, 1.0, 4.0, 5.0);
                List<Double> yDataCLuong1 = Arrays.asList(2.0, 3.0, 2.5, 6.0, 1.0, 4.0, 3.0, 5.0, 2.0, 3.0, 2.5, 6.0);
                CategoryChart ChartLuong = n10_ChartCreator.createBarChart(xdataCLuong, yDataCLuong, yDataCLuong1, "Biểu đồ lương", "Tháng", "Chi phí (Triệu)", "lương nhân viên", "nhập hàng");
                XChartPanel<CategoryChart> ChartLuongPn = new XChartPanel<CategoryChart>(ChartLuong);
                ContentLuong1.setLayout(new BorderLayout());
                ContentLuong1.add(ChartLuongPn, BorderLayout.CENTER);
                //////biểu đồ bánh
                PieChart chart = new PieChartBuilder()
                        .width(800)
                        .height(500)
                        .title("kho hàng")
                        .build();
                
                // Thiết lập màu nền cho biểu đồ (tuỳ chọn)
                
                
                // Thêm dữ liệu vào biểu đồ Pie
                chart.addSeries("cafe ", 40);
                chart.addSeries("bánh", 30);
                chart.addSeries("kẹo", 20);
                chart.addSeries("đường", 10);
                
                // Tạo XChartPanel để hiển thị biểu đồ
                XChartPanel<PieChart> ChartpnKho = new XChartPanel<>(chart);
                ContentKhohang1.setLayout(new BorderLayout());
                ContentKhohang1.add(ChartpnKho,BorderLayout.CENTER);
            }
        
            private void addControl() {
                ThongkePanel.setUI(new javax.swing.plaf.basic.BasicTabbedPaneUI() {
                    @Override
                    protected int calculateTabHeight(int tabPlacement, int tabIndex, int fontHeight) {
                        return 0;
                    }
        
                    @Override
                    protected int calculateTabWidth(int tabPlacement, int tabIndex, FontMetrics metrics) {
                        return 0;
                    }
        
                    @Override
                    protected void paintTabArea(Graphics g, int tabPlacement, int selectedIndex) {
                    }
                });
            }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        HeaderTk = new javax.swing.JPanel();
        BtnExport = new javax.swing.JButton();
        Combobox_TK = new javax.swing.JComboBox<>();
        ThongkePanel = new javax.swing.JTabbedPane();
        DefaultTK = new javax.swing.JScrollPane();
        Panel_default = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        DtNgayPn = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        SLdonhangPn = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        SLspBanPn = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        KhMoiPn = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        TongDtPn = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        content_Panel = new javax.swing.JPanel();
        TK_doanhthu = new javax.swing.JScrollPane();
        PnDthu = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        DetailDtPn = new javax.swing.JPanel();
        TongDThu = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        DthuTrungBinh = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        DTthang = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Main_DtPn = new javax.swing.JPanel();
        Main_DtPn1 = new javax.swing.JPanel();
        Main_DtPn2 = new javax.swing.JPanel();
        selectPn = new javax.swing.JPanel();
        CbboxDthu = new javax.swing.JComboBox<>();
        TK_chiphi = new javax.swing.JScrollPane();
        jPanel18 = new javax.swing.JPanel();
        jPanel65 = new javax.swing.JPanel();
        DetailChiphi = new javax.swing.JPanel();
        jPanel67 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel68 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel69 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        ContentCphi = new javax.swing.JPanel();
        ContentCphi1 = new javax.swing.JPanel();
        ContentCphi2 = new javax.swing.JPanel();
        selectPnCphi = new javax.swing.JPanel();
        CbboxChiphi = new javax.swing.JComboBox<>();
        TK_loinhuan = new javax.swing.JScrollPane();
        jPanel72 = new javax.swing.JPanel();
        jPanel73 = new javax.swing.JPanel();
        detailLoinhuan = new javax.swing.JPanel();
        jPanel75 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jPanel76 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jPanel77 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        contentTKLnhuan = new javax.swing.JPanel();
        contentTKLnhuan1 = new javax.swing.JPanel();
        contentTKLnhuan2 = new javax.swing.JPanel();
        selectPnLoinhuan = new javax.swing.JPanel();
        CbboxLoinhuan = new javax.swing.JComboBox<>();
        TK_luong = new javax.swing.JScrollPane();
        jPanel80 = new javax.swing.JPanel();
        jPanel81 = new javax.swing.JPanel();
        detailLuong = new javax.swing.JPanel();
        jPanel83 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jPanel84 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jPanel85 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        ContentLuong = new javax.swing.JPanel();
        ContentLuong1 = new javax.swing.JPanel();
        ContentLuong2 = new javax.swing.JPanel();
        selectPnLuong = new javax.swing.JPanel();
        CbboxLuong = new javax.swing.JComboBox<>();
        TK_khohang = new javax.swing.JScrollPane();
        jPanel88 = new javax.swing.JPanel();
        jPanel89 = new javax.swing.JPanel();
        detailKhohang = new javax.swing.JPanel();
        jPanel91 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jPanel92 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jPanel93 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        ContentKhohang = new javax.swing.JPanel();
        ContentKhohang1 = new javax.swing.JPanel();
        ContentKhohang3 = new javax.swing.JPanel();
        selectKhohang = new javax.swing.JPanel();
        CbboxKhohang = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(122, 74, 74));
        setMaximumSize(new java.awt.Dimension(1125, 667));
        setPreferredSize(new java.awt.Dimension(1120, 667));

        jPanel1.setPreferredSize(new java.awt.Dimension(1125, 658));

        HeaderTk.setBackground(new java.awt.Color(255, 255, 255));
        HeaderTk.setPreferredSize(new java.awt.Dimension(1120, 93));

        BtnExport.setBackground(new java.awt.Color(217, 217, 217));
        BtnExport.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnExport.setText("jButton1");
        BtnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExportActionPerformed(evt);
            }
        });

        Combobox_TK.setBackground(new java.awt.Color(219, 189, 142));
        Combobox_TK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Mặc định", "Doanh Thu", "Chi phí", "Lợi nhuận","Lương","Kho hàng" }));
        Combobox_TK.setToolTipText("");
        Combobox_TK.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Combobox_TK.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Combobox_TK.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Combobox_TK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combobox_TKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HeaderTkLayout = new javax.swing.GroupLayout(HeaderTk);
        HeaderTk.setLayout(HeaderTkLayout);
        HeaderTkLayout.setHorizontalGroup(
            HeaderTkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderTkLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Combobox_TK, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 726, Short.MAX_VALUE)
                .addComponent(BtnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        HeaderTkLayout.setVerticalGroup(
            HeaderTkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderTkLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(HeaderTkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnExport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Combobox_TK, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        ThongkePanel.setBackground(new java.awt.Color(255, 255, 255));
        ThongkePanel.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        ThongkePanel.setTabPlacement(1);
        ThongkePanel.setPreferredSize(new java.awt.Dimension(1120, 500));

        DefaultTK.setBackground(new java.awt.Color(219, 189, 142));
        DefaultTK.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        DefaultTK.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        DefaultTK.setPreferredSize(new java.awt.Dimension(1120, 450));

        Panel_default.setBackground(new java.awt.Color(204, 0, 51));
        Panel_default.setEnabled(false);
        Panel_default.setMaximumSize(new java.awt.Dimension(590, 600));
        Panel_default.setPreferredSize(new java.awt.Dimension(1000, 1000));
        Panel_default.setLayout(new javax.swing.BoxLayout(Panel_default, javax.swing.BoxLayout.Y_AXIS));

        jPanel5.setBackground(new java.awt.Color(219, 189, 142));
        jPanel5.setPreferredSize(new java.awt.Dimension(1090, 500));

        headerPanel.setBackground(new java.awt.Color(219, 189, 142));
        headerPanel.setEnabled(false);
        headerPanel.setMaximumSize(new java.awt.Dimension(590, 600));
        headerPanel.setMinimumSize(new java.awt.Dimension(300, 218));
        headerPanel.setPreferredSize(new java.awt.Dimension(1090, 218));
        headerPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 60, 20));

        DtNgayPn.setBackground(new java.awt.Color(217, 217, 217));
        DtNgayPn.setPreferredSize(new java.awt.Dimension(200, 100));

        jTextField2.setBackground(new java.awt.Color(217, 217, 217));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField2.setText("100000");
        jTextField2.setBorder(null);

        jLabel1.setBackground(new java.awt.Color(168, 154, 143));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Doanh thu ngày");
        jLabel1.setToolTipText("");
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(200, 16));

        javax.swing.GroupLayout DtNgayPnLayout = new javax.swing.GroupLayout(DtNgayPn);
        DtNgayPn.setLayout(DtNgayPnLayout);
        DtNgayPnLayout.setHorizontalGroup(
            DtNgayPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DtNgayPnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DtNgayPnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        DtNgayPnLayout.setVerticalGroup(
            DtNgayPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DtNgayPnLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        headerPanel.add(DtNgayPn);

        SLdonhangPn.setBackground(new java.awt.Color(217, 217, 217));
        SLdonhangPn.setPreferredSize(new java.awt.Dimension(200, 100));

        jLabel2.setBackground(new java.awt.Color(168, 154, 143));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Đơn hàng");
        jLabel2.setOpaque(true);
        jLabel2.setPreferredSize(new java.awt.Dimension(200, 16));

        jTextField1.setBackground(new java.awt.Color(217, 217, 217));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField1.setText("100000");
        jTextField1.setBorder(null);

        javax.swing.GroupLayout SLdonhangPnLayout = new javax.swing.GroupLayout(SLdonhangPn);
        SLdonhangPn.setLayout(SLdonhangPnLayout);
        SLdonhangPnLayout.setHorizontalGroup(
            SLdonhangPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SLdonhangPnLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(SLdonhangPnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SLdonhangPnLayout.setVerticalGroup(
            SLdonhangPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SLdonhangPnLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        headerPanel.add(SLdonhangPn);

        SLspBanPn.setBackground(new java.awt.Color(217, 217, 217));
        SLspBanPn.setPreferredSize(new java.awt.Dimension(200, 100));

        jLabel3.setBackground(new java.awt.Color(168, 154, 143));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sản phẩm bán ra");
        jLabel3.setOpaque(true);
        jLabel3.setPreferredSize(new java.awt.Dimension(200, 16));

        jTextField3.setBackground(new java.awt.Color(217, 217, 217));
        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField3.setText("100000");
        jTextField3.setBorder(null);

        javax.swing.GroupLayout SLspBanPnLayout = new javax.swing.GroupLayout(SLspBanPn);
        SLspBanPn.setLayout(SLspBanPnLayout);
        SLspBanPnLayout.setHorizontalGroup(
            SLspBanPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SLspBanPnLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(SLspBanPnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SLspBanPnLayout.setVerticalGroup(
            SLspBanPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SLspBanPnLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        headerPanel.add(SLspBanPn);

        KhMoiPn.setBackground(new java.awt.Color(217, 217, 217));
        KhMoiPn.setPreferredSize(new java.awt.Dimension(200, 100));

        jLabel5.setBackground(new java.awt.Color(168, 154, 143));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Khách hàng mới");
        jLabel5.setOpaque(true);
        jLabel5.setPreferredSize(new java.awt.Dimension(200, 16));

        jTextField4.setBackground(new java.awt.Color(217, 217, 217));
        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField4.setText("100000");
        jTextField4.setBorder(null);

        javax.swing.GroupLayout KhMoiPnLayout = new javax.swing.GroupLayout(KhMoiPn);
        KhMoiPn.setLayout(KhMoiPnLayout);
        KhMoiPnLayout.setHorizontalGroup(
            KhMoiPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KhMoiPnLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(KhMoiPnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        KhMoiPnLayout.setVerticalGroup(
            KhMoiPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KhMoiPnLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        headerPanel.add(KhMoiPn);

        TongDtPn.setBackground(new java.awt.Color(217, 217, 217));
        TongDtPn.setPreferredSize(new java.awt.Dimension(200, 100));

        jLabel4.setBackground(new java.awt.Color(168, 154, 143));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tổng doanh thu");
        jLabel4.setOpaque(true);
        jLabel4.setPreferredSize(new java.awt.Dimension(200, 16));

        jTextField5.setBackground(new java.awt.Color(217, 217, 217));
        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField5.setText("100000");
        jTextField5.setBorder(null);

        javax.swing.GroupLayout TongDtPnLayout = new javax.swing.GroupLayout(TongDtPn);
        TongDtPn.setLayout(TongDtPnLayout);
        TongDtPnLayout.setHorizontalGroup(
            TongDtPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TongDtPnLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(TongDtPnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TongDtPnLayout.setVerticalGroup(
            TongDtPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TongDtPnLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        headerPanel.add(TongDtPn);

        content_Panel.setBackground(new java.awt.Color(255, 255, 255));
        content_Panel.setToolTipText("");
        content_Panel.setMaximumSize(new java.awt.Dimension(1090, 1000));
        content_Panel.setPreferredSize(new java.awt.Dimension(1090, 450));

        javax.swing.GroupLayout content_PanelLayout = new javax.swing.GroupLayout(content_Panel);
        content_Panel.setLayout(content_PanelLayout);
        content_PanelLayout.setHorizontalGroup(
            content_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
        );
        content_PanelLayout.setVerticalGroup(
            content_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 702, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(content_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
                .addContainerGap())
        );

        Panel_default.add(jPanel5);

        DefaultTK.setViewportView(Panel_default);

        ThongkePanel.addTab("", DefaultTK);

        TK_doanhthu.setBackground(new java.awt.Color(219, 189, 142));
        TK_doanhthu.setPreferredSize(new java.awt.Dimension(1120, 450));

        PnDthu.setBackground(new java.awt.Color(204, 0, 51));
        PnDthu.setEnabled(false);
        PnDthu.setMaximumSize(new java.awt.Dimension(1000, 600));
        PnDthu.setPreferredSize(new java.awt.Dimension(1000, 1000));
        PnDthu.setLayout(new javax.swing.BoxLayout(PnDthu, javax.swing.BoxLayout.Y_AXIS));

        jPanel12.setBackground(new java.awt.Color(219, 189, 142));
        jPanel12.setMaximumSize(new java.awt.Dimension(1120, 32767));
        jPanel12.setPreferredSize(new java.awt.Dimension(1120, 667));

        DetailDtPn.setBackground(new java.awt.Color(219, 189, 142));
        DetailDtPn.setEnabled(false);
        DetailDtPn.setMaximumSize(new java.awt.Dimension(590, 600));
        DetailDtPn.setMinimumSize(new java.awt.Dimension(300, 218));
        DetailDtPn.setPreferredSize(new java.awt.Dimension(1125, 218));
        DetailDtPn.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 50, 5));

        TongDThu.setPreferredSize(new java.awt.Dimension(200, 100));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("jLabel1");
        jLabel6.setPreferredSize(new java.awt.Dimension(200, 16));

        javax.swing.GroupLayout TongDThuLayout = new javax.swing.GroupLayout(TongDThu);
        TongDThu.setLayout(TongDThuLayout);
        TongDThuLayout.setHorizontalGroup(
            TongDThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TongDThuLayout.setVerticalGroup(
            TongDThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TongDThuLayout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        DetailDtPn.add(TongDThu);

        DthuTrungBinh.setPreferredSize(new java.awt.Dimension(200, 100));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("jLabel2");
        jLabel7.setPreferredSize(new java.awt.Dimension(200, 16));

        javax.swing.GroupLayout DthuTrungBinhLayout = new javax.swing.GroupLayout(DthuTrungBinh);
        DthuTrungBinh.setLayout(DthuTrungBinhLayout);
        DthuTrungBinhLayout.setHorizontalGroup(
            DthuTrungBinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DthuTrungBinhLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        DthuTrungBinhLayout.setVerticalGroup(
            DthuTrungBinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DthuTrungBinhLayout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        DetailDtPn.add(DthuTrungBinh);

        DTthang.setPreferredSize(new java.awt.Dimension(200, 100));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("jLabel3");
        jLabel8.setPreferredSize(new java.awt.Dimension(200, 16));

        javax.swing.GroupLayout DTthangLayout = new javax.swing.GroupLayout(DTthang);
        DTthang.setLayout(DTthangLayout);
        DTthangLayout.setHorizontalGroup(
            DTthangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DTthangLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        DTthangLayout.setVerticalGroup(
            DTthangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DTthangLayout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        DetailDtPn.add(DTthang);

        Main_DtPn.setBackground(new java.awt.Color(219, 189, 142));
        Main_DtPn.setToolTipText("");
        Main_DtPn.setMaximumSize(new java.awt.Dimension(1090, 1000));
        Main_DtPn.setPreferredSize(new java.awt.Dimension(1090, 450));
        Main_DtPn.setLayout(cardLayout);

        Main_DtPn1.setBackground(new java.awt.Color(29, 189, 142));
        Main_DtPn1.setToolTipText("");
        Main_DtPn1.setMaximumSize(new java.awt.Dimension(1090, 1000));
        Main_DtPn1.setPreferredSize(new java.awt.Dimension(1090, 702));

        javax.swing.GroupLayout Main_DtPn1Layout = new javax.swing.GroupLayout(Main_DtPn1);
        Main_DtPn1.setLayout(Main_DtPn1Layout);
        Main_DtPn1Layout.setHorizontalGroup(
            Main_DtPn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
        );
        Main_DtPn1Layout.setVerticalGroup(
            Main_DtPn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 862, Short.MAX_VALUE)
        );

        Main_DtPn.add(Main_DtPn1, "Tháng");

        Main_DtPn2.setBackground(new java.awt.Color(219, 139, 142));
        Main_DtPn2.setToolTipText("");
        Main_DtPn2.setMaximumSize(new java.awt.Dimension(1090, 1000));
        Main_DtPn2.setPreferredSize(new java.awt.Dimension(1090, 702));

        javax.swing.GroupLayout Main_DtPn2Layout = new javax.swing.GroupLayout(Main_DtPn2);
        Main_DtPn2.setLayout(Main_DtPn2Layout);
        Main_DtPn2Layout.setHorizontalGroup(
            Main_DtPn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
        );
        Main_DtPn2Layout.setVerticalGroup(
            Main_DtPn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 862, Short.MAX_VALUE)
        );

        Main_DtPn.add(Main_DtPn2, "Quý");

        selectPn.setBackground(new java.awt.Color(219, 189, 142));

        CbboxDthu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tháng", "Quý" }));
        CbboxDthu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbboxDthuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout selectPnLayout = new javax.swing.GroupLayout(selectPn);
        selectPn.setLayout(selectPnLayout);
        selectPnLayout.setHorizontalGroup(
            selectPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectPnLayout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addComponent(CbboxDthu, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        selectPnLayout.setVerticalGroup(
            selectPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectPnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CbboxDthu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Main_DtPn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(DetailDtPn, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(selectPn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DetailDtPn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectPn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Main_DtPn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        PnDthu.add(jPanel12);

        TK_doanhthu.setViewportView(PnDthu);

        ThongkePanel.addTab("", TK_doanhthu);

        TK_chiphi.setBackground(new java.awt.Color(219, 189, 142));
        TK_chiphi.setPreferredSize(new java.awt.Dimension(1120, 450));

        jPanel18.setBackground(new java.awt.Color(204, 0, 51));
        jPanel18.setEnabled(false);
        jPanel18.setMaximumSize(new java.awt.Dimension(1000, 600));
        jPanel18.setPreferredSize(new java.awt.Dimension(1000, 1000));
        jPanel18.setLayout(new javax.swing.BoxLayout(jPanel18, javax.swing.BoxLayout.Y_AXIS));

        jPanel65.setBackground(new java.awt.Color(219, 189, 142));
        jPanel65.setMaximumSize(new java.awt.Dimension(1122, 32767));
        jPanel65.setPreferredSize(new java.awt.Dimension(1120, 1000));

        DetailChiphi.setBackground(new java.awt.Color(219, 189, 142));
        DetailChiphi.setEnabled(false);
        DetailChiphi.setMaximumSize(new java.awt.Dimension(590, 600));
        DetailChiphi.setMinimumSize(new java.awt.Dimension(300, 218));
        DetailChiphi.setPreferredSize(new java.awt.Dimension(1125, 218));
        DetailChiphi.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 50, 5));

        jPanel67.setPreferredSize(new java.awt.Dimension(200, 100));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("jLabel1");
        jLabel9.setPreferredSize(new java.awt.Dimension(200, 16));

        javax.swing.GroupLayout jPanel67Layout = new javax.swing.GroupLayout(jPanel67);
        jPanel67.setLayout(jPanel67Layout);
        jPanel67Layout.setHorizontalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel67Layout.setVerticalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel67Layout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        DetailChiphi.add(jPanel67);

        jPanel68.setPreferredSize(new java.awt.Dimension(200, 100));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("jLabel2");
        jLabel10.setPreferredSize(new java.awt.Dimension(200, 16));

        javax.swing.GroupLayout jPanel68Layout = new javax.swing.GroupLayout(jPanel68);
        jPanel68.setLayout(jPanel68Layout);
        jPanel68Layout.setHorizontalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel68Layout.setVerticalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel68Layout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        DetailChiphi.add(jPanel68);

        jPanel69.setPreferredSize(new java.awt.Dimension(200, 100));

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("jLabel3");
        jLabel36.setPreferredSize(new java.awt.Dimension(200, 16));

        javax.swing.GroupLayout jPanel69Layout = new javax.swing.GroupLayout(jPanel69);
        jPanel69.setLayout(jPanel69Layout);
        jPanel69Layout.setHorizontalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel69Layout.createSequentialGroup()
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel69Layout.setVerticalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel69Layout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        DetailChiphi.add(jPanel69);

        ContentCphi.setBackground(new java.awt.Color(219, 189, 142));
        ContentCphi.setToolTipText("");
        ContentCphi.setMaximumSize(new java.awt.Dimension(1090, 1000));
        ContentCphi.setPreferredSize(new java.awt.Dimension(1090, 450));
        ContentCphi.setLayout(cardLayout1);

        ContentCphi1.setBackground(new java.awt.Color(19, 189, 142));
        ContentCphi1.setToolTipText("");
        ContentCphi1.setMaximumSize(new java.awt.Dimension(1090, 1000));
        ContentCphi1.setPreferredSize(new java.awt.Dimension(1090, 702));

        javax.swing.GroupLayout ContentCphi1Layout = new javax.swing.GroupLayout(ContentCphi1);
        ContentCphi1.setLayout(ContentCphi1Layout);
        ContentCphi1Layout.setHorizontalGroup(
            ContentCphi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
        );
        ContentCphi1Layout.setVerticalGroup(
            ContentCphi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 862, Short.MAX_VALUE)
        );

        ContentCphi.add(ContentCphi1, "Tháng");

        ContentCphi2.setBackground(new java.awt.Color(219, 189, 42));
        ContentCphi2.setToolTipText("");
        ContentCphi2.setMaximumSize(new java.awt.Dimension(1090, 1000));
        ContentCphi2.setPreferredSize(new java.awt.Dimension(1090, 702));

        javax.swing.GroupLayout ContentCphi2Layout = new javax.swing.GroupLayout(ContentCphi2);
        ContentCphi2.setLayout(ContentCphi2Layout);
        ContentCphi2Layout.setHorizontalGroup(
            ContentCphi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
        );
        ContentCphi2Layout.setVerticalGroup(
            ContentCphi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 862, Short.MAX_VALUE)
        );

        ContentCphi.add(ContentCphi2, "Quý");

        selectPnCphi.setBackground(new java.awt.Color(219, 189, 142));

        CbboxChiphi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tháng", "Quý" }));
        CbboxChiphi.setToolTipText("");
        CbboxChiphi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbboxChiphiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout selectPnCphiLayout = new javax.swing.GroupLayout(selectPnCphi);
        selectPnCphi.setLayout(selectPnCphiLayout);
        selectPnCphiLayout.setHorizontalGroup(
            selectPnCphiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectPnCphiLayout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addComponent(CbboxChiphi, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        selectPnCphiLayout.setVerticalGroup(
            selectPnCphiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectPnCphiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CbboxChiphi, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel65Layout = new javax.swing.GroupLayout(jPanel65);
        jPanel65.setLayout(jPanel65Layout);
        jPanel65Layout.setHorizontalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel65Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ContentCphi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel65Layout.createSequentialGroup()
                        .addComponent(DetailChiphi, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(selectPnCphi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel65Layout.setVerticalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel65Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DetailChiphi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectPnCphi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ContentCphi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel18.add(jPanel65);

        TK_chiphi.setViewportView(jPanel18);

        ThongkePanel.addTab("", TK_chiphi);

        TK_loinhuan.setBackground(new java.awt.Color(219, 189, 142));
        TK_loinhuan.setPreferredSize(new java.awt.Dimension(1120, 450));

        jPanel72.setBackground(new java.awt.Color(204, 0, 51));
        jPanel72.setEnabled(false);
        jPanel72.setMaximumSize(new java.awt.Dimension(1000, 600));
        jPanel72.setPreferredSize(new java.awt.Dimension(1000, 1000));
        jPanel72.setLayout(new javax.swing.BoxLayout(jPanel72, javax.swing.BoxLayout.Y_AXIS));

        jPanel73.setBackground(new java.awt.Color(219, 189, 142));
        jPanel73.setMaximumSize(new java.awt.Dimension(1122, 32767));
        jPanel73.setPreferredSize(new java.awt.Dimension(1120, 1000));

        detailLoinhuan.setBackground(new java.awt.Color(219, 189, 142));
        detailLoinhuan.setEnabled(false);
        detailLoinhuan.setMaximumSize(new java.awt.Dimension(590, 600));
        detailLoinhuan.setMinimumSize(new java.awt.Dimension(300, 218));
        detailLoinhuan.setPreferredSize(new java.awt.Dimension(1125, 218));
        detailLoinhuan.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 50, 5));

        jPanel75.setPreferredSize(new java.awt.Dimension(200, 100));

        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("jLabel1");
        jLabel37.setPreferredSize(new java.awt.Dimension(200, 16));

        javax.swing.GroupLayout jPanel75Layout = new javax.swing.GroupLayout(jPanel75);
        jPanel75.setLayout(jPanel75Layout);
        jPanel75Layout.setHorizontalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel75Layout.setVerticalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel75Layout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        detailLoinhuan.add(jPanel75);

        jPanel76.setPreferredSize(new java.awt.Dimension(200, 100));

        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("jLabel2");
        jLabel38.setPreferredSize(new java.awt.Dimension(200, 16));

        javax.swing.GroupLayout jPanel76Layout = new javax.swing.GroupLayout(jPanel76);
        jPanel76.setLayout(jPanel76Layout);
        jPanel76Layout.setHorizontalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel76Layout.createSequentialGroup()
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel76Layout.setVerticalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel76Layout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        detailLoinhuan.add(jPanel76);

        jPanel77.setPreferredSize(new java.awt.Dimension(200, 100));

        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("jLabel3");
        jLabel39.setPreferredSize(new java.awt.Dimension(200, 16));

        javax.swing.GroupLayout jPanel77Layout = new javax.swing.GroupLayout(jPanel77);
        jPanel77.setLayout(jPanel77Layout);
        jPanel77Layout.setHorizontalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel77Layout.createSequentialGroup()
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel77Layout.setVerticalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel77Layout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        detailLoinhuan.add(jPanel77);

        contentTKLnhuan.setBackground(new java.awt.Color(219, 189, 142));
        contentTKLnhuan.setToolTipText("");
        contentTKLnhuan.setMaximumSize(new java.awt.Dimension(1090, 1000));
        contentTKLnhuan.setPreferredSize(new java.awt.Dimension(1090, 450));
        contentTKLnhuan.setLayout(cardLayout2);

        contentTKLnhuan1.setBackground(new java.awt.Color(219, 89, 142));
        contentTKLnhuan1.setToolTipText("");
        contentTKLnhuan1.setMaximumSize(new java.awt.Dimension(1090, 1000));
        contentTKLnhuan1.setPreferredSize(new java.awt.Dimension(1090, 702));

        javax.swing.GroupLayout contentTKLnhuan1Layout = new javax.swing.GroupLayout(contentTKLnhuan1);
        contentTKLnhuan1.setLayout(contentTKLnhuan1Layout);
        contentTKLnhuan1Layout.setHorizontalGroup(
            contentTKLnhuan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
        );
        contentTKLnhuan1Layout.setVerticalGroup(
            contentTKLnhuan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 862, Short.MAX_VALUE)
        );

        contentTKLnhuan.add(contentTKLnhuan1, "Tháng");

        contentTKLnhuan2.setBackground(new java.awt.Color(21, 189, 142));
        contentTKLnhuan2.setToolTipText("");
        contentTKLnhuan2.setMaximumSize(new java.awt.Dimension(1090, 1000));
        contentTKLnhuan2.setPreferredSize(new java.awt.Dimension(1090, 702));

        javax.swing.GroupLayout contentTKLnhuan2Layout = new javax.swing.GroupLayout(contentTKLnhuan2);
        contentTKLnhuan2.setLayout(contentTKLnhuan2Layout);
        contentTKLnhuan2Layout.setHorizontalGroup(
            contentTKLnhuan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
        );
        contentTKLnhuan2Layout.setVerticalGroup(
            contentTKLnhuan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 862, Short.MAX_VALUE)
        );

        contentTKLnhuan.add(contentTKLnhuan2, "Quý");

        selectPnLoinhuan.setBackground(new java.awt.Color(219, 189, 142));

        CbboxLoinhuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tháng", "Quý" }));
        CbboxLoinhuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbboxLoinhuanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout selectPnLoinhuanLayout = new javax.swing.GroupLayout(selectPnLoinhuan);
        selectPnLoinhuan.setLayout(selectPnLoinhuanLayout);
        selectPnLoinhuanLayout.setHorizontalGroup(
            selectPnLoinhuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectPnLoinhuanLayout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addComponent(CbboxLoinhuan, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        selectPnLoinhuanLayout.setVerticalGroup(
            selectPnLoinhuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectPnLoinhuanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CbboxLoinhuan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel73Layout = new javax.swing.GroupLayout(jPanel73);
        jPanel73.setLayout(jPanel73Layout);
        jPanel73Layout.setHorizontalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel73Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(contentTKLnhuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel73Layout.createSequentialGroup()
                        .addComponent(detailLoinhuan, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(selectPnLoinhuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel73Layout.setVerticalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel73Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(detailLoinhuan, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectPnLoinhuan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentTKLnhuan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel72.add(jPanel73);

        TK_loinhuan.setViewportView(jPanel72);

        ThongkePanel.addTab("", TK_loinhuan);

        TK_luong.setBackground(new java.awt.Color(219, 189, 142));
        TK_luong.setPreferredSize(new java.awt.Dimension(1120, 450));

        jPanel80.setBackground(new java.awt.Color(204, 0, 51));
        jPanel80.setEnabled(false);
        jPanel80.setMaximumSize(new java.awt.Dimension(1000, 600));
        jPanel80.setPreferredSize(new java.awt.Dimension(1000, 1000));
        jPanel80.setLayout(new javax.swing.BoxLayout(jPanel80, javax.swing.BoxLayout.Y_AXIS));

        jPanel81.setBackground(new java.awt.Color(219, 189, 142));
        jPanel81.setMaximumSize(new java.awt.Dimension(1122, 32767));
        jPanel81.setPreferredSize(new java.awt.Dimension(1120, 1000));

        detailLuong.setBackground(new java.awt.Color(219, 189, 142));
        detailLuong.setEnabled(false);
        detailLuong.setMaximumSize(new java.awt.Dimension(590, 600));
        detailLuong.setMinimumSize(new java.awt.Dimension(300, 218));
        detailLuong.setPreferredSize(new java.awt.Dimension(1125, 218));
        detailLuong.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 50, 5));

        jPanel83.setPreferredSize(new java.awt.Dimension(200, 100));

        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("jLabel1");
        jLabel40.setPreferredSize(new java.awt.Dimension(200, 16));

        javax.swing.GroupLayout jPanel83Layout = new javax.swing.GroupLayout(jPanel83);
        jPanel83.setLayout(jPanel83Layout);
        jPanel83Layout.setHorizontalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel83Layout.setVerticalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel83Layout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        detailLuong.add(jPanel83);

        jPanel84.setPreferredSize(new java.awt.Dimension(200, 100));

        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("jLabel2");
        jLabel41.setPreferredSize(new java.awt.Dimension(200, 16));

        javax.swing.GroupLayout jPanel84Layout = new javax.swing.GroupLayout(jPanel84);
        jPanel84.setLayout(jPanel84Layout);
        jPanel84Layout.setHorizontalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel84Layout.createSequentialGroup()
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel84Layout.setVerticalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel84Layout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        detailLuong.add(jPanel84);

        jPanel85.setPreferredSize(new java.awt.Dimension(200, 100));

        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("jLabel3");
        jLabel42.setPreferredSize(new java.awt.Dimension(200, 16));

        javax.swing.GroupLayout jPanel85Layout = new javax.swing.GroupLayout(jPanel85);
        jPanel85.setLayout(jPanel85Layout);
        jPanel85Layout.setHorizontalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel85Layout.createSequentialGroup()
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel85Layout.setVerticalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel85Layout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        detailLuong.add(jPanel85);

        ContentLuong.setBackground(new java.awt.Color(219, 189, 142));
        ContentLuong.setToolTipText("");
        ContentLuong.setMaximumSize(new java.awt.Dimension(1090, 1000));
        ContentLuong.setPreferredSize(new java.awt.Dimension(1090, 450));
        ContentLuong.setLayout(cardLayout3);

        ContentLuong1.setBackground(new java.awt.Color(219, 189, 42));
        ContentLuong1.setToolTipText("");
        ContentLuong1.setMaximumSize(new java.awt.Dimension(1090, 1000));
        ContentLuong1.setPreferredSize(new java.awt.Dimension(1090, 702));

        javax.swing.GroupLayout ContentLuong1Layout = new javax.swing.GroupLayout(ContentLuong1);
        ContentLuong1.setLayout(ContentLuong1Layout);
        ContentLuong1Layout.setHorizontalGroup(
            ContentLuong1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ContentLuong1Layout.setVerticalGroup(
            ContentLuong1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 862, Short.MAX_VALUE)
        );

        ContentLuong.add(ContentLuong1, "Tháng");

        ContentLuong2.setBackground(new java.awt.Color(2, 189, 1));
        ContentLuong2.setToolTipText("");
        ContentLuong2.setMaximumSize(new java.awt.Dimension(1090, 1000));
        ContentLuong2.setPreferredSize(new java.awt.Dimension(1090, 702));

        javax.swing.GroupLayout ContentLuong2Layout = new javax.swing.GroupLayout(ContentLuong2);
        ContentLuong2.setLayout(ContentLuong2Layout);
        ContentLuong2Layout.setHorizontalGroup(
            ContentLuong2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ContentLuong2Layout.setVerticalGroup(
            ContentLuong2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 862, Short.MAX_VALUE)
        );

        ContentLuong.add(ContentLuong2, "Quý");

        selectPnLuong.setBackground(new java.awt.Color(219, 189, 142));

        CbboxLuong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tháng", "Quý" }));
        CbboxLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbboxLuongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout selectPnLuongLayout = new javax.swing.GroupLayout(selectPnLuong);
        selectPnLuong.setLayout(selectPnLuongLayout);
        selectPnLuongLayout.setHorizontalGroup(
            selectPnLuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectPnLuongLayout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addComponent(CbboxLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        selectPnLuongLayout.setVerticalGroup(
            selectPnLuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectPnLuongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CbboxLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel81Layout = new javax.swing.GroupLayout(jPanel81);
        jPanel81.setLayout(jPanel81Layout);
        jPanel81Layout.setHorizontalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel81Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ContentLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel81Layout.createSequentialGroup()
                        .addComponent(detailLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(selectPnLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel81Layout.setVerticalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel81Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(detailLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectPnLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ContentLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel80.add(jPanel81);

        TK_luong.setViewportView(jPanel80);

        ThongkePanel.addTab("", TK_luong);

        TK_khohang.setBackground(new java.awt.Color(219, 189, 142));
        TK_khohang.setPreferredSize(new java.awt.Dimension(1120, 450));

        jPanel88.setBackground(new java.awt.Color(204, 0, 51));
        jPanel88.setEnabled(false);
        jPanel88.setMaximumSize(new java.awt.Dimension(1000, 600));
        jPanel88.setPreferredSize(new java.awt.Dimension(1000, 1000));
        jPanel88.setLayout(new javax.swing.BoxLayout(jPanel88, javax.swing.BoxLayout.Y_AXIS));

        jPanel89.setBackground(new java.awt.Color(219, 189, 142));
        jPanel89.setMaximumSize(new java.awt.Dimension(1122, 32767));
        jPanel89.setPreferredSize(new java.awt.Dimension(1120, 1000));

        detailKhohang.setBackground(new java.awt.Color(219, 189, 142));
        detailKhohang.setEnabled(false);
        detailKhohang.setMaximumSize(new java.awt.Dimension(590, 600));
        detailKhohang.setMinimumSize(new java.awt.Dimension(300, 218));
        detailKhohang.setPreferredSize(new java.awt.Dimension(1125, 218));
        detailKhohang.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 50, 5));

        jPanel91.setPreferredSize(new java.awt.Dimension(200, 100));

        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("jLabel1");
        jLabel43.setPreferredSize(new java.awt.Dimension(200, 16));

        javax.swing.GroupLayout jPanel91Layout = new javax.swing.GroupLayout(jPanel91);
        jPanel91.setLayout(jPanel91Layout);
        jPanel91Layout.setHorizontalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel91Layout.setVerticalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel91Layout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        detailKhohang.add(jPanel91);

        jPanel92.setPreferredSize(new java.awt.Dimension(200, 100));

        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("jLabel2");
        jLabel44.setPreferredSize(new java.awt.Dimension(200, 16));

        javax.swing.GroupLayout jPanel92Layout = new javax.swing.GroupLayout(jPanel92);
        jPanel92.setLayout(jPanel92Layout);
        jPanel92Layout.setHorizontalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel92Layout.createSequentialGroup()
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel92Layout.setVerticalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel92Layout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        detailKhohang.add(jPanel92);

        jPanel93.setPreferredSize(new java.awt.Dimension(200, 100));

        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("jLabel3");
        jLabel45.setPreferredSize(new java.awt.Dimension(200, 16));

        javax.swing.GroupLayout jPanel93Layout = new javax.swing.GroupLayout(jPanel93);
        jPanel93.setLayout(jPanel93Layout);
        jPanel93Layout.setHorizontalGroup(
            jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel93Layout.createSequentialGroup()
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel93Layout.setVerticalGroup(
            jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel93Layout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        detailKhohang.add(jPanel93);

        ContentKhohang.setBackground(new java.awt.Color(219, 189, 142));
        ContentKhohang.setToolTipText("");
        ContentKhohang.setMaximumSize(new java.awt.Dimension(1090, 1000));
        ContentKhohang.setPreferredSize(new java.awt.Dimension(1090, 450));
        ContentKhohang.setLayout(cardLayout4);

        ContentKhohang1.setBackground(new java.awt.Color(219, 189, 110));
        ContentKhohang1.setToolTipText("");
        ContentKhohang1.setMaximumSize(new java.awt.Dimension(1090, 1000));
        ContentKhohang1.setPreferredSize(new java.awt.Dimension(1090, 702));

        javax.swing.GroupLayout ContentKhohang1Layout = new javax.swing.GroupLayout(ContentKhohang1);
        ContentKhohang1.setLayout(ContentKhohang1Layout);
        ContentKhohang1Layout.setHorizontalGroup(
            ContentKhohang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
        );
        ContentKhohang1Layout.setVerticalGroup(
            ContentKhohang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 862, Short.MAX_VALUE)
        );

        ContentKhohang.add(ContentKhohang1, "Tháng");

        ContentKhohang3.setBackground(new java.awt.Color(219, 19, 142));
        ContentKhohang3.setToolTipText("");
        ContentKhohang3.setMaximumSize(new java.awt.Dimension(1090, 1000));
        ContentKhohang3.setPreferredSize(new java.awt.Dimension(1090, 702));

        javax.swing.GroupLayout ContentKhohang3Layout = new javax.swing.GroupLayout(ContentKhohang3);
        ContentKhohang3.setLayout(ContentKhohang3Layout);
        ContentKhohang3Layout.setHorizontalGroup(
            ContentKhohang3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
        );
        ContentKhohang3Layout.setVerticalGroup(
            ContentKhohang3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 862, Short.MAX_VALUE)
        );

        ContentKhohang.add(ContentKhohang3, "Quý");

        selectKhohang.setBackground(new java.awt.Color(219, 189, 142));

        CbboxKhohang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tháng", "Quý" }));
        CbboxKhohang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbboxKhohangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout selectKhohangLayout = new javax.swing.GroupLayout(selectKhohang);
        selectKhohang.setLayout(selectKhohangLayout);
        selectKhohangLayout.setHorizontalGroup(
            selectKhohangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectKhohangLayout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addComponent(CbboxKhohang, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        selectKhohangLayout.setVerticalGroup(
            selectKhohangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectKhohangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CbboxKhohang, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel89Layout = new javax.swing.GroupLayout(jPanel89);
        jPanel89.setLayout(jPanel89Layout);
        jPanel89Layout.setHorizontalGroup(
            jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel89Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ContentKhohang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel89Layout.createSequentialGroup()
                        .addComponent(detailKhohang, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(selectKhohang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel89Layout.setVerticalGroup(
            jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel89Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(detailKhohang, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectKhohang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ContentKhohang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel88.add(jPanel89);

        TK_khohang.setViewportView(jPanel88);

        ThongkePanel.addTab("", TK_khohang);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(HeaderTk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ThongkePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(HeaderTk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ThongkePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnExportActionPerformed

    private void Combobox_TKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combobox_TKActionPerformed
        int selectedIndex = Combobox_TK.getSelectedIndex();
        ThongkePanel.setSelectedIndex(selectedIndex);
    }//GEN-LAST:event_Combobox_TKActionPerformed

    private void CbboxDthuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbboxDthuActionPerformed
        String selectedCard = (String) CbboxDthu.getSelectedItem();
                // Chuyển sang trang tương ứng
                cardLayout.show(Main_DtPn, selectedCard);
    }//GEN-LAST:event_CbboxDthuActionPerformed

    private void CbboxChiphiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbboxChiphiActionPerformed
        String selectedCard = (String) CbboxChiphi.getSelectedItem();
                // Chuyển sang trang tương ứng
                cardLayout1.show(ContentCphi, selectedCard);
    }//GEN-LAST:event_CbboxChiphiActionPerformed

    private void CbboxLoinhuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbboxLoinhuanActionPerformed
        String selectedCard = (String) CbboxLoinhuan.getSelectedItem();
        // Chuyển sang trang tương ứng
        cardLayout2.show(contentTKLnhuan, selectedCard);
    }//GEN-LAST:event_CbboxLoinhuanActionPerformed

    private void CbboxKhohangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbboxKhohangActionPerformed
        String selectedCard = (String) CbboxKhohang.getSelectedItem();
                // Chuyển sang trang tương ứng
                cardLayout4.show(ContentKhohang, selectedCard);
    }//GEN-LAST:event_CbboxKhohangActionPerformed

    private void CbboxLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbboxLuongActionPerformed
                String selectedCard = (String) CbboxLuong.getSelectedItem();
                // Chuyển sang trang tương ứng
                cardLayout3.show(ContentLuong, selectedCard);
    }//GEN-LAST:event_CbboxLuongActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnExport;
    private javax.swing.JComboBox<String> CbboxChiphi;
    private javax.swing.JComboBox<String> CbboxDthu;
    private javax.swing.JComboBox<String> CbboxKhohang;
    private javax.swing.JComboBox<String> CbboxLoinhuan;
    private javax.swing.JComboBox<String> CbboxLuong;
    private javax.swing.JComboBox<String> Combobox_TK;
    private javax.swing.JPanel ContentCphi;
    private javax.swing.JPanel ContentCphi1;
    private javax.swing.JPanel ContentCphi2;
    private javax.swing.JPanel ContentKhohang;
    private javax.swing.JPanel ContentKhohang1;
    private javax.swing.JPanel ContentKhohang3;
    private javax.swing.JPanel ContentLuong;
    private javax.swing.JPanel ContentLuong1;
    private javax.swing.JPanel ContentLuong2;
    private javax.swing.JPanel DTthang;
    private javax.swing.JScrollPane DefaultTK;
    private javax.swing.JPanel DetailChiphi;
    private javax.swing.JPanel DetailDtPn;
    private javax.swing.JPanel DtNgayPn;
    private javax.swing.JPanel DthuTrungBinh;
    private javax.swing.JPanel HeaderTk;
    private javax.swing.JPanel KhMoiPn;
    private javax.swing.JPanel Main_DtPn;
    private javax.swing.JPanel Main_DtPn1;
    private javax.swing.JPanel Main_DtPn2;
    private javax.swing.JPanel Panel_default;
    private javax.swing.JPanel PnDthu;
    private javax.swing.JPanel SLdonhangPn;
    private javax.swing.JPanel SLspBanPn;
    private javax.swing.JScrollPane TK_chiphi;
    private javax.swing.JScrollPane TK_doanhthu;
    private javax.swing.JScrollPane TK_khohang;
    private javax.swing.JScrollPane TK_loinhuan;
    private javax.swing.JScrollPane TK_luong;
    private javax.swing.JTabbedPane ThongkePanel;
    private javax.swing.JPanel TongDThu;
    private javax.swing.JPanel TongDtPn;
    private javax.swing.JPanel contentTKLnhuan;
    private javax.swing.JPanel contentTKLnhuan1;
    private javax.swing.JPanel contentTKLnhuan2;
    private javax.swing.JPanel content_Panel;
    private javax.swing.JPanel detailKhohang;
    private javax.swing.JPanel detailLoinhuan;
    private javax.swing.JPanel detailLuong;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel81;
    private javax.swing.JPanel jPanel83;
    private javax.swing.JPanel jPanel84;
    private javax.swing.JPanel jPanel85;
    private javax.swing.JPanel jPanel88;
    private javax.swing.JPanel jPanel89;
    private javax.swing.JPanel jPanel91;
    private javax.swing.JPanel jPanel92;
    private javax.swing.JPanel jPanel93;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JPanel selectKhohang;
    private javax.swing.JPanel selectPn;
    private javax.swing.JPanel selectPnCphi;
    private javax.swing.JPanel selectPnLoinhuan;
    private javax.swing.JPanel selectPnLuong;
    // End of variables declaration//GEN-END:variables
}
