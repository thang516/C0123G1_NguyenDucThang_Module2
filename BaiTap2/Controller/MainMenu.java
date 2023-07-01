package Controller;

import service.SimService;

import java.util.Scanner;

public class MainMenu {
    public static void display() {
        Scanner scanner = new Scanner(System.in);
        SimService simService = new SimService();
        boolean flag = true;
        do {
            System.out.println(" Chọn chức năng:" +
                    "\n 1.display sim" +
                    "\n 2. add sim" +
                    "\n 3. delete sim" +
                    "\n 4. edit sim" +
                    "\n 5. exit");
            try {
                String choose = scanner.nextLine();
                switch (choose) {
                    case "1":
                        System.out.println("1.display sim");
                        simService.display();
                        break;
                    case "2":
                        System.out.println("2.add sim");
                        simService.add();
                        break;
                    case "3":
                        System.out.println("3.delete sim");
                        System.out.println("nhập sim");
                        int id=Integer.parseInt(scanner.nextLine());
                        simService.check(id);
                        simService.delete(id);
                        break;
                    case "4":
                        System.out.println("4.edit sim");
                        System.out.println("nhập sim");
                        int id1=Integer.parseInt(scanner.nextLine());
                        simService.edit(id1);
                        simService.edit(id1);
                        break;
                    case "5":
                        System.out.println("5.exit sim");
                        flag = false;
                        simService.saveToFile();
                        break;
                    default:
                        System.out.println("chọn cho có số trong menu");

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        while (flag);
    }
}
