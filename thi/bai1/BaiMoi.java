package bai1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaiMoi {
    public static void main(String[] args) {
        int [] array = new  int[]{6,2,3,8};

         solution(array);
    }
    static int solution(int[] statues) {
        int [] result = sort(statues);
        int count = 0;
        for (int i = 0; i < result.length - 1; i++) {
            int distance = result[i + 1] - result[i];
            if(distance > 1){
                count = count + (distance -1);
            }
        }
        return count;
    }

    static int[] sort(int[] statues) {
        int length = statues.length;
        for (int i = 0; i < length; i++) {
            for (int index = i + 1; index < length; index++) {
                if(statues[i] > statues[index]){
                    int temp = statues[i];
                    statues[i]=statues[index];
                    statues[index]=temp ;

                }
            }

        }
        return statues;
    }
}
