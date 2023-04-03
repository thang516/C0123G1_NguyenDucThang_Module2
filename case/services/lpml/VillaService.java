package services.lpml;

import models.Facility;
import models.Villa;
import repository.IVillaRepository;
import repository.VillaRepository;
import services.IVillaSerVice;
import util.Regex;

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
        Villa villa = new Villa();
        try {
        Facility facility = insertInformation("Villa");
        String roomStandard = Regex.checkRegrex("^[A-Z][a-z]+$"," Nhập tiêu chuẩn phòng Viết hoa chữ cái đầu)");
        String area = Regex.checkRegrex("^[3-9][0-9](m2)$"," Nhập diện tích hồ bơi -> nhập như format sau và phải lớn hơn :(30m2) ");
        String floor =Regex.checkRegrex("^[0-9]{0,2}$", "Nhập số tầng");
         villa = new Villa(facility, roomStandard, area, floor);
        } catch (Exception e){
            e.printStackTrace();
        }
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
