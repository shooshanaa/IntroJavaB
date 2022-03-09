package com.company;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class StringsExtendedArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

     //   System.out.print("Enter your full name");
    //    String userName = scanner.next();

      //  String userSurname = scanner.next();
    //   System.out.println("Your full name is " + userSurname + " " + userName);

      //  scanner.close();

        // Write a program to compare two strings by their length and return output
        // that tells the user if the strings are equal or not.

/*
       System.out.println("Enter the first sentence: ");
       String firstSentence = scanner.next();

       System.out.println("Enter your second sentence: ");
       String secondSentence = scanner.next();



        if(firstSentence.length() == secondSentence.length()) {
         System.out.println("Sentences are the same length.");
        } else {
            System.out.println("Sentences are not the same length.");

        }*/



   /*     // Task 2:

        System.out.print("Enter a number of r: ");
        int rNumber = scanner.nextInt();

        String rString = "";

        for (int i = 0; i <rNumber ; i++) {
            rString = rString + "r";
        }
        System.out.println("bu" + rString + "p");*/

       /* System.out.println("This is one line\t This is another line");

        String five = "5";
        int number = Integer.parseInt(five);
        System.out.println(( number + number)*number);


        Pattern pattern = Pattern.compile ("adi");
        Matcher matcher = pattern.matcher("adidas");
        System.out.println(matcher.matches());*/

      /*  System.out.println("Task 1: ");
        System.out.println("Hi! Please, enter a word: ");
        String enteredWord = scanner.next();

        int counter = 0;

        for (int i = 0; i < enteredWord.length(); i++) {
            char currentLetter = enteredWord.toLowerCase().charAt(i);
            if (('a'== currentLetter)||('e' == currentLetter) || ('i'==currentLetter)||('u'==currentLetter)|| ('o'==currentLetter))
            {
                counter++;
            }
            }

        System.out.println("Your word has " + counter + " vowels");*/


/*
        System.out.println("Task 2:");

        System.out.println("Hi! Please, enter 5 numbers: ");
        String number1 = scanner.next();
        String number2 = scanner.next();
        String number3 = scanner.next();
        String number4 = scanner.next();
        String number5 = scanner.next();

        int number11 = Integer.parseInt(number1);
        int number21 = Integer.parseInt(number2);
        int number31= Integer.parseInt(number3);
        int number41 = Integer.parseInt(number4);
        int number51 = Integer.parseInt(number5);

        System.out.println("The sum of your first two numbers");
        System.out.println("multiplied by the difference of your next two numbers");
        System.out.println("and all this divided by your fifth number is: ");
        System.out.println( ((number11 + number21)*(number31 - number41))/number51);*/


        System.out.println("Task 3:");

        System.out.println("Please enter your first number: ");
        String num1 = scanner.next();

        System.out.println("Enter the operator: ");
        String operator = scanner.next();

        System.out.println("Enter the second number: ");
        String num2 = scanner.next();

        int numOne = Integer.parseInt(num1);
        int numTwo = Integer.parseInt(num2);


        switch (operator) {
            case "+":
                System.out.println("Sum is " + (numOne+numTwo));
                break;

            case "-":
                System.out.println("Difference is " + (numOne-numTwo));
                break;
            case "/":
                System.out.println("Result is " + (numOne/numTwo));
                break;
            case "*":
                System.out.println("Result is " + (numOne*numTwo));
                break;

            default:
                System.out.println("Operator not recognized!");
                break;



        }

        /*char operator = '/';
        int bigNumber = 15;
       float smallNumber = 3;


        if (operator == '+') {
            System.out.println("The sum is " + (bigNumber + smallNumber));
        } else if (operator == '-') {
            System.out.println("The difference is " + (bigNumber - smallNumber));
        } else if (operator == '*') {
            System.out.println("The product is " + (bigNumber * smallNumber));
        } else if (operator == '/') {
            System.out.println("The quotient is " + (bigNumber / smallNumber));
        } else {
            System.out.println("Operator not recognized!");
        }*/







        }

}
