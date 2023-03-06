package introduction_to_java;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn hãy nhập vào số tiền usd muốn đổi ");
        usd = Integer.parseInt(scanner.nextLine());
        double quyDoi = usd * vnd;
        System.out.println("Số tiền quy đổi là " + quyDoi);
    }
}
