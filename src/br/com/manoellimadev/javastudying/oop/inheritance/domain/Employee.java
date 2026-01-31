package br.com.manoellimadev.javastudying.oop.inheritance.domain;

public class Employee extends Person {
    private double salary;

    public Employee(String name, String personId, double salary) {
        super(name, personId);
        this.salary = salary;
    }

    public void print() {
        super.print();
        System.out.println("Salary: $" + this.salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
