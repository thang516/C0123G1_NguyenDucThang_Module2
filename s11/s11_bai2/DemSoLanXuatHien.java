package s11_bai2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 chuỗi ");
        String str = scanner.nextLine();
        String[] arr = new String[]{};
        str = str.replaceAll(",", "");
        arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhập vô 1 kí tự bất kì ");
        int kiTu = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < arr.length; i++) {
            if (!treeMap.containsKey(kiTu)) {
                treeMap.get(kiTu);
            } else {

            }
        }
    }

}
