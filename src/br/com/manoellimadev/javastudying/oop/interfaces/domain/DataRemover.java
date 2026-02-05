package br.com.manoellimadev.javastudying.oop.interfaces.domain;

public interface DataRemover {
    default void rmData(){
        System.out.println("Removing data...");
    }
}
