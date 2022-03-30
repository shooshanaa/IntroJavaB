package com.company;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class MethodsIntro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Please write something: ");
        String userInput = scanner.nextLine();

        System.out.println("There are " + countConsonants(userInput) + " consonants ir your statement.");


        System.out.println("How many numbers would you like to check?");

        int[] userNumbers = new int[scanner.nextInt()];

        for (int i = 0; i < userNumbers.length; i++) {
            System.out.println("Please enter your numbers:");
            userNumbers[i] = scanner.nextInt();
        }
        System.out.println("The biggest number you entered is " + findMax(userNumbers));*/

      /*  System.out.println("Enter a big number: ");
        double bigNumber = scanner.nextDouble();

        System.out.println("Enter a smaller number: ");
        double smallNumber = scanner.nextDouble();

        System.out.println("Choose the operator: + - / * ");
        String operator = scanner.next();

        System.out.println("You entered: "+ (bigNumber) + (operator) + (smallNumber) + ".");
        System.out.println("The result is: " + calculator(bigNumber, smallNumber, operator));

        System.out.println(calculator(6, 18, "*"));*/

  /*      System.out.println("Enter your password: ");
        String password = scanner.next();

        System.out.println("Repeat the password: ");
        String passwordCheck = scanner.next();

        System.out.println("The passwords you entered are " + checkEqual(password, passwordCheck));*/


    /*    System.out.println("Enter your initial amount fo money: ");
        double initialAmount = scanner.nextDouble();

        System.out.println("Enter the interest rate (as a decimal: ");
        double intRate = scanner.nextDouble();

        System.out.println("Enter the time period: ");
        double time = scanner.nextDouble();

        System.out.println("Your interest earned is " + simpleInterest(initialAmount, intRate, time) );*/

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println(isPrime(number) ? "is prime " : " is not prime " );




    }

    public static boolean checkEven(int number) {
        if (number % 2 == 0) return true;
        else return false;
    }


//Task 1: write a method that takes in a string and returns the number of consonants in it.

    public static boolean isConsonant (char letter) {
      //  letter = Character.toLowerCase();

        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') return false;
        else return true;

    }
    public static int countConsonants (String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            
                if (isConsonant(str.charAt(i)))
            count++;
               // return count;
        }
        return count;
    }

    //Task 2: write a method to find the max number in the array

    public static int findMax (int []number) {

        int maxNumber = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] > maxNumber)
                maxNumber = number[i];

        }

        return maxNumber;

        }

        //Task 3: simple calculator

    public static double calculator (double bigNumber, double smallNumber, String operator) {
      //  double result = 0;

                switch (operator) {
            case "+":
                return  (bigNumber + smallNumber);
            case "-":
                return (bigNumber - smallNumber);
            case "*":
                return (bigNumber * smallNumber);
            case "/":
                return (bigNumber/smallNumber);
                    default:
                        return 0;
                                }


    }

    //Task 4: write a method, that compares two strings and returns true or false based on their equality

   public static boolean checkEqual (String textOne, String textTwo) {
       if (textOne.equals(textTwo))

          return true;
       else return false;
   }

   //Task 5: Write a method to calculate simple interest and return it.

    public static double simpleInterest (double ipb, double interestRate, double years) {

        return ((ipb*interestRate*years)/100 );


    }

    // Method that takes an int and returns whether it is or is not a prime

    public static boolean isPrime (int number) {

        for (int j = 2; j <= (number / 2); j++) {
            if (number % j == 0) {

                return false;
            }
        }
        return true;
    }







}
