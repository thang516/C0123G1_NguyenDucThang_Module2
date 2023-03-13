package lam_lai;

import java.util.*;

public class DanhSachSinhVienNangCao {
    private ArrayList<SinhVienNangCao> danhSach;

    public DanhSachSinhVienNangCao() {
        this.danhSach = new ArrayList<SinhVienNangCao>();
    }

    public DanhSachSinhVienNangCao(ArrayList<SinhVienNangCao> danhSach) {
        this.danhSach = danhSach;
    }

    public void themSinhVien(SinhVienNangCao sv) {
        this.danhSach.add(sv);
    }

    public void inDanhSachSinhVien() {
        for (SinhVienNangCao sinhVien : danhSach) {
            System.out.println(sinhVien);
        }
    }

    public boolean kiemTraDanhSachRong() {
        return this.danhSach.isEmpty();
    }

    public int laySoLuongSinhVien() {
        return this.danhSach.size();
    }

    public void lamRongDanhSach() {
        this.danhSach.removeAll(danhSach);
    }

    public boolean kiemTraTonTai(SinhVienNangCao sv) {
        return this.danhSach.contains(sv);
    }

    public boolean xoaSinhVien(SinhVienNangCao sv) {
        return this.danhSach.remove(sv);
    }

    public void timSinhVien(String ten) {
        for (SinhVienNangCao sinhVien : danhSach) {
            if (sinhVien.getHoVaTen().indexOf(ten) >= 0) {
                System.out.println(sinhVien);
            }
        }
    }

}
