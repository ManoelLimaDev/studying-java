package br.com.manoellimadev.javastudying.introduction.syntaxbasics;

public class arrays {
    public static void main(String[] args) {
//      String[] cars = new String[5];
        String[] cars = {"BYD", "Ford", "Volkswagen", "Fiat", "Ferrari", "BMW", "Lamborghini", "Tesla"};

        System.out.println("Showing the array with FOR!!!");
        for(int i=0; i < cars.length; i++){
            System.out.print(cars[i] + " ");
        }

        System.out.println("\n\nShowing the array with FOREACH!!!");
        for(String car : cars){
            System.out.print(car + " ");
        }
    }
}
