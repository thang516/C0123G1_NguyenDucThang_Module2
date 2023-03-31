package services.lpml;

import models.*;
import repository.FacilityRepository;
import repository.IFacilityRepository;
import services.IFacilityService;

import java.util.*;

public class FacilityService implements IFacilityService {


    static IFacilityRepository facilityRepository = new FacilityRepository();

    static LinkedHashMap<Facility, Integer> facilityList = facilityRepository.displayRepository();

    static LinkedHashMap<String, Integer> listMaintain = new LinkedHashMap<>();

    //    public static void checkBooking(Booking b) {
//        /*  kiểm tra cách khác */
////        if(bookingList.containsKey(b)){
////            bookingList.put(b,bookingList.get(b)+1);
////        }
//    }
    public void displayMaintain() {
        Set<String> keySet = listMaintain.keySet();
        List<String> stringList = new ArrayList<>();
        for (String key : keySet) {
            if (listMaintain.get(key) >= 2) {
                stringList.add(key);
            }
        }
        int size = stringList.size();
        for (int i = 0; i < size; i++) {
            System.out.println("Cơ sở vật chất cần bảo trì :" + stringList.get(i));
        }
    }

    public void updateMaintain(String key) {
        Set<String> keySet = listMaintain.keySet();
        boolean hasKey = false;
        for (String keyItem : keySet) {
            if (keyItem.equals(key)) {
                listMaintain.put(key, listMaintain.get(key) + 1);
                hasKey = true;
                break;
            }
        }
        if (!hasKey) {
            listMaintain.put(key, 1);
        }
        System.out.println(key + " - " + listMaintain);
    }

    @Override
    public void add() {

    }

    public void updateRepository() {
        facilityRepository.updateRepository(facilityList);
    }

    @Override
    public void display() {
        Set<Facility> keySet = facilityList.keySet();
        for (Facility key : keySet) {
            System.out.println(key + " " + facilityList.get(key));
        }

    }

    public static Facility insertInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên dịch vụ của bạn vào đi ");
        String nameFacility = scanner.nextLine();
        System.out.println("Nhập vào điện tích sử dụng  ");
        String usableArea = scanner.nextLine();
        System.out.println("Nhập chi phí thuê   ");
        String rentalCosts = scanner.nextLine();
        System.out.println("Nhập số lượng tối đa người trong dịch vụ");
        String maximumQuantity = scanner.nextLine();
        System.out.println("Nhập kiểu thuê (ngày giờ tháng năm thuê)");
        String typeOfRental = scanner.nextLine();
        Facility facility = new Facility(nameFacility, usableArea, rentalCosts, maximumQuantity, typeOfRental);
        return facility;
    }


}
