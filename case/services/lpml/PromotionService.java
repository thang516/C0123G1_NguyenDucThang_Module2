package services.lpml;

import models.Booking;
import models.Contract;
import models.Customer;
import repository.BookingRepository;
import repository.CustomerRepository;
import services.IPromotionService;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class PromotionService implements IPromotionService {
    Scanner scanner = new Scanner(System.in);
    BookingRepository bookingRepository = new BookingRepository();
    CustomerRepository customerRepository = new CustomerRepository();
    TreeSet<Customer> customersList = new TreeSet<>();
    TreeSet<Booking> bookingList = bookingRepository.displayListBookingRepository();
    List<Customer> customerList = customerRepository.displayRepository();

    @Override
    public void displayUseService() {
        System.out.println("Nhập vào năm sử dụng dịch vụ ");
        String yearOfUse = scanner.nextLine();
        List<Booking> arrayList = new ArrayList<>();
        arrayList.addAll(bookingList);
        for (int i = 0; i < arrayList.size(); i++) {
            String[] arr = arrayList.get(i).getStartDay().split("/");
            String year = arr[2];
            if (year.equals(yearOfUse)) {
                for (int j = 0; j < customerList.size(); j++) {
                    if (arrayList.get(i).getCustomerId().equals(customerList.get(j).getCustomerId())) {
                        customersList.add(customerList.get(j));
                        break;
                    }

                }
            }
        }
        bookingList.clear();
        bookingList.addAll(arrayList);
        System.out.println(customersList.toString());
    }

    @Override
    public void displayGetVoucher() {

        Stack<Booking> bookingStack = new Stack<>();
        LocalDate currentdate = LocalDate.now();
        Month currentMonth = currentdate.getMonth();
//        System.out.println("Current month: " + currentMonth.getValue());
        System.out.println("Nhập voucher 10% ");
        int voucher10 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập voucher 20%");
        int voucher20 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập voucher 50%");
        int voucher50 = Integer.parseInt(scanner.nextLine());
        List<Booking> arrayList = new ArrayList<>();
        arrayList.addAll(bookingList);
        for (int i = 0; i < arrayList.size(); i++) {
            String[] arr = arrayList.get(i).getStartDay().split("/");
            String month = arr[1];
            if (Integer.parseInt(month) == currentMonth.getValue()) {
                bookingStack.add(arrayList.get(i));
                for (int j = bookingStack.size() -1;j>0; j--) {
                    if (bookingStack.get(j).getBookingId().equals(arrayList.get(i).getBookingId())) {
                        if(voucher10 > 0){
                            System.out.println(arrayList.get(i) + " voucher: 10%" );
                            voucher10--;
                        }else if(voucher20 > 0){
                            System.out.println(arrayList.get(i) + " voucher: 20%" );
                            voucher20--;
                        }else {
                            System.out.println(arrayList.get(i) + " voucher: 50%" );
                            voucher50--;
                        }
                    }
                }
            }
        }
        bookingList.clear();
        bookingList.addAll(arrayList);
    }
}

