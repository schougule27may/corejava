package collection.ListInterface.SetPackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        set.add("Sherry");
        set.add("Ravi");
        set.add("Sherry");
        set.add("Neha");
        set.add("Ravi");
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
