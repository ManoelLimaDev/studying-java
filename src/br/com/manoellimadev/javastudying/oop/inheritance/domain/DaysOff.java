package br.com.manoellimadev.javastudying.oop.inheritance.domain;

public enum DaysOff {
    FRIDAY(6, "Friday"),
    SATURDAY(7, "Saturday"),
    SUNDAY(1, "Sunday");

    public final int dayNumber;
    public final String day;
    DaysOff(int dayNumber, String day){
        this.dayNumber=dayNumber;
        this.day = day;
    }
}
