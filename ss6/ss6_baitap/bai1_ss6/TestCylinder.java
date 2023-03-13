package bai1_ss6;

import bai1_ss6.LopCylinder;

import java.util.Scanner;

public class TestCylinder {
    public static void main(String[] args) {
        LopCylinder cylinder = new LopCylinder(3.5, "blue", 5);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập bán kính ");
        double banKinhMoi = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập màu sắc");
        String mauSachMoi = scanner.nextLine();
        System.out.println("Nhập chiều cao");
        double chieuCaoMoi = Double.parseDouble(scanner.nextLine());
        cylinder.setBanKinh(banKinhMoi);
        cylinder.setMauSac(mauSachMoi);
        cylinder.setChieuCao(chieuCaoMoi);
        System.out.println(cylinder);

    }
}
