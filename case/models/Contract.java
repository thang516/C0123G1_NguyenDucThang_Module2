package models;

public class Contract implements Comparable<Contract> {
    private int contractNumber;
    private String bookingCode;
    private String deposit;
    private String paymentAmount;
    private String customerId;

    public Contract(int contractNumber, String bookingCode, String deposit, String paymentAmount, String customerId) {
        this.contractNumber = contractNumber;
        this.bookingCode = bookingCode;
        this.deposit = deposit;
        this.paymentAmount = paymentAmount;
        this.customerId = customerId;
    }

    public Contract() {
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public String getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Contract :" +
                " Số hợp đồng : " + this.getContractNumber() +
                ", mã Booking :" + this.getBookingCode() +
                ", Số tiền cọc trước :" + this.getDeposit() +
                ", Tổng số tiền thanh toán : " + this.getPaymentAmount() +
                ", Mã khách hàng : " + this.getCustomerId();
    }

    public String getInfoToCsv() {
        return contractNumber + "," + bookingCode + "," + deposit + "," + paymentAmount + "," + customerId;
    }

    @Override
    public int compareTo(Contract o) {
        return this.getContractNumber()-o.getContractNumber();
    }
}
