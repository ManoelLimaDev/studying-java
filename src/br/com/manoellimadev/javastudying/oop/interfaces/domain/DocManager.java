package br.com.manoellimadev.javastudying.oop.interfaces.domain;

public class DocManager implements DataLoader, DataRemover{
    public void retrieveData(){
        System.out.println("Retrieving Document data...");
    }
}
