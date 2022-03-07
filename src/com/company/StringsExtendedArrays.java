package com.company;
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


      //  System.out.print("Enter the first sentence: ");
        //String firstSentence = scanner.next();

       // System.out.print("Enter your second sentence: ");
      //  String secondSentence = scanner.next();



     //   if(firstSentence.length() == secondSentence.length()) {
     //    System.out.println("Sentences are the same length.");
     //   } else {
     //       System.out.println("Sentences are not the same length.");

    //    }



   /*     // Task 2:

        System.out.print("Enter a number of r: ");
        int rNumber = scanner.nextInt();

        String rString = "";

        for (int i = 0; i <rNumber ; i++) {
            rString = rString + "r";
        }
        System.out.println("bu" + rString + "p");*/

        System.out.println("This is one line\t This is another line");

        String five = "5";
        int number = Integer.parseInt(five);
        System.out.println(( number + number)*number);


        Pattern pattern = Pattern.compile ("a + d");
        Matcher matcher = pattern.matcher("adidas");
        System.out.println(matcher.matches());







            
        }





}
