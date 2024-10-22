package DTO;

public class CongThucDTO {
    private String maCongThuc;
    private String tenCongThuc;
    private String moTaCongThuc;
    private boolean trangThaiCongThuc;

    public CongThucDTO(String maCongThuc, String tenCongThuc, String moTaCongThuc, boolean trangThaiCongThuc) {
        this.maCongThuc = maCongThuc;
        this.tenCongThuc = tenCongThuc;
        this.moTaCongThuc = moTaCongThuc;
        this.trangThaiCongThuc = trangThaiCongThuc;
    }

    public String getMaCongThuc() {
        return maCongThuc;
    }

    public void setMaCongThuc(String maCongThuc) {
        this.maCongThuc = maCongThuc;
    }

    public String getTenCongThuc() {
        return tenCongThuc;
    }

    public void setTenCongThuc(String tenCongThuc) {
        this.tenCongThuc = tenCongThuc;
    }

    public String getMoTaCongThuc() {
        return moTaCongThuc;
    }

    public void setMoTaCongThuc(String moTaCongThuc) {
        this.moTaCongThuc = moTaCongThuc;
    }

    public boolean isTrangThaiCongThuc() {
        return trangThaiCongThuc;
    }

    public void setTrangThaiCongThuc(boolean trangThaiCongThuc) {
        this.trangThaiCongThuc = trangThaiCongThuc;
    }

    @Override
    public String toString() {
        return "CongThucDTO{" +
                "maCongThuc='" + maCongThuc + '\'' +
                ", tenCongThuc='" + tenCongThuc + '\'' +
                ", moTaCongThuc='" + moTaCongThuc + '\'' +
                ", trangThaiCongThuc=" + trangThaiCongThuc +
                '}';
    }

    public static void main(String[] args) {
        CongThucDTO congThuc = new CongThucDTO("CT001", "Cà phê muối", "50g cà phê, 50g sữa, 10g muối", true);
        System.out.println(congThuc.toString());
    }
}
