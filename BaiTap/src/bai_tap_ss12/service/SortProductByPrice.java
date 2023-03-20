package bai_tap_ss12.service;

import bai_tap_ss12.model.Product;

import java.util.Comparator;

public class SortProductByPrice implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
