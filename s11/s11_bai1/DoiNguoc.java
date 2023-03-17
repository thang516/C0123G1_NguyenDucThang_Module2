package s11_bai1;

import java.util.Scanner;
import java.util.Stack;

public class DoiNguoc {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài ");
        int doDai = scanner.nextInt();
        for (int i = 0; i < doDai; i++) {
            System.out.println("Phần tử thứ " + (i + 1) + "là :");
            int input = scanner.nextInt();
            stack.push(input);
        }
        Stack<Integer> stack2 = new Stack<>();
        System.out.println(stack);
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            stack2.push(stack.pop());
        }
        System.out.println(stack2);
    }

}
