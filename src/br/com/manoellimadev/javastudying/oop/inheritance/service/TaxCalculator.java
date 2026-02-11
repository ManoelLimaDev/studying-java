package br.com.manoellimadev.javastudying.oop.inheritance.service;

import br.com.manoellimadev.javastudying.oop.polymorphism.domain.Product;
import br.com.manoellimadev.javastudying.oop.polymorphism.domain.Tomato;


public class TaxCalculator {
    public static void calculateTax(Product product) {
        System.out.println("Calculating...");
        double tax = product.calculateTaxes();
        System.out.println("Name: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Tax: " + tax);
        if(product instanceof Tomato){
            Tomato tomato = (Tomato) product;
            System.out.println("Is red? " + tomato.getIsRed());
        }
    }
}
