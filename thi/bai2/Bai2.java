package bai2;

import java.util.Scanner;

public class Bai2 {
    public static int findMaxNumber(int n) {
        if (n > 999 && n <= 9999) {
            return n;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n");
        int n = scanner.nextInt();
        System.out.println(findMaxNumber(n));
    }
}

