package lam_lai;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManager {
    static Student[] students = new Student[10];

    static {
        students[0] = new Student(1, "Đức thắng", "Male");
        students[1] = new Student(2, " Thảo", "female");
        students[2] = new Student(3, "Quỳnh", "Female");
    }

    public void display() {
        for (Student s : students) {
            if (s != null) {
                System.out.println(s);
            } else {
                break;
            }
        }
    }

    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id của bạn ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên của bạn zo");
        String name = scanner.nextLine();
        System.out.println("Nhập giới tính của bạn");
        String gender = scanner.nextLine();
        Student student = new Student(id, name, gender);
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    public void delete() {
        int index = 0;
        Student[] arr = new Student[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id Bạn muốn xóa");
        int idXoa = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && idXoa != students[i].getId()) {
                arr[index] = students[i];
                index++;
            }
        }
        students = arr;
    }
}
