package ss2_baitap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] array3 = new int[10];
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Nhập các phần tử dô");
            array1[i] = scanner.nextInt();
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Nhập các pần tử mảng 2");
            array2[i] = scanner1.nextInt();

        }
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }
        System.out.println(Arrays.toString(array3));
    }
}
