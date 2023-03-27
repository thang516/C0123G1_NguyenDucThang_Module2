package ontap_comperable_comperator.comperator;

import ontap_comperable_comperator.Student;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        Student student1=new Student("thảo",30);
        Student student2=new Student("an",34);
        Student student3=new Student("nga",37);
        Student student4=new Student("lan",22);

        Student[] studentsList=new Student[]{student1,student2,student3,student4};
        for (Student s:
                studentsList) {
            System.out.println(s);
        }
        Arrays.sort(studentsList, new SortStudentByAge());
        System.out.println("----------------");
        for (Student s: studentsList) {
            System.out.println(s);
        }
        Arrays.sort(studentsList, new SortStudentByName());
        System.out.println("----------------------");
        for (Student s: studentsList) {
            System.out.println(s);
        }
    }

}
