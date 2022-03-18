package com.company;

import javax.swing.text.AttributeSet;

public class HomeworkStrings {
    public static void main(String[] args) {

        System.out.println("Task 1:");
        // Write a program to compare two strings by their length and return output
        // that tells the user if the strings are equal or not.

        String sentence1 = "I love spring";
        String sentence2 = "Birds fly high";

        if (sentence1.length() == sentence2.length()) {
            System.out.println((sentence1.length()) + " is equal to " + sentence2.length());
        } else {
            System.out.println(sentence1.length() + " is not equal to " + sentence2.length());
        }

        if (sentence1.equalsIgnoreCase(sentence2)) {
            System.out.println(sentence1 + " is equal to " + sentence2);

        } else {
            System.out.println(sentence1 + " is not equal to " + sentence2);
        }

        System.out.println("Task 2:");

        // Write a program to add as many 'r's to 'burp' by using a variable to regulate.
        // For example, if that variable is set to 4, then it will return an output like 'burrrrp'.

        int num = 3;
        String rnumber = " ";

        for (int i = 0; i < num ; i++) {
            rnumber = rnumber + "r";

        }
        System.out.println("bu" + rnumber + "p");





        System.out.println("Task 3:");

        //Write a program to remove the first and last letters of a string. e.g. hello becomes ell.

        String word = "hello";
        char ch1='h';
        char ch2 = 'o';
        char newch = ' ';

        word = word.replace('o', ' ');

        System.out.println(word.replace('h', ' '));


        String newword = "hello";
        System.out.println(newword.substring(1, newword.length()-1));


        System.out.println("Task 4:");
        //Write a program to reverse a string and capitalize all the letters. e.g. hello becomes OLLEH.

        String task = "hello";
        String newtask = " ";

        System.out.println(task.toUpperCase());
        
        char chnew;

        for (int n = 0; n < task.length(); n++) {
            chnew = task.toUpperCase().charAt(n);
            newtask = chnew + newtask;
        }
        System.out.println("Reversed word: " + newtask);
            
        }




}
