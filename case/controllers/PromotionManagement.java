package controllers;

import java.util.Scanner;

public class PromotionManagement {
    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Promotion Management");
        System.out.println("--------------------");
        boolean flag5 = true;
        do {
            System.out.println("Bạn có thể chọn thêm  chức năng " +
                    "\n 1.Display list customers use service" +
                    "\n 2.Display list customers get voucher" +
                    "\n 3. Return main menu");
            int choosen5 = Integer.parseInt(scanner.nextLine());
            switch (choosen5) {
                case 1:
                    System.out.println("Display list customers use service");
                    System.out.println("--------------------");
                    break;
                case 2:
                    System.out.println("Display list customers get voucher ");
                    System.out.println("--------------------");
                    break;
                case 3:
                    System.out.println("Return menu");
                    flag5 = false;
                    break;
                default:
                    System.out.println("Bạn nhập ko hợp lệ");
                    break;
            }
        }
        while (flag5);
    }
}
