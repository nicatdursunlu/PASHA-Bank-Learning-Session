package az.pashabank.learning.session.stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
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

public class FilterExample {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Samsung S 21", 2500));
        products.add(new Product(2, "Iphone 12", 3500));
        products.add(new Product(3, "Sony Xperia", 1400));
        products.add(new Product(4, "Nokia Lumia", 2500));
        products.add(new Product(5, "Redmi 4", 1500));
        products.add(new Product(6, "One Plus 8", 2900));

        Stream<Product> filteredProducts = products.stream().filter(p -> p.price > 2500);
        filteredProducts.forEach(
                product -> System.out.println(product.name + " " + product.price)
        );
//        Iphone 12 3500.0
//        One Plus 8 2900.0

        List<String> names= List.of("Reflection", "Collection", "Stream");
        List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
        System.out.println(result); // [Stream]
    }
}
