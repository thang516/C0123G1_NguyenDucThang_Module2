package baitap_s14;

import java.util.Arrays;
import java.util.Scanner;

public class SapXepChon {
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
        selectionSort(arr);
        System.out.println("Sau khi sắp xếp " + Arrays.toString(arr));


    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int indexMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indexMin]) {
                    indexMin = j;
                }
            }
            if (indexMin != i) {
                int temp = arr[i];
                arr[i] = arr[indexMin];
                arr[indexMin] = temp;
            }
            System.out.println("Lần thứ " + i + ":" + Arrays.toString(arr));
        }

    }


}




