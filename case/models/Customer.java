package models;

public class Customer extends Person {
    private String customerId;
    private String customerType;
    private String address;

    public Customer(String customerId, String fullName, String dateOfBirth, String sex, String citizenIdentification, String phoneNumber, String email, String customerType, String address) {
        super(fullName, dateOfBirth, sex, citizenIdentification, phoneNumber, email);
        this.customerId = customerId;
        this.customerType = customerType;
        this.address = address;
    }

    public Customer() {
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
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
                ", Số CMND :" + this.getCitizenIdentification() +
                ", Số điện thoại : " + this.getPhoneNumber() +
                ", Email :'" + this.getEmail() + '\'' +
                ", Loại Khách :'" + this.getCustomerType() + '\'' +
                ", Địa chỉ :'" + this.getAddress() + '\'';
    }

    public String getInfoToCsv() {
        return customerId + "," + fullName + "," + dateOfBirth + "," + sex + "," + citizenIdentification + "," + phoneNumber + ","
                + email + "," + customerType + "," + address;
    }
}
