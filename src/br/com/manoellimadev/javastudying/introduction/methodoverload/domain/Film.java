package br.com.manoellimadev.javastudying.introduction.methodoverload.domain;

public class Film {
    private String title;
    private int year;
    private String director;
    private double budget;

    public Film(String title, int year, String director, double budget) {
        this.title = title;
        this.year = year;
        this.director = director;
        this.budget = budget;
    }

    public Film(String title, int year, String director) {
        this.title = title;
        this.year = year;
        this.director = director;
        this.budget = 0.0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void print() {
        System.out.println("Title: " + this.title + ", Year: " + this.year);
        System.out.println("Director: " + this.director + ", Budget: $" + this.budget);
        System.out.println();
    }
}
