package s11_bai4;

import sun.misc.Queue;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

public class KiemTraChuoiPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vô 1 chuỗi bất kì");
        String input = scanner.nextLine().toLowerCase();
        Stack<Character> stack = new Stack<>();
        ArrayDeque<Character> arrayDeque = new ArrayDeque<>();


        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        for (int i = 0; i < input.length(); i++) {
            arrayDeque.add(input.charAt(i));
        }

        boolean flag = true;
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            if (stack.pop() != arrayDeque.pop()) {
                flag = false;
            }
        }
        if (flag) {
            System.out.println(" Chuỗi Palindrome");
        } else {
            System.out.println(" Không chuỗi Palindrome");
        }
    }

}


