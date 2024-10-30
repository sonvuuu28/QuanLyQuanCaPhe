package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Util.*;
import DTO.ChiTietPhieuNhapDTO;

public class ChiTietPhieuNhapDAO {

  

  // Phương thức lấy danh sách chi tiết phiếu nhập dựa trên mã phiếu nhập
  public ArrayList<ChiTietPhieuNhapDTO> getListChiTietPhieuNhapByMaPN(){
    ArrayList<ChiTietPhieuNhapDTO> dsctpn = new ArrayList<>();
    try(Connection c = JDBCUtil.getConnection()){
      String sql = "select * from ChiTietPhieuNhap";
      PreparedStatement stmt = c.prepareStatement(sql);
      ResultSet rs = stmt.executeQuery();
      while(rs.next()){
        ChiTietPhieuNhapDTO ctpn = new ChiTietPhieuNhapDTO();
        ctpn.setMaPhieuNhap(rs.getString("MaPhieuNhap"));
        ctpn.setMaNguyenLieu(rs.getString("MaNguyenLieu"));
        ctpn.setDonGia(rs.getInt("DonGia"));
        ctpn.setThanhTien(rs.getInt("ThanhTien"));
        ctpn.setKhoiLuong(rs.getInt("KhoiLuong"));
        
        dsctpn.add(ctpn);
      }
  }catch(SQLException e){
    e.printStackTrace();
  }
  return dsctpn;
  }

    // Phương thức thêm một chi tiết phiếu nhập mới vào cơ sở dữ liệu
    public boolean addChiTietPhieuNhap(ChiTietPhieuNhapDTO ctpn){
      try(Connection c = JDBCUtil.getConnection()){
        String sqlUdateSP = "update NguyenLieu set SoLuong = SoLuong + ? where MaNguyenLieu = ?";
        PreparedStatement stmtUpdateSP = c.prepareStatement(sqlUdateSP);
        stmtUpdateSP.setFloat(1, ctpn.getKhoiLuong());
        stmtUpdateSP.setString(2, ctpn.getMaNguyenLieu());
        stmtUpdateSP.executeUpdate();
        
        String sql = "insert into ChiTietPhieuNhap values(MaPhieuNhap, MaNguyenLieu, DonGia, ThanhTien, KhoiLuong) values(?,?,?,?,?)";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, ctpn.getMaPhieuNhap());
        stmt.setString(2, ctpn.getMaNguyenLieu());
        stmt.setInt(3, ctpn.getDonGia());
        stmt.setInt(4, ctpn.getThanhTien());
        stmt.setFloat(5, ctpn.getKhoiLuong());
        int rowAffected = stmt.executeUpdate();
        return rowAffected > 0;
      }catch(SQLException e){
        e.printStackTrace();
        return false;
      }
    }

    // Phương thức cập nhật thông tin một chi tiết phiếu nhập trong cơ sở dữ liệu
    public boolean updateChiTietPhieuNhap(ChiTietPhieuNhapDTO ctpn){
      try(Connection c = JDBCUtil.getConnection()){
        String sql = "update ChiTietPhieuNhap set DonGia = ?,ThanhTien = ?, KhoiLuong = ? where MaPhieuNhap = ? and MaNguyenLieu = ?" ;
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, ctpn.getDonGia());
        stmt.setInt(2, ctpn.getThanhTien());
        stmt.setFloat(3, ctpn.getKhoiLuong());
        stmt.setString(4, ctpn.getMaPhieuNhap());
        stmt.setString(5, ctpn.getMaNguyenLieu());


        int rowAffected = stmt.executeUpdate();
        return rowAffected > 0;
      }catch(SQLException e){
        e.printStackTrace();
        return false;
      }
    }

    // Phương thức xóa một chi tiết phiếu nhập khỏi cơ sở dữ liệu
    public boolean deleteChiTietPhieuNhap(String maPhieuNhap, String maNguyenLieu){
      try(Connection c = JDBCUtil.getConnection()){
        String sql = "delete from ChiTietPhieuNhap where MaPhieuNhap = ? and MaNguyenLieu = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, maPhieuNhap);
        stmt.setString(2, maNguyenLieu);
        int rowAffected = stmt.executeUpdate();
        return rowAffected > 0;
      }catch(SQLException e){
        e.printStackTrace();
        return false;
      }
    }

    public ChiTietPhieuNhapDTO timkiemChiTietPhieuNhapDTO(String maPhieuNhap, String maNguyenLieu){
      ChiTietPhieuNhapDTO ctpn = null;
      try(Connection c = JDBCUtil.getConnection()){
        String sql = "select * from ChiTietPhieuNhap where MaPhieuNhap = ? and MaNguyenLieu = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, maPhieuNhap);
        stmt.setString(2, maNguyenLieu);
        ResultSet rs = stmt.executeQuery();
        if(rs.next()){
          ctpn.setMaPhieuNhap(rs.getString("MaPhieuNhap"));
          ctpn.setMaNguyenLieu(rs.getString("MaNguyenLieu"));
          ctpn.setDonGia(rs.getInt("DonGia"));
          ctpn.setThanhTien(rs.getInt("ThanhTien"));
          ctpn.setKhoiLuong(rs.getInt("KhoiLuong"));
        }
      }catch(SQLException e){
        e.printStackTrace();
      }
      return ctpn;
    }

    public ChiTietPhieuNhapDTO getChiTietPhieuNhapByMaNguyenLieu(String maNguyenLieu){
      ChiTietPhieuNhapDTO ctpn = null;
      try(Connection c = JDBCUtil.getConnection()){
        String sql = "select * from ChiTietPhieuNhap where MaNguyenLieu = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, maNguyenLieu);
        ResultSet rs = stmt.executeQuery();
        if(rs.next()){
          ctpn.setMaPhieuNhap(rs.getString("MaPhieuNhap"));
          ctpn.setMaNguyenLieu(rs.getString("MaNguyenLieu"));
          ctpn.setDonGia(rs.getInt("DonGia"));
          ctpn.setThanhTien(rs.getInt("ThanhTien"));
          ctpn.setKhoiLuong(rs.getInt("KhoiLuong"));
        }
    }catch(SQLException e){
      e.printStackTrace();
    }
    return ctpn;
  }



}
