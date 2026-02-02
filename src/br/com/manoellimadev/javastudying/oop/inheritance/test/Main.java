package br.com.manoellimadev.javastudying.oop.inheritance.test;

import br.com.manoellimadev.javastudying.oop.inheritance.domain.DaysOff;
import br.com.manoellimadev.javastudying.oop.inheritance.domain.Employee;

public class Main {
    public static void main(String[] args) {
        final Employee leader = new Employee("Lucas", "999999", 999.99, DaysOff.SATURDAY);
        Employee emp01 = new Employee("Pedro", "123456", 123.65, DaysOff.FRIDAY);
        Employee emp02 = new Employee("Maria", "789ABC", 456.43, DaysOff.SUNDAY);

        System.out.println("LEADER=>\n" + leader);
        System.out.println(emp01);
        System.out.println(emp02);
        System.out.println("Salary Limit: $"+Employee.SALARY_LIMIT);
    }
}
