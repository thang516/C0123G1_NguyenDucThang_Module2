package s11_bai1;

import java.util.Scanner;
import java.util.Stack;

public class DoiNguoc2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài ");
        int doDai = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < doDai; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + "là:");
            String input = scanner.nextLine();
            stack.push(input);
        }
        System.out.println(stack);
        Stack<String> stack1 = new Stack<>();
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            stack1.push(stack.pop());
        }
        System.out.println(stack1);
    }
}
