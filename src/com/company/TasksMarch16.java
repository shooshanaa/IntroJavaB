package com.company;
import java.util.Scanner;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TasksMarch16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Task 1:");
        //You're given a string of words from the user.
        // You need to find the word "Nemo", and return a string like this:
        // "I found Nemo at [the order of the word you find Nemo]!".
        // If you can't find Nemo, return "I can't find Nemo :(".

      /*  System.out.println("Please write something here:");
        String userInput = scanner.nextLine();

       String[] words = userInput.split (" ");
        System.out.println(Arrays.toString(userInput.split(" ")));

        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase("Nemo")) ;
            {


                System.out.println("I found Nemo at " + (i + 1));
                break;
            }

            if (i == words.length - 1 && !words[i].equalsIgnoreCase("Nemo")) {
                System.out.println("I can't find Nemo !");
            }
        }*/

        System.out.println("Task 2:");
        //Create a program that takes an array and returns
        // the difference between the biggest and smallest numbers.

       /* System.out.println("How many numbers you want to enter?");
        int[] countOfNumbers = new int [scanner.nextInt()];

        for (int i = 0; i < countOfNumbers.length; i++) {
            System.out.println("Please enter your numbers:");
            countOfNumbers [i] = scanner.nextInt();
        }

        int minimum = countOfNumbers [0];
        int maximum = countOfNumbers[0];
        for (int i = 0; i < countOfNumbers.length; i++) {
            if (maximum < countOfNumbers[i])
                maximum = countOfNumbers[i];
            if (minimum > countOfNumbers[i])
                minimum = countOfNumbers[i];
        }
        System.out.println(Arrays.toString(countOfNumbers) + " difference between min and max number is " + (maximum - minimum));*/





       /* Arrays.sort (countOfNumbers);

        System.out.println("The biggest number of array is " + (countOfNumbers[countOfNumbers.length -1]));
        System.out.println("The smallest number of array is " + (countOfNumbers[0]));
        System.out.println("The difference between them is " + (countOfNumbers[countOfNumbers.length -1]-countOfNumbers[0]));*/


        System.out.println("Task 3:");
        //Create a program that takes an array of Strings
        // (You can initialize the variable without user input)
        // and checks if the last item matches the rest of the array concatenated together.
        // For example,  ["i", "love", "tesh", "ilovetesh"] will return true.

        String[] stringArr = {"i", "love", "tesh", "ilovetesh"};
        String appender = "";

        for (int i = 0; i < stringArr.length-1; i++) {
            appender += stringArr[i];
            
        }

        System.out.println(appender.equals(stringArr[stringArr.length-1]) ? "match":"don't match");





























    }
}
