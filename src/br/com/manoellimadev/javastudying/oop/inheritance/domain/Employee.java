package br.com.manoellimadev.javastudying.oop.inheritance.domain;

public final class Employee extends Person {
    private double salary;
    public static final double SALARY_LIMIT = 1500;

    public Employee(String name, String personId, double salary) {
        super(name, personId);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return (super.toString() + "Salary: $" + this.salary +"Salary limit: $"+Employee.SALARY_LIMIT+
                "\n---------------------\n");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalaryLimit(){
        return SALARY_LIMIT;
    }
}
