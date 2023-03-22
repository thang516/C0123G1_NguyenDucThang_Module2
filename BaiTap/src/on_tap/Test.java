package on_tap;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public   class Test {
    public static void main(String[] args) {
        String str="CodegymDaNang";
        solution(str);
        System.out.println(str);
    }
public static String solution(String str){
    char[] arr = str.toCharArray();
    String result="";
    System.out.println(arr);
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]==str.toUpperCase().charAt(i)){
            result += " "+str.toLowerCase().charAt(i);

        }else{
            result += arr[i];
        }
    }
return result;
}


}
