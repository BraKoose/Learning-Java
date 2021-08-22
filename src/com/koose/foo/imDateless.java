package com.koose.foo;
import java.time.LocalDateTime;
import java.util.Date;
import java.time.LocalDate;

public class imDateless {

    public static void main(String [] args){
        Date date = new Date();
        LocalDate locateDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        String s = new String();
        java.sql.Date dateSql = new java.sql.Date(1);
        System.out.println(date);
        System.out.println(localDateTime);
        System.out.println(s);
        System.out.println(dateSql);
    }
}
