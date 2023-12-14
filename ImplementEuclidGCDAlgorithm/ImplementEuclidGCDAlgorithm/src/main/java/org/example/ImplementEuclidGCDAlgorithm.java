package org.example;

import java.util.Scanner;
public class ImplementEuclidGCDAlgorithm {

    public long gcd(long p, long q) {
        if (p % q == 0)
            return q;
        return gcd(q, p % q);
    }
    /** Main function **/
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Euclid GCD Algorithm Test\n");
        /** Make an object of EuclidGcd class **/

        ImplementEuclidGCDAlgorithm eg = new ImplementEuclidGCDAlgorithm();

        /** Accept two integers **/
        System.out.println("Enter two integer numbers\n");

        long n1 = scan.nextLong();
        long n2 = scan.nextLong();
        /** Call function gcd of class EuclidGcd **/

        long gcd = eg.gcd(n1, n2);

        System.out.println("\nGCD of "+ n1 +" and "+ n2 +" = "+ gcd);
    }
}
