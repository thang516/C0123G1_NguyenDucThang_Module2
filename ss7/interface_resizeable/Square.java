package interface_resizeable;

public class Square extends Shape {
    private double edge = 1.0;

    public Square() {
    }

    public Square(double edge) {
        this.edge = edge;
    }

    public Square(String color, boolean filled, double edge) {
        super(color, filled);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getArea() {
        return (this.edge * this.edge);
    }

    @Override
    public String toString() {
        return " Square :" +
                " edge=" + this.getEdge() +
                ",Area =" + this.getArea() +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.edge = this.edge + this.edge * (percent / 100);
    }
}
