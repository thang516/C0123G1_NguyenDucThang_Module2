package ss3_baitap;

import java.util.Scanner;

public class TongCacSoOMotCot {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 3, 4, 5},
                {3, 4, 5, 6},
                {3, 8, 9, 10},
        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ban. muon' tinh' tong? cot. may': ");
        int cotMuonXoa = scanner.nextInt();
        int ketQua = sum(arr, cotMuonXoa);
        System.out.println(ketQua);
    }

    public static int sum(int arr[][], int cot) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i][cot];
        }
        return sum;
    }
}


