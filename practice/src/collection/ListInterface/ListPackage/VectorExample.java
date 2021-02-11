package collection.ListInterface.ListPackage;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        insertElements(v);
        Iterator<String> its = v.iterator();
        while (its.hasNext()){
            System.out.println(its.next());
        }
    }

    private static void insertElements(Vector<String> v) {
        v.add("Sherry");
        v.add("Neha");
        v.add("Ali");
        v.add("Sandeep");
    }
}
