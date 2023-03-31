package repository;

import models.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> displayRepository();

    void saveToFile(List<Employee> employeeList);

}
