package baitap_ss16.copy_read_csv;

public class Country {
    private int soThuTu;
    private String vietTat;
    private String ten;

    public Country(int soThuTu, String vietTat, String ten) {
        this.soThuTu = soThuTu;
        this.vietTat = vietTat;
        this.ten = ten;
    }

    public Country() {
    }

    public int getSoThuTu() {
        return soThuTu;
    }

    public void setSoThuTu(int soThuTu) {
        this.soThuTu = soThuTu;
    }

    public String getVietTat() {
        return vietTat;
    }

    public void setVietTat(String vietTat) {
        this.vietTat = vietTat;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "Country :" +
                " Số thứ tự : " + this.getSoThuTu() +
                ", Mã Quốc Gia :" + this.getVietTat() +
                ", Tên :" + this.getTen();
    }
}
