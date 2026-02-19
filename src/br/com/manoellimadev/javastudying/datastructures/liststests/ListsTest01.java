package br.com.manoellimadev.javastudying.datastructures.liststests;

import java.util.ArrayList;
import java.util.List;

public class ListsTest01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>(5);
        List<String> names02 = new ArrayList<>(10);

        names.add("Manoel");
        names.add("Peter");
        names.add("Francis");
        System.out.println("List 01");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("-------------------");

        names02.add("Raphael");
        names02.add("Diana");
        names02.add("Joseph");
        names02.add("Mariah");
        System.out.println("List 02");
        for (String name : names02){
            System.out.println(name);
        }
        System.out.println("-------------------");

        names.addAll(names02);
        System.out.println("List 01 + 02");
        for (String name: names){
            System.out.println(name);
        }
    }
}
