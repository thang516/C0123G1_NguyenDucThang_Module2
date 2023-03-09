package ss4;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a ");
        double a = scanner.nextDouble();
        System.out.println("Nhập b ");
        double b = scanner.nextDouble();
        System.out.println("Nhập c ");
        double c = scanner.nextDouble();
        Qua nhapDulieu = new Qua(a, b, c);
        if (nhapDulieu.getDiscriminant() > 0) {
            System.out.println("Phương trình có 2 nghiệm");
            System.out.println("Nghiệm 1: " + nhapDulieu.getRoot1() + ", Nghiệm 2:" + nhapDulieu.getRoot2());
        } else if (nhapDulieu.getDiscriminant() == 0) {
            System.out.println("Phương trình có 1 nghiệm kép : " + nhapDulieu.getRoot3());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}

class Qua {
    double a, b, c;

    public Qua(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getDiscriminant() {
        double delta = Math.pow(this.b, 2) - (4 * this.a * this.c);
        return delta;
    }

    public double getRoot1() {
        double r1 = ((-this.b) + Math.sqrt(this.getDiscriminant())) / (2 * this.a);
        return r1;
    }

    public double getRoot2() {
        double r2 = ((-this.b) - Math.sqrt(this.getDiscriminant())) / (2 * this.a);
        return r2;
    }

    public double getRoot3() {
        double r3 = -this.b / (2 * this.a);
        return r3;
    }

}

