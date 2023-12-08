package org.example;

import java.util.Scanner;

public class Checkprime2 {

    public static void main(String[] args) {
        int i = 1, num, flag = 0;
        System.out.print("Enter the number :");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        if (num <= 1) {
            System.out.println("The number is not prime");
            return;
        }
        while (i <= num / 2) {
            if (num % i == 0) {
                flag++;
            }
            i++;
        }
        if (flag > 1) {
            System.out.println("" + num + " is not a prime number.");
        } else {
            System.out.println("" + num + " is a prime number.");
        }
    }
}
