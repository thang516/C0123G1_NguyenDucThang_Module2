package on_tap.controller;

import on_tap.service.StudentService;

import java.util.Scanner;

public class Menu {

    private String id;

    public static void display(){
        StudentService studentService = new StudentService();
        Scanner scanner = new Scanner(System.in);
        boolean flag=true;
        do {
            System.out.println("Chọn chức năng " +
                    "\n 1.Display" +
                    "\n 2.Add" +
                    "\n 3.Delete" +
                    "\n 4.Exit");
            System.out.println("Chọn chức năng ");
            int choose=Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    System.out.println("1.Display");
                    studentService.display();
                    break;
                case 2:
                    System.out.println("1.Add");
                    studentService.add();
                    break;
                case 3:
                    System.out.println("1.Delete");
                    System.out.println("Nhập mã học sinh zô");
                    int maHocSinh=Integer.parseInt(scanner.nextLine());
                    boolean check= studentService.check(maHocSinh);
                    if(check){
                        System.out.println("Nhập mã học sinh");
                        boolean flag1 = true;
                        do {
                            System.out.println("1.Xóa" +
                                    "\n 2.Ko");
                            int chose=Integer.parseInt(scanner.nextLine());
                            switch (chose){
                                case 1:
                                    studentService.delete(maHocSinh);
                                    flag1=false;
                                    break;
                                default:
                                    System.out.println("Thoát");
                                    flag1=false;
                                    break;
                            }
                        }
                        while (flag1);
                    }else {
                        System.out.println("Không xóa");
                    }
                    break;

                case 4:
                    System.out.println("1.Thoát ");
                    flag=false;
                    break;
                default:
                    System.out.println("Số bạn nhập không hợp lệ");
                    break;
            }
        }
        while (flag);
    }
}
