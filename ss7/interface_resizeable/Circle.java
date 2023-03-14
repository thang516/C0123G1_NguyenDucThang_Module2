package interface_resizeable;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return " Circle :" +
                " radius=" + this.getRadius() +
                " , Area = " + this.getArea() +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.radius = this.radius + this.radius * (percent / 100);
    }
}
