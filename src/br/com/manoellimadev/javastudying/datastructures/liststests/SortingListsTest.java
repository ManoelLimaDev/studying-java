package br.com.manoellimadev.javastudying.datastructures.liststests;

import br.com.manoellimadev.javastudying.datastructures.domain.Manga;

import java.io.ObjectStreamException;
import java.util.*;

public class SortingListsTest {
    public static void main(String[] args) {

        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(1L, "One Piece"));
        mangas.add(new Manga(4L, "Dragonball"));
        mangas.add(new Manga(2L, "Bersek"));
        mangas.add(new Manga(5L, "Pokemon"));
        mangas.add(new Manga(3L, "Bakugan"));

        for(Manga m : mangas){
            System.out.println(m);
        }

        Collections.sort(mangas);
        System.out.println("-----------------------");
        for(Manga m : mangas){
            System.out.println(m);
        }

        Collections.sort(mangas, new SortById());
        System.out.println("-----------------------");
        for(Manga m : mangas){
            System.out.println(m);
        }

        Collections.sort(mangas, new SortByName());
        System.out.println("-----------------------");
        for(Manga m : mangas){
            System.out.println(m);
        }

    }
}

