package baitap_s19;

import java.util.Scanner;

public class CheckClassed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String reGex = "^[C_A_P][0-9]{0,4}[G_H_I_K]$";
        System.out.println("Nhập lớp của bạn");
        String classed = scanner.nextLine();
        boolean flag = classed.matches(reGex);
        if (flag) {
            System.out.println("Lớp của bạn đúng ");
        } else {
            System.out.println("Lớp của bạn không tồn tại");
        }
    }

}
