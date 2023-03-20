package bai_tap_ss12.service;

import bai_tap_ss12.model.Product;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class ProductManager implements IProductManager {
    static LinkedList<Product> linkedList = new LinkedList<>();
    static Product product3 = new Product(03, "Sữa Cô Gái Hà lan", 800);

    static Product product = new Product(01, "Sữa ông thọ", 500);
    static Product product1 = new Product(02, "Sữa Ensure Gold", 600);

    static {
        linkedList.add(product3);
        linkedList.add(product);
        linkedList.add(product1);
    }

    Scanner scanner = new Scanner(System.in);

    public Product insertInformation() {

        System.out.println("Nhập id của sản phầm  ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên của sản phẩm ");
        String ten = scanner.nextLine();
        System.out.println("Nhập giá tiền  của sản phẩm ");
        int gia = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, ten, gia);
        return product;
    }

    @Override
    public void add() {
        Product product = insertInformation();
        linkedList.add(product);


    }


    public boolean check(int id) {
        for (Product x : linkedList) {
            if (id == x.getId()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void edit(int id) {
        Product product = insertInformation();
        int size = linkedList.size();
        for (int i = 0; i < size; i++) {
            if (linkedList.get(i).getId() == id) {
                linkedList.set(i, product);
                break;
            }
        }
    }

    @Override
    public void delete(int id) {
        for (Product x : linkedList) {
            if (id == x.getId()) {
                linkedList.remove(x);
                break;
            }
        }
    }

    @Override
    public void display() {
        for (Product x : linkedList) {
            System.out.println(x);
        }
    }

    @Override
    public void search() {

        System.out.println("Nhập tên sản phẩm muốn tìm ? ");
        String name = scanner.nextLine();
        int count = 0;
        for (Product x : linkedList) {
            if (name.equals(x.getNameProduct())) {
                System.out.println(x);
            } else {
                count++;
            }
        }
        if (count == linkedList.size()) {
            System.out.println("EROR");
        }
    }

    @Override
    public void arrange() {
        System.out.println("Bạn muốn tăng hay giảm nhập số 1 or 2 tương ứng  ");
        boolean check = true;

        do {
            int input = Integer.parseInt(scanner.nextLine());
            switch (input) {
                case 1:
                    Collections.sort(linkedList, new SortProductByPrice());
                    System.out.println("Bạn đã sắp xếp tăng dần");
                    check = false;
                    break;
                case 2:
                    Collections.sort(linkedList, new Comparator<Product>() {
                                @Override
                                public int compare(Product o1, Product o2) {
                                    return o2.getPrice() - o1.getPrice();
                                }
                            }
                    );
                    System.out.println("Bạn đã sắp xếp giảm dần  ");
                    check = false;
                    break;
            }
        } while (check);

        for (Product x : linkedList) {
            System.out.println(x);

        }
    }
}