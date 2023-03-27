package thuc_hanh_bai_moi;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student1> student1s = new ArrayList<>();
        student1s.add(new Student1(1, "Vũ Kiều Anh", "Hà Nội"));
        student1s.add(new Student1(2, "Nguyễn Minh Quân", "Hà Nội"));
        student1s.add(new Student1(3, "Đặng Huy Hoà", "Đà Nẵng"));
        student1s.add(new Student1(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        student1s.add(new Student1(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeDataToFile("src\\thuc_hanh_bai_moi\\student.txt", student1s);
        List<Student1> student1s1 = readDataFromFile("src/thuc_hanh_bai_moi/student.txt");
        for (Student1 s : student1s1
        ) {
            System.out.println(s);
        }


    }

    public static void writeDataToFile(String filePath, List<Student1> student1s) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student1s);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student1> readDataFromFile(String filePath) {
        List<Student1> student1s = new ArrayList<>();

        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            student1s = (List<Student1>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return student1s;
    }
}
