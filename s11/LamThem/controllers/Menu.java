
package controllers;

import service.InstructorService;
import service.StudentService;

import java.util.Scanner;


public class Menu {
    public static void displayMenu() {
        StudentService studentService = new StudentService();
        InstructorService instructorService = new InstructorService();

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng theo số :" +
                    "\n  1.Thêm mới học sinh    " +
                    "\n 2.Thêm mới giảng viên " +
                    "\n 3.Xóa  học sinh  " +
                    "\n 4.Xóa giảng Viên  " +
                    "\n 5.Xem danh sách học sinh " +
                    "\n 6.Xem danh sách  giảng viên" +
                    "\n 7.Thoát");
            System.out.println("Chọn chức năng ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Thêm mới học sinh  ");
                    studentService.add();
                    break;
                case 2:
                    System.out.println("Thêm mới giảng  viên  ");
                    instructorService.add();
                    break;

                case 3:
                    System.out.println("Xóa  học sinh");

                    System.out.println("Nhập mã học sinh zo ");
                    int maHocSinh = Integer.parseInt(scanner.nextLine());

                    boolean check = studentService.kiemTra(maHocSinh);
                    if (check) {
                        System.out.println("Vui  lòng xác nhận có xóa hay ko ");
                        boolean flag1 = true;
                        do {
                            System.out.println("1. Xóa " +
                                    "\n 2.Không xóa ");
                            int choosen = Integer.parseInt(scanner.nextLine());
                            switch (choosen) {
                                case 1:
                                    studentService.delete(maHocSinh);
                                    flag1 = false;
                                    break;
                                default:
                                    System.out.println("không xóa ");
                                    flag1 = false;
                                    break;
                            }
                        }
                        while (flag1);
                    } else {
                        System.out.println(" Xóa không thành công  ");
                    }

                    break;
                case 4:
                    System.out.println("Xóa giảng viên   ");
                    System.out.println("nhập mã giảng viên zô ");
                    int maGiangVien = Integer.parseInt(scanner.nextLine());
                    boolean check1 = instructorService.kiemTra(maGiangVien);
                    if (check1) {
                        System.out.println("Xác nhận có xóa hay không ");
                        boolean flag2 = true;
                        do {
                            System.out.println("1.xóa " +
                                    "\n 2.không xóa ");
                            int choosen1 = Integer.parseInt(scanner.nextLine());
                            switch (choosen1) {
                                case 1:
                                    instructorService.delete(maGiangVien);
                                    flag2 = false;
                                    break;
                                default:
                                    System.out.println("Bạn đã không xóa ");
                                    flag2 = false;
                                    break;
                            }
                        }
                        while (flag2);
                    } else {
                        System.out.println("Xóa không thành công ");
                    }
                    break;
                case 5:
                    System.out.println("Xem danh sách học sinh");
                    studentService.display();
                    break;
                case 6:
                    System.out.println("Xem danh sách giảng viên");
                    instructorService.display();
                    break;
                case 7:
                    System.out.println("Thoát chương trình ");
                    flag = false;
                    break;
                default:
                    System.out.println("Bạn nhập số không hợp lệ");
                    break;
            }
        }

        while (flag);
    }
}
