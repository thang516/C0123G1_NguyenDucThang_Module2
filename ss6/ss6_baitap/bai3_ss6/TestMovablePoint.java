package bai3_ss6;

import java.util.Scanner;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println("Mới đầu" + movablePoint);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số x");
        float x = scanner.nextFloat();
        System.out.println("Nhập số y");
        float y = scanner.nextFloat();
        System.out.println("Nhập số xSpeed");
        float xSpeed = scanner.nextFloat();
        System.out.println("Nhập số ySpeed");
        float ySpeed = scanner.nextFloat();
        movablePoint.setX(x);
        movablePoint.setY(y);
        movablePoint.setXSpeed(xSpeed);
        movablePoint.setYSpeed(ySpeed);
        System.out.println(movablePoint);
        System.out.println(" Khi thay đổi con trỏ: " + movablePoint.move());

    }
}
