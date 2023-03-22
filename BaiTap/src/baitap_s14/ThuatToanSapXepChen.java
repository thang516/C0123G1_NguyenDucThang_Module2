package baitap_s14;

import java.util.Arrays;
import java.util.Scanner;

public class ThuatToanSapXepChen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mãng ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập độ dài phần tử thứ " + (i + 1) + "là :");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Trước khi sắp xếp" + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Sau khi sắp xếp " + Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        int x;
        int pos;
        for (int i = 1; i < arr.length; i++) {
            x = arr[i];
            pos = i;
            while (0 < pos && x < arr[pos - 1]) {
                arr[pos] = arr[pos - 1];
                pos--;
                System.out.println("Lần thứ " + i + "-" + pos + "" + Arrays.toString(arr));
            }
            arr[pos] = x;
            System.out.println("Sau lần thứ " + i + ":" + Arrays.toString(arr));
        }
    }

}
