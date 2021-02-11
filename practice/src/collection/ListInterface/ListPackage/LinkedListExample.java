package collection.ListInterface.ListPackage;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> al = new LinkedList<String>();
        al.add("xyz");
        al.add("abc");
        al.add("test");
        al.add("sandeep");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
