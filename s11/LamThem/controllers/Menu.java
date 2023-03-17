package controllers;

import java.util.Scanner;


public class Menu {
    public static void displayMenu(){
        Scanner scanner =new Scanner(System.in);
        boolean flag =true;
        do{
            System.out.println("Chọn chức năng theo số :" +
                            " \n 1.Thêm mới giảng viên  "+
                    "\n 2.Xóa giảng viên hoặc học sinh "+
                    "\n 3.Xem danh sách giảng viên hoặc hoc sinh"+
                    "\n 4.Thoát");
            System.out.println("Chọn chức năng ");
            int choose =Integer.parseInt(scanner.nextLine());
                switch (choose){
                    case 1:
                    System.out.println("Chức năng thêm mới giảng viên");
                    case 2:
                        System.out.println("Xóa giảng viên hoặc học sinh");
                    case 3:
                        System.out.println("Xem danh sách giảng viên hoặc học sinh");
                    case 4:
                        System.out.println("Thoát chương trình ");
                        flag = false;
                    default:
                        System.out.println("Bạn nhập số không hợp lệ");
                }
            }

        while(false);
    }
}
