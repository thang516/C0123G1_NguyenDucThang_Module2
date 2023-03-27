package ontap_comperable_comperator;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Student student1=new Student("thảo",30);
        Student student2=new Student("an",34);
        Student student3=new Student("nga",37);
        Student student4=new Student("lan",22);

        Student[] students=new Student[]{student1,student2,student3,student4};
        for (Student s:
             students) {
            System.out.println(s);
        }
        Arrays.sort(students);
        System.out.println("--------------------");
        for (Student s:
             students) {
            System.out.println(s);
        }
    }
}
