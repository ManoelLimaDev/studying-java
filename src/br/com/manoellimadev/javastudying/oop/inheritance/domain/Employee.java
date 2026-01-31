package br.com.manoellimadev.javastudying.oop.inheritance.domain;

public class Employee extends Person {
    private double salary;

    public Employee(String name, String personId, double salary) {
        super(name, personId);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return (super.toString() + "Salary: $" + this.salary + "\n---------------------\n");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
