package baitap_s13;


import java.util.LinkedList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String string = input.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }


        for (Character ch : max) {
            System.out.print(ch);
        }
        System.out.println();
    }

/*********************************************************************************
 * 	TÃ­nh toÃ¡n Ä‘á»™ phá»©c táº¡p cá»§a bÃ i toÃ¡n:                                           *
 * 	1 vÃ²ng láº·p bÃªn ngoÃ i = n;                                                     *
 * 	1 vÃ²ng láº·p bÃªn trong = n - 1;                                                 *
 *  1 cÃ¢u lá»‡nh = 1                                                                *
 * 	1 vÃ²ng láº·p * 1 cÃ¢u lá»‡nh = 1;                                                  *
 *  T(n) = (n * (n - 1)) + (1 + 1);                                               *
 *  T(n) = O(n^2) + O(n);                                                         *
 * 	T(n) = O(n^2);                                                                *
 * 	=> Äá»™ phá»©c táº¡p bÃ i toÃ¡n nÃ y lÃ  O(n^2)                                         *
 *********************************************************************************/


}


