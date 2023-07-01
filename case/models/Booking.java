package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Booking implements Comparable<Booking> {
    private String bookingId;
    private String startDay;
    private String endDate;
    private String customerId;
    private String serviceName;
    private String typeOfService;


    public Booking(String bookingId, String startDay, String endDate, String customerId, String serviceName, String typeOfService) {
        this.bookingId = bookingId;
        this.startDay = startDay;
        this.endDate = endDate;
        this.customerId = customerId;
        this.serviceName = serviceName;
        this.typeOfService = typeOfService;
    }

    public Booking() {
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    @Override
    public String toString() {
        return "Booking :" +
                " Mã booking :" + this.getBookingId() +
                ", Ngày bắt đầu : '" + this.getStartDay() + '\'' +
                ", Ngày kết thúc :  '" + this.getEndDate() + '\'' +
                ", Mã khách hàng : " + this.getCustomerId() +
                ", Tên dịch vụ : '" + this.getServiceName() + '\'' +
                ", Loại dịch vụ : '" + this.getTypeOfService() + '\'';
    }

    public String getInfoToCsv() {
        return bookingId + "," + startDay + "," + endDate + "," + customerId + "," + serviceName + "," + typeOfService;
    }

    @Override
    public int compareTo(Booking booking) {
        Date startDate1;
        Date startDate2;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            startDate1 = dateFormat.parse(this.startDay);
            startDate2 = dateFormat.parse(booking.startDay);
            if (startDate1.compareTo(startDate2) == 0) {
                Date endDate1 = dateFormat.parse(this.endDate);
                Date endDate2 = dateFormat.parse(booking.endDate);
                return endDate1.compareTo(endDate2);
            }

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return startDate1.compareTo(startDate2);
    }
}
