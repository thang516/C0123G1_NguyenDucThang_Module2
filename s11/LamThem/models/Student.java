package models;

import service.IStudent;

public class Student extends Person {
    private String lop;
    private int diemSo;

    public Student() {
    }

    public Student(int ma, String ten, String ngaySinh, String gioiTinh, String lop, int diemSo) {
        super(ma, ten, ngaySinh, gioiTinh);
        this.lop = lop;
        this.diemSo = diemSo;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public int getDiemSo() {
        return diemSo;
    }

    public void setDiemSo(int diemSo) {
        this.diemSo = diemSo;
    }

    @Override
    public String toString() {
        return "Student :" +
                "  lớp '" + this.getLop() + '\'' +
                ", điểm số : =" + this.getDiemSo() +
                ", mã  :" + this.getMa() +
                ", tên : '" + this.getTen() + '\'' +
                ", ngày Sinh : '" + this.getNgaySinh() + '\'' +
                ", giới tính :'" + this.getGioiTinh() + '\'';
    }
}
