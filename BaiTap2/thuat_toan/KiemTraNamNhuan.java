package thuat_toan;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static boolean checkLapYear( int year){
        boolean isLeap=false;
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    isLeap=true;
                }else {
                    isLeap = false;
                }
            }else {
                isLeap = true;
            }
        }else {
            isLeap=false;
        }
        if( isLeap==true){
            System.out.println(year+ ":Năm nhuận");
        }else {
            System.out.println(year+ ":Năm ko nhuận");
        }
        return isLeap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập năm");
        int year=scanner.nextInt();
        checkLapYear(year);
    }
}
