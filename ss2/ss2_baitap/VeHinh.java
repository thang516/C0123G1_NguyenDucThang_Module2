package ss2_baitap;

import java.util.Scanner;

public class VeHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập từ 1 đến 6 để xem  hình");
        int x = Integer.parseInt(scanner.nextLine());
        switch (x) {
            case 1:
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 7; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 3:
                for (int i = 7; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");

                    }
                    System.out.println("");
                }
                break;
            case 4:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= 5; j++) {
                        if (j <= 5 - i) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    }
                    System.out.println("");
                }
                break;
            case 5:
                for (int i = 5; i >= 1; i--) {
                    for (int j = 1; j <= 5; j++) {
                        if (j <= 5 - i) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    }
                    System.out.println("");
                }
                break;
            case 6:
                int chieuCao = 5;
                int chieuRong = 9;
                double middle = Math.ceil(chieuRong / 2);
                for (int i = 1; i <= chieuCao; i++) {
                    for (int j = 1; j <= chieuRong; j++) {
                        if (j < middle - i + 1 || j > middle + i - 1) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    }
                    System.out.println("");
                }
                break;
            default:
                System.out.println("Bạn đã thoát khỏi ctrinh");
                break;
        }

    }
}
