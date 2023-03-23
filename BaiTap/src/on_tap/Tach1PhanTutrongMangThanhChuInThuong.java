package on_tap;

public   class Tach1PhanTutrongMangThanhChuInThuong {
    public static void main(String[] args) {
        String str="CodegymDaNang";
        str = solution(str);
        System.out.println(str);
    }
public static String solution(String str){
   char[] arr=str.toCharArray();
   String result ="";
    for (int i = 0; i < arr.length; i++) { // vô C D N
        if(arr[i]==str.toUpperCase().charAt(i)){
            result+= " "+ str.toLowerCase().charAt(i);
        }else{
            result+=arr[i]; // vô odegym a ang
        }
    }
 return result.trim();
}
}
