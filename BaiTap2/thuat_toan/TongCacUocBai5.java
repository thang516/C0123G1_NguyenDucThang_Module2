package thuat_toan;

public class TongCacUocBai5 {
    public static int tongUoc(int numb) {
        int sum = 0;
        for (int i = 1; i <= numb; i++) {
            if (numb % i == 0) {
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        tongUoc(12);
    }
}
