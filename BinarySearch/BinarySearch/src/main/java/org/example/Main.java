package org.example;

import static org.example.BinarySearch.binarySearch;

public class Main {

    public static void main(String args[]) {

        int arr[] = {10, 20, 30, 40, 50};

        int key = 30;

        int last = arr.length - 1;

        binarySearch(arr, 0, last, key);
    }
}