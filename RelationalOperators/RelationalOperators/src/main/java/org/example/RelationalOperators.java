package org.example;

import java.util.Scanner;

public class RelationalOperators {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first integer:");
        int a = s.nextInt();
        System.out.print("Enter second integer:");
        int b = s.nextInt();
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("b >= a : " + (b >= a));
        System.out.println("b <= a : " + (b <= a));
    }
}
