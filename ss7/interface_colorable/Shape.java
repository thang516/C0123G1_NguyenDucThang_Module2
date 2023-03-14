package interface_colorable;

public abstract class Shape {
    protected String color = "black";
    protected boolean filled = false;

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
        return "A Shape with color of " +
                this.getColor() +
                "and" +
                (isFilled() ? "filled" : "not filled");
    }

    public static void printShape(Shape[] shapes) {
        for (Shape s : shapes) {
            System.out.println(s.toString());
        }
    }


}
