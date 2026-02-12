package br.com.manoellimadev.javastudying.advancedcore.exceptions.tests;

public class ThrowException {
    public static void main(String[] args) {
        try {
            System.out.println(divide(5, 0));
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("End ...");
    }

    public static double divide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Can't divide by 0");

        return (double) (a / b);
    }
}
