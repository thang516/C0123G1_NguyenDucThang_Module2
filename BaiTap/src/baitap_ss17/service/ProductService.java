package baitap_ss17.service;

import baitap_ss17.model.Product;
import baitap_ss17.repository.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    Scanner scanner = new Scanner(System.in);

    ProductRepository productRepository = new ProductRepository();

    @Override
    public void display() {
        List<Product> productList = productRepository.displayRepository();
        for (Product p : productList) {
            System.out.println(p);
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập mã sản phầm ");
        int productId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập vào giá");
        String price = scanner.nextLine();
        System.out.println("Nhập hàng sản xuất");
        String producedGood = scanner.nextLine();
        System.out.println("Nhập mô tả ");
        String describe = scanner.nextLine();
        Product product = new Product(productId, name, Float.parseFloat(price), producedGood, describe);
        productRepository.addRepository(product);
    }


    @Override
    public void find() {
        List<Product> productList = productRepository.displayRepository();
        System.out.println("Nhập tên sản phẩm");
        String nameFind = scanner.nextLine();
        boolean flag = false;
        for (Product s : productList) {
            if (s.getName().toLowerCase().contains(nameFind.toLowerCase())) {
                System.out.println(s);
                flag = true;
            }

        }
        if (!flag) {
            System.out.println("Không tìm thấy ");
        }
    }
}
