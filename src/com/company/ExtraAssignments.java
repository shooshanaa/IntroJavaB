package com.company;
import java.util.Scanner;
public class ExtraAssignments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Task 1:");
       // Write a program that returns true interactively,
        // if a user enters a string containing any of
        // these characters: 'u', 'w', '6', 'i', 'b', 'q'

        System.out.println("Please enter your word: ");
        String inputString = scanner.next();

        int counter = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char currentLetter = inputString.toLowerCase().charAt(i);
            switch (currentLetter) {
                case 'u':
                case 'w':
                case '6':
                case 'i':
                case 'b':
                case 'q':
                    break;

                default:
                   break;
            }
        }

        System.out.println("True" );*/

        // Write a program that accepts a String from a user and prints
        // an interactive response telling the user if the word is the same when spelt backwards.
        // For example, bread when spelt backwards is daerb, which isn't quite the same.

        System.out.println("Task 2:");

        System.out.println("Please enter a word: ");
        String userString = scanner.next();
        String backwards = "";
        char chnew;

        for (int n = 0; n < userString.length(); n++) {
            chnew = userString.charAt(n);
            backwards = chnew + backwards;
        }
        if (userString.equalsIgnoreCase(backwards)) {
            System.out.println("Your word is the same spelt backwards " + (backwards));
        } else {
            System.out.println("Your word is not spelt the same backwards " + (backwards));
        }

        // Write a program that accepts any of the primary colors as a String
        // and returns the complimentary color of that color to the user.

        System.out.println("Task 3:");
        System.out.println("Please choose a color: yellow, blue or red. And type it here: ");

        String userColor = scanner.next();

        if (userColor.equalsIgnoreCase("red"+"yellow"+"blue")) {

            switch (userColor) {
                case "blue":
                    System.out.println("The complimentary colour of blue is orange.");
                    break;
                case "yellow":
                    System.out.println("The complementary colour of yellow is purple.");
                    break;
                case "red":
                    System.out.println("The complementary colour of red is green.");
                    break;

            }
        }else {
                System.out.println("That's not a primary colour.");



        }
    }

      }
