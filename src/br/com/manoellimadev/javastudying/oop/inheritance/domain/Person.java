package br.com.manoellimadev.javastudying.oop.inheritance.domain;

public abstract class Person {
    protected String name;
    protected final String personId;

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

}
