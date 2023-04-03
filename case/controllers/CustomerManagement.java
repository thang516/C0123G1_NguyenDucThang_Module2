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
        String employeeId;

        do {
            System.out.println("Bạn có thể chọn thêm  chức năng " +
                    "\n 1.Display list customers" +
                    "\n 2.Add new customer" +
                    "\n 3.Delete  customer" +
                    "\n 4.Edit customer " +
                    "\n 5. Return main menu ");
            try {
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
                        System.out.print("Nhập id  của bạn zô ");
                        employeeId = scanner.nextLine();
                        boolean check = customerService.checkValue(employeeId) != "0";
                        if (check) {
                            System.out.print("Vui lòng xác nhận có xóa hay không ");
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

                        System.out.print("Nhập id của bạn zô ");
                        employeeId = scanner.nextLine();
                        if (customerService.checkValue(employeeId) != "0") {
                            customerService.edit(employeeId);
                        } else {
                            System.out.println("Không tìm thấy dữ liệu EROR");
                        }
                        break;
                    case 5:
                        System.out.println("Return menu");
                        customerService.updateRepository();
                        flag2 = false;
                        break;
                    default:
                        System.out.println("Số bạn nhập không hợp lệ");
                }
            } catch (Exception e) {
                System.out.println("Nhập sai rồi nhập lại đi nghe ^ ^");
            }
        } while (flag2);

    }
}
