package thuat_toan;

public class TBCCuaUocVaBoiChung {
    public static int uoc(int numb,int numb2){
        if(numb==numb2){
            return numb;
        }else {
            for (int i = (numb > numb2) ? numb2 : numb; i > 1; i--) {
                if (numb2 % i == 0 && numb % i == 0) {
                    return i;
                }
            }
            return 1;
        }
    }

    public static  int boi(int numb,int numb2){
        int f=(numb>numb2)? numb:numb2;
        if(numb==numb2){
            return numb;
        }else {
            boolean flag=true;
           do {

               if (f%numb==0&&f%numb2==0){
                   flag=false;
                   return f;
               }
               f++;
           }while (flag);

            }

        return 0;
    }
    public static void main(String[] args) {
        int sum=(uoc(6,7)+boi(6,7)/2);
        System.out.println(sum);
    }
}
