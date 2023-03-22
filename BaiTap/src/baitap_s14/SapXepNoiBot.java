package baitap_s14;

import java.util.Arrays;
import java.util.Scanner;

public class SapXepNoiBot {
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
        bubbleSort(arr);
        System.out.println("Sau khi sắp xếp " + Arrays.toString(arr));

    }
    public static void bubbleSort(int[] arr){
        boolean flag=true;
        for (int i = 0; i < arr.length && flag ; i++) {
            flag=false;
            for (int j = arr.length-1; j >i ; j++) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    flag=true;
                }
                System.out.println("Lần thứ "+i+":"+Arrays.toString(arr));
            }
            System.out.println("Lần thứ "+i+":"+Arrays.toString(arr));

        }
    }

}
