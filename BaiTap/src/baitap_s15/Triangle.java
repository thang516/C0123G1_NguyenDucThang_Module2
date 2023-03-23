package baitap_s15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 3 cạnh của tam giác ");

        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            System.out.println("Các cạnh bạn vừa nhập : " + " " + a + " " + b + " " + c);
            checkInput(a, b, c);
        } catch (IllegalTriangleException e) {
            throw new RuntimeException(e);
        } catch (InputMismatchException e) {
            System.out.println("Bạn nhập phải đúng format của chương trình là SỐ nhé ");

        }
    }

    public static boolean checkInput(int a, int b, int c) throws IllegalTriangleException {
        if (a < 0 && b < 0 && c < 0) {
            throw new IllegalTriangleException("Không phải là cạnh của tam giác ");
        } else if (a + b <= c || b + c <= a || c + a <= b) {
            throw new IllegalTriangleException("3 cạnh bạn vừa nhập ko phải là cạnh của tam giác");

        } else {
            return true;
        }
    }
}
