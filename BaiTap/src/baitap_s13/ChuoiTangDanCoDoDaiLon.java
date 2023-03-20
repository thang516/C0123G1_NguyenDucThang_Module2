package baitap_s13;

import java.util.*;

public class ChuoiTangDanCoDoDaiLon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi :");
        String myString = scanner.nextLine();
        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < myString.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(myString.charAt(i));
            for (int j = i + 1; j < myString.length(); j++) {
                if (myString.charAt(j) > list.getLast()) {
                    list.add(myString.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character x : max) {
            System.out.println(x);
        }
        System.out.println();
    }
}
