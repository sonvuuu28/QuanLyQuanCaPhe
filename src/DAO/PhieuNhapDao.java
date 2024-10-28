package DAO;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import DTO.PhieuNhapDTO;
import Util.JDBCUtil;
import Util.*;

import java.sql.Statement;
public class PhieuNhapDAO {
  public PhieuNhapDAO() {
  }

  public ArrayList<PhieuNhapDTO> getallPhieuNhap(){
    ArrayList<PhieuNhapDTO> dspn = new ArrayList<>();
    try{
      Connection c = JDBCUtil.getConnection();
      System.out.println("connect success");
      String sql = "select * from PhieuNhap";
      PreparedStatement stmt = c.prepareStatement(sql);
      ResultSet rs = stmt.executeQuery();
      while(rs.next()){
        PhieuNhapDTO pn = new PhieuNhapDTO();
        pn.setMaPhieuNhap(rs.getString(0));
        pn.setNgayLapPhieuNhap(null);
        pn.setTongTienPhieuNhap(rs.getInt(2));
        pn.setMaNhanVien(rs.getString(3));
        pn.setMaNhaCungCap(rs.getString(4));
      }
    }catch(SQLException e){
      e.printStackTrace();
      return null;
    }
    return dspn;
  }
  public boolean capNhapPhieuNhap(PhieuNhapDTO pn){
    try{
      Connection c = JDBCUtil.getConnection();
      String sql = "update PhieuNhap set NgayLapPhieuNhap = ?, TongTienPhieuNhap = ?, MaNhanVien = ? , MaNhaCungCap = ? where MaPhieuNhap = ?";
      PreparedStatement stmt = c.prepareStatement(sql);
      stmt.setDate(1, new java.sql.Date( pn.getNgayLapPhieuNhap().getTime()));
      stmt.setInt(2, pn.getTongTienPhieuNhap());
      stmt.setString(3, pn.getMaNhanVien());
      stmt.setString(4, pn.getMaNhaCungCap());
      stmt.setString(5, pn.getMaPhieuNhap());
      int rowsAffected = stmt.executeUpdate();
      return rowsAffected > 0;
    }catch(SQLException e){
      e.printStackTrace();
      return false;
    }
  }
  public String getNewId(){
    String ma = null;
    try{
      Connection c = JDBCUtil.getConnection();
      String sql = "select max(MaPhieuNhap) as MaPhieuNhap from PhieuNhap";
      Statement stmt = c.createStatement();
      ResultSet rs = stmt.executeQuery(sql);
      if(rs.next()){
        ma = rs.getString("MaPhieuNhap");
      }
      JDBCUtil.closeConnection(c);
      return ma;
    }catch(SQLException e){
      e.printStackTrace();
    }
    return ma;
  }
  public ArrayList<PhieuNhapDTO> getPhieuNhapByNgayDenVaGia(Date tuNgay, Date denNgay, int giaTu, int giaDen){
    ArrayList<PhieuNhapDTO> dspn = new ArrayList<>();
    try{
      Connection c = JDBCUtil.getConnection();
      String sql = "select * from PhieuNhap where NgayLapPhieuNhap between ? and ? and TongTienPhieuNhap between ? and ?";
      PreparedStatement stmt = c.prepareStatement(sql);
      stmt.setDate(1, (java.sql.Date)tuNgay);
      stmt.setDate(2, (java.sql.Date)denNgay);
      stmt.setInt(3, giaTu);
      stmt.setInt(4, giaDen);
      ResultSet rs = stmt.executeQuery();
      while(rs.next()){
        PhieuNhapDTO pn = new PhieuNhapDTO();
        pn.setMaPhieuNhap(rs.getString(0));
        pn.setNgayLapPhieuNhap(null);
        pn.setTongTienPhieuNhap(rs.getInt(2));
        pn.setMaNhanVien(rs.getString(3));
        pn.setMaNhaCungCap(rs.getString(4));
        dspn.add(pn);
      }
    }catch(SQLException e){
      e.printStackTrace();
      return null;
    }
    return dspn;
  }
  public ArrayList<PhieuNhapDTO> getPhieuNhapByNgayLapVaGiaTu(Date tuNgay, Date denNgay, int giaTu){
    ArrayList<PhieuNhapDTO> dspn = new ArrayList<>();
    try{
      Connection c = JDBCUtil.getConnection();
      String sql = "select * from PhieuNhap where NgayLapPhieuNhap between ? and ? and TongTienPhieuNhap >= ?";
      PreparedStatement stmt = c.prepareStatement(sql);
      stmt.setDate(1, (java.sql.Date)tuNgay);
      stmt.setDate(2, (java.sql.Date)denNgay);
      stmt.setInt(3, giaTu);
      ResultSet rs = stmt.executeQuery();
      while(rs.next()){
        PhieuNhapDTO pn = new PhieuNhapDTO();
        pn.setMaPhieuNhap(rs.getString(0));
        pn.setNgayLapPhieuNhap(null);
        pn.setTongTienPhieuNhap(rs.getInt(2));
        pn.setMaNhanVien(rs.getString(3));
        pn.setMaNhaCungCap(rs.getString(4));
        dspn.add(pn);
      }
    }catch(SQLException e){
      e.printStackTrace();
      return null;
    }
    return dspn;
  }
  public ArrayList<PhieuNhapDTO> getPhieuNhapByNgayLapVaGiaDen(Date tuNgay, Date denNgay, int giaDen){
    ArrayList<PhieuNhapDTO> dspn = new ArrayList<>();
    try{
      Connection c = JDBCUtil.getConnection();
      String sql = "select * from PhieuNhap where NgayLapPhieuNhap between ? and ? and TongTienPhieuNhap <= ?";
      PreparedStatement stmt = c.prepareStatement(sql);
      stmt.setDate(1, (java.sql.Date)tuNgay);
      stmt.setDate(2, (java.sql.Date)denNgay);
      stmt.setInt(3, giaDen);
      ResultSet rs = stmt.executeQuery();
      while(rs.next()){
        PhieuNhapDTO pn = new PhieuNhapDTO();
        pn.setMaPhieuNhap(rs.getString(0));
        pn.setNgayLapPhieuNhap(null);
        pn.setTongTienPhieuNhap(rs.getInt(2));
        pn.setMaNhanVien(rs.getString(3));
        pn.setMaNhaCungCap(rs.getString(4));
        dspn.add(pn);
      }
    }catch(SQLException e){
      e.printStackTrace();
      return null;
    }
    return dspn;
  }
  
