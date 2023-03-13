package bai2_ss6;

import java.util.Scanner;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println("Trước khi set lại:" + point3D.toString());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn hãy nhập x zô");
        float x = scanner.nextFloat();
        System.out.println("Bạn hãy nhập y zô");
        float y = scanner.nextFloat();
        System.out.println("Bạn hãy nhập z zô");
        float z = scanner.nextFloat();
        point3D.setXYZ(x, y, z);
        System.out.println("Sau khi set lại giá trị: " + point3D.toString());

    }
}
