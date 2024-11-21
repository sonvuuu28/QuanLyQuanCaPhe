
package BUS;
import javax.swing.table.DefaultTableModel;


import DAO.NhapHangDAO;
import Util.JDBCUtil;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.sql.Statement;

// public class NhapHangBUS {
//     private NhapHangDAO nhapHangDAO;

//     public NhapHangBUS() {
//         nhapHangDAO = new NhapHangDAO();
//     }

//     public void loadDataToTable_KhoHang(JTable table) {
//         ArrayList<Object[]> data = nhapHangDAO.getDataFromDatabase();
//         DefaultTableModel model = (DefaultTableModel) table.getModel();
//         model.setRowCount(0); // Clear existing data

//         for (Object[] row : data) {
//             String maNguyenLieu = (String) row[0];
//             String tenNguyenLieu = (String) row[1];
//             double khoiLuong = (double) row[2];
//             String trangThai;

//             if (khoiLuong >= 1) {
//                 trangThai = "Còn hàng";
//             } else if (khoiLuong > 0.1) {
//                 trangThai = "Sắp hết";
//             } else {
//                 trangThai = "Hết hàng";
//             }

//             model.addRow(new Object[]{maNguyenLieu, tenNguyenLieu, khoiLuong, trangThai});
//         }
//     }
    // public boolean isNguyenLieuInChoNhap(JTable table, String maNguyenLieu) {
    //     DefaultTableModel model = (DefaultTableModel) table.getModel();
    //     for (int i = 0; i < model.getRowCount(); i++) {
    //         Object value = model.getValueAt(i, 0);
    //         if (value != null && value.equals(maNguyenLieu)) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    // public static class NonEditableTableModel extends DefaultTableModel {
    //     public NonEditableTableModel(Object[][] data, Object[] columnNames) {
    //         super(data, columnNames);
    //     }

    //     @Override
    //     public boolean isCellEditable(int row, int column) {
    //         return false; // Tất cả các ô đều không thể chỉnh sửa
    //     }
    // }
// }
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class NhapHangBUS {
    private NhapHangDAO nhapHangDAO;

    public NhapHangBUS() {
        nhapHangDAO = new NhapHangDAO();
    }

    public void loadDataToTable_KhoHang(JTable table) {
        if (table == null) {
            throw new IllegalArgumentException("Table cannot be null");
        }

        ArrayList<Object[]> data = nhapHangDAO.getDataFromDatabase();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Clear existing data

        for (Object[] row : data) {
            String maNguyenLieu = (String) row[0];
            String tenNguyenLieu = (String) row[1];
            double khoiLuong = (double) row[2];
            String trangThai;

            if (khoiLuong >= 1) {
                trangThai = "Còn hàng";
            } else if (khoiLuong > 0.1) {
                trangThai = "Sắp hết";
            } else {
                trangThai = "Hết hàng";
            }

            model.addRow(new Object[]{maNguyenLieu, tenNguyenLieu, khoiLuong, trangThai});
        }
    }

    public static class NonEditableTableModel extends DefaultTableModel {
        public NonEditableTableModel(Object[][] data, Object[] columnNames) {
            super(data, columnNames);
        }

        @Override
        public boolean isCellEditable(int row, int column) {
            return false; // Tất cả các ô đều không thể chỉnh sửa
        }
    }
    public boolean isNguyenLieuInChoNhap(JTable table, String maNguyenLieu) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            Object value = model.getValueAt(i, 0);
            if (value != null && value.equals(maNguyenLieu)) {
                return true;
            }
        }
        return false;
    }
    

    public void searchNguyenLieuByMa(JTable table, String maNguyenLieu) {
        if (table == null) {
            throw new IllegalArgumentException("Table is null");
        }
        ArrayList<Object[]> data = nhapHangDAO.searchNguyenLieuByMa(maNguyenLieu);
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Clear existing data
        for (Object[] row : data) {
            String maNguyenLieuResult = (String) row[0];
            String tenNguyenLieu = (String) row[1];
            double khoiLuong = (double) row[2];
            String trangThai = khoiLuong >= 1 ? "Còn hàng" : khoiLuong > 0.1 ? "Sắp hết" : "Hết hàng";
            model.addRow(new Object[]{maNguyenLieuResult, tenNguyenLieu, khoiLuong, trangThai});

  }
}
    
    
}
