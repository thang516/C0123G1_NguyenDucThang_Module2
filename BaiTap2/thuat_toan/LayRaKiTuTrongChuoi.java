package thuat_toan;
import java.util.Arrays;

public class LayRaKiTuTrongChuoi {
    public static void main(String[] args) {
        String str="aabavsvcsabdgsadc";
        String[] arr=str.split("");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <arr.length ; i++) {
            String chas=arr[i];
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if(chas.equals(arr[j])){
                    count++;
                    i++;
                }
            }
            System.out.println(chas +""+count);
        }

    }
}
