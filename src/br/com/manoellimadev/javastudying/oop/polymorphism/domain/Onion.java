package br.com.manoellimadev.javastudying.oop.polymorphism.domain;

public class Onion extends Product {
    public static double ONION_TAX = 0.25;

    public Onion(double price, String date, String name) {
        super(price, date, name);
    }

    @Override
    public double calculateTaxes() {
        return this.price * Onion.ONION_TAX;
    }

    @Override
    public String toString() {
        String text = super.toString() + "Tax( "+ this.calculateTaxes()+" )";;

        return text;
    }
}
