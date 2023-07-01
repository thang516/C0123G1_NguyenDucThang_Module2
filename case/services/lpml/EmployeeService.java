package services.lpml;

import models.Employee;
import repository.EmployeeRepository;
import repository.IEmployeeRepository;
import services.IEmployeeService;
import util.Regex;

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


    public Employee enterValue() {
        Employee employee = new Employee();

        try {
            System.out.print("Nhập mã nhân viên   của bạn ");
            int employeeId = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập họ và tên của bạn ");
            String name = scanner.nextLine();
            String dayOfBirth = Regex.checkRegrex("^(([0-2][0-9])||3[0-1])\\/(([0][0-9])||1[0-2])\\/((19((2[4-9])||([3-9][0-9])))||200[0-5])$", "Nhập sinh nhật của bạn ->format Ngày sinh phải nhỏ hơn ngày hiện tại 18 năm, người dùng không được quá 100 tuổi và phải đúng định dạng dd/mm/YYYY  ");
            System.out.print("Nhập giới tính  của bạn ");
            String sex = scanner.nextLine();
            System.out.print("Nhập số CMND của bạn ");
            String citizedIdentification = scanner.nextLine();
            String phoneNumber = Regex.checkRegrex("^((\\+84)||0)[0-9]{9}$", "Nhập số điện thoại  của bạn->(+84) hoặc 0 và 9 số điện thoại của bạn ");
            String email = Regex.checkRegrex("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", "Nhập email của bạn nhập phải chuẩn  form như google");
            String level="";
            String position="";
            boolean flag = true;
            do {
                System.out.print("Trình độ học vấn của bạn ?" +
                        "\n 1.Trung Cấp" +
                        "\n 2. Cao đẳng" +
                        "\n 3. Đại học" +
                        "\n 4.Sau đại học ");
                String choose = scanner.nextLine();
                switch (choose){
                    case "1":
                        level="Trung cấp";
                        flag = false;
                        break;
                    case "2":
                        level="Cao đẳng";
                        flag=false;
                        break;
                    case "3":
                        level="Đại học";
                        flag=false;
                        break;
                    case "4":
                        level="Sau Đại học";
                        flag=false;
                        break;
                    default:
                        System.out.print("Bạn đã nhập sai mời nhập lại số chỉ có từ 1 đến 4");
                }

            } while (flag);
            do {
                System.out.print("Nhập vị trí làm việc của bạn :" +
                        "\n 1.Lễ tân" +
                        "\n 2.Phục vụ " +
                        "\n 3.Chuyên viên" +
                        "\n 4.Giám sát" +
                        "\n 5.Quản Lý" +
                        "\n 6.Giám đốc");
                String choose=scanner.nextLine();
                switch (choose){
                    case "1":
                        position="Lễ tân";
                        flag=false;
                        break;
                    case "2":
                        position="Phục vụ";
                        flag=false;
                        break;
                    case "3":
                        position="Chuyên viên";
                        flag=false;
                        break;
                    case "4":
                        position="Giám sát";
                        flag=false;
                        break;
                    case "5":
                        position="Quản lý";
                        flag=false;
                        break;
                    case "6":
                        position="Giám đốc";
                        flag=false;
                        break;
                    default:
                        System.out.print("Mời nhập lại số từ 1->6 đúng với vị trí làm việc của mình");
                }

            }
            while (flag);
            System.out.print("Nhập lương  của bạn ");
            String salary = scanner.nextLine();
             employee = new Employee(employeeId, name, dayOfBirth, sex, citizedIdentification, phoneNumber, email, level, position, salary);


        } catch (Exception e) {
            e.printStackTrace();
        }
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
