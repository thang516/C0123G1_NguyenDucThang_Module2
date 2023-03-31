package services.lpml;

import models.Employee;
import repository.EmployeeRepository;
import repository.IEmployeeRepository;
import services.IEmployeeService;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {

    static IEmployeeRepository employeeRepository = new EmployeeRepository();
    static List<Employee> employeeList = employeeRepository.displayRepository();
    Scanner scanner = new Scanner(System.in);

    public void updateRepository() {
        employeeRepository.saveToFile(employeeList);
    }

    public int checkInput(int employeeId) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeId == employeeList.get(i).getEmployeeId()) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void delete(int employeeId) {
        int index = checkInput(employeeId);
        if (index != -1) {
            employeeList.remove(index);
        } else {
            System.out.println("Không tìm thấy ");
        }
    }

    @Override
    public void edit(int employeeId) {
        Employee employee = enterValue();
        int size = employeeList.size();
        for (int i = 0; i < size; i++) {
            if (employeeList.get(i).getEmployeeId() == employeeId) {
                employeeList.set(i, employee);
                break;
            }
        }

    }

    public enum LevelEnum {
        TRUNGCAP, CAODANG, DAIHOC, SAUDAIHOC
    }

    public enum PositionEnum {
        LETAN, PHUCVU, CHUYENVIEN, GIAMSAT, QUANLY, GIAMDOC
    }

    public Employee enterValue() {
        System.out.println("Nhập mã nhân viên   của bạn ");
        int employeeId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập họ và tên của bạn ");
        String name = scanner.nextLine();
        System.out.println("Nhập sinh nhật của bạn ");
        String dayOfBirth = scanner.nextLine();
        System.out.println("Nhập giới tính  của bạn ");
        String sex = scanner.nextLine();
        System.out.println("Nhập số CMND của bạn ");
        String cmnd = scanner.nextLine();
        System.out.println("Nhập số điện thoại  của bạn ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Nhập email của bạn ");
        String email = scanner.nextLine();
        String level;
        String position;
        boolean flag = true;
        do {
            System.out.println("Nhập trình độ của bạn (bạn có thể nhập trong 4 : trungcap,caodang,daihoc,saudaihoc) Nhớ nha viết ko dấu: ^ . ^ ");
            level = scanner.nextLine();
            try {
                LevelEnum.valueOf(level.toUpperCase());
                flag = false;
            } catch (IllegalArgumentException e) {
                System.out.println("vui lòng nhập 1 trong 4 cái đã gợi ý");
            }

        } while (flag);
        do {
            System.out.println("Nhập vị trí  của bạn(bạn chỉ có thể nhập 1 trong :letan,phucvu,chuyenvien,giamsat,quanly,giamdoc . Nhỡ nhập không dấu và giống như gợi ý nhé ^ ^");
            position = scanner.nextLine();
            try {
                PositionEnum.valueOf(position.toUpperCase());
                flag = false;
            } catch (IllegalArgumentException e) {
                System.out.println("vui lòng nhập những cái đã gợi ý");

            }
        }
        while (flag);
        System.out.println("Nhập lương  của bạn ");
        String salary = scanner.nextLine();
        Employee employee = new Employee(employeeId, name, dayOfBirth, sex, cmnd, phoneNumber, email, level, position, salary);
        return employee;
    }

    @Override
    public void add() {
        Employee employee = enterValue();
        employeeList.add(employee);

    }

    @Override
    public void display() {
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }

}
