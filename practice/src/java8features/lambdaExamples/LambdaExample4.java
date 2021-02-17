package java8features.lambdaExamples;

import java.util.ArrayList;
import java.util.List;

public class LambdaExample4 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Neha");
        list.add("Sherry");
        list.add("Husna");
        list.add("Muezzin");

        list.forEach(
                (n) -> System.out.println(n)
        );
        list.forEach(
                (n) -> {
                    n = "Modified" + n;
                    System.out.println(n);
                }
        );
        for(String str : list){

            {
                System.out.println(str);
            }
        }
    }
}
