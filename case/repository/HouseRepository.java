package repository;

import models.Facility;
import models.House;
import util.ReadAndWriteToFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public class HouseRepository implements IHouseRepository {
    private final String PATH_FILE = "data\\house.csv";
    static int value=5;
    @Override
    public LinkedHashMap<House, Integer> displayHouseRepository() {
        LinkedHashMap<House, Integer> houseIntegerLinkedHashMap = new LinkedHashMap<>();
        List<String> stringList = ReadAndWriteToFile.readToFile(PATH_FILE);
        int size = stringList.size();
        for (int i = 0; i < size; i++) {
            String str = stringList.get(i);
            String[] arr = str.split(",");
            House house = new House(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6]);
            houseIntegerLinkedHashMap.put(house,value );
        }
        return houseIntegerLinkedHashMap;
    }

    @Override
    public void updateRepository(LinkedHashMap<House, Integer> houseList) {
        File file = new File("data\\house.csv");
        try {
            PrintWriter writer = new PrintWriter(file);
            writer.print("");
            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Set<House> house = houseList.keySet();
        for (Facility x : house) {
            ReadAndWriteToFile.writeToFile(PATH_FILE, x.getInfoToCsv()+","+1 , true);

        }
    }
}

