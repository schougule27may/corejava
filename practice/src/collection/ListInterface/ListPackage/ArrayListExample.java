package collection.ListInterface.ListPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); // Creating arrayList;

        list.add("Muneeb");
        list.add("Vijay");
        list.add("abc");
        list.add("yyyy");
        for (int i = 0; i < 50 ; i++) {
            list.add(" i - "+i);
        }
        //Traverinng list
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
