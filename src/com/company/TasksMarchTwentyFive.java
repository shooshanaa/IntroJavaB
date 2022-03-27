package com.company;
import javafx.util.converter.LocalDateStringConverter;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Arrays;
import java.time.LocalDate;
import java.util.Date;

public class TasksMarchTwentyFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       /*   //Task 1: BMI for 5 persons based on heigth and weigth

        System.out.println("Enter your weigth : ");
        double weigthOne = scanner.nextDouble();

        System.out.println("Enter your heigth : ");
        double heigthOne = scanner.nextDouble();

        System.out.println("Enter your weigth : ");
        double weigthTwo = scanner.nextDouble();

        System.out.println("Enter your heigth : ");
        double heigthTwo = scanner.nextDouble();

        System.out.println("Enter your weigth : ");
        double weigthThree = scanner.nextDouble();

        System.out.println("Enter your heigth : ");
        double heigthThree = scanner.nextDouble();

        System.out.println("Enter your weigth : ");
        double weigthFour = scanner.nextDouble();

        System.out.println("Enter your heigth : ");
        double heigthFour = scanner.nextDouble();

        System.out.println("Enter your weigth : ");
        double weigthFive = scanner.nextDouble();

        System.out.println("Enter your heigth : ");
        double heigthFive = scanner.nextDouble();

        double bmiOne = weigthOne/Math.pow(heigthOne, 2);
        double bmiTwo = weigthTwo/Math.pow(heigthTwo, 2);
        double bmiThree = weigthThree/Math.pow(heigthThree, 2);
        double bmiFour = weigthFour/Math.pow(heigthFour, 2);
        double bmiFive = weigthFive/Math.pow(heigthFive, 2);

        double average = (bmiOne+bmiTwo+bmiThree+bmiFour+bmiFive)/5;

        System.out.println("The average bmi of the group is " + average);*/

        //Task 2: the most used character of a string
        //Given a string from the user return the character and count of the character that occurs the most
        //in the string.

     /*   System.out.println("Please enter a sentence: ");
        String userInput = scanner.nextLine();

        String mostUsedChar = "";
        int count = 0;

        String[] array = userInput.split("");
        for (int i = 0; i < array.length; i++) {
            int temp = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    temp++;
                }
                if (temp > count) {
                    count = temp;
                    mostUsedChar = array[i];

                    }
                }

            }
            System.out.println("The most used character is " + mostUsedChar + " used " + count + " times.");*/


        //Task 3:
        // You're sent to a grocery store with the following items on your list ["Bananas", "Bread", "Fish"]
        // The cost of the items in the store is [12, 5, 10], your current cash-in-hand is 20 dollars. Which
        // of the items can you safely buy without needing extra cash.
        // Priority - Bananas[least], Fish[second], Bread[First]
        // N.B. you can't buy half of an item.
        // You can buy -- and -- and you'll be left with -- dollars.

     /*   String[] list = {"bananas", "bread", "fish"};
        int bananas = 12;
        int bread = 5;
        int fish = 10;
        int cash = 20;

        System.out.println(Arrays.toString(list));

        int[] price = {12, 5, 10};

        int sum = 0;
        int count = 0;

        Arrays.sort(price);
        System.out.println(Arrays.toString(price));

        for (int i = 0; i < price.length; i++) {
            if (sum + price[i] <= cash) {

                sum += price[i];
                count++;
            }
        }
        System.out.println("You can buy " + count + " items and you are left with " + (cash - sum) + " dollars.");*/



        // Task 4: magic dates
       // Receive the year, month and day from the user separately.
        // - The year should be a four-digit number.
        // - Assume that the date is correct
        // Determine if the date is a magic date
        // A magic date occurs when:
        // - m * d  is a 1-digit number that matches the last digit of the year. OR
        // - m * d is a 2-digit number that matches the last 2 digits of the year. OR
        // - m * d is a 3-digit number that matches the last 3 digits of the year.

        // For example, 1 2 2012

        // return the output interactively to the user.

        Date date = new Date();


            System.out.println("Enter a year ");
            String year = scanner.nextLine();

            System.out.println("Enter a month ");
            String month = scanner.nextLine();

            System.out.println("Enter a day ");
            String day = scanner.nextLine();

            int y = Integer.parseInt(year);
            int m = Integer.parseInt(month);
            int d = Integer.parseInt(day);

            String [] yArray = year.split("");


           if ((m*d)==y) {
                System.out.println( " is a magic date.");

            } else
                System.out.println("nothing magical about this date.");













    }
}
