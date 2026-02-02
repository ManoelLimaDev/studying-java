package br.com.manoellimadev.javastudying.oop.inheritance.test;

import br.com.manoellimadev.javastudying.oop.inheritance.domain.Employee;

public class Main {
    public static void main(String[] args) {
        final Employee leader = new Employee("Lucas", "999999", 999.99);
        Employee emp01 = new Employee("Pedro", "123456", 123.65);
        Employee emp02 = new Employee("Maria", "789ABC", 456.43);

        System.out.println("LEADER=>\n" + leader);
        System.out.println(emp01);
        System.out.println(emp02);
    }
}
