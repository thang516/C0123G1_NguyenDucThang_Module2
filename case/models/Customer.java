package models;

public class Customer extends Person {
    private int customerId;
    private String customerType;
    private String address;

    public Customer(int customerId, String fullName, String dateOfBirth, String sex, String cmnd, String phoneNumber, String email, String customerType, String address) {
        super(fullName, dateOfBirth, sex, cmnd, phoneNumber, email);
        this.customerId = customerId;
        this.customerType = customerType;
        this.address = address;
    }

    public Customer() {
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer :" +
                " Mã khách hàng :" + this.getCustomerId() +
                ", Họ và tên :'" + this.getFullName() + '\'' +
                ",Ngày sinh :" + this.getDateOfBirth() +
                ",Giới tính :'" + this.getSex() + '\'' +
                ", Số CMND :" + this.getCmnd() +
                ", Số điện thoại : " + this.getPhoneNumber() +
                ", Email :'" + this.getEmail() + '\'' +
                ", Loại Khách :'" + this.getCustomerType() + '\'' +
                ", Địa chỉ :'" + this.getAddress() + '\'';
    }

    public String getInfoToCsv() {
        return customerId + "," + fullName + "," + dateOfBirth + "," + sex + "," + cmnd + "," + phoneNumber + ","
                + email + "," + customerType + "," + address;
    }
}
