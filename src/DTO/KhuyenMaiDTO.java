package DTO;

public class KhuyenMaiDTO {
    private String maKhuyenMai;
    private String tenKhuyenMai;
    private String ngayBatDauKhuyenMai;
    private String ngayKetThucKhuyenMai;
    private double phanTramKhuyenMai;
    private int dieuKienKhuyenMai;

    public KhuyenMaiDTO(String maKhuyenMai, String tenKhuyenMai, String ngayBatDauKhuyenMai, String ngayKetThucKhuyenMai, double phanTramKhuyenMai, int dieuKienKhuyenMai) {
        this.maKhuyenMai = maKhuyenMai;
        this.tenKhuyenMai = tenKhuyenMai;
        this.ngayBatDauKhuyenMai = ngayBatDauKhuyenMai;
        this.ngayKetThucKhuyenMai = ngayKetThucKhuyenMai;
        this.phanTramKhuyenMai = phanTramKhuyenMai;
        this.dieuKienKhuyenMai = dieuKienKhuyenMai;
    }

    public String getMaKhuyenMai() {
        return maKhuyenMai;
    }

    public void setMaKhuyenMai(String maKhuyenMai) {
        this.maKhuyenMai = maKhuyenMai;
    }

    public String getTenKhuyenMai() {
        return tenKhuyenMai;
    }

    public void setTenKhuyenMai(String tenKhuyenMai) {
        this.tenKhuyenMai = tenKhuyenMai;
    }

    public String getNgayBatDauKhuyenMai() {
        return ngayBatDauKhuyenMai;
    }

    public void setNgayBatDauKhuyenMai(String ngayBatDauKhuyenMai) {
        this.ngayBatDauKhuyenMai = ngayBatDauKhuyenMai;
    }

    public String getNgayKetThucKhuyenMai() {
        return ngayKetThucKhuyenMai;
    }

    public void setNgayKetThucKhuyenMai(String ngayKetThucKhuyenMai) {
        this.ngayKetThucKhuyenMai = ngayKetThucKhuyenMai;
    }

    public double getPhanTramKhuyenMai() {
        return phanTramKhuyenMai;
    }

    public void setPhanTramKhuyenMai(double phanTramKhuyenMai) {
        this.phanTramKhuyenMai = phanTramKhuyenMai;
    }

    public int getDieuKienKhuyenMai() {
        return dieuKienKhuyenMai;
    }

    public void setDieuKienKhuyenMai(int dieuKienKhuyenMai) {
        this.dieuKienKhuyenMai = dieuKienKhuyenMai;
    }

    @Override
    public String toString() {
        return "KhuyenMaiDTO{" +
                "maKhuyenMai='" + maKhuyenMai + '\'' +
                ", tenKhuyenMai='" + tenKhuyenMai + '\'' +
                ", ngayBatDauKhuyenMai=" + ngayBatDauKhuyenMai +
                ", ngayKetThucKhuyenMai=" + ngayKetThucKhuyenMai +
                ", phanTramKhuyenMai=" + phanTramKhuyenMai +
                ", dieuKienKhuyenMai=" + dieuKienKhuyenMai +
                '}';
    }

    public static void main(String[] args) {
        KhuyenMaiDTO khuyenMai = new KhuyenMaiDTO("KM001", "Khuyen Mai 1", "21/10/2024", "21/12/2024", 10.5, 1000000);
        System.out.println(khuyenMai.toString());
    }
}
