package services;

import models.Employee;

public interface IEmployeeService extends IService{

    void delete(int employeeId);
    void edit(int employeeId);
}
