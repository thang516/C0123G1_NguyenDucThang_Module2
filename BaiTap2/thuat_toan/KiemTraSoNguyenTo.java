package thuat_toan;

import java.util.Scanner;

public class KiemTraSoNguyenTo {

    public static boolean check(int numb){
        int count=0;
        for (int i = 1; i <=numb ; i++) {
            if(numb % i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return  false;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vô 1 số để kiêm tra");
        int numb=scanner.nextInt();
        check(numb);
    }

}
