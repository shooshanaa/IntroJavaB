package com.company;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayAssignmentsTwo {
    public static void main(String[] args) {

      /*  //Task 1:

        int [] numbers = {3, 5, 9, 10, 7, 2, 1};

        //Arrays.sort(numbers);

        for (int i = 1; i < numbers.length; i+=2) {

            if (numbers[i-1]> numbers[i]) {
                int temp = numbers [i-1];
                numbers[i-1]=numbers[i];
                numbers[i]=temp;

            }
                if (i+1< numbers.length && numbers[i+1] > numbers[i]){
                    int temp = numbers [i+1];
                    numbers[i+1]=numbers[i];
                    numbers[i]=temp;
                }
        }
        System.out.println(Arrays.toString(numbers));*/

        Scanner scanner = new Scanner(System.in);
        //Task on triangles:

      /*  System.out.println("Enter the length of the base of triangle: ");
        int base = scanner.nextInt();

        System.out.println("Enter the height of the triangle: ");
        int height = scanner.nextInt();

        System.out.println("The area of your triangle is " + (Math.multiplyExact(base, height)/2) + " square cm." );*/


        // Task on quadratic equations:

     /*   System.out.println("Enter a number: ");
        double a = scanner.nextDouble();

        System.out.println("Enter b number: ");
        double b = scanner.nextDouble();

        System.out.println("Enter c number: ");
        double c = scanner.nextDouble();

        double x1 = ((-b + Math.sqrt((Math.pow(b, 2) - (4*a*c))))/(2*a));
        double x2 = ((-b - Math.sqrt((Math.pow(b, 2) - (4*a*c))))/(2*a));

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);*/


        //Write a Java program to find maximum product of two integers in a given array of integers
        // Example:
        //Input :
        //nums = { 2, 3, 5, 7, -7, 5, 8, -5 }
        //Output:
        //Pair is (7, 8, Maximum Product: 56

     /*   int [] numbers = {2,3,5,7,-7,5,8,-5};

        System.out.println(numbers.length);

        Arrays.sort (numbers);
        System.out.println(Arrays.toString(numbers));



        System.out.println("The pair is: " + numbers[numbers.length-1] + " & " + numbers[numbers.length-2]);
        System.out.println("The product is: " + (numbers[numbers.length-1]*numbers[numbers.length-2]));*/



        //Write a Java program to find minimum subarray sum of specified size in a given array of integers
        // Example:
        //Input :
        //nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9,10}
        //Output:
        //Sub-array size: 4
        //Sub-array from 0 to 3 and sum is: 10


        System.out.println("Choose the number of numbers: ");
        int[] nums = new int [scanner.nextInt()];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter random numbers: ");
            nums[i]= scanner.nextInt();

        }
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("Choose the length of array: ");
        int minSize = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < minSize; i++) {

            sum += nums[i];


        }
        System.out.println("The smallest sum of subarray numbers is: " + sum);


















    }

}
