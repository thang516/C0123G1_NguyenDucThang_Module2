package thuat_toan;

import java.util.Arrays;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vô  độ dài mãng ");
        int v = scanner.nextInt();
        System.out.println("----------");
        System.out.println("Nhập vô 1 N bất kì");
        int n = scanner.nextInt();
        int[] arr = new int[v];
        int result1 = -1;
        int result2 = -1;
        for (int i = 0; i < v; i++) {
            System.out.println("Nhập các phần tử của mãng " + (i + 1) + "là:");
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (n == arr[i] + arr[j]) {
                    result1 = i;
                    result2 = j;
                    break;
                }
            }
            if (result1 != -1 && result2 != -1) {
                break;
            }
        }
        System.out.println("Vị trí số đầu tiên :" + result1);
        System.out.println("Vị trí số thứ 2  :" + result2);
    }
}
