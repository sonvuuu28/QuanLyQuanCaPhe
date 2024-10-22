package DTO;

public class MonDTO {
    private String maMon;
    private String maLoaiMon;
    private String tenMon;
    private String maCongThuc;
    private int donGiaMon;
    private boolean trangThaiMon;

    public MonDTO(String maMon, String maLoaiMon, String tenMon, String maCongThuc, int donGiaMon, boolean trangThaiMon) {
        this.maMon = maMon;
        this.maLoaiMon = maLoaiMon;
        this.tenMon = tenMon;
        this.maCongThuc = maCongThuc;
        this.donGiaMon = donGiaMon;
        this.trangThaiMon = trangThaiMon;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getMaLoaiMon() {
        return maLoaiMon;
    }

    public void setMaLoaiMon(String maLoaiMon) {
        this.maLoaiMon = maLoaiMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public String getMaCongThuc() {
        return maCongThuc;
    }

    public void setMaCongThuc(String maCongThuc) {
        this.maCongThuc = maCongThuc;
    }

    public int getDonGiaMon() {
        return donGiaMon;
    }

    public void setDonGiaMon(int donGiaMon) {
        this.donGiaMon = donGiaMon;
    }

    public boolean isTrangThaiMon() {
        return trangThaiMon;
    }

    public void setTrangThaiMon(boolean trangThaiMon) {
        this.trangThaiMon = trangThaiMon;
    }

    @Override
    public String toString() {
        return "MonDTO{" +
                "maMon='" + maMon + '\'' +
                ", maLoaiMon='" + maLoaiMon + '\'' +
                ", tenMon='" + tenMon + '\'' +
                ", maCongThuc='" + maCongThuc + '\'' +
                ", donGiaMon=" + donGiaMon +
                ", trangThaiMon=" + trangThaiMon +
                '}';
    }

    public static void main(String[] args) {
        MonDTO mon = new MonDTO("M001", "LM001", "Cà Phê Muối", "CT001", 50000, true);
        System.out.println(mon.toString());
    }
}
