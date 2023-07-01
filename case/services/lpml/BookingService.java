package services.lpml;

import models.Booking;
import models.Customer;
import repository.BookingRepository;
import repository.IBookingRepository;
import services.CustomerService;
import services.IBookingService;
import util.ReadAndWriteToFile;
import util.Regex;
import java.util.*;

public class BookingService implements IBookingService {
    static IBookingRepository bookingRepository = new BookingRepository();

    static FacilityService facilityService = new FacilityService();
    static TreeSet<Booking> bookingList =bookingRepository.displayListBookingRepository();
    CustomerService customerService=new CustomerService();
    List<Customer> customerList= customerService.customers();
    Scanner scanner = new Scanner(System.in);


    public void addRepositoryToFileCsv() {
        bookingRepository.updateRepository(bookingList);
    }

    public Booking enterValue() {
        Booking booking = new Booking();
        try{
        System.out.print("Nhập vào id của booking ");
        String bookingId = scanner.nextLine();
        String startDay = Regex.checkRegrex("^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$", "Nhập vào ngày bắt đầu thuê ");
        String endDate = Regex.checkRegrex("^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$", "Nhập vào ngày kết thúc thuê ");
        System.out.print("Nhập vào mã khách hàng");
        boolean flag=true;
            String customerId="";
        do {
             customerId = scanner.nextLine();
            for (int i = 0; i < customerList.size(); i++) {
                if(customerId.equals(customerList.get(i).getCustomerId())){
                    flag=false;
                    break;
                }

            }if(flag){

            System.out.println("Bạn chưa có mã khách hàng ");
            }

        }
        while (flag);

        System.out.print("Nhập vào tên dịch vụ ");
        String serviceName = scanner.nextLine();
        System.out.print("Nhập vào loại dịch vụ ");
        String typeOfService = scanner.nextLine();
        booking = new Booking(bookingId, startDay, endDate, customerId, serviceName, typeOfService);
        }catch (Exception e){
            System.out.println("Bạn nhập sai ròi nhập lại đi ^.^");
        }
        return booking;
    }

    @Override
    public  void add() {
        Booking booking = enterValue();
        bookingList.add(booking);
        facilityService.updateMaintain(booking.getServiceName());
        System.out.println(bookingList.toString());
    }

    @Override
    public void display() {
        for (Booking x : bookingList) {
            System.out.println(x.toString());
        }

    }



}
