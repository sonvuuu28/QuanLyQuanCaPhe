package DAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import Util.JDBCUtil;


public class NccDAO {
  public ArrayList<Object[]> getDataFromDatabase() {
    ArrayList<Object[]> data = new ArrayList<>();
    try (Connection c = JDBCUtil.getConnection()) {
      Statement stmt = c.createStatement();
      String loadDataTable_KhoHang = "select MaNhaCungCap, TenNhaCungCap, DiaChiNhaCungCap, SoDienThoaiNhaCungCap from NhaCungCap";
      ResultSet rs = stmt.executeQuery(loadDataTable_KhoHang);

      while (rs.next()) {
        String maNhaCungCap = rs.getString("MaNhaCungCap");
        String tenNhaCungCap = rs.getString("TenNhaCungCap");
        String diaChi = rs.getString("DiaChiNhaCungCap");
        String soDienThoai = rs.getString("SoDienThoaiNhaCungCap");
        data.add(new Object[]{maNhaCungCap, tenNhaCungCap, diaChi, soDienThoai});
      }

      rs.close();
      stmt.close();
      c.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return data;
  }
  
}
