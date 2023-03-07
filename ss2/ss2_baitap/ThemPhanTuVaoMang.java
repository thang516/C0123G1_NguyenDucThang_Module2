package ss2_baitap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
//    int[] arr=new int[10];
        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Nhập các phần tử trong mãng "+(i+1));
//            arr[i]=scanner.nextInt();
//        }
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
                if (i == viTri){
                    arr[i] = giaTri;

                }
            }
            System.out.println(Arrays.toString(arr));
        }


    }

}

