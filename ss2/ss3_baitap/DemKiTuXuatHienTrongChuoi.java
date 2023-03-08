package ss3_baitap;

import java.util.Arrays;
import java.util.Scanner;

public class DemKiTuXuatHienTrongChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap. Cac' Phan` tu? zo");
            arr[i] = scanner.nextLine();
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Nhập Kí tự zo");
        String kyTu = scanner.nextLine();
        int count = 0;
        demKiTu(arr, kyTu, count);
    }

    public static void demKiTu(String[] arr, String kyTu, int count) {
        for (int i = 0; i < arr.length; i++) {
            if (kyTu.equals(arr[i])) {
                count++;
            }
        }
        System.out.println(count);
    }
}
