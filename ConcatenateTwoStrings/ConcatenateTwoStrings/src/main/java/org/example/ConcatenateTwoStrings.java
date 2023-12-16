package org.example;

import java.util.Scanner;

public class ConcatenateTwoStrings {

    public static void main(String[] args)
    {
        String a, b, c;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first string:");
        a = s.nextLine();
        System.out.print("Enter second string:");
        b = s.nextLine();
        ConcatenateTwoStrings obj = new  ConcatenateTwoStrings();
        c = obj.concat(a, b);
        System.out.println("New String:"+c);
    }
    String concat(String x, String y)
    {
        String z;
        z = x + " " + y;
        return z;
    }
}
