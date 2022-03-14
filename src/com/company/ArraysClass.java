package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class ArraysClass {
    public static void main(String[] args) {

        System.out.println("Task 1:");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Decide on how many numbers you will use: ");
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

        System.out.println("The average is: " + (sum/(numbers.length)));








    }
}
