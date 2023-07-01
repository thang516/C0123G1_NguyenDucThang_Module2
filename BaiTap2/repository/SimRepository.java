package repository;

import model.Sim;
import util.ReadAndWrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimRepository implements ISimRepository {
    public final String PATH_FILE = "data\\sim.csv";

    public static String checkRegrex(String regex, String display) {
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean flag;
        do {
            System.out.println(display);
            input = scanner.nextLine();
            flag = input.matches(regex);
        }
        while (!flag);
        return input;
    }

    @Override
    public List<Sim> displayRepository() {
        List<Sim> simList = new ArrayList<>();
        List<String> stringList = ReadAndWrite.readToFile(PATH_FILE);
        for (int i = 0; i < stringList.size(); i++) {
            String str = stringList.get(i);
            String[] arr = str.split(",");
            Sim sim = new Sim(Integer.parseInt(arr[0]), arr[1], arr[2]);
            simList.add(sim);
        }
        return simList;
    }

    @Override
    public void addRepository(List<Sim> simList) {
        ReadAndWrite.writeToFile(PATH_FILE, "", false);
        for (int i = 0; i < simList.size(); i++) {
            Sim sim = simList.get(i);
            if (i == 0) {
                ReadAndWrite.writeToFile(PATH_FILE, sim.getInfoToFileCsv(), false);
            } else {
                ReadAndWrite.writeToFile(PATH_FILE, sim.getInfoToFileCsv(), true);
            }
        }
    }
    public  void add(List<Sim> simList){
        File file = new File("data\\sim.csv");
        try {
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.print("");
            printWriter.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        for (Sim x:
             simList) {
            ReadAndWrite.writeToFile(PATH_FILE,x.getInfoToFileCsv(),true);
        }

    }
}
