package bai1_ss6;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        LopCircle circle = new LopCircle(3, "Blue");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập bán kính mới");
        double banKinhMoi = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập màu sắc mới ");
        String mauSacMoi = scanner.nextLine();
        circle.setBanKinh(banKinhMoi);
        circle.setMauSac(mauSacMoi);
        System.out.println(circle);

    }
}
