package Arrays;

import java.util.HashSet;

public class DupsByCollection {

    public static void main(String[] args) {
        Integer [] a = {8,7,1,2,3,1,2,3};
        HashSet<Integer> noDups = new HashSet<>();
        for (int i = 0; i < a.length ; i++) {
            noDups.add(a[i]);
        }
        System.out.println(noDups);
    }
}
