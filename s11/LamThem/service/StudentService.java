package service;

import models.Student;

import java.util.*;

public class StudentService implements IStudent {
    static ArrayList<Student> arrayList = new ArrayList<>();
    static Student student = new Student(01, "Nguyễn Đức Thắng", "05/06", "Nam", "C0123G1", 9);
    static Student student1 = new Student(02, "Nguyễn Nga", "18/01", " Nữ", "C0123G1", 10);
    static Student student2 = new Student(03, "Nguyên Thảo ", "20/01", " Nữ", "C0123G1", 10);

    static {
        arrayList.add(student);
        arrayList.add(student1);
        arrayList.add(student2);
    }

    @Override
    public void display() {
        for (Student x : arrayList) {
            System.out.println(x);
        }
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã của bạn zô  ");
        int ma = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên của  bạn  zô ");
        String ten = scanner.nextLine();
        System.out.println("Nhập ngày sinh  bạn ");
        String ngaySinh = scanner.nextLine();
        System.out.println("Nhập giới tính của  bạn ");
        String gioiTinh = scanner.nextLine();
        System.out.println("Nhập lớp của  bạn ");
        String lop = scanner.nextLine();
        System.out.println("Nhập điểm của bạn ");
        int diem = Integer.parseInt(scanner.nextLine());

        Student student3 = new Student(ma, ten, ngaySinh, gioiTinh, lop, diem);
        arrayList.add(student3);


    }


    public boolean kiemTra(int maHocSinh) {

        for (Student i : arrayList) {
            if (maHocSinh == i.getMa()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void delete(int maHocSinh) {
        for (Student i : arrayList) {
            if (maHocSinh == i.getMa()) {
                arrayList.remove(i);
                break;
            }
        }

    }
}
