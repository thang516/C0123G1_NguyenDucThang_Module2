package introduction_to_java;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên bạn vào");
        String name = scanner.nextLine();
        System.out.println("Xin chào :" + name);
    }
}
