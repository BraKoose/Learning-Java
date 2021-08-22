package com.koose.foo;

import java.time.LocalDate;

public class Foo {

    public static void main(String[] args){
        int a = 10;
        int b = a;
        a = 100;
        LocalDate now = LocalDate.now();
        System.out.println(now.getDayOfWeek());
        System.out.println("a = " + a + " - b" + b);

        Person alex = new Person("Koo$e");
        Person mariam = alex;

        System.out.println("Before changing Alex");
        System.out.println(alex.name + " " + mariam.name);

        alex.name = "Godfred Addai Amoako";


        System.out.println("After  changing Alex");
        System.out.println(alex.name + " " + mariam.name);


    }

    static class Person{
        String name;

        Person(String name){
            this.name = name;
        }
    }
}
