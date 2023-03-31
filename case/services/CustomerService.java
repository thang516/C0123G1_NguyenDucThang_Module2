package services;

import models.Customer;
import repository.CustomerRepository;
import repository.ICustomerRepository;

import java.util.LinkedList;
import java.util.Scanner;

public class CustomerService implements ICustomerService {


    static ICustomerRepository customerRepository = new CustomerRepository();
    static LinkedList<Customer> customerList = customerRepository.displayRepository();
    Scanner scanner = new Scanner(System.in);

    public void updateRepository() {
        customerRepository.updateRepository(customerList);
    }

    enum TypeOfCustomerEnum {
        DIAMOND, PLATINIUM, GOLD, SILVER, MEMBER
    }

    public Customer enterValue() {
        System.out.println(" Hãy điền vào mã khách hàng  của bạn  ");
        int customerId = Integer.parseInt(scanner.nextLine());
        System.out.println(" Hãy điền vào tên của bạn  ");
        String name = scanner.nextLine();
        System.out.println(" Hãy điền vào sinh nhật  của bạn  ");
        String dayOfBirth = scanner.nextLine();
        System.out.println(" Hãy điền vào giới tính  của bạn  ");
        String sex = scanner.nextLine();
        System.out.println(" Hãy điền vào số CMND của bạn  ");
        String cmnd = scanner.nextLine();
        System.out.println(" Hãy điền vào số điện thoại của bạn  ");
        String phoneNumber = scanner.nextLine();
        System.out.println(" Hãy điền vào email của bạn  ");
        String email = scanner.nextLine();
        boolean flag = true;
        String typeNumber;
        do {
            System.out.println(" Hãy điền vào xếp loại mức độ khách hàng  của bạn:(gợi ý :DIAMOND, PLATINIUM, GOLD, SILVER, MEMBER . Bạn chỉ có thể nhập những gợi ý bên có thể viết hoc hoặc viết thường)");
            typeNumber = scanner.nextLine();

            try {
                TypeOfCustomerEnum.valueOf(typeNumber.toUpperCase());
                flag = false;
            } catch (IllegalArgumentException e) {
                System.out.println("vui lòng nhập những cái đã gợi ý  cái đã gợi ý");

            }

        } while (flag);
        System.out.println(" Hãy điền vào  địa chỉ  của bạn  ");
        String adress = scanner.nextLine();
        Customer customer = new Customer(customerId, name, dayOfBirth, sex, cmnd, phoneNumber, email, typeNumber, adress);
        return customer;
    }

    @Override
    public void edit(int customerId) {
        Customer customer = enterValue();
        int size = customerList.size();
        for (int i = 0; i < size; i++) {
            if (customerList.get(i).getCustomerId() == customerId) {
                customerList.set(i, customer);
                break;
            }
        }
    }

    public int checkValue(int customerId) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customerId == customerList.get(i).getCustomerId()) {
                return i;
            }
        }
        return -1;
    }


    @Override
    public void add() {
        Customer customer = enterValue();
        customerList.add(customer);
    }

    @Override
    public void display() {
        for (Customer x : customerList) {
            System.out.println(x);
        }
    }

    @Override
    public void delete(int employeeId) {
        int index = checkValue(employeeId);
        if (index != -1) {
            customerList.remove(index);
        } else {
            System.out.println("Không hợp lệ");
        }
    }
}
