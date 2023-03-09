public class Fan {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;
    int speed = 1;
    String color = "Blue";
    double radius = 5;
    boolean on = false;

    public int speed() {
        return SLOW;
    }

    public boolean on() {
        return on;
    }

    public double radius() {
        return radius;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String color() {
        return color;
    }

    public String toString() {
        if (on) {
            return " Quạt có tốc độ là : " + speed + " Quạt đang: bật " + " Kích thước kiểu to : " + radius + " Quạt màu " + color;
        } else {
            return " Quạt có tốc độ là : " + speed + " Quạt đang : Tắt" + "Kích thước kiểu nhỏ : " + radius + " Quạt màu " + color;
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        System.out.println(fan1);
        Fan fan2 = new Fan();
        fan2.setSpeed(MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.setOn(false);
        System.out.println(fan2);

    }
}
