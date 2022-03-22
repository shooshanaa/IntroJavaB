package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class AssignmentsThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Task 1: area of right angled triangle

        System.out.println("Enter the length of the triangles one side: ");
        float a = scanner.nextFloat();

        System.out.println("Enter the length of the triangles other side: ");
        float b = scanner.nextFloat();

        System.out.println("Enter the length of the triangles third side: ");
        float c = scanner.nextFloat();

        float[]sides = {a, b, c};

        Arrays.sort (sides);

        if (sides[0]<sides[2] && sides [1] < sides[2]) {

            System.out.println("The area of the given triangle is: " + ((sides[0] * sides[1]) / 2) + " square cm.");
        } else System.out.println("That's not a right-angled triangle");


        // Task 2: fibonacci

        System.out.println("How many fibonacci numbers do you want to display?");
        int userIdea = scanner.nextInt();
        int []fibo = new int [userIdea];

        for (int i = 2; i < userIdea; i++) {
          fibo[0]=0;
          fibo[1]=1;
          fibo[i] = fibo[i - 1] + fibo[i - 2];

        }
        System.out.println(Arrays.toString(fibo));




    }
}
