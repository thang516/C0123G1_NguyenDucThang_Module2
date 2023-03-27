package on_tap.service;

import on_tap.model.Student;
import on_tap.repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    Scanner scanner = new Scanner(System.in);
    static ArrayList<Student> arrayList =new ArrayList<>();
    private StudentRepository studentRepository = new StudentRepository();

    @Override
    public void add() {

    studentRepository.add();
    }

    @Override
    public void display() {
        List<Student> studentList = studentRepository.display();
        for (Student x:studentList) {
            System.out.println(x);


        }
    }

    @Override
    public void delete(int studentId) {
        studentRepository.delete(studentId);
    }

    @Override
    public void edit(int studentId) {
        studentRepository.edit(studentId);
    }


    public boolean check(int maHocSinh){
        return studentRepository.check(maHocSinh) != -1;
    }
}
