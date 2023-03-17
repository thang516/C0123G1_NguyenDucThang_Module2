package models;

public class GiangVien extends Person {
    private  String chuyenMon;

    public GiangVien() {
    }
    public GiangVien(int ma, String ten, String ngaySinh, String gioiTinh, String chuyenMon) {
        super(ma, ten, ngaySinh, gioiTinh);
        this.chuyenMon = chuyenMon;
    }

    public String getChuyenMon() {
        return chuyenMon;
    }

    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }


}
