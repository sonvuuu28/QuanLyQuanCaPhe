// package DAO;

// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.ResultSet;
// import java.sql.Statement;
// import javax.swing.JTable;
// import javax.swing.table.DefaultTableModel;

// import Util.JDBCUtil;

// public class NhapHangDAO {

//     public void loadDataToTable_KhoHang(JTable table) {
//         try(Connection c = JDBCUtil.getConnection()) {
//           Statement stmt = c.createStatement();
//           String loadDataTable_KhoHang = "select MaNguyenLieu, TenNguyenLieu, KhoiLuongNguyenLieu from NguyenLieu";
//           ResultSet rs = stmt.executeQuery(loadDataTable_KhoHang);
//           DefaultTableModel model = (DefaultTableModel) table.getModel();
//           model.setRowCount(0);
//           while (rs.next()) {
//             model.addRow(new Object[] {rs.getString("MaNguyenLieu"), rs.getString("TenNguyenLieu"), rs.getString("KhoiLuongNguyenLieu")});
            
//           }          
//           rs.close();
//           stmt.close();
//           c.close();
          
//         } catch (Exception e) {
//           e.printStackTrace();
//         }
//     }
// }
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import Util.JDBCUtil;

public class NhapHangDAO {
    public NhapHangDAO() {
    }

    public ArrayList<Object[]> getDataFromDatabase() {
        ArrayList<Object[]> data = new ArrayList<>();
        try (Connection c = JDBCUtil.getConnection()) {
            Statement stmt = c.createStatement();
            String loadDataTable_KhoHang = "select MaNguyenLieu, TenNguyenLieu, KhoiLuongNguyenLieu from NguyenLieu";
            ResultSet rs = stmt.executeQuery(loadDataTable_KhoHang);

            while (rs.next()) {
                String maNguyenLieu = rs.getString("MaNguyenLieu");
                String tenNguyenLieu = rs.getString("TenNguyenLieu");
                double khoiLuong = rs.getDouble("KhoiLuongNguyenLieu");
                data.add(new Object[]{maNguyenLieu, tenNguyenLieu, khoiLuong});
            }

            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
   
    public ArrayList<Object[]> searchNguyenLieuByMa(String maNguyenLieu) {
        ArrayList<Object[]> data = new ArrayList<>();
        try (Connection c = JDBCUtil.getConnection()) {
            Statement stmt = c.createStatement();
            String sql = "SELECT MaNguyenLieu, TenNguyenLieu, KhoiLuongNguyenLieu " +
                         "FROM NguyenLieu " +
                         "WHERE MaNguyenLieu LIKE '%" + maNguyenLieu + "%' " +
                         "ORDER BY CAST(SUBSTRING(MaNguyenLieu, 3, LEN(MaNguyenLieu) - 2) AS INT) ";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String maNguyenLieuResult = rs.getString("MaNguyenLieu");
                String tenNguyenLieu = rs.getString("TenNguyenLieu");
                double khoiLuongNguyenLieu = rs.getDouble("KhoiLuongNguyenLieu");
                data.add(new Object[]{maNguyenLieuResult, tenNguyenLieu, khoiLuongNguyenLieu});
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

     
          
}