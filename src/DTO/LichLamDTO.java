package DTO;

public class LichLamDTO {

    private String maCaLam;
    private String maNhanVien;
    private String ngayLam;

    public LichLamDTO(String maCaLam, String maNhanVien, String ngayLam) {
        this.maCaLam = maCaLam;
        this.maNhanVien = maNhanVien;
        this.ngayLam = ngayLam;
    }

    public String getMaCaLam() {
        return maCaLam;
    }

    public void setMaCaLam(String maCaLam) {
        this.maCaLam = maCaLam;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getNgayLam() {
        return ngayLam;
    }

    public void setNgayLam(String ngayLam) {
        this.ngayLam = ngayLam;
    }

    @Override
    public String toString() {
        return "LichLamDTO{"
                + "maCaLam='" + maCaLam + '\''
                + ", maNhanVien='" + maNhanVien + '\''
                + ", ngayLam=" + ngayLam
                + '}';
    }

    public static void main(String[] args) {
        LichLamDTO lichLamDTO = new LichLamDTO("CL001", "NV001", "21/10/2024");
        System.out.println(lichLamDTO.toString());
    }
}
