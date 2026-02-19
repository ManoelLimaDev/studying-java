package br.com.manoellimadev.javastudying.datastructures.liststests;

import br.com.manoellimadev.javastudying.datastructures.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomBinarySearch {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(1L, "One Piece"));
        mangas.add(new Manga(4L, "Dragonball"));
        mangas.add(new Manga(2L, "Bersek"));
        mangas.add(new Manga(5L, "Pokemon"));
        mangas.add(new Manga(3L, "Bakugan"));
        mangas.sort(new SortById());

        for (Manga m : mangas){System.out.println(m);}

        Manga mangaToSearch = new Manga(2L, "Bersek");
        System.out.println(Collections.binarySearch(mangas, mangaToSearch, new SortById()));
    }
}
