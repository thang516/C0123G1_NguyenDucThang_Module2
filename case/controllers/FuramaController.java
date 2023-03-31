package controllers;

import java.util.Scanner;

public class FuramaController {

    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Mời bạn chọn chức năng" +
                    "\n 1.Employee Management " +
                    "\n 2. Customer Management" +
                    "\n 3.Facility Management " +
                    "\n 4.Booking Management " +
                    "\n 5.Promotion Management " +
                    "\n 6.Exit");
            System.out.println("Mời bạn chọn chức năng");
            int choosen = Integer.parseInt(scanner.nextLine());
            switch (choosen) {
                case 1:
                    EmployeeManagement.displayMenu();
                    break;
                case 2:
                    CustomerManagement.displayMenu();
                    break;
                case 3:
                    FacilityManagement.displayMenu();
                    break;
                case 4:
                    BookingManagement.displayMenu();
                    break;
                case 5:
                    PromotionManagement.displayMenu();
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("Số bạn nhập không hợp lệ ");
                    break;
            }
        }
        while (flag);
    }
}
