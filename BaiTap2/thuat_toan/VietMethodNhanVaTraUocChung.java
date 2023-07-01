package thuat_toan;

import java.util.ArrayList;
import java.util.Scanner;

public class VietMethodNhanVaTraUocChung {
    public static  ArrayList<Integer>  kiemTraUocChung(int arr){
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i = 1; i <=arr; i++) {
            if(arr%i==0){
                System.out.print(i);
                arrayList.add(i);
            }
        }
            return  arrayList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vô số  ");
        int so=scanner.nextInt();
        kiemTraUocChung(so);
    }
}
