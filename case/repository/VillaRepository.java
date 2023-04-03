package repository;

import models.House;
import models.Villa;
import util.ReadAndWriteToFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public class VillaRepository implements IVillaRepository {
    private final String PATH_FILE = "data\\villa.csv";

    @Override
    public LinkedHashMap<Villa, Integer> displayVillaRepository() {

        LinkedHashMap<Villa, Integer> villaIntegerLinkedHashMap = new LinkedHashMap<>();
        List<String> stringList = ReadAndWriteToFile.readToFile(PATH_FILE);
        int size = stringList.size();
        for (int i = 0; i < size; i++) {
            String str = stringList.get(i);
            String[] arr = str.split(",");
            Villa villa = new Villa(arr[0], arr[1], arr[2], arr[3], Integer.parseInt(arr[4]), arr[5], arr[6],arr[7],arr[8]);
            villaIntegerLinkedHashMap.put(villa, 0);
        }
        return villaIntegerLinkedHashMap;

    }

    @Override
    public void addVillaRepository(LinkedHashMap<Villa, Integer> villaList) {

        File file = new File("data\\villa.csv");
        try {
            PrintWriter writer = new PrintWriter(file);
            writer.print("");
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Set<Villa> villas = villaList.keySet();
        for (Villa x : villas) {
            ReadAndWriteToFile.writeToFile(PATH_FILE, x.getInfoToCsv(), true);

        }
    }
}
