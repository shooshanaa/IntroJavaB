package com.company;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class ArraysClass {
    public static void main(String[] args) {

        System.out.println("Task 1:");

        Scanner scanner = new Scanner(System.in);

      /*  System.out.println("Decide on how many numbers you will use: ");
        int z = scanner.nextInt();

        int []numbers = new int[z];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter your numbers:");
            numbers [i] = scanner.nextInt();

        }
        System.out.println(Arrays.toString(numbers));

        float sum = 0;
        for (int i = 0; i <numbers.length ; i++) {

            sum += numbers [i];

        }
        System.out.println("The sum is: " + sum);

        System.out.println("The average is: " + (sum/(numbers.length)));*/

        // Write a program that receives some numbers based on the user’s choice
        // and then returns the largest number of the ones the user entered.

      /*  System.out.println("Task 2:");

        System.out.println("How many numbers would you like to check?");

        int[] userNumbers = new int[scanner.nextInt()];

        for (int i = 0; i < userNumbers.length; i++) {
            System.out.println("Please enter your numbers:");
            userNumbers[i] = scanner.nextInt();

        }
        System.out.println(Arrays.toString(userNumbers));

        int max = userNumbers[0];
        for (int i = 0; i < userNumbers.length; i++)
            if (userNumbers[i] > max)
                max = userNumbers[i];
        System.out.println("The biggest number of this array is: " + max);*/


        System.out.println("Task 3:");
        //Write a program that accepts a String from the user and
        // returns an array of integers representing the counts of each vowel in the String.
        // The array returned by your method should hold 5 elements:
        // the first is the count of As, the second is the count of Es,
        // the third Is, the fourth Os, and the fifth Us.

     /*   System.out.println("Write something!");
        String userString = scanner.nextLine();

        int[] counters = new int[5];


        for (int i = 0; i < userString.length(); i++) {
            char currentLetter = userString.toLowerCase().charAt(i);

            switch (currentLetter) {
                case 'a':
                    counters [0] ++;
                    break;
                case 'e':
                    counters [1] ++;
                    break;
                case 'i':
                    counters [2] ++;
                    break;
                case 'o':
                    counters [3] ++;
                    break;
                case 'u':
                    counters [4] ++;
                    break;

            }
        }
        System.out.println("Your statement contains: " + (Arrays.toString(counters)));*/

        System.out.println("16.03 - Task 1:");
        System.out.println("Decide on the amount of numbers you want: ");

        int[] numbers = new int[scanner.nextInt()];


        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter your numbers:");
            numbers[i] = scanner.nextInt();
        }
        int[] set = new int[numbers.length];
            int counter = 0;

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    counter++;
                    set[counter - 1] = numbers[i];
                }
            }
        for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 != 0) {
                        counter++;
                        set[counter - 1] = numbers[i];
                    }
            }
            System.out.println(Arrays.toString(set));

                






        /*System.out.println("Task 2: ");

        System.out.println("Decide on the amount of numbers you want: ");

        int[] userInput = new int[scanner.nextInt()];

        for (int i = 0; i < userInput.length; i++) {
            System.out.println("Please enter your numbers:");
            userInput[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(userInput));

        Arrays.sort(userInput);

        System.out.println("The second largest number is: " + userInput[userInput.length -2]);*/


       /* System.out.println("Task 3:");
        System.out.println("Decide on the amount of numbers you want: ");

        int[] userInput = new int[scanner.nextInt()];

        for (int i = 0; i < userInput.length; i++) {
            System.out.println("Please enter your numbers:");
            userInput[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(userInput));

        boolean ifThree = false;

        for (int i = 0; i <userInput.length; i++) {
            if (userInput[i] % 3 == 0) {
                ifThree = true;
                break;
            }
        }
        if (ifThree ) {

                System.out.println("A multiple of three exists");
            } else
                System.out.println("There are no numbers that can be divided by 3.");*/




        }
}
