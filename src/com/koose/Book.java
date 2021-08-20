package com.koose;

public class Book {
    public static void main (String[] args){
        String content ="1234";
        int n = Integer.parseInt(content);
        int m = 2 * n;
        System.out.println(m + 20);
        String koose="3.14";
        double d1 = Double.parseDouble(koose);
        double d2 = d1 % 100;
        double d3 = d2 - 140;
        double d5 = d3 * d1;
        System.out.println(d5);
    }


}
