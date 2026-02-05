package br.com.manoellimadev.javastudying.oop.abstractclasses.domain;

public class Engineer extends Employee{

    public Engineer(String name, double salary){
        super(name, salary);
        calcBonus();
    }

    @Override
    public void calcBonus(){
        bonus = salary*0.1;
    }

    @Override
    public String toString(){
        return "Engineer{" +
                "name=" + name +
                ", salary=" + salary +
                ", bonus=" + bonus +
                '}';
    }
}
