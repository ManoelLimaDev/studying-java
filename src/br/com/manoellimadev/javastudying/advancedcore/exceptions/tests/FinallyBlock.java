package br.com.manoellimadev.javastudying.advancedcore.exceptions.tests;

public class FinallyBlock {
    public static void main(String[] args) {
        try{
            test();
        }catch(RuntimeException e){
            e.printStackTrace();
        }finally{
            System.out.println("Always work");
        }
    }
    private static void test()throws RuntimeException{
        throw new RuntimeException("Blablabla");
    }
}
