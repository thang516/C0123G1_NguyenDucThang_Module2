package thuat_toan;

import java.util.Scanner;

public class ThuatToanTInhTongCacSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng số nguyên tố ");
        int number = scanner.nextInt();
        int count;
        int n = 2;
        int sum = 0;
//        while (n < number) {
//            for (int i = 1; i > 0; i++) {
//                count = 0;
//                for (int j = 1; j <= i; j++) {
//                    if (i % j == 0) {
//                        count++;
//                    }
//
//                }
//                if (count == 2) {
//                    n++;
//                    System.out.println(i);
//                    sum +=i;
//                }
//                if (n == number) {
//                    break;
//                }
//
//            }
//
//        }

        while (n < number) {
            for (int i = 1; i > 0; i++) {
                count = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    n++;
                    System.out.println(i);
                    sum += i;
                }
                if (n == number) {
                    break;
                }

            }
        }
        System.out.println(sum);
    }
}
