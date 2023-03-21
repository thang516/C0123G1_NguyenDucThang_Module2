package baitap_s13;

import java.util.*;

public class DeQuyTimKiemNhiPhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài ");
        int doDai = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < doDai; i++) {
            System.out.println("Nhập các phần tử thứ  " + (i + 1) + "là :");
            arrayList.add(scanner.nextInt());
        }
        Collections.sort(arrayList);
        System.out.println(arrayList);
        System.out.println("Nhập 1 con số để tìm kiếm  ");
        int soTimKiem = scanner.nextInt();
        int result = binarySearch(arrayList, 0, arrayList.size() - 1, soTimKiem);
        System.out.println(result);
    }

    public static int binarySearch(ArrayList<Integer> array, int left, int right, int value) {
        int middle = (left + right) / 2;
        if (array.get(middle) == value) {
            return middle;
        } else if (value > array.get(middle)) {
            left = middle + 1;
            if (left == right) {
                if (array.get(left) == value) {
                    return left;
                }
                return -1;
            }
            return binarySearch(array, left, right, value);
        } else if (value < array.get(middle)) {
            right = middle - 1;
            if (left == right) {
                if (array.get(left) == value) {
                    return left;
                }
                return -1;
            }
            return binarySearch(array, left, right, value);
        }

        return -1;

    }
}
