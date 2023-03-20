package bai_tap_ss12;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class DemSoLanXuatHien {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi ");
        String myString = scanner.nextLine();
        String[] arr = new String[]{};
        myString = myString.replaceAll(",", "").toLowerCase();
        arr = myString.split(" ");
        String key = " ";
        Integer value;
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            key = arr[i];
            if (treeMap.containsKey(key)) {
                value = treeMap.get(key);
                treeMap.remove(key);
                treeMap.put(key, value + 1);
            } else {
                treeMap.put(key, 1);
            }
        }
        Set<String> keySet = treeMap.keySet();
        for (String x : keySet) {
            System.out.println("Từ :" + x + " " + "Số lần xuất hiện :" + treeMap.get(key) + "lần ");
        }
    }
}
