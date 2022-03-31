package com.company;
import java.util.Scanner;


public class RecursionAssignments {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Task 1:
        System.out.println("The sum is " + upToNumber(8));

        //Task 2:
        System.out.println("Enter a word: ");
        String word = scanner.next();

        System.out.println("Reversed string: " + reversedString(word));


    }

    //Task 1:
    //Using recursion, write a method that takes a number as a parameter and
    // returns the total sum between one and that number;
    // upToNumber(8) -> 1 + 2 + ... + 8

    public static int upToNumber (int number) {
        if (number <= 1)
            return number;
            return number + upToNumber(number - 1);

    }

    //Task 2:
    //Using recursion, write a method that takes a string as a parameter and
    //returns the reverse of the string.

    public static String reversedString (String text) {
        if (text.isEmpty())
            return text;
            return reversedString(text.substring(1))+text.charAt(0);


        }


}
