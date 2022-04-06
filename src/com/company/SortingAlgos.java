package com.company;

import java.util.Arrays;

public class SortingAlgos {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 8, 5, 3, 9};

        //Bubble sort:
/*
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;


                }

            }
        }*/

      /*  //Insertion sort:
        for (int i = 1; i < numbers.length; i++) {
            int valueToSort = numbers[i];
            int j;
            for (int j = i; j < 0 && numbers[j - 1] > valueToSort; j--) {
                numbers[j] = numbers[j - 1];
            }
            numbers[j] = valueToSort;

        }
            System.out.println(Arrays.toString(numbers));*/

     /*   //Selection sort:
        for (int i = 0; i < numbers.length; i++) {
            int index=i;
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[j]<numbers [index])
                    index = j;
                }


            int smallerNumber=numbers[index];
            numbers[index]=numbers[i];
            numbers[i]=smallerNumber;


        }
        System.out.println(Arrays.toString(numbers));*/

        mergeSort(0, numbers.length -1, numbers);
        System.out.println(Arrays.toString(numbers));


    }

    public static void mergeSort (int start, int end, int[]numbers) {
        int mid = (start+end)/2;
        if(start<end) {
            mergeSort(start, mid, numbers);
            mergeSort(mid+1, end, numbers);
            merge (start, mid, end, numbers);
        }
    }

    public static void merge (int start, int mid, int end, int[] numbers) {
        int[] tempArray = new int[numbers.length];
        int tempArrayIndex = start;
        int startIndex = start;
        int midIndex = mid + 1;

        while (startIndex <= mid && midIndex <= end) {
            if (numbers[startIndex] < numbers[midIndex]) {
                tempArray[tempArrayIndex++] = numbers[startIndex++];

            } else {
                tempArray[tempArrayIndex++] = numbers[midIndex++];
            }
        }
        while (startIndex <= mid) {
            tempArray[tempArrayIndex++] = numbers[startIndex++];

        }
        while (midIndex <= end) {
            tempArray[tempArrayIndex++] = numbers[midIndex++];

        }
        if (end + 1 - start >= 0) {
            System.arraycopy(tempArray, start, numbers, start, end+1-start);
        }
    }

}