  public PhieuNhapDTO getById(String maPhieuNhap){
    PhieuNhapDTO pn = null;
    try{
      Connection c = JDBCUtil.getConnection();
      String sql = "select * from PhieuNhap where MaPhieuNhap = ?";
      PreparedStatement stmt = c.prepareStatement(sql);
      stmt.setString(1, maPhieuNhap);
      ResultSet rs = stmt.executeQuery();
      if(rs.next()){
        pn = new PhieuNhapDTO();
        pn.setMaPhieuNhap(rs.getString(0));
        pn.setNgayLapPhieuNhap(null);
        pn.setTongTienPhieuNhap(rs.getInt(2));
        pn.setMaNhanVien(rs.getString(3));
        pn.setMaNhaCungCap(rs.getString(4));
      }
      JDBCUtil.closeConnection(c);
      return pn;
    }catch(SQLException e){
      e.printStackTrace();
      return null;
    }
  }
  //hàm tự tăng mã phiếu nhập
  // public String tuTangMaPhieuNhap() {
  //   String ma = "";
  //   try {
  //       Connection c = JDBCUtil.getConnection();
  //       String sql = "select TOP 1 MaPhieuNhap FROM PhieuNhap ORDER BY MaPhieuNhap DESC";
  //       Statement st = c.createStatement();
  //       ResultSet rs = st.executeQuery(sql);
  //       if (rs.next()) {
  //           ma = String.valueOf(Integer.parseInt(rs.getString("MaPhieuNhap").substring(2)) + 1);
  //           if(Integer.parseInt(ma)<10){
  //               ma = "PN00" + ma;
  //           }else if(10<=Integer.parseInt(ma) &&Integer.parseInt(ma)<999){
  //               ma = "PN0" + ma;
  //           }
  //           else
  //               ma = "PN" + ma;
  //       }
  //       JDBCUtil.closeConnection(c);
  //       return ma;
  //   } catch (SQLException e) {
  //       e.printStackTrace();
  //   }
  //   return ma;
  // }
  public String tuTangMaPhieuNhap() {
    String ma = "";
    try {
        Connection c = JDBCUtil.getConnection();
        String sql = "select TOP 1 MaPhieuNhap FROM PhieuNhap ORDER BY MaPhieuNhap DESC";
        Statement st = c.createStatement();
        ResultSet rs = st.executeQuery(sql);
        if (rs.next()) {
            String currentMa = rs.getString("MaPhieuNhap");
            int numberPart = Integer.parseInt(currentMa.substring(2)) + 1;
            if (numberPart < 10) {
                ma = "PQ00" + numberPart;
            } else if (numberPart < 100) {
                ma = "PN0" + numberPart;
            } else {
                ma = "PN" + numberPart;
            }
        }
        JDBCUtil.closeConnection(c);
        return ma;
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return ma;
}
}
