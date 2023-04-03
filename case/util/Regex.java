package util;

import java.util.Scanner;

public class Regex {
   static Scanner scanner = new Scanner(System.in);

    public static String checkRegrex(String regex, String display) {
        String input;
        boolean flag;
        do {
            flag=true;
            System.out.println(display);
            input = scanner.nextLine();
            flag = input.matches(regex);
        }
        while (!flag);
        return input;
    }

    public String checkIdVilla() {
        String regex = "^(SV)(VL)\\-[0-9]{4}$";
        String id;
        boolean flag;
        do {
            flag=true;
            System.out.println("Nhập id của room");
            id = scanner.nextLine();
            flag = id.matches(regex);
        }
        while (!flag);
        return id;
    }

    public String checkIdHouse() {
        String regex = "^(SV)(HO)\\-[0-9]{4}$";
        String id;
        boolean flag;
        do {
            flag=true;
            System.out.println("Nhập id của room");
            id = scanner.nextLine();
            flag = id.matches(regex);
        }
        while (!flag);
        return id;
    }

    public String checkIdRoom() {
        String regex = "^(SV)(RO)\\-[0-9]{4}$";
        String id;
        boolean flag;
        do {
            flag=true;
            System.out.println("Nhập id của room");
            id = scanner.nextLine();
            flag = id.matches(regex);
        }
        while (!flag);
        return id;
    }
    public String checkNameService(){
        String regex="^[A-Z][a-z]+$";
        String  nameService;
        boolean flag;
        do {
            flag=true;
            nameService=scanner.nextLine();
            flag=nameService.matches(regex);
        }
        while (!flag);
        return nameService;
    }
    public String checkArea(){
        String regex="^[3-9][0-9](m2)$";
        String  area;
        boolean flag;
        do {
            flag=true;
            area=scanner.nextLine();
            flag=area.matches(regex);
        }
        while (!flag);
        return area;
    }
    public static String checkTheDateMonthYear(){
        String regex="^(([0-2][0-9])||3[0-1])\\/(([0][0-9])||1[0-2])\\/((19((2[4-9])||([3-9][0-9])))||200[0-5])$";
        String dayYearMonth;
        boolean flag;
        do {
            flag=true;
            dayYearMonth=scanner.nextLine();
            flag=dayYearMonth.matches(regex);

        }
        while (!flag);
        return  dayYearMonth;
    }
}
