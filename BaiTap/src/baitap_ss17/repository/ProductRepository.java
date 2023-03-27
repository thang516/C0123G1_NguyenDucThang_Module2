package baitap_ss17.repository;

import baitap_ss17.model.Product;
import baitap_ss17.util.ReadAndWriteToBinary;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private final String PATH_FILE = "src\\baitap_ss17\\data\\product.dat";

    @Override
    public List<Product> displayRepository() {
        List<Product> productList = ReadAndWriteToBinary.readFileBinary(PATH_FILE);
        return productList;
    }

    @Override
    public void addRepository(Product product) {
        List<Product> productList = ReadAndWriteToBinary.readFileBinary(PATH_FILE);
        productList.add(product);
        ReadAndWriteToBinary.writeListProductToFileDat(PATH_FILE, productList);
    }

    @Override
    public void findRepository() {
        List<Product> productList = ReadAndWriteToBinary.readFileBinary(PATH_FILE);
        productList.add(new Product());

    }
}
