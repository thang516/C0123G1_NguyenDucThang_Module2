package thuat_toan;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class KiemTraDoiXung {

    public static boolean check(int[] numb) {
        boolean flag=true;
        int j=numb.length-1;
        for (int i = 0; i < numb.length/2; i++) {
            if (numb[i] != numb[j]) {
                flag=false;
            }
            j--;
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vô số lượng ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập vô các số trong i" + (i + 1) + "là:");
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("--------------");
        System.out.println(check(arr));
    }
}
