package services.lpml;

import models.Facility;
import models.House;
import repository.HouseRepository;
import repository.IHouseRepository;
import services.IHouseService;
import util.Regex;

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
        House house = new House();
        try {


            Facility facility = insertInformation("House");
            String roomStandard = Regex.checkRegrex("^[A-Z][a-z]+$", "Nhập tiêu chuẩn phòng viết hoa chữ cái đầu nhé ");
            String floor = Regex.checkRegrex("^[0-9]{0,2}$", "Nhập số  tầng -> số tầng là phải dương nhé :D ");
            house = new House(facility, roomStandard, floor);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
