package com.company;

public class stringTest {
    public static void main(String[] args) {
        String word1 = "Aerodynamics" ;
        String word2 = "Physician";

        System.out.println(word1.length());
        System.out.println(word2.length());

        int counterA = 0;
        for (int i = 0; i < word1.length(); i++) {
          //  System.out.println(word1.toLowerCase().charAt(i));
            if ('a' == word1.toLowerCase().charAt(i)) ;   {
                counterA++;
            }
        }

            System.out.println("'a' appeared " + counterA + " times");
            }

        //Write a program to compare two strings by their length and return output
        // that tells the user if the strings are equal or not.
            String string_1 = "I love spring";
            String string_2 = "Birds are flying";














}
