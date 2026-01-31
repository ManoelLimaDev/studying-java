package br.com.manoellimadev.javastudying.oop.inheritance.test;

import br.com.manoellimadev.javastudying.oop.inheritance.domain.Employee;

public class Main {
    public static void main(String[] args) {
        Employee emp01 = new Employee("Pedro", "123456", 123.65);
        Employee emp02 = new Employee("Maria", "789ABC", 456.43);

        emp01.print();
        emp02.print();
    }
}
