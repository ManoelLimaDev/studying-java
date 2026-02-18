package br.com.manoellimadev.javastudying.datastructures.tests;

import br.com.manoellimadev.javastudying.datastructures.domain.Smartphone;

public class HashCodeTest {
    public static void main(String[] args) {
        Smartphone phone01 = new Smartphone("123ABC", "iPhone");
        Smartphone phone02 = new Smartphone("123ABC", "iPhone");
        System.out.println(phone01.hashCode() == phone02.hashCode());
    }
}
