package controllers;

import services.lpml.EmployeeService;

import java.util.Scanner;

public class EmployeeManagement {
    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeService();

        System.out.println("Employee Management");
        System.out.println("--------------------");
        boolean flag1 = true;
        do {
            System.out.println("Bạn có thể chọn thêm  chức năng " +
                    "\n 1.Display list employees" +
                    "\n 2.Add new employee" +
                    "\n 3.Delete  employee" +
                    "\n 4.Edit employee " +
                    "\n 5. Return main menu ");
            int choosen1 = Integer.parseInt(scanner.nextLine());
            switch (choosen1) {
                case 1:
                    System.out.println("Display list employee ");
                    System.out.println("--------------------");
                    employeeService.display();
                    break;
                case 2:
                    System.out.println("Add new employee ");
                    System.out.println("--------------------");
                    employeeService.add();
                    break;
                case 3:
                    System.out.println("Delete employee ");
                    System.out.println("--------------------");
                    System.out.println("Nhập vô mã nhân viên ");
                    int maNhanVien = Integer.parseInt(scanner.nextLine());
                    boolean check = employeeService.checkInput(maNhanVien) != -1;
                    if (check) {
                        System.out.println("Vui lòng xác nhận có xóa hay không");
                        boolean flag2 = true;
                        do {
                            System.out.println("1. Xóa " +
                                    "\n 2.không xóa ");
                            int choose1 = Integer.parseInt(scanner.nextLine());
                            switch (choose1) {
                                case 1:
                                    employeeService.delete(maNhanVien);
                                    flag2 = false;
                                    break;
                                default:
                                    System.out.println("Không xóa ");
                                    flag2 = false;
                                    break;
                            }
                        }
                        while (flag2);
                    } else {
                        System.out.println("Xóa không thành công ");
                    }
                    break;
                case 4:
                    System.out.println("4.Edit employee");
                    System.out.println("Nhập id của bạn  ");
                    int employeeId = Integer.parseInt(scanner.nextLine());
                    if (employeeService.checkInput(employeeId) != -1) {
                        employeeService.edit(employeeId);
                        break;
                    } else {
                        System.out.println("EROR");
                    }
                default:
                    System.out.println("Return menu");
                    System.out.println("--------------------");
                    employeeService.updateRepository();
                    flag1 = false;
                    break;
            }
        }
        while (flag1);
    }
}
