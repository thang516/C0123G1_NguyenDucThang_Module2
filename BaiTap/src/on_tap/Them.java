package on_tap;


import java.util.Arrays;
import java.util.Scanner;

public class Them {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println("nhập vào số cần  thêm  ");
        int giaTri = scanner.nextInt();
        System.out.println("Nhập vào vị trí để thêm");
        int viTri = scanner.nextInt();
        if (viTri == 0 || viTri >= arr.length - 1) {
            System.out.println("ko chèn đc");
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

