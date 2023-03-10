package access_modifier2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên của bạn zô :D");
        String student1 = scanner.nextLine();
        Student student = new Student();
        student.setName(student1);
        System.out.println(student.getName());
        System.out.println("Nhập lớp của bạn zo :D");
        String class1 = scanner.nextLine();
        student.setClasses(class1);
        System.out.println(student.toString(student1, class1));

    }

}
