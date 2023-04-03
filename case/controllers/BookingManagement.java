package controllers;

import models.Customer;
import models.Facility;
import services.CustomerService;
import services.lpml.BookingService;
import services.lpml.ContractService;
import services.lpml.FacilityService;

import java.util.Scanner;

public class BookingManagement {
    public static void displayMenu() {
        BookingService bookingService = new BookingService();
        CustomerService customerService = new CustomerService();
        FacilityService facilityService = new FacilityService();
        ContractService contractService = new ContractService();

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
            try {
                int choosen4 = Integer.parseInt(scanner.nextLine());
                switch (choosen4) {
                    case 1:
                        System.out.print("Add new booking");
                        System.out.print("----- Danh sách khách hàng------");
                        customerService.display();
                        System.out.print("----- Danh sách dịch vụ -------");
                        facilityService.display();
                        bookingService.add();
                        break;
                    case 2:
                        System.out.print("Display list booking ");
                        System.out.print("--------------------");
                        bookingService.display();
                        break;
                    case 3:
                        System.out.println("Create new contract ");
                        System.out.println("--------------------");
                        contractService.create();
                        break;
                    case 4:
                        System.out.println("Display list contracts ");
                        System.out.println("--------------------");
                        contractService.displayListContracts();
                        break;
                    case 5:
                        System.out.println("Edit contracts");
                        System.out.println("--------------------");
                        System.out.println("Nhập vào mã hợp đồng ");
                        int contractId = Integer.parseInt(scanner.nextLine());
                        contractService.editContract(contractId);
                        break;
                    case 6:
                        bookingService.addRepositoryToFileCsv();
                        contractService.addRepositoryToFileCsv();
                        flag4 = false;
                        break;
                    default:
                        System.out.println("Bạn nhập không hợp lệ ");
                        break;
                }
            } catch (Exception e) {
                System.out.println(" Nhập sai định dạng rồi nhập lại đi nge ^ ^ ");
            }
        } while (flag4);

    }
}
