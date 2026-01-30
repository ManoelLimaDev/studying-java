package br.com.manoellimadev.javastudying.oop.methodoverload.test;

import br.com.manoellimadev.javastudying.oop.methodoverload.domain.Film;

public class Main {
    public static void main(String[] args) {
        Film minecraft = new Film("A Minecraft Movie", 2025, "Jared Hess", 150000000.0);
        Film nosferatu = new Film("Nosferatu", 2024, "Robert Eggers");

        minecraft.print();
        nosferatu.print();
    }
}
