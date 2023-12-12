package org.example;

import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        int[][] pascal = new int[rows][rows];

        for (int i = 0; i < rows; i++) {
            pascal[i][0] = 1;
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < rows; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }

        // Print the Pascal Triangle
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.println(pascal[i][j] + " ");
            }
            System.out.println();
        }
    }
}
