package models;

import service.IStudent;

public class Student extends Person {
        private  String lop;
        private  int diemSo;

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




}
