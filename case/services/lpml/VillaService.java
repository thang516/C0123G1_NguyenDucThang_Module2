package services.lpml;

import models.Facility;
import models.Villa;
import repository.IVillaRepository;
import repository.VillaRepository;
import services.IVillaSerVice;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

import static services.lpml.FacilityService.insertInformation;

public class VillaService implements IVillaSerVice {
    Scanner scanner = new Scanner(System.in);
    static IVillaRepository iVillaRepository = new VillaRepository();
    static LinkedHashMap<Villa, Integer> villaList = iVillaRepository.displayVillaRepository();

    public void addVillaCsv() {
        iVillaRepository.addVillaRepository(villaList);
    }


    @Override
    public void add() {
        Facility facility = insertInformation();
        System.out.println(" Nhập tiêu chuẩn phòng");
        String roomStandard = scanner.nextLine();
        System.out.println(" Nhập diện tích hồ bơi ");
        String area = scanner.nextLine();
        System.out.println(" Nhập số tầng");
        String floor = scanner.nextLine();
        Villa villa = new Villa(facility, roomStandard, area, floor);
        villaList.put(villa, 0);

    }

    @Override
    public void display() {
        Set<Villa> keySet = villaList.keySet();
        for (Villa key : keySet) {
            System.out.println(key + " " + villaList.get(key));
        }
    }
}
