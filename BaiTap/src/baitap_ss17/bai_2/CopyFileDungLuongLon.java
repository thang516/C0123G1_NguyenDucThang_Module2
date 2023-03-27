package baitap_ss17.bai_2;

import java.io.*;

public class CopyFileDungLuongLon {
    private static String readFile(String source) {
        String result = "";
        File file = new File(source);
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            int i = -1;
            while ((i = fileInputStream.read()) != -1) {
                result += (char) i;
                System.out.print(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    private static void write(String target, String result) {
        File file = new File(target);
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            byte[] bytes = result.getBytes();
            for (int i = 0; i < bytes.length; i++) {
                fileOutputStream.write(bytes[i]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static boolean checkFile(String source) {
        try {
            File file = new File(source);
            FileInputStream fileInputStream = new FileInputStream(file);
        } catch (IOException e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String pathSource = "src/baitap_ss17/bai_2/source.dat";
        String pathTarget = "src/baitap_ss17/bai_2/target.dat";

        boolean checkSource = checkFile(pathSource);
        boolean checkTarget = checkFile(pathTarget);

        if (!checkSource || checkTarget) {
            System.out.println("file khong hop le");
        } else {
            String result = readFile(pathSource);
            write(pathTarget, result);
        }
    }
}
