package org.example;

public class PrintTheFollowingPatternOnTheConsole9 {

    public static void main(String[] args) {

        int i, j;

        int n = 16;

        for (i = n; i > 0; i--) {

            for (j = 0; j < i; j++) {

                System.out.print("Q");

            }

            System.out.println("");
        }
    }
}
