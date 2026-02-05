package br.com.manoellimadev.javastudying.oop.abstractclasses.domain;

public class Developer extends Employee{

    public Developer(String name, double salary){
        super(name, salary);
        calcBonus();
    }

    @Override
    public void calcBonus(){
        bonus = salary*0.05;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name="+name +
                ", salary=" + salary +
                ", bonus=" + bonus +
                '}';
    }
}
