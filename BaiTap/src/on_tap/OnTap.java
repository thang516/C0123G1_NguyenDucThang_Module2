package on_tap;


import java.util.Arrays;
import java.util.Scanner;

public class OnTap {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 3};

        System.out.println(check(a));
    }


    public static boolean check(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int left = 0;
            int right = 0;
            for (int j = 0; j < i; j++) {
                left += a[j];
            }
            for (int j = i + 1; j < a.length; j++) {
                right += a[j];
            }
            if (left == right) {
                return true;
            }
        }
        return false;
    }
}