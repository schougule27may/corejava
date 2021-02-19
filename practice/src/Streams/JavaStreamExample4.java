package Streams;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

class Product3 {
    int  id;
    String name;
    float price;

    public Product3(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product3{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class JavaStreamExample4 {

    //Sum by using collection methods.
    public static void main(String[] args) {
        List<Product3> productList = new ArrayList<>();
        productList.add(new Product3(1, "HP Laptop", 2500f));
        productList.add(new Product3(2, "Dell Laptop", 2800f));
        productList.add(new Product3(3, "Lenovo Laptop", 3000f));
        productList.add(new Product3(4, "Sony Laptop", 2800f));
        productList.add(new Product3(5, "Apple Laptop", 9000f));

        double totalProductPrices3 = productList.stream()
                .collect(summingDouble(product -> product.price));
       // System.out.println(totalProductPrices3);

        // Max of given product list

        Product3 productMax = productList.stream().
                 max((product1, product2) -> product1.price > product2.price ? 1 : -1 )
                .get();
        // count of number of products with price < 3000

        int age = 20;
        boolean votingEligible = (age > 18 ? true : false);
        // System.out.println(votingEligible);

        long count = productList.stream().filter(product3 -> product3.price < 3000)
                .count();
         // System.out.println(count);

        // Convert list into set
        //Set - it stores unique values

        Set<Float> productPriceList =
                productList.stream()
                .filter(product3 -> product3.price <3000) // filter
                .map(product3 -> product3.price)
                .collect(toSet()); // (removes duplicates)
        System.out.println("Set ==>" +productPriceList);


        List<Float> productPriceList1 =
                productList.stream()
                        .filter(product3 -> product3.price <3000) // filter
                        .map(product3 -> product3.price)
                        .collect(toList()); // (removes duplicates)
        System.out.println("List ==>" +productPriceList1);

        //ID, Name List to Map
        //Collectors.toMap(key, value)

        Map<Integer, String> productPriceMap =
                productList.stream()
                .collect(toMap(p-> p.id, p-> p.name));
        System.out.println(productPriceMap);

        Map<String, Float> productPriceMap2 =
                productList.stream()
                        .collect(toMap(p-> p.name, p-> p.price));
        System.out.println(productPriceMap2);

        Map<Integer, Product3>
                 productPriceMap3 =
                productList.stream()
                        .collect(toMap(tempP-> tempP.id, myPId -> myPId));
        System.out.println(productPriceMap3);
        HashMap<Integer, String> map = new HashMap<>();
        for(Product3 p : productList) {
            map.put(p.id, p.name);
        }

    }
}
