package baitap_ss16;

import baitap_ss16.copy_read_csv.Country;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCSV {
    public static void main(String[] args) {
        String path = "src\\baitap_ss16\\contries..csv";
        List<Country> list = readFileToListString(path);
        for (Country x : list) {
            System.out.println(x);
        }

    }

    public static List<Country> readFileToListString(String pathFile) {
        List<Country> stringList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(",");
                stringList.add(new Country(Integer.parseInt(arr[0]), arr[1], arr[2]));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }
}
