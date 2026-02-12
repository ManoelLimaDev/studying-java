package br.com.manoellimadev.javastudying.advancedcore.exceptions.tests;

public class CustomExceptionTest {
    public static void main(String[] args) {
        customExceptionTesting();
    }
    public static void customExceptionTesting(){
        try {
            throw new CustomException();
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }
}
