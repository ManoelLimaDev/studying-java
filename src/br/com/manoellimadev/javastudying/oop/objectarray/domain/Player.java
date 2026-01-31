package br.com.manoellimadev.javastudying.oop.objectarray.domain;

public class Player {
    private String name;
    private int number;
    private int goals;

    public Player(String name, int number, int goals) {
        this.name = name;
        this.number = number;
        this.goals = goals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public void print() {
        System.out.println(this.name + " " + this.number + " " + this.goals);
    }
}
