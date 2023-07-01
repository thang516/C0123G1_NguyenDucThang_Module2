package thuat_toan;

import java.util.Scanner;

public class ChoChuoiLamDaoNguoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào các số muốn đảo ngược");
        int numb =scanner.nextInt();
        int reverse=0;
      while (numb !=0){
          int digit=numb%10;
          reverse=reverse*10+digit;
         numb/=10;
      }
  System.out.println(reverse);
    }
}
