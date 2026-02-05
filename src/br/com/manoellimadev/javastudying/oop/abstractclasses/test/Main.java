package br.com.manoellimadev.javastudying.oop.abstractclasses.test;

import br.com.manoellimadev.javastudying.oop.abstractclasses.domain.Developer;
import br.com.manoellimadev.javastudying.oop.abstractclasses.domain.Engineer;
import com.sun.source.tree.EnhancedForLoopTree;

public class Main {
    public static void main(String[] args) {
        Developer dev = new Developer("Goku", 2000);
        Engineer eng = new Engineer("Kratos", 20000);
        System.out.println(dev);
        System.out.println(eng);
    }
}
