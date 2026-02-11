package br.com.manoellimadev.javastudying.oop.interfaces.test;

import br.com.manoellimadev.javastudying.oop.interfaces.domain.DBManager;
import br.com.manoellimadev.javastudying.oop.interfaces.domain.DocManager;

public class Main {
    public static void main(String[] args) {
        DocManager docManager = new DocManager();
        DBManager dbManager = new DBManager();

        docManager.auth();
        docManager.retrieveData();
        docManager.rmData();
        System.out.println();

        dbManager.auth();
        dbManager.retrieveData();
        dbManager.rmData();
        System.out.println();
    }
}
