package thuat_toan;

import java.util.Arrays;
import java.util.Scanner;

public class ChoChuoiStringSapXepTheoTangDan {
    public static void main(String[] args) {
        String temp = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vô độ 1 chuỗi để so sánh ");
        String str = scanner.nextLine().toLowerCase();
        String[] arr = str.split("");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

