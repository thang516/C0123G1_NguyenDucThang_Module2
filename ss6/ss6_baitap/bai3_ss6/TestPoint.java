package bai3_ss6;

import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println("Ban đầu:" + point);
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập x zô");
        float x = scanner.nextFloat();
        System.out.println("nhập y zô ");
        float y = scanner.nextFloat();
        point.setX(x);
        point.setY(y);
        System.out.println(" Sau khi: " + point);
    }


}
