package es1;

import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {


        List<Product> products = new ArrayList<>();

        products.add(new Product(1, "Prodotto1", "Books", 150.0));
        products.add(new Product(2, "Prodotto2", "Books", 100.0));
        products.add(new Product(3, "Prodotto3", "Books", 10.0));
        products.add(new Product(4, "Prodotto4", "Books", 180.0));

//        System.out.println(products);

        List<Product> risultatoProdotti = products.stream()
                .filter(product -> product.getCategory().equals("Books"))
                .filter(product -> product.getPrice() > 100).toList();

        risultatoProdotti.forEach(product -> System.out.println(product));

    }
}
