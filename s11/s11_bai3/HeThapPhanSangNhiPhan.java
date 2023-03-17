package s11_bai3;

import java.util.Scanner;
import java.util.Stack;

public class HeThapPhanSangNhiPhan {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 số bất kì ");
        number = scanner.nextInt();

        while (number / 2 > 0) {
            for (int i = 0; i < number; i++) {
                stack.push(number % 2);
                number = number / 2;
            }
        }
        stack.push(number % 2);
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            System.out.print(stack.pop());
        }

    }
}
