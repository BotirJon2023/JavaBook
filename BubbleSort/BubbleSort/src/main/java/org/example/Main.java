package org.example;

import static org.example.BubbleSort.bubbleSort;

public class Main {

    public static void main(String[] args) {

        int arr[] = {3, 60, 35, 2, 45, 320, 5};

        System.out.println("Array Before Bubble Sort");

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }

        System.out.println();

        bubbleSort(arr);

        System.out.println("Array After Bubble Sort");

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }
}