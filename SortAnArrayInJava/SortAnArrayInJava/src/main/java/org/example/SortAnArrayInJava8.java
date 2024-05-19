package org.example;

import java.util.Arrays;

public class SortAnArrayInJava8 {

    public static void main(String[] args) {

        int[] a = {12, 90, 34, 2, 45, 3, 22, 18, 5, 78};

        Arrays.sort(a, 2, 7);


        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i]);

        }
    }
}
