package br.com.manoellimadev.javastudying.oop.interfaces.domain;

public interface DataLoader {
    default void auth(){
        System.out.println("Authenticating...");
    }
    void retrieveData();
}
