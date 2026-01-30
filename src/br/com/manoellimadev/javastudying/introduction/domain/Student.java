package br.com.manoellimadev.javastudying.introduction.domain;

public class Student {
    public String name;
    public int age;
    public char gender;

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
