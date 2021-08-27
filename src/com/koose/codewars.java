package com.koose;


public class codewars {
    public static String createPhoneNumberClever(int[] numbers) {

        String no = "(";

        for(int i=1; i<numbers.length; ++i) {
            if(i<2) {
                no += "" + i;
            }else if(i==2) {
                no += "" + i + ") ";
            }else if(i>2 && i<5) {
                no += ""+i;
            }else if(i == 5){
                no += ""+i+"-";
            }else {
                no += ""+i;
            }

        }

        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);

    }

    }

