package models;

public class Employee extends Person {
    private int employeeId;
    private String level;
    private String position;
    private String salary;

    public Employee(int employeeId, String fullName, String dateOfBirth, String sex, String cmnd, String phoneNumber, String email, String level, String position, String salary) {
        super(fullName, dateOfBirth, sex, cmnd, phoneNumber, email);
        this.employeeId = employeeId;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee() {
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee : " +
                " Mã nhân viên :  " + this.getEmployeeId() +
                ", Họ và tên : '" + this.getFullName() + '\'' +
                ", Ngày sinh  : " + this.getDateOfBirth() +
                ",  Giới tính : '" + this.getSex() + '\'' +
                ", Số CMND :" + this.getCmnd() +
                ", Số điện thoại  :" + this.getPhoneNumber() +
                ", Email : '" + this.getEmail() + '\'' +
                ", Trình độ  :'" + this.getLevel() + '\'' +
                ", Vị trí  :  '" + this.getPosition() + '\'' +
                ", Lương  : " + this.getSalary();
    }

    public String getInfoToCsv() {
        return employeeId + "," + fullName + "," + dateOfBirth + "," + sex + "," + cmnd + "," + phoneNumber + ","
                + email + "," + level + "," + position + "," + salary;
    }
}
