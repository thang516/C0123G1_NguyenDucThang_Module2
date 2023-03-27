package thuc_hanh_bai_moi;

import java.io.Serializable;

public class Student1 implements Serializable {
    private int id;
    private String name;
    private  String address;

    public Student1() {
    }

    public Student1(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student : " +
                " ID :" + id +
                " Name :'" + name + '\'' +
                ", Address :'" + address + '\'';
    }
}
