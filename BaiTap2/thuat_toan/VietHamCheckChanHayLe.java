package thuat_toan;

import java.util.Scanner;

public class VietHamCheckChanHayLe {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vô 1 số");
        int numb=scanner.nextInt();
        check(numb);
    }
    public static void check(int numb){
        if(numb%2==0){
            System.out.println("false");
        }else {
            System.out.println("true");
        }

    }

}
