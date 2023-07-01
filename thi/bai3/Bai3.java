package bai3;

import java.util.Scanner;

public class Bai3 {
    // kiểm tra các ước lowns thứ 2
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập 1 số n");
//        int n = scanner.nextInt();
//        for (int i = n - 1; i >= 1; i--) {
//            if (n % i == 0) {
//                System.out.println(i);
//                break;
//
//            }
//        }
//    }
    public static int indexOf(char[] arr, char value){
        int size = arr.length;
        for (int i = 0; i < size ; i++) {
            if(arr[i] == value){
                return i;
            }
        }
        return -1;
    }
static char[] solution(String s) {
    char[] arr = s.toCharArray();
    String str="";
    for(int i = 0 ; i < arr.length; i++){
        for(int j= i+1; j< arr.length; j++){
            if(arr[i]==arr[j]){
                char[] kyTu=str.toCharArray();
                boolean check = indexOf(kyTu, arr[j]) != -1;
                if(!check){
                    str = str + arr[i];
                }
                break;
            }
        }
    }
    char[] array = str.toCharArray();
    return array;
}

    public static void main(String[] args) {
        System.out.println(solution("abcbbbbbbbbbbbbbbbbbbbbbbbbbcd"));
    }
}
