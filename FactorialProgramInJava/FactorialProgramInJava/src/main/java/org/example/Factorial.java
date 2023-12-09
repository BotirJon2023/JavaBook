package org.example;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        long fact = 1;
        int i = 1;
        while (i <= n) {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }

    public int fact(int n) {
        return n;
    }
}
