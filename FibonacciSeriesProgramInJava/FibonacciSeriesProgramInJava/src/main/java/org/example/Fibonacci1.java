package org.example;

import java.util.Scanner;

public class Fibonacci1 {

    public static void main(String[] args) {
        int n, a = 0, b = 0, c = 1, i = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of n:");
        n = s.nextInt();
        System.out.print("Fibonacci Series:");
        while (i <= n) {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a + " ");
            i++;
        }
    }
}

