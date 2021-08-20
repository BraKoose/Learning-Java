package com.koose.foo;

import java.time.LocalDate;

public class Foo {

    public static void main(String[] args){
        // non primitive data types AKA reference types
        String name = new String("Koose");
        String gf = new String("Adwoa");
        LocalDate now = LocalDate.now();
        System.out.println(now.getDayOfWeek());
        System.out.println(name.toUpperCase());
        System.out.println(gf.toUpperCase());

    }
}
