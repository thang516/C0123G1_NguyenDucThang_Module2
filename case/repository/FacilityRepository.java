package repository;

import models.*;
import util.ReadAndWriteToFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class FacilityRepository implements IFacilityRepository {

    private final String PATH_FILE = "data\\facility.csv";

    @Override
    public LinkedHashMap<Facility, Integer> displayRepository() {
        LinkedHashMap<Facility, Integer> facilityList = new LinkedHashMap<>();
        List<String> stringList = ReadAndWriteToFile.readToFile(PATH_FILE);
        int size = stringList.size();
        for (int i = 0; i < size; i++) {
            String str = stringList.get(i);
            String[] arr = str.split(",");
            Facility facility = new Facility(arr[0],arr[1], arr[2], arr[3],Integer.parseInt(arr[4]) ,arr[5]);
            facilityList.put(facility, +1);
        }
        return facilityList;
    }

    @Override
    public LinkedHashMap<Facility, Integer> displayListFacilityMaintenance() {
        LinkedHashMap<Facility, Integer> listMaintance = new LinkedHashMap<>();
        return listMaintance;
    }

    @Override
    public void updateRepository(LinkedHashMap<Facility, Integer> facilityList) {
        File file = new File("data\\facility.csv");
        try {
            PrintWriter writer = new PrintWriter(file);
            writer.print("");
            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Set<Facility> facilitySet = facilityList.keySet();
        for (Facility x : facilitySet) {
            ReadAndWriteToFile.writeToFile(PATH_FILE, x.getInfoToCsv(), true);

        }
    }
}

