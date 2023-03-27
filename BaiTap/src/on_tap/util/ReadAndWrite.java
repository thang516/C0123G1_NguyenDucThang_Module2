package on_tap.util;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static void writeStringToFile(String filePath, String text, boolean appear) {
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(file, appear);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(text);
            bufferedWriter.newLine();
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();

        }

    }
   public static List<String> readFile(String filePath){
        List<String> studentList = new ArrayList<>();
        File file = new File(filePath);
       FileReader fileReader=null;
       BufferedReader bufferedReader=null;
       try {
           fileReader=new FileReader(file);
           bufferedReader=new BufferedReader(fileReader);
           String line=null;
           while ((line=bufferedReader.readLine())  !=null){
             studentList.add(line);
           }
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }

       return studentList;
   }

}
