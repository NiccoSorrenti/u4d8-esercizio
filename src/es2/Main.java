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

        List<Product> listaProdottiOrdinati = new ArrayList<>();
        List<Product> listaProdottiOrdinati2 = new ArrayList<>();
        
        Product product1 = new Product(1, "Prodotto", "Books", 150.0);
        Product product2 = new Product(2, "Prodotto2", "Baby", 15.0);
        Product product3 = new Product(3, "Prodotto3", "Books", 50.0);
        Product product4 = new Product(4, "Prodotto4", "Baby", 10.0);

        listaProdotti.add(product1);
        listaProdotti.add(product2);
        listaProdotti.add(product3);
        listaProdotti.add(product4);

        listaProdottiOrdinati.add(product1);
        listaProdottiOrdinati.add(product3);

        listaProdottiOrdinati2.add(product4);


        Customer customer = new Customer(1, "Customer", 1);
        Customer customer2 = new Customer(1, "Customer2", 2);

        listaOrdini.add(new Order(1, "Status", LocalDate.of(2026, 3, 18), LocalDate.of(2026, 4, 18), listaProdottiOrdinati, customer));
        listaOrdini.add(new Order(2, "Status", LocalDate.of(2026, 3, 18), LocalDate.of(2026, 5, 18), listaProdottiOrdinati2, customer2));


        List<Order> listaOrdiniFiltrati = listaOrdini.stream()
                .filter(order -> order.getProducts().stream().anyMatch(product -> product.getCategory().equals("Baby"))).toList();

        listaOrdiniFiltrati.forEach(order -> System.out.println(order));
    }
}
