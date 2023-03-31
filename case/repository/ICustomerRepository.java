package repository;

import models.Customer;

import java.util.LinkedList;
import java.util.List;

public interface ICustomerRepository {
    LinkedList<Customer> displayRepository();

    void updateRepository(List<Customer> customerList);
}
