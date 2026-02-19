package br.com.manoellimadev.javastudying.datastructures.liststests;

import br.com.manoellimadev.javastudying.datastructures.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneList {
    public static void main(String[] args) {
        Smartphone phone01 = new Smartphone("123ABC", "iPhone");
        Smartphone phone02 = new Smartphone("456EFG", "Samsung");
        Smartphone phone03 = new Smartphone("789HIJ", "Motorola");
        Smartphone phone04 = new Smartphone("012KLM", "Xiaomi");
        List<Smartphone> smrtList = new ArrayList<>();
        smrtList.add(phone01);
        smrtList.add(phone02);
        smrtList.add(phone03);
        smrtList.add(phone04);
        System.out.println(smrtList+"\n");
        for(Smartphone smrt : smrtList){
            System.out.println(smrt);
        }
    }
}
