package com.company;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.YEARS;


public class DateAndTime {
    public static void main(String[] args) {

        Date date = new Date();
        Scanner scanner = new Scanner(System.in);

       /* System.out.println(date.getTime());
        LocalTime timeLocal = LocalTime.now();
        System.out.println(timeLocal);

        //Task 1: leap year or not?

        System.out.println("Please choose a year: ");
        int y = scanner.nextInt();

        if (y % 400 == 0 && y%100 !=0 && y%4==0) {
            System.out.println(y + " is a leap year.");

        } else {
            System.out.println(y + " is not a leap year.");


        }

        //Task 2: get the hours between two o'clocks

        System.out.println("Enter the beginning time: ");
                int begin = scanner.nextInt();

        System.out.println("Enter the end time (in hours, like 1 2 3 ): ");
        int end = scanner.nextInt();

        System.out.println( (end - begin) + " hours from  " + begin + " o'clock till " + end + " o'clock.");*/


       //Write a Java program to get year and months between two dates.

       /* System.out.println("Enter a date (yyyy-mm-dd): ");
        LocalDate begin = LocalDate.parse(scanner.next());


        System.out.println("Enter another date (yyyy-mm-dd): ");
        LocalDate end = LocalDate.parse(scanner.next());

        boolean before = begin.isBefore(end);


        if (before = true) {
            System.out.println(begin.until(end));
        } else {
            System.out.println(end.until(begin));
        }
*/

        //Write a Java program to calculate the difference between two dates in days.
        System.out.println("Enter a date (yyyy-mm-dd): ");
        LocalDate start = LocalDate.parse(scanner.next());


        System.out.println("Enter another date (yyyy-mm-dd): ");
        LocalDate stop = LocalDate.parse(scanner.next());


        long days = Math.abs(DAYS.between (start, stop));

        System.out.println(days + " days between two given dates.");

        //Task: calculate a persons age

        System.out.println("Enter your birth date (yyyy-mm-dd): ");
        LocalDate birthDate = LocalDate.parse(scanner.next());

        LocalDate today = LocalDate.now();
        System.out.println(today);

        long personsAge = YEARS.between(birthDate, today);
        System.out.println("You are " + personsAge + " years old.");



















    }

}
