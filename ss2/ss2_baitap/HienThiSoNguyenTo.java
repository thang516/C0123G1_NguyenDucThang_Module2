package ss2_baitap;

import javax.swing.*;
import java.util.Scanner;

public class HienThiSoNguyenTo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 giá trị từ bàn phím  ");
        int numbers = scanner.nextInt();
        int count;
        int n = 0;
        while (n < numbers) {
            for (int i = 1; i > 0; i++) {
                count = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    n++;
                    System.out.println(i + ":là số nguyên tố");
                }

                if (n == numbers) {
                    break;
                }
            }

        }

    }

}

