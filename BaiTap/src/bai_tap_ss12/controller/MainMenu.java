package bai_tap_ss12.controller;

import bai_tap_ss12.service.ProductManager;

import java.util.Scanner;

public class MainMenu {
    public static void display() {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int id;
        do {
            System.out.println("Mời bạn chọn Menu :" +
                    "\n 1.Thêm Sản Phẩm " +
                    "\n 2.Sửa thông tin sản phầm theo id " +
                    "\n 3.Xóa sản phẩm theo id " +
                    "\n 4.Hiển thị danh sách sản phầm " +
                    "\n 5.Tìm kiếm sản phẩm theo tên " +
                    "\n 6.Sắp xếp sản phẩm tăng dần , giảm dần theo giá");
            System.out.println("Chọn chức năng số ");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("1.Thêm sản phẩm ");
                    productManager.add();
                    break;
                case 2:
                    System.out.println("2.Sửa thông tin sản phầm theo id ");
                    System.out.println("Nhập id của sản phẩm ");
                    id = scanner.nextInt();
                    if (productManager.check(id)) {
                        productManager.edit(id);
                    } else {
                        System.out.println("ID không hợp lệ EROR");
                    }
                    break;
                case 3:
                    System.out.println("3.Xóa sản phẩm theo id ");
                    System.out.println("Nhập id sản phẩm  ");
                    id = scanner.nextInt();
                    boolean check = productManager.check(id);
                    if (check) {
                        System.out.println("Vui lòng xác nhận có xóa hay ko");
                        boolean flag1 = true;
                        do {
                            System.out.println("1.Xóa " +
                                    "\n 2. Không xóa ");
                            int choose1 = scanner.nextInt();
                            switch (choose1) {
                                case 1:
                                    productManager.delete(id);
                                    flag1 = false;
                                    break;
                                default:
                                    System.out.println(" Bạn đã   không xóa ");
                                    flag1 = false;
                                    break;
                            }

                        }
                        while (flag1);
                    }

                    break;
                case 4:
                    System.out.println("4.Hiển thị danh sách sản phầm ");
                    productManager.display();
                    break;
                case 5:
                    System.out.println("5.Tìm kiếm sản phẩm theo tên ");
                    productManager.search();
                    break;
                case 6:
                    System.out.println("6.Sắp xếp sản phẩm tăng dần , giảm dần theo giá ");
                    System.out.println("-------------00------------");
                    productManager.arrange();
                    break;
            }
        }
        while (flag);
    }
}
