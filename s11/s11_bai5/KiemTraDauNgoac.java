package s11_bai5;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraDauNgoac {
   public  static boolean kiemTraDauNgoac(String str){
    Stack<Character> stack=new Stack<>();
    char[] arr= str.toCharArray();
       for (char x: arr) {
           if (x == '('){
               stack.push(x);
           } else if (x == ')') {
               if(stack.isEmpty()){
                   return false;
               }
               char last = stack.peek();
               if((x == '(' && last ==')')){
                   stack.pop();
               }else{
                   return false;
               }
           }

       }
       return stack.isEmpty();
   }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" Nhập  vô 1 chuỗi bâất kì có chứa ngoặc ");
        String str=scanner.nextLine();
        System.out.println(str +"Sau khi đã biến đổi"+ kiemTraDauNgoac(str));
    }

}
