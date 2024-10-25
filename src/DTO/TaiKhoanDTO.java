package DTO;

public class TaiKhoanDTO {

    private String maTaiKhoan;
    private String tenDangNhap;
    private String matKhau;
    private String maPhanQuyen;
    private String maNhanVien;
    private boolean trangThaiTaiKhoan;

    public TaiKhoanDTO(String maTaiKhoan, String tenDangNhap, String matKhau, String maPhanQuyen, String maNhanVien, boolean trangThaiTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.maPhanQuyen = maPhanQuyen;
        this.maNhanVien = maNhanVien;
        this.trangThaiTaiKhoan = trangThaiTaiKhoan;
    }

    public String getMaTaiKhoan() {
        return maTaiKhoan;
    }

    public void setMaTaiKhoan(String maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getMaPhanQuyen() {
        return maPhanQuyen;
    }

    public void setMaPhanQuyen(String maPhanQuyen) {
        this.maPhanQuyen = maPhanQuyen;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public boolean isTrangThaiTaiKhoan() {
        return trangThaiTaiKhoan;
    }

    public void setTrangThaiTaiKhoan(boolean trangThaiTaiKhoan) {
        this.trangThaiTaiKhoan = trangThaiTaiKhoan;
    }
    public boolean getTrangThaiTaiKhoan() {
        return trangThaiTaiKhoan;
    }

    @Override
    public String toString() {
        return "TaiKhoanDTO{"
                + "maTaiKhoan='" + maTaiKhoan + '\''
                + ", tenDangNhap='" + tenDangNhap + '\''
                + ", matKhau='" + matKhau + '\''
                + ", maPhanQuyen='" + maPhanQuyen + '\''
                + ", maNhanVien='" + maNhanVien + '\''
                + ", trangThaiTaiKhoan=" + trangThaiTaiKhoan
                + '}';
    }

    public static void main(String[] args) {
        TaiKhoanDTO taiKhoan = new TaiKhoanDTO("TK001", "user1", "password123", "PQ001", "NV001", true);
        System.out.println(taiKhoan.toString());
    }
}
