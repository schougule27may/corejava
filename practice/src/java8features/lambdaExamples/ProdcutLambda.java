package java8features.lambdaExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}


public class ProdcutLambda {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product(1, "b", 999f));
        list.add(new Product(2, "a", 666f));
        list.add(new Product(3, "c", 50f));
        System.out.println("Sort based on the name");

        Collections.sort(list, (p1, p2) -> {
            return p1.name.compareTo(p2.name);
        });

        Collections.sort(list, (p1, p2) -> p1.name.compareTo(p2.name));
        Collections.sort(list, Comparator.comparing(p -> p.name));
        for(Product p: list) {
           // System.out.println(p.id +" " + p.name + " "+p.price);
        }

        //using lamda to filter data
        Stream<Product> filteredData = list.stream().filter((p -> p.price > 100));

        //iterate
        filteredData.forEach(p -> {
            System.out.println(p.name + " "+p.price);
        });
    }
}
