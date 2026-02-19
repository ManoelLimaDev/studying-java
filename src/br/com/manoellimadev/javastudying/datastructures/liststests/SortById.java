package br.com.manoellimadev.javastudying.datastructures.liststests;

import br.com.manoellimadev.javastudying.datastructures.domain.Manga;

import java.util.Comparator;

public class SortById implements Comparator<Manga> {

    @Override
    public int compare(Manga m1, Manga manga2) {

        return m1.getId().compareTo(manga2.getId());
    }
}
