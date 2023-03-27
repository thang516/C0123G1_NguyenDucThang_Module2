package baitap_ss17.repository;

import baitap_ss17.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> displayRepository();

    void addRepository(Product product);

    void findRepository();


}
