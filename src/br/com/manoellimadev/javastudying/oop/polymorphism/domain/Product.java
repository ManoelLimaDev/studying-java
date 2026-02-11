package br.com.manoellimadev.javastudying.oop.polymorphism.domain;

public abstract class Product  implements Taxes{
    protected double price;
    protected String expireDate;
    protected String name;

    public Product(double price, String date, String name){
        this.price = price;
        this.expireDate = date;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getExpireDate() {
        return expireDate;
    }

    @Override
    public String toString() {
        return "Product( "+this.name+" ) - Price( "+
                this.price+" ) - Expiration( "+
                this.expireDate+" ) - ";
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
