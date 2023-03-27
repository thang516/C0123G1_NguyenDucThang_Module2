package on_tap.repository;

import on_tap.model.Student;

import on_tap.util.ReadAndWrite;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StudentRepository implements IStudentRepository {
    private  final String PATH_FILE="src\\on_tap\\data\\student.txt";
//    static  ArrayList<Student> studentArrayList =new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);


    @Override
    public List<Student> display() {
        List<Student> studentList = new ArrayList<>();
        List<String> stringList = ReadAndWrite.readFile(PATH_FILE);
        for (int i = 0; i < stringList.size(); i++) {
            String string = stringList.get(i);
            String[] arr = string.split(",");
            Student student = new Student(Integer.parseInt(arr[0]),
                    arr[1],arr[2],arr[3]);
            studentList.add(student);
        }
        return studentList;
    }

    public Student enterValue(){
        System.out.println("Nhập vào id của bạn");
        int id=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên của bạn");
        String ten=scanner.nextLine();
        System.out.println("Nhập giới tính");
        String gioiTinh=scanner.nextLine();
        System.out.println("Nhập vào nơi sinh");
        String noiSinh=scanner.nextLine();
        Student student = new Student(id,ten,gioiTinh,noiSinh);
        return student;
    }

    @Override
    public void add() {
        Student student= enterValue();
        String studentStr = student.getId() + "," + student.getHoVaTen() + "," + student.getGioiTinh() + "," + student.getNoiSinh();
        ReadAndWrite.writeStringToFile(PATH_FILE,studentStr,true);

    }

    @Override
    public void delete(int studentId) {
        int deleteIndex = check(studentId);
        if(deleteIndex != -1){
            List<Student> studentList= display();
            studentList.remove(deleteIndex);
                ReadAndWrite.writeStringToFile(PATH_FILE, "" ,false);
                int size = studentList.size();
                for (int i =0 ; i < size; i++) {
                    String student1 = studentList.get(i).getId() + "," + studentList.get(i).getHoVaTen() + "," + studentList.get(i).getGioiTinh() + "," + studentList.get(i).getNoiSinh();
                    if (i == 0){
                        ReadAndWrite.writeStringToFile(PATH_FILE, student1 ,false);
                    } else {
                        ReadAndWrite.writeStringToFile(PATH_FILE, student1 ,true);
                    }
                }
        }else {
            System.out.println("Không tìm thấy ID trùng để xóa");
        }

    }
    @Override
    public void edit(int studentId) {
        int index= check(studentId);
        if( index !=-1){
            List<Student> studentList= display();
            Student student=enterValue();
            studentList.set(index,student);
            ReadAndWrite.writeStringToFile(PATH_FILE, "" ,false);
            int size = studentList.size();
            for (int i =0 ; i < size; i++) {
                String student1 = studentList.get(i).getId() + "," + studentList.get(i).getHoVaTen() + "," + studentList.get(i).getGioiTinh() + "," + studentList.get(i).getNoiSinh();
                if (i == 0){
                    ReadAndWrite.writeStringToFile(PATH_FILE, student1 ,false);
                } else {
                    ReadAndWrite.writeStringToFile(PATH_FILE, student1 ,true);
                }
            }

        }else {
            System.out.println("Không tìm thấy ");
        }
    }
    public int check(int id){
       List<Student> studentList= display();
        int size = studentList.size();
        for (int i =0 ; i < size; i++) {
            if(id == studentList.get(i).getId()){
                return i;
            }
        }
       return -1;
    }

}
