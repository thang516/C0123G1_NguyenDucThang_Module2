package lam_lai;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
       Date d=new Date(System.currentTimeMillis());
        System.out.println(d.getDate()+"/"+(d.getMonth()+1)+"/"+(d.getYear())+1900);
        // dateFormat
        // tham khảo openplaning.net
        DateFormat df = new SimpleDateFormat();
        System.out.println(df.format(d));
        df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(d);
    }
}