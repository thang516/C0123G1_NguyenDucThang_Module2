package baitap_s13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DeQuyTimKiemNhiPhanCach2 {
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
        int first = 0;
        int last = arrayList.size() - 1;
        System.out.println("Nhập 1 con số để tìm kiếm  ");
        int soTimKiem = scanner.nextInt();
        int result = binarySearch(arrayList, first, last, soTimKiem);
        System.out.println(result);
    }

    public static int binarySearch(ArrayList<Integer> arr, int first, int last, int value) {

        int mid = (first + last) / 2;
        if (arr.get(mid) == value) {
            return mid;
        } else if (arr.get(mid) < value) {
            first = mid + 1;
        } else {
            last = mid - 1;
        }
        if (first <= last) {
            return binarySearch(arr, first, last, value);
        }
        return -1;
    }
}
