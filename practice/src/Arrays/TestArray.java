package Arrays;

import java.util.ArrayList;
import java.util.List;

public class TestArray {

    public static void main(String[] args) {
        int a[] = new int[5];
        a[0] = 10 ; //initi 10
        a[1] = 20 ;
        a[2] = 30 ;
        a[3] = 40 ;
        a[4] = 50 ;

        List<Integer> z = new ArrayList<>();

        for(int i = 0; i < a.length; i++) { //length is the property of array
            System.out.println(a[i]);
        }

        for(int i = 0; i < 1000; i++) { //length is the property of array
            z.add(i);

        }
        System.out.println(" ====== My dynamic array ======");
       for(Integer i :z){
           System.out.println(i);
       }

    }
}
