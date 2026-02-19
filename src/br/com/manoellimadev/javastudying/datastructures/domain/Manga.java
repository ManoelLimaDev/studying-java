package br.com.manoellimadev.javastudying.datastructures.domain;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String name;

    public Manga(Long id, String name) {
        Objects.requireNonNull(id);
        Objects.requireNonNull(name);
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return id.equals(manga.id) && Objects.equals(name, manga.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "id = " + id + "; name = " + name;
    }

    @Override
    public int compareTo(Manga m) {

//        if(this.id < m.getId()) return -1;
//        else if(this.id == m.getId()) return 0;
//        else return 1;

        return Long.compare(this.id, m.getId());  //Sorted by id
//        return this.name.compareTo(m.getName());    //Sorted by name
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
