package br.com.manoellimadev.javastudying.oop.abstractclasses.domain;

public abstract class Employee {
    protected String name;
    protected double salary;
    protected double bonus;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.bonus = 0;
    }

    public abstract void calcBonus();
}
