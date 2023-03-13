package lam_lai;

import java.util.Scanner;

public class LamLai {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập số nguyên  cần in ");
//        int numbers = scanner.nextInt();
//        int count = 0;
//        int n = 2;
////        while (n < numbers) {
////            for (int i = 1; i > 0; i++) {
////                count = 0;
////                for (int j = 1; j <= i; j++) {
////                    if (i % j == 0) {
////                        count++;
////                    }
////                }
////                if (count == 2) {
////                    n++;
////                    System.out.println(i);
////                }
////                if (n == numbers) {
////                    break;
////                }
//
//            }
//        }
//    }

    //
//    public static void main(String[] args) {
//
//        Scanner scanner =new Scanner(System.in);
//        System.out.println("Nhập số để xem các s ngto in ra");
//        int numbers=scanner.nextInt();
//        int count;
//        int n=2;
//        while (n<numbers){
//            for (int i = 1; i >0 ; i++) {
//                count=0;
//                for (int j = 1; j <=i ; j++) {
//                    if(i%j==0){
//                        count+=1;
//                    }
//                }
//                if(count==2){
//                   n++;
//                    System.out.println(i);
//                }
//                if( n==numbers){
//                    break;
//                }
//            }
//
//        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng nguyên tố muốn in  ra ");
        int numbers = Integer.parseInt(scanner.nextLine());
        int count;
        int n = 2;
        while (n < numbers) {
            for (int i = 1; i > 0; i++) {
                count = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count += 1;
                    }
                }
                if (count == 2) {
                    n++;
                    System.out.println(i);
                }
                if (n == numbers) {
                    break;
                }
            }
        }
    }
}

