package interface_resizeable;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Ban đầu kích thước:");
        Circle circle = new Circle();
        System.out.println(circle.toString());
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.toString());
        Square square = new Square();
        System.out.println(square.toString());
        System.out.println("---------------00---------------");
        double x = Math.floor(Math.random() * 100) + 1;
        System.out.println(" Kích thước thay đổi : " + x);
        Shape[] arr = new Shape[3];
        arr[0] = new Circle();
        arr[1] = new Rectangle();
        arr[2] = new Square();
        for (Shape s : arr) {
            s.resize(x);
        }
        System.out.println("Sau khi tăng kích thước :");
        Shape.printShape(arr);

    }
}
