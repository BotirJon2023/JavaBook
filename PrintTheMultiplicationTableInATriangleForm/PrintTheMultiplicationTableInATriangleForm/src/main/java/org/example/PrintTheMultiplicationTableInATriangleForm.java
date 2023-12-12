package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrintTheMultiplicationTableInATriangleForm {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.println("Enter the value of n");
        try {
            n = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            System.out.println("An error occurred");
            return;
        }
        int i, j;
        System.out.println("The table in triangular form is");
        for (i = 1; i <= n; i++) {
            System.out.printf("%2d ", i);
        }
        System.out.println();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.printf("%2d ", i * j);
            }
            System.out.println();
        }
    }
}

