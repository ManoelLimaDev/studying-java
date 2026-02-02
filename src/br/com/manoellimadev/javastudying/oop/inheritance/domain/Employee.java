package br.com.manoellimadev.javastudying.oop.inheritance.domain;

public final class Employee extends Person {
    private double salary;
    private final DaysOff dayOff;
    public static final double SALARY_LIMIT = 1500;

    public Employee(String name, String personId, double salary, DaysOff dayOff) {
        super(name, personId);
        this.salary = salary;
        this.dayOff = dayOff;
    }

    @Override
    public String toString() {
        return (super.toString() +
                "Salary: $" + this.salary +
                "\nDay off: " + this.dayOff.day+"("+this.dayOff.dayNumber+")"+
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
