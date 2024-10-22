package DTO;

public class PhieuNhapDTO {

    private String maPhieuNhap;
    private String ngayLapPhieuNhap;
    private int tongTienPhieuNhap;
    private String maNhanVien;
    private String maNhaCungCap;

    public PhieuNhapDTO(String maPhieuNhap, String ngayLapPhieuNhap, int tongTienPhieuNhap, String maNhanVien, String maNhaCungCap) {
        this.maPhieuNhap = maPhieuNhap;
        this.ngayLapPhieuNhap = ngayLapPhieuNhap;
        this.tongTienPhieuNhap = tongTienPhieuNhap;
        this.maNhanVien = maNhanVien;
        this.maNhaCungCap = maNhaCungCap;
    }

    public String getMaPhieuNhap() {
        return maPhieuNhap;
    }

    public void setMaPhieuNhap(String maPhieuNhap) {
        this.maPhieuNhap = maPhieuNhap;
    }

    public String getNgayLapPhieuNhap() {
        return ngayLapPhieuNhap;
    }

    public void setNgayLapPhieuNhap(String ngayLapPhieuNhap) {
        this.ngayLapPhieuNhap = ngayLapPhieuNhap;
    }

    public int getTongTienPhieuNhap() {
        return tongTienPhieuNhap;
    }

    public void setTongTienPhieuNhap(int tongTienPhieuNhap) {
        this.tongTienPhieuNhap = tongTienPhieuNhap;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getMaNhaCungCap() {
        return maNhaCungCap;
    }

    public void setMaNhaCungCap(String maNhaCungCap) {
        this.maNhaCungCap = maNhaCungCap;
    }

    @Override
    public String toString() {
        return "PhieuNhapDTO{"
                + "maPhieuNhap='" + maPhieuNhap + '\''
                + ", ngayLapPhieuNhap=" + ngayLapPhieuNhap
                + ", tongTienPhieuNhap=" + tongTienPhieuNhap
                + ", maNhanVien='" + maNhanVien + '\''
                + ", maNhaCungCap='" + maNhaCungCap + '\''
                + '}';
    }

    public static void main(String[] args) {
        PhieuNhapDTO phieuNhap = new PhieuNhapDTO("PN001", "21/11/2024", 1000000, "NV001", "NCC001");
        System.out.println(phieuNhap.toString());
    }
}
