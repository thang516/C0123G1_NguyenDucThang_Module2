package interface_colorable;

public class Test {
    public static void main(String[] args) {

        Shape[] arr = new Shape[3];
        arr[0] = new Circle();
        arr[1] = new Rectangle();
        arr[2] = new Square();
        for (Shape s : arr) {
            if (s instanceof Colorable) {
                System.out.println(s);
                ((Colorable) s).howToColor();
            }
        }
    }
}
