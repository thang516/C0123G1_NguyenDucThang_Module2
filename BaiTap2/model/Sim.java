package model;

public class Sim {
    private int id;
    private String name;
    private String price;

    public Sim() {
    }

    public Sim(int id, String name, String price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "Sim{" +
                "id=" + this.getId() +
                ", name='" + this.getName() + '\'' +
                ", price='" + this.getPrice() + '\'' +
                '}';
    }
    public String getInfoToFileCsv(){
        return id+","+name+","+price;
    }
}
