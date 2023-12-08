package org.example;

import java.util.Scanner;

public class ArmStrong2 {

    public static void main(String[] args) {
        int n, count = 0, a, b, c, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
        n = s.nextInt();
        a = n;
        c = n;

        // Calculate the number of digits in 'n' using a for loop
        for (; a > 0; a /= 10) {
            count++;
        }

        // Reset 'a' and 'sum' for the following loop
        a = n;
        sum = 0;

        // Calculate the sum of cubes of digits using a for loop
        for (; n > 0; n /= 10) {
            b = n % 10;
            sum += Math.pow(b, count);
        }

        if (sum == c) {
            System.out.println(c + " is an Armstrong number");
        } else {
            System.out.println(c + " is not an Armstrong number");
        }
    }
}
