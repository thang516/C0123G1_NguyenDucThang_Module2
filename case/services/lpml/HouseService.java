package services.lpml;

import models.Facility;
import models.House;
import repository.HouseRepository;
import repository.IHouseRepository;
import services.IHouseService;

import java.util.*;

import static services.lpml.FacilityService.insertInformation;

public class HouseService implements IHouseService {
    Scanner scanner = new Scanner(System.in);
    static IHouseRepository iHouseRepository = new HouseRepository();
    static LinkedHashMap<House, Integer> houseIntegerLinkedHashMap = iHouseRepository.displayHouseRepository();

    public void updateRepository() {
        iHouseRepository.updateRepository(houseIntegerLinkedHashMap);
    }

    @Override
    public void add() {
        Facility facility = insertInformation();
        System.out.println("Nhập tiêu chuẩn phòng ");
        String roomStandard = scanner.nextLine();
        System.out.println("Nhập số  tầng ");
        String floor = scanner.nextLine();
        House house = new House(facility, roomStandard, floor);

        houseIntegerLinkedHashMap.put(house, 0);
    }

    @Override
    public void display() {
        Set<House> keySet = houseIntegerLinkedHashMap.keySet();
        for (House key : keySet) {
            System.out.println(key + " " + houseIntegerLinkedHashMap.get(key));
        }

    }
}
