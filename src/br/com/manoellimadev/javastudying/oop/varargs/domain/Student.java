package br.com.manoellimadev.javastudying.oop.varargs.domain;

public class Student {
    private String name;
    private int age;
    private char gender;

    public Student(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void sayHi() {
        System.out.println("Hello");
    }

    public int varArgsSum(int... number) {
        int sum = 0;
        for (int i : number) {
            sum+= i;
        }
        return sum;
    }
}
