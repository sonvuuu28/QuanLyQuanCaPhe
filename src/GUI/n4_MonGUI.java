package GUI;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Image;
import java.net.URL;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import javax.swing.event.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import BUS.n4_MonBUS;
import BUS.n4_LoaiMonBUS;
import DTO.MonDTO;
import DTO.NguyenLieuDTO;
import DTO.LoaiMonDTO;
import Util.TableCustom;
import net.sf.jasperreports.engine.component.Component;

public class n4_MonGUI extends javax.swing.JPanel {
    private n4_MonBUS monBUS;
    private n4_LoaiMonBUS loaiMonBUS;
    private File selectedFile;
    private String targetFolder = "C:\\Users\\dvmv2\\OneDrive\\Documents\\Nam3\\CNPM\\QuanLyQuanCaPhe\\src\\IMAGE\\SanPham";

    public n4_MonGUI() {
        this.monBUS = new n4_MonBUS();
        this.loaiMonBUS = new n4_LoaiMonBUS();  
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
        tf_DonGia = new javax.swing.JTextField();
        btn_TaoCongThuc = new javax.swing.JButton();
        btn_ChonAnh = new javax.swing.JButton();
        lb_HinhAnhMonAn = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        comboboxLoaiMon = new javax.swing.JComboBox<>();
        PanelChuaNut = new javax.swing.JPanel();
        btn_Sua = new javax.swing.JButton();
        btn_Them = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();
        btn_XuatExcel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_DanhSachMon = new javax.swing.JTable();
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
        btn_TaiLai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reloadData();
            }
        });

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
        tf_MaMon.setDisabledTextColor(Color.BLACK); 
        tf_MaMon.setEditable(false);
        tf_MaMon.setEnabled(false);

        tf_TenMon.setBorder(null);
        tf_TenMon.setMaximumSize(new java.awt.Dimension(230, 24));
        tf_TenMon.setMinimumSize(new java.awt.Dimension(230, 24));
        tf_TenMon.setPreferredSize(new java.awt.Dimension(230, 24));

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
        btn_TaoCongThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // btn_TaoCongThucActionPerformed(evt);
            }
        });

        btn_ChonAnh.setBackground(new java.awt.Color(219, 189, 142));
        btn_ChonAnh.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_ChonAnh.setText("Chọn Ảnh");
        btn_ChonAnh.setPreferredSize(new java.awt.Dimension(150, 24));
        btn_ChonAnh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Chọn tệp");

                int result = fileChooser.showOpenDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    selectedFile = fileChooser.getSelectedFile();
                    hienThiAnhMoiChon(selectedFile);
                } else {
                    System.out.println("Không có tệp nào được chọn.");
                }
            }
        });

        lb_HinhAnhMonAn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_HinhAnhMonAn.setPreferredSize(new Dimension(300, 300));
        // lb_HinhAnhMonAn.setText("Hình Ảnh");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        
        ArrayList<LoaiMonDTO> dsLoaiMon = loaiMonBUS.getAll();
        comboboxLoaiMon.removeAllItems();
        for(int i = 0; i < dsLoaiMon.size(); i++) {
            comboboxLoaiMon.addItem(dsLoaiMon.get(i));
        }

        PanelChuaNut.setBackground(new java.awt.Color(255, 255, 255));

        btn_Sua.setBackground(new java.awt.Color(0, 0, 0));
        btn_Sua.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_Sua.setForeground(new java.awt.Color(255, 255, 255));
        btn_Sua.setText("Sửa");
        btn_Sua.setMaximumSize(new java.awt.Dimension(100, 26));
        btn_Sua.setMinimumSize(new java.awt.Dimension(100, 26));
        btn_Sua.setPreferredSize(new java.awt.Dimension(100, 26));
        btn_Sua.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = tb_DanhSachMon.getSelectedRow();
                if (selectedRow != -1) {
                    int confirm = JOptionPane.showConfirmDialog(null,"Bạn có muốn sửa món này?","Xác nhận",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                    if (confirm == JOptionPane.YES_OPTION) {
                        String maMon = String.valueOf(tf_MaMon.getText());
                        LoaiMonDTO temp = (LoaiMonDTO) comboboxLoaiMon.getSelectedItem();
                        String maLoaiMon = temp.getMaLoaiMon();
                        String tenMon = String.valueOf(tf_TenMon.getText());
                        if(tenMon.length() > 50) {
                            JOptionPane.showMessageDialog(null, "Tên món không được vượt quá 50 ký tự !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                        // Biểu thức regex để kiểm tra không có ký tự đặc biệt
                        String regex = "^[a-zA-Z0-9]+$";
                        if(!tenMon.matches(regex)) {
                            JOptionPane.showMessageDialog(null, "Tên món không được chứa ký tự đặc biệt !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                        int donGia;
                        if(checkMoneyMount(tf_DonGia.getText())) {
                            donGia = Integer.valueOf(tf_DonGia.getText());
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Đơn giá không hợp lệ !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                        //? Check chọn ảnh chưa 
                        String hinhAnh = null;
                        if(selectedFile != null) {
                            hinhAnh = maMon+".jpg";
                            //? Tên mới cho ảnh dựa trên mã món ăn
                            //? Lưu ảnh
                            try {
                                Path targetPath = new File(targetFolder, hinhAnh).toPath();
                                // Sao chép ảnh vào thư mục đích
                                Files.copy(selectedFile.toPath(), targetPath, StandardCopyOption.REPLACE_EXISTING);
                            } catch (IOException ex) {
                                ex.printStackTrace();
                                System.out.println("Lỗi khi lưu ảnh.");
                            }
                        }
                        
                        MonDTO mon = new MonDTO(maMon, maLoaiMon, tenMon, hinhAnh, donGia, true);
                        if(monBUS.updateMon(mon)){
                            JOptionPane.showMessageDialog(null, "Sửa món thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                            reloadData();
                        }
                        else 
                            JOptionPane.showMessageDialog(null, "Sửa món thất bại !", "Thông báo", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn 1 sản phẩm để sửa !", "Thông báo", JOptionPane.ERROR_MESSAGE);
                }
            }
        });


        btn_Them.setBackground(new java.awt.Color(0, 0, 0));
        btn_Them.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_Them.setForeground(new java.awt.Color(255, 255, 255));
        btn_Them.setText("Thêm");
        btn_Them.setMaximumSize(new java.awt.Dimension(100, 26));
        btn_Them.setMinimumSize(new java.awt.Dimension(100, 26));
        btn_Them.setPreferredSize(new java.awt.Dimension(100, 26));
        btn_Them.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirm = JOptionPane.showConfirmDialog(null,"Bạn có muốn thêm món này?","Xác nhận",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                if (confirm == JOptionPane.YES_OPTION) {
                    String maMon = String.valueOf(tf_MaMon.getText());
                    LoaiMonDTO temp = (LoaiMonDTO) comboboxLoaiMon.getSelectedItem();
                    String maLoaiMon = temp.getMaLoaiMon();
                    String tenMon = String.valueOf(tf_TenMon.getText());
                    if(tenMon.length() > 50) {
                        JOptionPane.showMessageDialog(null, "Tên món không được vượt quá 50 ký tự !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }
                    // Biểu thức regex để kiểm tra không có ký tự đặc biệt
                    String regex = "^[a-zA-Z0-9]+$";
                    if(!tenMon.matches(regex)) {
                        JOptionPane.showMessageDialog(null, "Tên món không được chứa ký tự đặc biệt !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }
                    int donGia;
                    if(checkMoneyMount(tf_DonGia.getText())) {
                        donGia = Integer.valueOf(tf_DonGia.getText());
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Đơn giá không hợp lệ !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }
                    //? Check chọn ảnh chưa 
                    String hinhAnh = null;
                    if(selectedFile != null) {
                        hinhAnh = maMon+".jpg";
                        //? Tên mới cho ảnh dựa trên mã món ăn
                        //? Lưu ảnh
                        try {
                            Path targetPath = new File(targetFolder, hinhAnh).toPath();
                            // Sao chép ảnh vào thư mục đích
                            Files.copy(selectedFile.toPath(), targetPath, StandardCopyOption.REPLACE_EXISTING);
                        } catch (IOException ex) {
                            ex.printStackTrace();
                            System.out.println("Lỗi khi lưu ảnh.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Vui lòng chọn ảnh để thêm món !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }
                    MonDTO mon = new MonDTO(maMon, maLoaiMon, tenMon, hinhAnh, donGia, true);
                    if(monBUS.addMon(mon)){
                        JOptionPane.showMessageDialog(null, "Thêm món thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                        reloadData();
                    }
                    else 
                        JOptionPane.showMessageDialog(null, "Thêm món thất bại !", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        }
        });

        btn_Xoa.setBackground(new java.awt.Color(0, 0, 0));
        btn_Xoa.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_Xoa.setForeground(new java.awt.Color(255, 255, 255));
        btn_Xoa.setText("Xóa");
        btn_Xoa.setMaximumSize(new java.awt.Dimension(100, 26));
        btn_Xoa.setMinimumSize(new java.awt.Dimension(100, 26));
        btn_Xoa.setPreferredSize(new java.awt.Dimension(100, 26));
        btn_Xoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = tb_DanhSachMon.getSelectedRow();
                if (selectedRow != -1) {
                    int confirm = JOptionPane.showConfirmDialog(null,"Bạn có muốn xóa món này?","Xác nhận",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                    if (confirm == JOptionPane.YES_OPTION) {
                        String maMon = String.valueOf(tf_MaMon.getText());
                        if(monBUS.deleteMon(maMon)){
                            JOptionPane.showMessageDialog(null, "Xóa món thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                            reloadData();
                        }
                        else 
                            JOptionPane.showMessageDialog(null, "Xóa món thất bại !", "Thông báo", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn 1 sản phẩm để xóa !", "Thông báo", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btn_XuatExcel.setBackground(new java.awt.Color(0, 0, 0));
        btn_XuatExcel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_XuatExcel.setForeground(new java.awt.Color(255, 255, 255));
        btn_XuatExcel.setText("Xuất Excel");
        btn_XuatExcel.setMaximumSize(new java.awt.Dimension(100, 26));
        btn_XuatExcel.setMinimumSize(new java.awt.Dimension(100, 26));
        btn_XuatExcel.setPreferredSize(new java.awt.Dimension(100, 26));
        btn_XuatExcel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String fileName = "listMon.xlsx";
                String filePath = "C:\\Users\\dvmv2\\OneDrive\\Documents\\Nam3\\CNPM\\QuanLyQuanCaPhe\\src\\EXCEL\\"+fileName;
                Workbook workbook = new XSSFWorkbook();
                Sheet sheet = workbook.createSheet("Sheet1");

                // Lấy mô hình dữ liệu từ JTable
                TableModel model = tb_DanhSachMon.getModel();
                // Tạo hàng tiêu đề (header)
                Row headerRow = sheet.createRow(0);
                for (int col = 0; col < model.getColumnCount(); col++) {
                    Cell cell = headerRow.createCell(col);
                    cell.setCellValue(model.getColumnName(col));
                }

                // Ghi dữ liệu từ JTable vào tệp Excel
                for (int row = 0; row < model.getRowCount(); row++) {
                    Row excelRow = sheet.createRow(row + 1);
                    for (int col = 0; col < model.getColumnCount(); col++) {
                        Cell cell = excelRow.createCell(col);
                        cell.setCellValue(model.getValueAt(row, col).toString());
                    }
                }
                // Ghi workbook vào tệp và mở tệp sau khi lưu
                try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
                    workbook.write(outputStream);
                    workbook.close();
                    System.out.println("Xuất file Excel thành công!");

                    // Mở tệp ngay sau khi lưu
                    File file = new File(filePath);
                    if (Desktop.isDesktopSupported()) {
                        Desktop.getDesktop().open(file);
                    } else {
                        System.out.println("Mở tệp không được hỗ trợ trên hệ thống này.");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }   
            }
        });

        javax.swing.GroupLayout PanelChuaNutLayout = new javax.swing.GroupLayout(PanelChuaNut);
        PanelChuaNut.setLayout(PanelChuaNutLayout);
        PanelChuaNutLayout.setHorizontalGroup(
            PanelChuaNutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelChuaNutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelChuaNutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelChuaNutLayout.createSequentialGroup()
                        .addComponent(btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelChuaNutLayout.createSequentialGroup()
                        .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_XuatExcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PanelChuaNutLayout.setVerticalGroup(
            PanelChuaNutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelChuaNutLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(PanelChuaNutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelChuaNutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_XuatExcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelChuaThongTinTrangLayout = new javax.swing.GroupLayout(PanelChuaThongTinTrang);
        PanelChuaThongTinTrang.setLayout(PanelChuaThongTinTrangLayout);
        PanelChuaThongTinTrangLayout.setHorizontalGroup(
            PanelChuaThongTinTrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelChuaThongTinTrangLayout.createSequentialGroup()
                .addGroup(PanelChuaThongTinTrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelChuaThongTinTrangLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelChuaThongTinTrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_ThongTinMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelChuaThongTinTrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelChuaThongTinTrangLayout.createSequentialGroup()
                                    .addGroup(PanelChuaThongTinTrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lb_DonGia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lb_MaMon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lb_TenMon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lb_LoaiMon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(PanelChuaThongTinTrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PanelChuaThongTinTrangLayout.createSequentialGroup()
                                            .addGroup(PanelChuaThongTinTrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(PanelChuaThongTinTrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(comboboxLoaiMon, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tf_DonGia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(tf_TenMon, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(PanelChuaThongTinTrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(tf_MaMon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, Short.MAX_VALUE)
                                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(20, 20, 20)
                                            .addComponent(lb_HinhAnhMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(PanelChuaThongTinTrangLayout.createSequentialGroup()
                                    .addGap(55, 55, 55)
                                    .addComponent(btn_TaoCongThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_ChonAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(PanelChuaThongTinTrangLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(PanelChuaNut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        PanelChuaThongTinTrangLayout.setVerticalGroup(
            PanelChuaThongTinTrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelChuaThongTinTrangLayout.createSequentialGroup()
                .addComponent(lb_ThongTinMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelChuaThongTinTrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelChuaThongTinTrangLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_HinhAnhMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelChuaThongTinTrangLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelChuaThongTinTrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_MaMon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelChuaThongTinTrangLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(tf_MaMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelChuaThongTinTrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb_TenMon, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_TenMon, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelChuaThongTinTrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_LoaiMon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboboxLoaiMon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelChuaThongTinTrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb_DonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_DonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelChuaThongTinTrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_TaoCongThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ChonAnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(PanelChuaNut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelChuaThongTin_Cam.add(PanelChuaThongTinTrang);

        fillTable();
        tb_DanhSachMon.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                // Kiểm tra xem có hàng nào đang được chọn không
                if (!event.getValueIsAdjusting()) {
                    int selectedRow = tb_DanhSachMon.getSelectedRow();
                    if (selectedRow != -1) {
                        // Lấy dữ liệu của hàng được chọn
                        selectedFile = null;
                        String maMon = String.valueOf(tb_DanhSachMon.getValueAt(selectedRow, 0));
                        LoaiMonDTO loaiMon =  loaiMonBUS.getLoaiMonById(String.valueOf(tb_DanhSachMon.getValueAt(selectedRow, 1)));
                        String tenMon =  String.valueOf(tb_DanhSachMon.getValueAt(selectedRow, 2));
                        String donGia =  String.valueOf(tb_DanhSachMon.getValueAt(selectedRow, 3));
                        tf_MaMon.setText(maMon);
                        tf_TenMon.setText(tenMon);
                        tf_DonGia.setText(String.valueOf(convertCurrencyToInt(donGia)));

                        for (int i = 0; i < comboboxLoaiMon.getItemCount(); i++) {
                            if (comboboxLoaiMon.getItemAt(i).toString().equals(loaiMon.toString())) {
                                comboboxLoaiMon.setSelectedIndex(i);
                                break;
                            }
                        }
                        
                        hienThiAnhMon(monBUS.getMonById(maMon).getHinhAnh());
                    }
                }
            }
        });
        jScrollPane1.setViewportView(tb_DanhSachMon);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTongLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(comboboxTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btn_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btn_TaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(241, 241, 241))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTongLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(PanelChuaThongTin_Cam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        PanelTongLayout.setVerticalGroup(
            PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTongLayout.createSequentialGroup()
                .addComponent(lb_QuanLyMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTongLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(PanelTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTongLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_TaiLai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(comboboxTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTongLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(PanelChuaThongTin_Cam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelTongLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
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
    public void hienThiAnhMoiChon(File fileanh) {
        // Đường dẫn tới hình ảnh
        String linkHinhAnh = fileanh.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(linkHinhAnh);
    
        // Kích thước cố định của JLabel
        int labelWidth = lb_HinhAnhMonAn.getWidth();
        int labelHeight = lb_HinhAnhMonAn.getHeight();
    
        // Kích thước gốc của ảnh
        int imageWidth = imageIcon.getIconWidth();
        int imageHeight = imageIcon.getIconHeight();
    
        // Tính toán tỷ lệ thu phóng để giữ nguyên tỷ lệ ảnh
        double widthRatio = (double) labelWidth / imageWidth;
        double heightRatio = (double) labelHeight / imageHeight;
        double scaleFactor = Math.min(widthRatio, heightRatio);  // Chọn tỷ lệ nhỏ hơn để ảnh không bị cắt
    
        int newWidth = (int) (imageWidth * scaleFactor);
        int newHeight = (int) (imageHeight * scaleFactor);
    
        // Điều chỉnh kích thước ảnh theo tỷ lệ đã tính toán
        Image scaledImage = imageIcon.getImage().getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(scaledImage);
    
        // Đặt ImageIcon vào JLabel
        lb_HinhAnhMonAn.setIcon(imageIcon);
    }
    public void hienThiAnhMon(String tenAnh) {
        // Đường dẫn tới hình ảnh
        String linkHinhAnh = "/IMAGE/SanPham/" + tenAnh;
        java.net.URL imgURL = getClass().getResource(linkHinhAnh);
    
        ImageIcon imageIcon;
        if (imgURL != null) {
            imageIcon = new ImageIcon(imgURL);  // Ảnh tồn tại
        } else {
            // Đường dẫn ảnh mặc định nếu ảnh không tồn tại
            imageIcon = new ImageIcon("C:\\Users\\dvmv2\\OneDrive\\Documents\\Nam3\\CNPM\\QuanLyQuanCaPhe\\src\\IMAGE\\Logo2.png");
            // System.out.println("Ảnh không tồn tại, hiển thị ảnh mặc định.");
        }
    
        // Kích thước cố định của JLabel
        int labelWidth = lb_HinhAnhMonAn.getWidth();
        int labelHeight = lb_HinhAnhMonAn.getHeight();
    
        // Kích thước gốc của ảnh
        int imageWidth = imageIcon.getIconWidth();
        int imageHeight = imageIcon.getIconHeight();
    
        // Tính toán tỷ lệ thu phóng để giữ nguyên tỷ lệ ảnh
        double widthRatio = (double) labelWidth / imageWidth;
        double heightRatio = (double) labelHeight / imageHeight;
        double scaleFactor = Math.min(widthRatio, heightRatio);  // Chọn tỷ lệ nhỏ hơn để ảnh không bị cắt
    
        int newWidth = (int) (imageWidth * scaleFactor);
        int newHeight = (int) (imageHeight * scaleFactor);
    
        // Điều chỉnh kích thước ảnh theo tỷ lệ đã tính toán
        Image scaledImage = imageIcon.getImage().getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(scaledImage);
    
        // Đặt ImageIcon vào JLabel
        lb_HinhAnhMonAn.setIcon(imageIcon);
    }
    public String toCurrency(int giaTien) {
         // Sử dụng NumberFormat để định dạng tiền tệ
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.forLanguageTag("vi-VN"));
        String formattedNumber = numberFormat.format(giaTien);
        // Thêm ký hiệu tiền tệ "đ"
        return formattedNumber + "đ";
    }
    public int convertCurrencyToInt(String currency) {
        // Loại bỏ ký hiệu tiền tệ và dấu chấm
        String cleanString = currency.replaceAll("[\\.đ]", "").trim();
        
        // Chuyển đổi chuỗi sang số nguyên
        return Integer.parseInt(cleanString); // Trả về giá trị kiểu int
    }
    public void reloadData() {
        tf_MaMon.setText("");
        tf_TenMon.setText("");
        hienThiAnhMon("abc");//? Chọn tên ảnh không tồn tại để hiển thị ảnh mặc định
        tf_DonGia.setText("");
        this.selectedFile = null;
        fillTable();
    }
    public void fillTable() {
        DefaultTableModel modelTable = new DefaultTableModel();
        modelTable.addColumn("Mã Món");
        modelTable.addColumn("Loại Món");
        modelTable.addColumn("Tên Món");
        modelTable.addColumn("Đơn Giá");
        
        ArrayList<MonDTO> list = monBUS.getAll();
        for(int i = 0; i < list.size(); i++) {
            modelTable.addRow(new Object[] {
                list.get(i).getMaMon(),
                list.get(i).getMaLoaiMon(),
                list.get(i).getTenMon(),
                toCurrency(list.get(i).getDonGiaMon()),
            });
        }
        tb_DanhSachMon.setModel(modelTable);

    }
    
    public boolean checkMoneyMount(String moneyMount) {
        try {
            int amount = Integer.parseInt(moneyMount);
            //? Kiểm tra số tiền phải lớn hơn hoặc bằng 0
            if (amount < 0) {
                return false;
            }
            //? Kiểm tra chuỗi không chỉ chứa ký tự số và dấu thập phân hợp lệ (không có ký tự không hợp lệ)
            String regex = "^[0-9]+(\\.[0-9]{1,2})?$";
            return moneyMount.matches(regex);
        } catch (NumberFormatException e) {
            return false;
        }
    }
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
    private javax.swing.JComboBox<LoaiMonDTO> comboboxLoaiMon;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
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
    private javax.swing.JTextField tf_MaMon;
    private javax.swing.JTextField tf_TenMon;
    // End of variables declaration//GEN-END:variables
}
