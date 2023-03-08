package ss3_baitap;

import java.util.Scanner;

public class DocSoThanhChuCach2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần đọc");
        int number = scanner.nextInt();
        int hangChucTinh = number / 10;
        int hangdonVi = number % 10;
//        String[] mang2 = new String[]{"", "One hundred", "two hundred", "three hundred", "four hundred", "five hundred", "six hundred", "seven hundred", "eight hundred", "nine hundred"};
        int hangTram = number / 100;
        int hangChuc = hangChucTinh % 10;
        if (number < 10) {
            hangDonVi(number);
        } else if (number < 20) {
            hangHon10(number);
        } else if (number < 100) {
            hangChuc(hangChuc);
            hangDonVi(hangdonVi);
        } else if (number < 1000) {
            hangDonVi(hangTram);
            System.out.println("hundred"); // 516
            int layDu = number % 100;
            if (layDu > 0 && layDu <= 10) {
                hangDonVi(layDu);
            } else if (layDu > 10 && layDu < 20) {
                hangHon10(layDu);
            } else {
                hangChuc(hangChuc);
                hangDonVi(hangChuc);
            }
        }
    }

    public static void hangDonVi(int number) {
        switch (number) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eigth");
                break;
            case 9:
                System.out.println("nine");
                break;
            case 10:
                System.out.println("ten");
                break;
        }
    }

    public static void hangHon10(int number) {
        switch (number) {
            case 11:
                System.out.println("eleven");
                break;
            case 12:
                System.out.println("twelve");
                break;
            case 13:
                System.out.println("thirteen");
                break;
            case 14:
                System.out.println("fourteen");
                break;
            case 15:
                System.out.println("fifteen");
                break;
            case 16:
                System.out.println("sixteen");
                break;
            case 17:
                System.out.println("seventeen");
                break;
            case 18:
                System.out.println("eighteen");
                break;
            case 19:
                System.out.println("nineteen");
                break;
        }
    }

    public static void hangChuc(int number) {
        switch (number) {
            case 2:
                System.out.println("twenty");
                break;
            case 3:
                System.out.println("thirty");
                break;
            case 4:
                System.out.println("fourty");
                break;
            case 5:
                System.out.println("fifty");
                break;
            case 6:
                System.out.println("sixty");
                break;
            case 7:
                System.out.println("seventy");
                break;
            case 8:
                System.out.println("eighty");
                break;
            case 9:
                System.out.println("ninety");
                break;
        }

    }


}