package com.company;

public class Conditionals {
    public static void main(String[] args) {
        int value;
        value = 9;
        if (value > 9 && value <15) {
            System.out.println(value);
        } else {
            System.out.println("not bigger than 9");
        }
        // Task: 1

        int count = 1;
        count = count +1;

        for (int i =1; i<51; i++ ) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }

         //Task:2

            int counter = 1;
         while (counter <= 50) {
            if (counter %4 == 0) {
                System.out.println(counter);
            }
            counter ++;

        }

         // Task: 3

        int number = 1;
         for (int i =1; i<50; i++)
        {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("FizzBuzz");
            } else if
                (i % 3 == 0) {
                System.out.println("Fizz");
            } else if
                (i % 7 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }




    }



}