package thuat_toan;

import java.util.Arrays;
import java.util.Scanner;

public class DemKiTuTrong1Chuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vô 1 chuỗi bất kì");
        String str = scanner.nextLine();
        String[] arr = str.split("");
        System.out.println("Nhập 1 phần tử bất kif");
        String value = scanner.nextLine();
        System.out.println(Arrays.toString(arr));
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (value.equals(arr[i])) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện" + count);

    }
}
