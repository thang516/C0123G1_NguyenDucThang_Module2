package services.lpml;

import models.Booking;
import models.Customer;
import repository.BookingRepository;
import repository.CustomerRepository;
import services.IPromotionService;
import util.ReadAndWriteToFile;

import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class PromotionService implements IPromotionService {
    Scanner scanner = new Scanner(System.in);
    BookingRepository bookingRepository = new BookingRepository();
    CustomerRepository customerRepository = new CustomerRepository();
    TreeSet<Customer> customersList = new TreeSet<>();
    List<Booking> bookingList= bookingRepository.displayListBookingRepository();
    List<Customer>  customerList=customerRepository.displayRepository();
    @Override
    public void displayUseService() {
        Customer result=null;
        System.out.println("Nhập vào năm sử dụng dịch vụ ");
        String yearOfUse=scanner.nextLine();
        for (int i = 0; i <bookingList.size() ; i++) {
          String[] arr = bookingList.get(i).getStartDay().split("/");
          String year = arr[2];
          if(year.equals(yearOfUse)){
              for (int j = 0; j < customerList.size(); j++) {
                  if(bookingList.get(i).getCustomerId().equals(customerList.get(j).getCustomerId())){
                      result=customerList.get(j);
                      System.out.println(result);

                  }

              }
          }
        }
        customersList.add(result);
    }

    @Override
    public void displayGetVoucher() {
        System.out.println("Nhập vào số lượng voucher");
        String monthOfUse=scanner.nextLine();
        for (int i = 0; i <bookingList.size() ; i++) {
            String[] arr=bookingList.get(i).getStartDay().split("/");
            String month=arr[1];
            if(month.equals(monthOfUse)){

            }
        }
    }
}
