package introduction_to_java;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số vào để đọc");
        x = scanner.nextInt();
        String[] mang = new String[]{"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] mang1 = new String[]{"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        String[] mang2 = new String[]{"", "One hundred", "two hundred", "three hundred", "four hundred", "five hundred", "six hundred", "seven hundred", "eight hundred", "nine hundred"};

        if (x >= 0 && x <= 9) {
            switch (x) {
                case 0:
                    System.out.println("zero");
                    break;
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
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
        } else if (x >= 10 && x <= 19) {
            switch (x) {
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("Twelve");
                    break;
                case 13:
                    System.out.println("Thirteen");
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
        } else if (x >= 20 && x <= 99) {
            int hangChuc = x / 10;
            int hangDonVi = x % 10;
            System.out.println(mang[hangChuc]);
            System.out.println(mang1[hangDonVi]);
        } else if (x >= 100 && x <= 999) {
            int hangtram = x / 100;
            System.out.println(mang2[hangtram]);
            int hangChuc = x / 10 % 10;
            int hangDonVi = x % 10;
            if (x % 100 >= 20) {
                switch (hangChuc) {
                    case 0:
                        System.out.println(mang[0]);
                    case 1:
                        System.out.println(mang[1]);
                        break;
                    case 2:
                        System.out.println(mang[2]);
                        break;
                    case 3:
                        System.out.println(mang[3]);
                        break;
                    case 4:
                        System.out.println(mang[4]);
                        break;
                    case 5:
                        System.out.println(mang[5]);
                        break;
                    case 6:
                        System.out.println(mang[6]);
                        break;
                    case 7:
                        System.out.println(mang[7]);
                        break;
                    case 8:
                        System.out.println(mang[8]);
                        break;
                    case 9:
                        System.out.println(mang[9]);
                        break;
                }
                switch (hangDonVi) {
                    case 0:
                        System.out.println(mang1[0]);
                    case 1:
                        System.out.println(mang1[1]);
                        break;
                    case 2:
                        System.out.println(mang1[2]);
                        break;
                    case 3:
                        System.out.println(mang1[3]);
                        break;
                    case 4:
                        System.out.println(mang1[4]);
                        break;
                    case 5:
                        System.out.println(mang1[5]);
                        break;
                    case 6:
                        System.out.println(mang1[6]);
                        break;
                    case 7:
                        System.out.println(mang1[7]);
                        break;
                    case 8:
                        System.out.println(mang1[8]);
                        break;
                    case 9:
                        System.out.println(mang1[9]);
                        break;
                }

            } else if (x % 100 >= 10 && x % 100 <= 19) {
                switch (x % 100) {
                    case 10:
                        System.out.println("ten");
                        break;
                    case 11:
                        System.out.println("eleven");
                        break;
                    case 12:
                        System.out.println("Twelve");
                        break;
                    case 13:
                        System.out.println("Thirteen");
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
            } else if (x % 100 >= 0 && x % 100 <= 9) {
                switch (x % 100) {
                    case 0:
                        System.out.println("zero");
                        break;
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
                        System.out.println("eight");
                        break;
                    case 9:
                        System.out.println("nine");
                        break;
                }
            }

        }
    }
}
