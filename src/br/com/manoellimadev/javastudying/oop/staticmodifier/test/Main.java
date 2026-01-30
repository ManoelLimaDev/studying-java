package br.com.manoellimadev.javastudying.oop.staticmodifier.test;

import br.com.manoellimadev.javastudying.oop.staticmodifier.domain.Account;

public class Main {
    public static void main(String[] args) {
        Account acc01 = new Account("Manoel", "111111-11");
        Account acc02 = new Account("Maria", "222222-22");

        acc01.print();
        System.out.println();
        acc02.print();
        System.out.println();
//        System.out.println("Global transfer limit: $"+Account.transfLimit);
        Account.setTransfLimit(200.5);
//        System.out.println("Global transfer limit: $"+Account.transfLimit);
//        System.out.println();
        acc01.print();
        System.out.println();
        acc02.print();
        System.out.println();

    }
}
