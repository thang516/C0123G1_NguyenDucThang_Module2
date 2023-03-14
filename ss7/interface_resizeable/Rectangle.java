package interface_resizeable;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
    }

    @Override
    public void resize(double percent) {
        this.width = this.width + this.width * (percent / 100);
        this.length = this.length + this.length * (percent / 100);
    }
}
