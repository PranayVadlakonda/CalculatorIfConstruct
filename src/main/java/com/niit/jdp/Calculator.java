package com.niit.jdp;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // initialize the scanner
        Scanner input = new Scanner(System.in);

        // prompt the user to enter first number
        System.out.println("Enter the first number :");

        // create a variable to store the first number , use the input.nextint() method to accept user input
        // byte,short,int,long,float,double -> whole -> int,decimal -> double
        int firstNumber = input.nextInt();

        // prompt the user to enter operator
        System.out.println("Enter the operator :");

        // create a variable to store the operator, + - * / -> char
        char operator = input.next().charAt(0);

        // prompt the user to enter the second number
        System.out.println("Enter the second number :");

        // create a variable to store the second number , use the input.nextint() method to accept user input
        // byte,short,int,long,float,double -> whole -> int,decimal -> double
        int secondNumber = input.nextInt();

        // check if the operator is +
        if (operator == '+') {
            // if yes , print the sum of to numbers
            System.out.println("firstNumber + secondNumber");
        } else if (operator == '-') {
            // if yes , print the difference of two numbers
            System.out.println("firstNumber - secondNumber");


        }

    }

    }
}
