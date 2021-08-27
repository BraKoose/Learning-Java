package com.koose;
import java.util.Scanner;
public class calculator {
    public static void main (String[] args){
        double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your First Number: ");
        /* So we are using the data type double because user can enter
            integers as well as floats values
        * */
        num1 = scanner.nextDouble();
        System.out.print("Enter Your Second Number: ");
        num2 = scanner.nextDouble();

        System.out.print("Enter Your Operator (+, -, *, / ");
        char operator = scanner.next().charAt(0);
        scanner.close();
        double Output;

        switch (operator){
            case '+':
                Output = num1 + num2;
                break;

            case '-':
                Output = num1 - num2;
                break;

            case '*':
                Output = num1 * num2;
                break;

            case  '/':
                Output = num1 / num2;
                break;

             /*So Users are stupid so throw an error if they dont put in the
              right operator
             * */

            default:
                System.out.printf("Don't bullshit mee, Enter the right operator ");
                return;

        }

        System.out.println(num1 + " " + operator + " " + num2 +": " + Output);
    }
}
