package br.com.manoellimadev.javastudying.oop.inheritance.domain;

public class Person {
    protected String name;
    protected String personId;

    public Person(String personId, String name) {
        this.personId = personId;
        this.name = name;
    }

    public void print(){
        System.out.println(this.name + " " + this.personId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }
}
