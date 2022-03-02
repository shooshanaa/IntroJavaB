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
                System.out.println(counter + " is a multiple of 4");

            }
            counter ++;

            }
        }





    }


}