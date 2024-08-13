package org.example;

public class PrintSpiralPattern3 {

    public static void main(String args[]) {
        int SIZE = 10;

        int i, j, N;

        int[][] board = new int[SIZE][SIZE];

        int left, top;

        left = 0;

        top = SIZE - 1;

        N = 1;

        for (i = 1; i <= SIZE / 2; i++, left++, top--) {


            for (j = left; j <= top; j++, N++) {

                board[left][j] = N;
            }


            for (j = left + 1; j <= top; j++, N++) {

                board[j][top] = N;
            }


            for (j = top - 1; j >= left; j--, N++) {

                board[top][j] = N;
            }


            for (j = top - 1; j >= left + 1; j--, N++) {

                board[j][left] = N;
            }
        }


        for (i = 0; i < SIZE; i++) {

            for (j = 0; j < SIZE; j++) {

                System.out.printf("%-5d", board[i][j]);
            }

            System.out.printf("\n");
        }
    }
}
