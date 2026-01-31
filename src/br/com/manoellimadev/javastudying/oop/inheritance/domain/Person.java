package br.com.manoellimadev.javastudying.oop.inheritance.domain;

public class Person {
    protected String name;
    protected String personId;

    public Person(String name, String personId) {
        this.name = name;
        this.personId = personId;
    }

    @Override
    public String toString() {
        return ("Name: " + this.name + "\nId: " + this.personId + "\n");
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
