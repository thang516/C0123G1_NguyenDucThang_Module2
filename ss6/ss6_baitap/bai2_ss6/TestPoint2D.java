package bai2_ss6;

import java.util.Scanner;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println("Mới đầu " + point2D.toString());
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập x do để ktra");
        float x = scanner.nextFloat();
        System.out.println("nhập y do để ktra");
        float y = scanner.nextFloat();
        point2D.setXY(x, y);
        System.out.println("Sau khi " + point2D.toString());
    }
}
