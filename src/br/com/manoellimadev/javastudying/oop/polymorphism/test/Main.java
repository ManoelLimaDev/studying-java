package br.com.manoellimadev.javastudying.oop.polymorphism.test;

import br.com.manoellimadev.javastudying.oop.inheritance.service.TaxCalculator;
import br.com.manoellimadev.javastudying.oop.polymorphism.domain.Onion;
import br.com.manoellimadev.javastudying.oop.polymorphism.domain.Tomato;

public class Main {
    public static void main(String[] args) {
        Tomato tomato = new Tomato(10.90, "11/02", "Tomato 01");
        Onion onion = new Onion(25.00, "04/03", "Onion 05");

        TaxCalculator.calculateTax(onion);
        TaxCalculator.calculateTax(tomato);
    }
}
