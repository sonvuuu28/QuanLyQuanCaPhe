package DTO;

public class UuDaiThanhVienDTO {

    private String maUuDai;
    private String tenUuDai;
    private String ngayBatDauUuDai;
    private String ngayKetThucUuDai;
    private double phanTramUuDai;
    private int dieuKienUuDai;

    public UuDaiThanhVienDTO(String maUuDai, String tenUuDai, String ngayBatDauUuDai, String ngayKetThucUuDai, double phanTramUuDai, int dieuKienUuDai) {
        this.maUuDai = maUuDai;
        this.tenUuDai = tenUuDai;
        this.ngayBatDauUuDai = ngayBatDauUuDai;
        this.ngayKetThucUuDai = ngayKetThucUuDai;
        this.phanTramUuDai = phanTramUuDai;
        this.dieuKienUuDai = dieuKienUuDai;
    }

    public String getMaUuDai() {
        return maUuDai;
    }

    public void setMaUuDai(String maUuDai) {
        this.maUuDai = maUuDai;
    }

    public String getTenUuDai() {
        return tenUuDai;
    }

    public void setTenUuDai(String tenUuDai) {
        this.tenUuDai = tenUuDai;
    }

    public String getNgayBatDauUuDai() {
        return ngayBatDauUuDai;
    }

    public void setNgayBatDauUuDai(String ngayBatDauUuDai) {
        this.ngayBatDauUuDai = ngayBatDauUuDai;
    }

    public String getNgayKetThucUuDai() {
        return ngayKetThucUuDai;
    }

    public void setNgayKetThucUuDai(String ngayKetThucUuDai) {
        this.ngayKetThucUuDai = ngayKetThucUuDai;
    }

    public double getPhanTramUuDai() {
        return phanTramUuDai;
    }

    public void setPhanTramUuDai(double phanTramUuDai) {
        this.phanTramUuDai = phanTramUuDai;
    }

    public int getDieuKienUuDai() {
        return dieuKienUuDai;
    }

    public void setDieuKienUuDai(int dieuKienUuDai) {
        this.dieuKienUuDai = dieuKienUuDai;
    }

    @Override
    public String toString() {
        return "UuDaiThanhVienDTO{"
                + "maUuDai='" + maUuDai + '\''
                + ", tenUuDai='" + tenUuDai + '\''
                + ", ngayBatDauUuDai=" + ngayBatDauUuDai
                + ", ngayKetThucUuDai=" + ngayKetThucUuDai
                + ", phanTramUuDai=" + phanTramUuDai
                + ", dieuKienUuDai=" + dieuKienUuDai
                + '}';
    }

    public static void main(String[] args) {
        UuDaiThanhVienDTO uuDai = new UuDaiThanhVienDTO("UD001", "Uu Dai 1", "21/10/2024", "21/10/2024", 15.5, 500000);
        System.out.println(uuDai.toString());
    }
}
