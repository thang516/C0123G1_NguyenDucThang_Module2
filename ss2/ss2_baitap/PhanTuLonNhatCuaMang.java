package ss2_baitap;

import java.util.Scanner;

public class PhanTuLonNhatCuaMang {
    public static void main(String[] args) {
        int[][] arr= new  int[3][3];
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập độ dài mãng");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhập phần tử thứ"+i+"--"+j);
                arr[i][j]=scanner.nextInt();
            }
        }

        int max=arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max<arr[i][j]){
                    max=arr[i][j];
                }
                System.out.println(arr[i][j]);
            }
            System.out.println("--------");
        }
        System.out.println(" giá trị lớn nhất :"+max);
    }
}
