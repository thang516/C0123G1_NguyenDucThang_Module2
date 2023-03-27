package on_tap2;

public class Product {
    private int STT;
    private String name;
    private String price;

    public Product(int STT, String name, String price) {
        this.STT = STT;
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    public int getSTT() {
        return STT;
    }

    public void setSTT(int STT) {
        this.STT = STT;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "STT  :" + this.getSTT() +
                ", name  :'" + this.getName() + '\'' +
                ", price :'" + this.getPrice() + '\'';
    }

}
