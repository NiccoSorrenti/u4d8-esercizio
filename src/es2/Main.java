package es2;

import entities.Customer;
import entities.Order;
import entities.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {

        List<Order> listaOrdini = new ArrayList<>();

        List<Product> listaProdotti = new ArrayList<>();

        Product product1 = new Product(1, "Prodotto", "Books", 150.0);
        Product product2 = new Product(2, "Prodotto2", "Baby", 15.0);
        Product product3 = new Product(3, "Prodotto3", "Books", 50.0);
        Product product4 = new Product(4, "Prodotto4", "Baby", 10.0);

        listaProdotti.add(product1);
        listaProdotti.add(product2);
        listaProdotti.add(product3);
        listaProdotti.add(product4);


        Customer customer = new Customer(1, "Customer", 1);
        Customer customer2 = new Customer(1, "Customer2", 2);

        listaOrdini.add(new Order(1, "Status", LocalDate.of(2026, 3, 18), LocalDate.of(2026, 4, 18), listaProdotti, customer));
        listaOrdini.add(new Order(2, "Status", LocalDate.of(2026, 3, 18), LocalDate.of(2026, 5, 18), listaProdotti, customer2));

        List<Product> risultatoListaProdotti = listaProdotti.stream()
                .filter(product -> product.getCategory().equals("Baby"))
                .toList();

        risultatoListaProdotti.forEach(product -> System.out.println(product));
    }
}
