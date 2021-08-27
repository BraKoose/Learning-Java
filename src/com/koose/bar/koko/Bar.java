package com.koose.bar.koko;
import java.util.Scanner;
public class Bar {
    public static void main(String[] agrs ){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your First Number: ");

        int num1 = scan.nextInt();

        System.out.print("Enter Your Second Number: ");

        int num2 = scan.nextInt();
        scan.close();

        int product = num1 * num2;

        System.out.println("Output: " + product);
    }
 }