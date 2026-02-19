package br.com.manoellimadev.javastudying.datastructures.liststests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleBinarySearch {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(4);
        numbers.add(3);
        numbers.add(8);
        numbers.add(5);
        numbers.add(9);
        numbers.add(2);
        Collections.sort(numbers);
        System.out.println(numbers);
        System.out.println(numbers);
        int pos = Collections.binarySearch(numbers, 10);
        int normalizedPos = (pos*(-1))-1;
        System.out.println("Position: " + pos); //"Human" position view
        System.out.println("Normalized position: " + pos); //"Normalized" position view

        numbers.add((pos * (-1)) - 1, 10);//Normalization of the position to insert into
        System.out.println(numbers);
    }
}
