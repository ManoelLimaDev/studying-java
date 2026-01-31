package br.com.manoellimadev.javastudying.oop.objectarray.test;

import br.com.manoellimadev.javastudying.oop.objectarray.domain.Player;

public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("Neymar", 10, 15);
        Player player2 = new Player("Cafu", 7, 10);
        Player player3 = new Player("Pelé", 9, 35);

        Player[] team = {player1, player2, player3};
        for (Player p : team){
            p.print();
        }
    }
}
