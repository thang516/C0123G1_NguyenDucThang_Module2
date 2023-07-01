package thuat_toan;

import java.util.Scanner;

public  class MethodPrint100Fibonashi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vô số  ");
        int so = scanner.nextInt();
        check(so);
    }

    public static void check(int numb) {
        int temp = 0;
        int n1 = 0;
        int n2 = 1;
        int i = 0;
        while (i <= numb) {
            System.out.println(n1);
            temp = n1 + n2;
            n1 = n2;
            n2 = temp;
            i++;
        }

    }
}
