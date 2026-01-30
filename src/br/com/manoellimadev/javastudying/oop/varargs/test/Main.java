package br.com.manoellimadev.javastudying.oop.varargs.test;

import br.com.manoellimadev.javastudying.oop.varargs.domain.Student;

public class Main {
    public static void main(String[] args) {
        String name = "Manoel", name02 = "Pedro";
        int age = 25, age02 = 20;
        char gender= 'M', gender02 = 'M';
        Student student01 = new Student(name, age, gender);
        Student student02 = new Student(name02, age02, gender02);

//        System.out.println("Name: "+student01.name+ " Age: "+ student01.age + " Gender: "+ student01.gender);
//        System.out.println("Name: "+student02.name+ " Age: "+ student02.age + " Gender: "+ student02.gender);
        System.out.println("The sum is: " + student01.varArgsSum(1,2,3,4,5,6));
    }
}
