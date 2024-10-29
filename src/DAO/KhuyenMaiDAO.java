/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.KhuyenMaiDTO;
import Util.JDBCUtil;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Nguyen Khoi
 */
public class KhuyenMaiDAO {
    public ArrayList<KhuyenMaiDTO> getListKhuyenMai() {
        ArrayList<KhuyenMaiDTO> dskm = new ArrayList<>();
        try {
            String sql = "SELECT * FROM KhuyenMai ORDER BY MaKhuyenMai DESC";
            Statement stmt = Objects.requireNonNull(JDBCUtil.getConnection()).createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                KhuyenMaiDTO km = new KhuyenMaiDTO();
                km.setMaKhuyenMai(rs.getString(1));
                km.setTenKhuyenMai(rs.getString(2));
                km.setNgayBatDauKhuyenMai(rs.getDate(3));
                km.setNgayKetThucKhuyenMai(rs.getDate(4));
                km.setPhanTramKhuyenMai(rs.getFloat(5));
                km.setDieuKienKhuyenMai(rs.getInt(6));           
                dskm.add(km);
            }
        } catch (SQLException ex) {
            return null;
        }
        return dskm;
    }
    
    
}
