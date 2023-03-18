package service;

import models.Instructor;

import java.util.ArrayList;
import java.util.Scanner;

public class InstructorService implements IInstructor {
    static ArrayList<Instructor> arrayList = new ArrayList<>();
    static Instructor instructor = new Instructor(01, "Trần Văn Hữu Trung", "11/11", "Nam", "tutor");
    static Instructor instructor1 = new Instructor(02, "Chánh Trần", "12/12", "Nam", "teacher");
    static Instructor instructor2 = new Instructor(03, "Công Nguyễn ", "1/1", "Nam", "teacher");

    static {
        arrayList.add(instructor);
        arrayList.add(instructor1);
        arrayList.add(instructor2);
    }

    @Override
    public void display() {
        for (Instructor x : arrayList) {
            System.out.println(x);
        }
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã của bạn ");
        int ma = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên của bạn zô");
        String ten = scanner.nextLine();
        System.out.println("Nhập sinh nhật của bạn");
        String ngaySinh = scanner.nextLine();
        System.out.println("Nhập giới tính của bạn");
        String gioiTinh = scanner.nextLine();
        System.out.println("Nhập zô chuyên môn của bạn");
        String chuyenMon = scanner.nextLine();

        Instructor instructor3 = new Instructor(ma, ten, ngaySinh, gioiTinh, chuyenMon);
        arrayList.add(instructor3);
    }

    public boolean kiemTra(int maGiangVien) {
        for (Instructor x : arrayList) {
            if (maGiangVien == x.getMa()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void delete(int maGiangVien) {
        for (Instructor x : arrayList) {
            if (maGiangVien == x.getMa()) {
                arrayList.remove(x);
                break;
            }
        }
    }
}
