package collection.ListInterface.SetPackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.Collectors;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
   //File == > 10, 1000
        //==> Employee
        //===> 2-3

        if(!contains(set, "a")) {
            set.add("a");
        };
        if(!contains(set, "a")) {
            set.add("a");
        };
        if(!contains(set, "a")) {
            set.add("a");
        };
     /*   Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }*/
        for(String temp : set){
            System.out.println(temp);
        }
        set.forEach(t -> {
            System.out.println(t);
        });



    }

    private static boolean contains(HashSet<String> set, String value) {
        if(set.contains(value)) {
            System.out.println(" value already exists" + value);
        }
        return set.contains(value);
    }
}
