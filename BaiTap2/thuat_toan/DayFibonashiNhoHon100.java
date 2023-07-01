package thuat_toan;

public class DayFibonashiNhoHon100 {
    public static void main(String[] args) {
        int count = 100;
        int n1 = 0;
        int n2 = 1;
        int temp = 0;
        int i = 1;
        while (i <= count) {
            System.out.println(n1);
            temp = n1 + n2;
            n1 = n2;
            n2 = temp;
            i++;
        }

    }

}
