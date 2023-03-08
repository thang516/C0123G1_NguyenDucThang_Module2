package ss3_baitap;

import java.util.Arrays;
import java.util.Scanner;

public class TongSoDuongCheoChinh {
    public static void main(String[] args) {
        int n;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhập số bậc của ma trận:");
        n = scanner1.nextInt();
        int[][] arr = new int[n][n];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Nhập phần tử :" + i + "---" + j);
                arr[i][j] = scanner.nextInt();
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        int ketQua = sum(arr);
        System.out.println(ketQua);
    }

    public static int sum(int arr[][]) {
        int hungKetQua = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    hungKetQua = hungKetQua + arr[i][j];
                }

            }
        }
        return hungKetQua;
    }

}

