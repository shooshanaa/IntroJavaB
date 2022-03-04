package com.company;

public class homework_1 {
    public static void main(String[] args) {
        // Write a program that will output the prime numbers between 1- 80.
        System.out.println("Task 1: ");

        for (int i = 1; i <= 80; i++) {
            int counter = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }

            if (counter == 0) {
                System.out.println(i + " is prime");

            }

        }
        //Write a program that will act as a simple calculator where you set a variable as the operator and based on that
        //perform an arithmetic operation. For example if the operator variable is "+" then it will add two numbers  and so on

        System.out.println("Task 2:");

        char operator = '*';
        int bigNumber = 15;
        int smallNumber = 3;
        if (operator == '+') {

            System.out.println("The sum is " + (bigNumber + smallNumber));

        } else if (operator == '-') {
            System.out.println("The difference is " + (bigNumber - smallNumber));
        } else if (operator == '*') {
            System.out.println("The product is " + (bigNumber * smallNumber));
        } else
            System.out.println("Operator not recognized");



    }


}
