package br.com.manoellimadev.javastudying.oop.polymorphism.domain;

public class Tomato extends Product {
    public static double TOMATO_TAX = 0.20;
    private boolean isRed = true;

    public Tomato(double price, String date, String name) {
        super(price, date, name);
    }

    @Override
    public double calculateTaxes() {
        return this.price * Tomato.TOMATO_TAX;
    }

    @Override
    public String toString() {
        String text = super.toString() + "Tax( " + this.calculateTaxes() + " )";

        return text;
    }

    public boolean getIsRed(){
        return this.isRed;
    }
}
