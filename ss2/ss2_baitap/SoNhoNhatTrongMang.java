package ss2_baitap;

import java.util.Arrays;
import java.util.Scanner;

public class SoNhoNhatTrongMang {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập các phần tử trong mãng thứ: " + (i + 1));
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Số nhỏ nhất:" + min);
        System.out.println(Arrays.toString(arr));
    }
}
