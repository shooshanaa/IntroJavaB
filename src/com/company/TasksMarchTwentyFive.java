package com.company;
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

        //Task 2: the most used charachter of a string

        System.out.println("Please enter a sentence: ");
        String userInput = scanner.nextLine();
        int[] freqw = new int[userInput.length()];

        char[] userString = userInput.toCharArray();

        for (int i = 0; i < userInput.length(); i++) {
            freqw[i] = 1;
            for (int j = i+1; j < userInput.length(); j++) {
                if(userString[i]== userString[j]) {
                    freqw[i] ++;
                    userString[j]=0;
                }
                
            }
            }
        System.out.println("Charachter frequencies: ");
        for (int i = 0; i < freqw.length; i++) {
            if(userString[i]!=' ' && userString[i]!=0) {
                System.out.println(userString[i] + " " + freqw[i]);
            }

        }


       /* // Task 4: magic dates

        Date date = new Date();

        System.out.println("Enter a year ");
        int year = scanner.nextInt();

        System.out.println("Enter a month ");
        int month = scanner.nextInt();

        System.out.println("Enter a day ");
        int day = scanner.nextInt();

        String dateinString;


        String [] userDate = {"year", "month", "day"};
       System.out.println(date.toString());*/

      /*  for (int i = 0; i < userDate.length; i++) {
            if (userDate[1]*userDate[2]==userDate[0]) {
                System.out.println("You entered a magic date" + userDate);
            }

        }*/



















    }
}
