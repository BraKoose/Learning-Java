package com.koose.foo;

import java.sql.SQLOutput;

public class reserved {

    public static void  main(String[] agrs){
        // logical Operators
        boolean isAdult = false;
        boolean isStudent = true;
        boolean isKooseFan = true;
        String name = "Koo$e";
        System.out.println(!isAdult && isStudent);
        System.out.println((isAdult || isStudent) && !isKooseFan);
        System.out.println(10 * 10 > 8 && 2 *100 < 24);
        System.out.println(
                (10 > 8 || 2 <= 4) &&
                        !isAdult &&
                        name.contains("$"));
    }
}
