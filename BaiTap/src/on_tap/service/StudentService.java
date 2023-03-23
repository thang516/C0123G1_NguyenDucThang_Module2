package on_tap.service;

import on_tap.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService implements IStudentService {
    Scanner scanner = new Scanner(System.in);
    static ArrayList<Student> arrayList =new ArrayList<>();
    static Student student1=new Student(01,"Nguyễn Đức Thắng","Nam","Đà Nẵng");
    static Student student2=new Student(02,"Nguyễn Phương Thảo","Nữ","Đà Nẵng");
    static {
        arrayList.add(student1);
        arrayList.add(student2);
    }
    @Override
    public void add() {
        System.out.println("Nhập vào id của bạn");
        int id=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên của bạn");
        String ten=scanner.nextLine();
        System.out.println("Nhập giới tính");
        String gioiTinh=scanner.nextLine();
        System.out.println("Nhập vào nơi sinh");
        String noiSinh=scanner.nextLine();
        Student student = new Student(id,ten,gioiTinh,noiSinh);
        arrayList.add(student);
    }

    @Override
    public void display() {
        for (Student x:arrayList) {
            System.out.println(x);
        }
    }

    @Override
    public void delete(int maHocSinh) {
        for ( Student x: arrayList) {
            if(maHocSinh==x.getId()){
                    arrayList.remove(x);
                    break;
            }
        }
    }
    public boolean check(int maHocSinh){
        for (Student x: arrayList) {
            if (maHocSinh==x.getId()){
                return true;
            }
        }
        return false;
    }
}
