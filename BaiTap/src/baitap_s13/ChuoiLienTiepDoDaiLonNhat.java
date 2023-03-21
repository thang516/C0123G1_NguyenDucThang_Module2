package baitap_s13;

import java.util.LinkedList;
import java.util.Scanner;

public class ChuoiLienTiepDoDaiLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        System.out.println("Nhập vô 1 chuỗi");
        String str = scanner.nextLine();
        char[] arr = str.toCharArray();
        int max = 0;
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                result += arr[i];
            } else {
                max = arr[i];
                list.add(result);
                result = "";
                result += arr[i];

            }
        }
        list.add(result);
        String maxStart = list.get(0);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (maxStart.length() < list.get(i).length()) {
                maxStart = list.get(i);
            }
        }
        System.out.println("Chuỗi liên tiếp có độ dài lớn nhất là :" + maxStart);
    }
}
