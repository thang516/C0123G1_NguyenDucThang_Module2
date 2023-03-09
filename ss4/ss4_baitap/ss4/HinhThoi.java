package ss4;

public class HinhThoi {
    public static void main(String[] args) {
         int  middle = 5;
         int left=4;
         int right=5;
         int index =  1;
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j < 10; j++) {
               if(j==left || j==right){
                   System.out.print(index);
               }else{
                   System.out.print(" ");
               }
            }
            if(i>4){
                index--;
                left++;
                right--;
            }else{
                index++;
                left--;
                right++;

            }
        System.out.println();
        }
        }
    }



