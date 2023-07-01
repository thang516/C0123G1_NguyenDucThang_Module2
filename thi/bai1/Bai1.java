package bai1;

public class Bai1 {
    public static boolean check(int[] arr) {
        int jump = arr[1] - arr[0];
        if (jump == 0) {
            return false;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != jump) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 5, 6, 8};
        System.out.println(check(arr));
    }
}
