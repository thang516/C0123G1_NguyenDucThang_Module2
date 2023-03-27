package baitap_ss17.controller;

import baitap_ss17.model.Product;
import baitap_ss17.service.ProductService;

import java.util.Scanner;

public class MainMenu {
    public static void display() {
        ProductService productService = new ProductService();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng " +
                    "\n 1.Add product " +
                    "\n 2.Display product " +
                    "\n 3.Find product" +
                    "\n 4.Exit");
            int choosen = Integer.parseInt(scanner.nextLine());
            switch (choosen) {
                case 1:
                    System.out.println("1.Add product");
                    System.out.println("--------------");
                    productService.add();
                    break;
                case 2:
                    System.out.println("2.Display product");
                    System.out.println("--------------");
                    productService.display();
                    break;
                case 3:
                    System.out.println("3.Find product");
                    System.out.println("--------------");
                    productService.find();
                    break;
                case 4:
                    System.out.println("Exit");
                    flag = false;
                    break;
                default:
                    System.out.println("No options found");
            }
        }
        while (flag);
    }
}
