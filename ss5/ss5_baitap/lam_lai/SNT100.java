package lam_lai;

public class SNT100 {
//    public static void main(String[] args) {
//        int numbers=0;
//        int count;
//        int n=2;
//        while (numbers<=100){
//            count=0;
//            for (int i = 1; i <=n; i++) {
//                if(n%i==0){
//                    count++;
//                }
//            }
//            if(count==2){
//                numbers++;
//                System.out.println(n);
//            }
//            n++;
//        }
//    }

//
//    public static void main(String[] args) {
//        int number=0;
//        int count;
//        int n=2;
//        while (number<200){
//            count=0;
//            for (int i = 1; i <=n ; i++) {
//                if (n % i == 0) {
//                    count++;
//                }
//            }
//            if (count==2){
//                number++;
//                System.out.println("Số ngyto"+n);
//            }
//            n++;
//        }
//    }


    public static void main(String[] args) {
        int numbers=0;
        int count;
        int n=2;
        while (numbers<=100){
            count=0;
            for (int i = 1; i <=n; i++) {
                if(n%i==0){
                    count++;
                }
            }
            if(count==2){
                numbers++;
                System.out.println(n);
            }
            n++;
        }
    }












}
