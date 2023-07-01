package services;

import models.Customer;
import repository.CustomerRepository;
import repository.ICustomerRepository;
import util.Regex;
import java.util.LinkedList;
import java.util.List;
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
        Customer customer = new Customer();
        try {


            System.out.println(" Hãy điền vào mã khách hàng  của bạn  ");
            String customerId = scanner.nextLine();
            System.out.println(" Hãy điền vào tên của bạn  ");
            String name = scanner.nextLine();
            String dayOfBirth = Regex.checkRegrex("^((0[1-9])||([1-2][0-9])||3[0-1])\\/((0[0-9])||1[0-2])\\/(19((2[4-9])||([3-9][0-9]))||(200[0-5]))$", "Nhập sinh nhật của bạn ->format Ngày sinh phải nhỏ hơn ngày hiện tại 18 năm, người dùng không được quá 100 tuổi và phải đúng định dạng dd/mm/YYYY  ");
            System.out.println(" Hãy điền vào giới tính  của bạn  ");
            String sex = scanner.nextLine();
            System.out.println(" Hãy điền vào số CMND của bạn  ");
            String citizenIdentification = scanner.nextLine();
            System.out.println(" Hãy điền vào số điện thoại của bạn  ");
            String phoneNumber = scanner.nextLine();
            System.out.println(" Hãy điền vào email của bạn  ");
            String email = scanner.nextLine();
            boolean flag = true;
            String typeOfGuest;
            do {
                System.out.println(" Hãy điền vào xếp loại mức độ khách hàng  của bạn:(gợi ý :DIAMOND, PLATINIUM, GOLD, SILVER, MEMBER . Bạn chỉ có thể nhập những gợi ý bên có thể viết hoc hoặc viết thường)");
                typeOfGuest = scanner.nextLine();

                try {
                    TypeOfCustomerEnum.valueOf(typeOfGuest.toUpperCase());
                    flag = false;
                } catch (IllegalArgumentException e) {
                    System.out.println("vui lòng nhập những cái đã gợi ý  cái đã gợi ý");

                }

            } while (flag);
            System.out.println(" Hãy điền vào  địa chỉ  của bạn  ");
            String adress = scanner.nextLine();
            customer = new Customer(customerId, name, dayOfBirth, sex, citizenIdentification, phoneNumber, email, typeOfGuest, adress);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customer;
    }

    @Override
    public void edit(String customerId) {
        Customer customer = enterValue();
        int size = customerList.size();
        for (int i = 0; i < size; i++) {
            if (customerId.equals(customerList.get(i).getCustomerId())) {
                customerList.set(i, customer);
                break;
            }
        }
    }

    public String checkValue(String customerId) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customerId.equals(customerList.get(i).getCustomerId())) {
                return customerId;
            }
        }
        return "0";
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
        public  List<Customer> customers (){
            return customerList;
        }
    @Override
    public void delete(String customerId) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customerId.equals(customerList.get(i).getCustomerId())) {
                customerList.remove(i);
            }
        }
    }
}
