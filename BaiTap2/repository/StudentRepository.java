package repository;

import util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class Student implements IStudent {
    private final String FILE_PATH ="data\\student.csv";
    public List<Student> displayStudent(){
        List<Student> studentList=new ArrayList<>();
        List<String> stringList= ReadAndWrite.readStringToFileCsv(FILE_PATH);
        int size=stringList.size();
        for (int i = 0; i <size ; i++) {
            String string =stringList.get(i);
            String[] arr=string.split(",");
            Student student=new Student();
            studentList.add(student);

        }
        return studentList;
    }
}
