package baitap_s13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ChuoiLienTiepCoDoDaiLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        System.out.println("Nhập chuỗi: ");
        String string = scanner.nextLine();
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            if (list.size() > 1 && string.charAt(i) <= list.getLast() &&
                    list.contains(string.charAt(i))) {
                list.clear();
            }
            list.add(string.charAt(i));
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }


        for (Character x : max) {
            System.out.print(x);
        }
        System.out.println();
    }
}