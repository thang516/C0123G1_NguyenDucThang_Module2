package controllers;

import services.lpml.BookingService;

import java.util.Scanner;

public class BookingManagement {
    public static void displayMenu() {
        BookingService bookingService = new BookingService();
        Scanner scanner = new Scanner(System.in);
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
                    bookingService.display();
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
                    break;
                default:
                    System.out.println("Bạn nhập không hợp lệ ");
                    break;
            }
        }
        while (flag4);
    }
}
