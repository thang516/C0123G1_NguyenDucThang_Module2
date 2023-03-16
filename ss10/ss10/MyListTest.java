package ss10;

import java.util.ArrayList;
import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add(0, "rr");
        myList.add(1, "rrrr");
        myList.add(2, "rrrrrr");
        myList.add("45");
        System.out.println(Arrays.toString(myList.clone()));
        myList.remove(2);
        System.out.println(Arrays.toString(myList.clone()));
        System.out.println(myList.get(1));
        System.out.println(myList.contains("rrrr"));
        System.out.println(Arrays.toString(myList.clone()));
        System.out.println(Integer.toString(myList.indexOf("rrrr")));
        myList.clear();
        System.out.println(Arrays.toString(myList.clone()));

    }


}
