package repository;

import models.Customer;
import models.Employee;
import util.ReadAndWriteToFile;

import java.util.LinkedList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private final String PATH_FILE = "data\\customer.csv";

    @Override
    public LinkedList<Customer> displayRepository() {
        LinkedList<Customer> customerList = new LinkedList<>();
        List<String> stringList = ReadAndWriteToFile.readToFile(PATH_FILE);
        int size = stringList.size();
        for (int i = 0; i < size; i++) {
            String string = stringList.get(i);
            String[] arr = string.split(",");
            Customer customer = new Customer(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]);
            customerList.add(customer);
        }
        return customerList;
    }

    @Override
    public void updateRepository(List<Customer> customerList) {
        ReadAndWriteToFile.writeToFile(PATH_FILE, "", false);
        int size = customerList.size();
        for (int i = 0; i < size; i++) {
            Customer customer = customerList.get(i);
            if (i == 0) {
                ReadAndWriteToFile.writeToFile(PATH_FILE, customer.getInfoToCsv(), false);
            } else {
                ReadAndWriteToFile.writeToFile(PATH_FILE, customer.getInfoToCsv(), true);
            }
        }
    }
}
