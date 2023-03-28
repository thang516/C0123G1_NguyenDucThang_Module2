package baitap_s19;

import java.util.Scanner;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String reGex = "^((\\+84)||0)[0-9]{10}$";
        System.out.println("Nhập vô số điện thoại bạn số mới là 10 số nha");
        String phoneNumber = scanner.nextLine();
        boolean flag = phoneNumber.matches(reGex);
        if (flag) {
            System.out.println("Số điện thoại của bạn đúng");
        } else {
            System.out.println("Số điện thoại không hợp lệ vui lòng kiểm tra lại ");
        }
    }
}
