package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProgramToDisplayUpperAndLowerTriangularMatrix {

    static void displayUpperAndLowerTriangle(int[][] matrix) {
        int order = matrix.length;
        int i, j;
        for (i = 0; i < order; i++) {
            for (j = 0; j < order; j++) {
                if ((i + j) < order)
                    System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        for (i = 0; i < order; i++) {
            for (j = 0; j < order; j++) {
                if ((i + j) >= order)
                    System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Function to read user input
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int order;
        System.out.println("Enter the order of the matrix");
        try {
            order = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            System.out.println("An error occurred");
            return;
        }
        int[][] matrix = new int[order][order];
        System.out.println("Enter matrix elements");
        int i, j;
        for (i = 0; i < order; i++) {
            for (j = 0; j < order; j++) {
                try {
                    matrix[i][j] = Integer.parseInt(br.readLine());
                } catch (Exception e) {
                    System.out.println("An error occurred");
                    return;
                }
            }
        }
        System.out.println("Tha matrix is");
        for (i = 0; i < order; i++) {
            for (j = 0; j < order; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("The upper and lower triangle is");
        displayUpperAndLowerTriangle(matrix);
    }
}
