package ss2_baitap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 6, 5, 5, 7, 5, 5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập phần tử cần xóa");
        int x = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = 0;
                i--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

