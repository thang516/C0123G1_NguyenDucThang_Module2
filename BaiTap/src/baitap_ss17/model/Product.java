package baitap_ss17.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int productId;
    private String name;
    private float price;
    private String producedGoods;
    private String describe;

    public Product() {
    }

    public Product(int productId, String name, float price, String producedGoods, String describe) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.producedGoods = producedGoods;
        this.describe = describe;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getProducedGoods() {
        return producedGoods;
    }

    public void setProducedGoods(String producedGoods) {
        this.producedGoods = producedGoods;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product :" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", produced goods='" + producedGoods + '\'' +
                ", describe='" + describe + '\'';
    }

}
