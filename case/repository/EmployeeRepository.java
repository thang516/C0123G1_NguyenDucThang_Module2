package repository;

import models.Employee;
import util.ReadAndWriteToFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeRepository implements IEmployeeRepository {
    private final String PATH_FILE = "data\\employee.csv";

    @Override
    public List<Employee> displayRepository() {
        List<Employee> employeeList = new ArrayList<>();
        List<String> stringList = ReadAndWriteToFile.readToFile(PATH_FILE);
        int size = stringList.size();
        for (int i = 0; i < size; i++) {
            String string = stringList.get(i);
            String[] arr = string.split(",");
            Employee employee = new Employee(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], arr[9]);
            employeeList.add(employee);
        }
        return employeeList;
    }

    @Override
    public void saveToFile(List<Employee> employeeList) {
        ReadAndWriteToFile.writeToFile(PATH_FILE, "", false);
        int size = employeeList.size();
        for (int i = 0; i < size; i++) {
            Employee employee = employeeList.get(i);
            if (i == 0) {
                ReadAndWriteToFile.writeToFile(PATH_FILE, employee.getInfoToCsv(), false);
            } else {
                ReadAndWriteToFile.writeToFile(PATH_FILE, employee.getInfoToCsv(), true);
            }
        }
    }

}
