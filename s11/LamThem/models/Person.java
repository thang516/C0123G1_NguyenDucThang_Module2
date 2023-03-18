package models;

public class Person {
    protected int ma;
    protected String ten;
    protected String ngaySinh;
    protected String gioiTinh;

    public Person() {
    }

    public Person(int ma, String ten, String ngaySinh, String gioiTinh) {
        this.ma = ma;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "Person : " +
                " mã : " + this.getMa() +
                ", tên : '" + this.getTen() + '\'' +
                ", ngày sinh  : '" + this.getNgaySinh() + '\'' +
                ", giới tính :  " + this.getGioiTinh() + '\''
                ;
    }
}
