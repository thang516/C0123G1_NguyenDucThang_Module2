package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student implements IStudent{
Scanner scanner = new Scanner(System.in);



    @Override
    public void add() {
        for (Student s: studentList) {
            System.out.println(s);
        }
    }

    @Override
    public void delete() {

    }

    @Override
    public void display() {

    }
}
