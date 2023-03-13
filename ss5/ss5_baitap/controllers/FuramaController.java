package controllers;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMenu();
    }

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
                    System.out.println("Employee Management");
                    System.out.println("--------------------");
                    boolean flag1 = true;
                    do {
                        System.out.println("Bạn có thể chọn thêm  chức năng " +
                                "\n 1.Display list employees" +
                                "\n 2.Add new employee" +
                                "\n 3.Edit  employee" +
                                "\n 4. Return main menu ");
                        int choosen1 = Integer.parseInt(scanner.nextLine());
                        switch (choosen1) {
                            case 1:
                                System.out.println("Display list employee ");
                                System.out.println("--------------------");
                                break;
                            case 2:
                                System.out.println("Add new employee ");
                                System.out.println("--------------------");
                                break;
                            case 3:
                                System.out.println("Edit employee ");
                                System.out.println("--------------------");
                                break;
                            default:
                                System.out.println("Return menu");
                                System.out.println("--------------------");
                                flag1 = false;
                                break;
                        }
                    }
                    while (flag1);
                    break;
                case 2:
                    System.out.println("Customer Management");
                    System.out.println("--------------------");
                    boolean flag2 = true;
                    do {
                        System.out.println("Bạn có thể chọn thêm  chức năng " +
                                "\n 1.Display list customers" +
                                "\n 2.Add new customer" +
                                "\n 3.Edit  customer" +
                                "\n 4. Return main menu ");
                        int choosen2 = Integer.parseInt(scanner.nextLine());
                        switch (choosen2) {
                            case 1:
                                System.out.println("Display list  customers");
                                System.out.println("--------------------");
                                break;
                            case 2:
                                System.out.println("Add new customer ");
                                System.out.println("--------------------");
                                break;
                            case 3:
                                System.out.println("Edit employee customer ");
                                System.out.println("--------------------");
                                break;
                            default:
                                System.out.println("Return menu");
                                System.out.println("--------------------");
                                flag2 = false;
                                break;
                        }
                    }
                    while (flag2);
                    break;
                case 3:
                    System.out.println("Facility Management");
                    System.out.println("--------------------");
                    boolean flag3 = true;
                    do {
                        System.out.println("Bạn có thể chọn thêm  chức năng " +
                                "\n 1.Display list facility" +
                                "\n 2.Add new facility" +
                                "\n 3.Display list facility maintenance" +
                                "\n 4. Return main menu ");
                        int choosen3 = Integer.parseInt(scanner.nextLine());
                        switch (choosen3) {
                            case 1:
                                System.out.println("Display list  facility");
                                System.out.println("--------------------");
                                break;
                            case 2:
                                System.out.println("Add new facility ");
                                System.out.println("--------------------");
                                break;
                            case 3:
                                System.out.println("Display list facility maintenance ");
                                System.out.println("--------------------");
                                break;
                            default:
                                System.out.println("Return menu");
                                System.out.println("--------------------");
                                flag3 = false;
                                break;
                        }
                    }
                    while (flag3);
                    break;
                case 4:
                    System.out.println("Booking  Management");
                    System.out.println("--------------------");
                    boolean flag4 = true;
                    do {
                        System.out.println("Bạn có thể chọn thêm  chức năng " +
                                "\n 1.Add new booking" +
                                "\n 2.Display list booking" +
                                "\n 3.Create new contract" +
                                "\n 4. Display list contracts " +
                                "\n 5.Edit contracts" +
                                "\n 6 Return main menu");
                        int choosen4 = Integer.parseInt(scanner.nextLine());
                        switch (choosen4) {
                            case 1:
                                System.out.println("Add new booking");
                                System.out.println("--------------------");
                                break;
                            case 2:
                                System.out.println("Display list booking ");
                                System.out.println("--------------------");
                                break;
                            case 3:
                                System.out.println("Create new contract ");
                                System.out.println("--------------------");
                                break;
                            case 4:
                                System.out.println("Display list contracts ");
                                System.out.println("--------------------");
                                break;
                            case 5:
                                System.out.println("Edit contracts");
                                System.out.println("--------------------");
                                break;
                            case 6:
                                flag4 = false;
                                System.out.println("--------------------");
                                break;
                            default:
                                System.out.println("--------------------");
                                break;
                        }
                    }
                    while (flag4);
                    break;
                case 5:
                    System.out.println("Promotion Management");
                    System.out.println("--------------------");
                    boolean flag5 = true;
                    do {
                        System.out.println("Bạn có thể chọn thêm  chức năng " +
                                "\n 1.Display list customers use service" +
                                "\n 2.Display list customers get voucher" +
                                "\n 6 Return main menu");
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
                            default:
                                System.out.println("Return menu");
                                System.out.println("--------------------");
                                flag5 = false;
                                break;
                        }
                    }
                    while (flag5);
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
