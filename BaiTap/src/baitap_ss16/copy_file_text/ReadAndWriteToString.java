package baitap_ss16.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteToString {
    public static void main(String[] args) {
        String path = "src\\baitap_ss16\\copy_file_text\\sourceFile.txt";
        readFileText("src\\baitap_ss16\\copy_file_text\\targetFile.txt");
        List<String> stringList = readFileText(path);
        for (String x : stringList) {
            System.out.println(x);
        }
        writeFileText(stringList, "src\\baitap_ss16\\copy_file_text\\targetFile.txt", true);
    }

    public static List<String> readFileText(String filePath) {
        List<String> stringList = new ArrayList<>();
        File file = new File(filePath);

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
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static void writeFileText(List<String> list, String filePath, boolean a) {
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, a);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < list.size(); i++) {
                bufferedWriter.write(list.get(i));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
