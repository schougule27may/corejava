package Streams;

import java.util.ArrayList;
import java.util.List;

class Product {
    int  id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class JavaStreamExample {

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "HP Laptop", 2500f));
        productList.add(new Product(2, "Dell Laptop", 3000f));
        productList.add(new Product(3, "Lenovo Laptop", 2800f));

        List<Float> productPriceList = new ArrayList<>();
        for(Product product : productList) {
            productPriceList.add(product.price);
        }
        System.out.println(productPriceList);
    }
}
