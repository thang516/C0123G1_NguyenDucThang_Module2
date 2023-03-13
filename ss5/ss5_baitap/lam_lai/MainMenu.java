package lam_lai;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        StudentManager studentManager=new StudentManager();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Mời bạn chọn chức năng để xem " +
                    "\n 1.Display" +
                    "\n 2.Add" +
                    "\n 3.Delete" +
                    "\n 4.Exit");
            System.out.println("Chọn chức nănn");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Chức năng hiển thị");
                    studentManager.display();
                    break;
                case 2:
                    System.out.println("Chức năng thêm");
                    studentManager.add();
                    break;
                case 3:
                    System.out.println("Chức năng Xóa");
                    studentManager.delete();
                    break;
                default:
                    System.out.println("thoát");
                    flag = false;
            }
        }
        while (flag);
    }
}

