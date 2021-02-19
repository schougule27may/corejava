package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product1 {
    int  id;
    String name;
    float price;

    public Product1(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class JavaStreamExample2 {

    public static void main(String[] args) {
        List<Product1> productList = new ArrayList<>();
        productList.add(new Product1(1, "HP Laptop", 2500f));
        productList.add(new Product1(2, "Dell Laptop", 3000f));
        productList.add(new Product1(3, "Lenovo Laptop", 3000f));

        List<Float> productPriceList = new ArrayList<>();
        for(Product1 product : productList) {
            productPriceList.add(product.price);
        }
     //   System.out.println(productPriceList);

        List<Float> productPriceList1 = productList.stream()
                   .map(p -> p.price)
                  .collect(Collectors.toList());
      //  System.out.println(productPriceList1);

        productList.
                stream().
                filter( product1 -> product1.price == 3000)
                .forEach(product1 -> {
                    System.out.println(product1.name);
                });

        Float totalPrice = productList.stream()
                .map(product -> product.price)
                .reduce(1f, Float::sum);
        System.out.println("totalPrice ::" +totalPrice);
        //accumulattig procem by referring method of Floatt class
    }
}
