package services.lpml;

import models.Booking;
import services.IBookingService;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeSet;

public class BookingService implements IBookingService {
   static TreeSet<Booking> bookingList= new TreeSet<>(new BookingComparator());
    static IBookingService bookingService=new BookingService();
//static TreeSet<Booking> bookingList=bookingService.displayListBookingRepository();
   Scanner scanner = new Scanner(System.in);
//    static Booking booking=new Booking(01,"20/3/2023","24/04/2023",1601,"Villa","Vip");
//    static Booking booking1=new Booking(02,"20/3/2023","24/3/2023",1602,"House","sliver");
//    static {
//        bookingList.add(booking);
//        bookingList.add(booking1);
//    }
//private  B
    public  Booking enterValue(){
//        String bookingId, String startDay, String endDate, String customerId, String serviceName, String typeOfService
        System.out.println("Nhập vào id của booking ");
        String bookingId=scanner.nextLine();
        System.out.println("Nhập vào ngày bắt đầu thuê ");
        String startDay=scanner.nextLine();
        System.out.println("Nhập vào ngày kết thúc ");
        String endDate=scanner.nextLine();
        System.out.println("Nhập vào mã khách hàng");
        String customerId=scanner.nextLine();
        System.out.println("Nhập vào tên dịch vụ ");
        String serviceName=scanner.nextLine();
        System.out.println("Nhập vào loại dịch vụ ");
        String typeOfService = scanner.nextLine();
        Booking booking = new Booking(bookingId,startDay,endDate,customerId,serviceName,typeOfService);
        return booking;
    }

    @Override
    public void add() {
    Booking booking = enterValue();
    bookingList.add(booking);
    }

    @Override
    public void display() {
        for ( Booking x: bookingList) {
            System.out.println(x.toString());
        }

    }

    @Override
    public void create() {

    }

    @Override
    public void displayListContracts() {

    }

    @Override
    public void edit() {
        Booking booking=enterValue();
        int size=bookingList.size();
        for (int i = 0; i <size ; i++) {
//            if(bookingList){
//
//            }
        }
    }
}
