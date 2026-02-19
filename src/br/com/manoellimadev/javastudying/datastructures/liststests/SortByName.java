package br.com.manoellimadev.javastudying.datastructures.liststests;

import br.com.manoellimadev.javastudying.datastructures.domain.Manga;

import java.util.Comparator;

public class SortByName implements Comparator<Manga> {

    @Override
    public int compare(Manga m1, Manga m2) {
        return m1.getName().compareTo(m2.getName());
    }
}
