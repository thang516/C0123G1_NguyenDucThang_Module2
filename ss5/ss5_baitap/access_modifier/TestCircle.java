package access_modifier;

import access_modifier.Circle;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập từ bàn phím");
        double banKinh = scanner.nextDouble();
        Circle circle = new Circle(banKinh);
        System.out.println(circle.getArea());

    }
}
