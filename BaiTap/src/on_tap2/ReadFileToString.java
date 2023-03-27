package on_tap2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFileToString {
    public static void main(String[] args) {

        String path="src\\on_tap2\\student_list_csv";
        List<Product> list=Read(path);
        for (Product x:
             list) {
            System.out.println(x);
        }
    }
public static List<Product> Read(String path){
    List<Product> productList = new ArrayList<>();
    File file= new File(path);
    FileReader fileReader = null;
    BufferedReader bufferedReader= null;

    try {
        fileReader=new FileReader(file);
        bufferedReader=new BufferedReader(fileReader);
        String line=null;
        while ((line=bufferedReader.readLine())!=null){
            String[]arr=line.split(",");
            productList.add(new Product(Integer.parseInt(arr[0]),arr[1],arr[2]));
        }
        bufferedReader.close();
        fileReader.close();

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
    return productList;
}

}
