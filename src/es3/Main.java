package es3;

import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {

        Product products1 = new Product(1, "PlayStation", "Boys", 100.0);

        List<Product> listaProdotti = new ArrayList<>();

        listaProdotti.add(products1);

        List<Product> risultatoListaProdotti = listaProdotti.stream()
                .filter(product -> product.getCategory().equals("Boys"))
                .toList();

    }


}
