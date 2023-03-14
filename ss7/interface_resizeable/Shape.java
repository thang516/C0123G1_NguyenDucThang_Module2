package interface_resizeable;

public abstract class Shape implements Resizeable {
    protected String color = "blue";
    protected boolean filled = true;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of{" +
                "color='" + this.getColor() + '\'' +
                ",  filled=" + this.getColor() +
                '}';
    }

    public static void printShape(Shape[] shapes) {
        for (Shape s : shapes) {
            System.out.println(s.toString());
        }
    }
}
