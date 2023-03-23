package on_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ThucHanhLai {
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
        int[][] arr = {
                {2, 3, 4, 5},
                {3, 4, 5, 6},
                {3, 8, 9, 10},
        };
        System.out.println("Bạn muốn tính cột thứ bao nhiêu");
        int cotMuonTinh=scanner.nextInt();
        int ketQua=sum(arr,cotMuonTinh);
        System.out.println(ketQua);
    }
    public  static  int sum(int arr[][],int cot){
        int sum=0;
        for (int i = 0; i < arr.length ; i++) {
            sum+= arr[i][cot];
        }
        return sum;
    }
}
