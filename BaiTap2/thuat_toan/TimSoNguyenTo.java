package thuat_toan;

import java.util.Scanner;

public class TimSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vô 1 số nguyên tố");
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Là số nguyên tố");
        } else {
            System.out.println("không phải là số nguyên tố");
        }
    }
}
