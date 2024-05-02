package org.example;

public class PrintTheElementsOfAnArrayPresentOnEvenPosition {

    public static void main(String[] args) {

        int [] arr = new int [] {1, 2, 3, 4, 5, 7, 6, 9, 8, 11, 10};

        System.out.println("Elements of given array present on even position: ");

        for (int i = 1; i < arr.length; i = i+2) {

            System.out.println(arr[i]);
        }
    }

}
