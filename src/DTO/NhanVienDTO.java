package DTO;

public class NhanVienDTO {

    private int MaNhanVien;
    private String TenNhanVien;
    private String GioiTinhNhanVien;
    private String SoDienThoaiNhanVien;
    private String NgaySinhNhanVien;
    private String ChucVuNhanVien;
    private int DiaChi;
    private int LuongNhanVien;
    private int TrangThaiNhanVien;

    public NhanVienDTO(){

    }
    
    public NhanVienDTO(int maNhanVien, String tenNhanVien, String gioiTinhNhanVien, String soDienThoaiNhanVien,
            String ngaySinhNhanVien, String chucVuNhanVien, int diaChi, int luongNhanVien, int trangThaiNhanVien) {

        this.MaNhanVien = maNhanVien;
        this.TenNhanVien = tenNhanVien;
        this.GioiTinhNhanVien = gioiTinhNhanVien;
        this.SoDienThoaiNhanVien = soDienThoaiNhanVien;
        this.NgaySinhNhanVien = ngaySinhNhanVien;
        this.ChucVuNhanVien = chucVuNhanVien;
        this.DiaChi = diaChi;
        this.LuongNhanVien = luongNhanVien;
        this.TrangThaiNhanVien = trangThaiNhanVien;
    }
    public int getMaNhanVien() {
        return MaNhanVien;
    }
    public void setMaNhanVien(int maNhanVien) {
        this.MaNhanVien = maNhanVien;
    }
    public String getTenNhanVien() {
        return TenNhanVien;
    }
    public void setTenNhanVien(String tenNhanVien) {
        this.TenNhanVien = tenNhanVien;
    }
    public String getGioiTinhNhanVien() {
        return GioiTinhNhanVien;
    }
    public void setGioiTinhNhanVien(String gioiTinhNhanVien) {
        this.GioiTinhNhanVien = gioiTinhNhanVien;
    }
    public String getSoDienThoaiNhanVien() {
        return SoDienThoaiNhanVien;
    }
    public void setSoDienThoaiNhanVien(String soDienThoaiNhanVien) {
        this.SoDienThoaiNhanVien = soDienThoaiNhanVien;
    }
    public String getNgaySinhNhanVien() {
        return NgaySinhNhanVien;
    }
    public void setNgaySinhNhanVien(String ngaySinhNhanVien) {
        this.NgaySinhNhanVien = ngaySinhNhanVien;
    }
    public String getChucVuNhanVien() {
        return ChucVuNhanVien;
    }
    public void setChucVuNhanVien(String chucVuNhanVien) {
        this.ChucVuNhanVien = chucVuNhanVien;
    }
    public int getDiaChi() {
        return DiaChi;
    }
    public void setDiaChi(int diaChi) {
        this.DiaChi = diaChi;
    }
    public int getLuongNhanVien() {
        return LuongNhanVien;
    }
    public void setLuongNhanVien(int luongNhanVien) {
        this.LuongNhanVien = luongNhanVien;
    }
    public int getTrangThaiNhanVien() {
        return TrangThaiNhanVien;
    }
    public void setTrangThaiNhanVien(int trangThaiNhanVien) {
        this.TrangThaiNhanVien = trangThaiNhanVien;
    }

}