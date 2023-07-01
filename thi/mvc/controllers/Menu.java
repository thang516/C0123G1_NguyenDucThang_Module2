package mvc.controllers;

import mvc.service.HoaDonTienDienService;

import java.util.Scanner;

public class Menu {
    public static void hienThiChucNang() {
        Scanner scanner = new Scanner(System.in);
        HoaDonTienDienService hoaDonTienDienService = new HoaDonTienDienService();
        boolean co = true;
        do {
            System.out.println("Chức năng : " +
                    "\n 1.Hiển thị hóa đơn tiền điện" +
                    "\n 2.thêm hoá đơn " +
                    "\n 3.thoát");
            try {
                String chon = scanner.nextLine();
                switch (chon) {
                    case "1":
                        System.out.println("Hiển thị chức năng");
                        hoaDonTienDienService.display();
                        break;
                    case "2":
                        System.out.println("thêm  chức năng");
                        hoaDonTienDienService.add();
                        break;
                    case "3":
                        System.out.println("3.Thoát");
                        co = false;
                        hoaDonTienDienService.luuFile();
                        break;
                    default:
                        System.out.println("Chọn 1 và 2 ko có số khác");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        while (co);
    }
}
