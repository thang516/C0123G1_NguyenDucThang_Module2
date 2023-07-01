package thuat_toan;

import java.util.Arrays;
import java.util.Scanner;

public class TimGiaTriLonThu2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập  vô độ dài ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + "Là:");
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int result = 0;
        int max = arr[0];
        int maxsecond = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for (int j = 1; j < arr.length; j++) {
            if (maxsecond < arr[j] && arr[j] != max) {
                maxsecond = arr[j];
                result = maxsecond;
            }

        }
        System.out.println("Số lớn nhất thứ 2:" + result);
    }
}
