package org.example;

import java.util.Scanner;
public class Euclid {

    void gcd(long a, long b)
    {
        while (b > 0)
        {
            long temp = b;
            b = a % b; // % is remainder
            a = temp;
        }
        System.out.println("GCD is "+a);
    }
    public static void main(String... a)
    {
        Euclid abc = new  Euclid();
        System.out.println("Enter any two numbers to calculate GCD");
        Scanner s = new Scanner(System.in);
        long x = s.nextLong();
        long y = s.nextLong();
        abc.gcd(x, y);
    }
}
