package services.lpml;

import models.*;
import repository.FacilityRepository;
import repository.IFacilityRepository;
import services.IFacilityService;
import util.Regex;
import java.util.*;

public class FacilityService implements IFacilityService {


    static IFacilityRepository facilityRepository = new FacilityRepository();

    static LinkedHashMap<Facility, Integer> facilityList = facilityRepository.displayRepository();

    static LinkedHashMap<String, Integer> listMaintain = new LinkedHashMap<>();

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

    public static Facility insertInformation(String typeOf) {
        Scanner scanner = new Scanner(System.in);
        Facility facility = new Facility();
        try {
            String regex = "^(SV)(RO)\\-[0-9]{4}$";
            if (typeOf.equals("Villa")) {
                regex = "^(SV)(VL)\\-[0-9]{4}$";
            } else if (typeOf.equals("House")) {
                regex = "^(SV)(HO)\\-[0-9]{4}$";
            }
            String facilityId = Regex.checkRegrex(regex, "Nhập id phải như format sau :(SVXX-YYYY -> Villa thì XX sẽ là VL ->" +
                    "House thì XX sẽ là HO -> Room thì XX sẽ là RO -> còn YYYY là số  ");
            String nameFacility = Regex.checkRegrex("^[A-Z][a-z]+$", "Nhập tên dịch vụ của bạn vào đi (Viết hoa chữ cái đầu)");
            String usableArea = Regex.checkRegrex("^([3-9][0-9])||([1-9][0-9]{2,})$", "Nhập vào điện tích sử dụng -> nhập như format sau và phải lớn hơn :(30m2)");
            String rentalCosts = Regex.checkRegrex("^[0-9]{1,}$", "Nhập chi phí thuê");
            int maximumQuantity;
            do {

                System.out.println("Nhập số lượng tối đa người trong dịch vụ (Số lượng >0 và <20 người nhé)");
                maximumQuantity = Integer.parseInt(scanner.nextLine());

            } while (maximumQuantity <= 0 || maximumQuantity >= 20);
            String typeOfRental = Regex.checkRegrex("^(([0-9][0-9]):([0-9][0-9]))\\s(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d$", "Nhập kiểu thuê ví dụ như format bên : (10:00 31/03/2023)");
            facility = new Facility(facilityId, nameFacility, usableArea, rentalCosts, maximumQuantity, typeOfRental);
        } catch (Exception e) {
            System.out.println("Nhập sai ròi nhập lại thôi");
        }
        return facility;
    }

}
