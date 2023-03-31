package controllers;

import services.CustomerService;

import java.util.Scanner;

public class CustomerManagement {
    public static void displayMenu() {
        CustomerService customerService = new CustomerService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Customer Management");
        System.out.println("--------------------");
        boolean flag2 = true;
        int employeeId;
        do {
            System.out.println("Bạn có thể chọn thêm  chức năng " +
                    "\n 1.Display list customers" +
                    "\n 2.Add new customer" +
                    "\n 3.Delete  customer" +
                    "\n 4.Edit customer " +
                    "\n 5. Return main menu ");
            int choosen2 = Integer.parseInt(scanner.nextLine());
            switch (choosen2) {
                case 1:
                    System.out.println("Display list  customers");
                    System.out.println("--------------------");
                    customerService.display();
                    break;
                case 2:
                    System.out.println("Add new customer ");
                    System.out.println("--------------------");
                    customerService.add();
                    break;
                case 3:
                    System.out.println("Delete employee customer ");
                    System.out.println("--------------------");
                    System.out.println("Nhập id  của bạn zô ");
                    employeeId = Integer.parseInt(scanner.nextLine());
                    boolean check = customerService.checkValue(employeeId) != -1;
                    if (check) {
                        System.out.println("Vui lòng xác nhận có xóa hay không ");
                        boolean co = true;
                        do {
                            System.out.println("1.Xóa" +
                                    "\n 2. không xóa ");
                            int chon = Integer.parseInt(scanner.nextLine());
                            switch (chon) {
                                case 1:
                                    customerService.delete(employeeId);
                                    co = false;
                                    break;
                                default:
                                    System.out.println("Không xóa ");
                                    co = false;
                                    break;
                            }
                        }
                        while (co);
                    } else {
                        System.out.println("Xóa không thành công");
                    }
                    break;
                case 4:
                    System.out.println("4.Edit customer");

                    System.out.println("Nhập id của bạn zô ");
                    employeeId = Integer.parseInt(scanner.nextLine());
                    if (customerService.checkValue(employeeId) != -1) {
                        customerService.edit(employeeId);
                    } else {
                        System.out.println("Không tìm thấy dữ liệu EROR");
                    }
                    break;
                default:
                    System.out.println("Return menu");
                    System.out.println("--------------------");
                    customerService.updateRepository();
                    flag2 = false;
                    break;
            }
        }
        while (flag2);
    }
}
