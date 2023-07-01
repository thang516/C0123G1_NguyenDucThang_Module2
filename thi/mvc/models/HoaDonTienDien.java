package mvc.models;

public class HoaDonTienDien {
    private String maHoaDon;
    private String hoVaTen;
    private String loaiKhach;
    private int dinhMuc;

    public HoaDonTienDien(String maHoaDon, String hoVaTen, String loaiKhach, int dinhMuc) {
        this.maHoaDon = maHoaDon;
        this.hoVaTen = hoVaTen;
        this.loaiKhach = loaiKhach;
        this.dinhMuc = dinhMuc;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public int getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(int dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    @Override
    public String toString() {
        return "HoaDonTienDien{" +
                "maHoaDon='" + maHoaDon + '\'' +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", loaiKhach='" + loaiKhach + '\'' +
                ", dinhMuc='" + dinhMuc + '\'' +
                '}';
    }

    public String ghiThongTinThanhChuoi() {
        return maHoaDon + "," + hoVaTen + "," + loaiKhach + "," + dinhMuc;
    }
}
