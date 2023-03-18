package models;

public class Instructor extends Person {
    private String chuyenMon;

    public Instructor() {
    }

    public Instructor(int ma, String ten, String ngaySinh, String gioiTinh, String chuyenMon) {
        super(ma, ten, ngaySinh, gioiTinh);
        this.chuyenMon = chuyenMon;
    }

    public String getChuyenMon() {
        return chuyenMon;
    }

    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }

    @Override
    public String toString() {
        return " Giảng Viên :  " +
                " chuyên môn : '" + this.getChuyenMon() + '\'' +
                ", mã : " + this.getMa() +
                ", tên  : '" + this.getTen() + '\'' +
                ", ngày sinh :'" + this.getNgaySinh() + '\'' +
                ", giới tính  '" + this.getGioiTinh() + '\'';
    }
}
