package ss2_baitap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 0, 0};
        System.out.println("nhập 1 số");
        int giaTri = scanner.nextInt();
        System.out.println("Nhập 1 vị trí để chèn");
        int viTri = scanner.nextInt();
        if (viTri == -1 && viTri >= arr.length - 1) {
            System.out.println("không chèn đc ");
        } else {
            for (int i = arr.length - 1; i >= viTri; i--) {
                arr[i] = arr[i - 1];
                if (i == viTri) {
                    arr[i] = giaTri;

                }
            }
            System.out.println(Arrays.toString(arr));
        }


    }

}

