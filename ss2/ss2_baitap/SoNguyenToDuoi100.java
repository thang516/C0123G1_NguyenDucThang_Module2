package ss2_baitap;

import java.util.Scanner;

public class SoNguyenToDuoi100 {
    public static void main(String[] args) {
        int n = 2;
        int countPrime = 0;
        while (countPrime < 100) {
            int count = 0;
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    count += 1;
                }
            }
            if (count == 2) {
                countPrime++;
                System.out.println(n);
            }
            n++;
        }

    }
}
