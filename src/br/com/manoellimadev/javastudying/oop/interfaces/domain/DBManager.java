package br.com.manoellimadev.javastudying.oop.interfaces.domain;

public class DBManager implements DataLoader, DataRemover{
    public void retrieveData(){
        System.out.println("Retrieving DataBase Data...");
    }
}
