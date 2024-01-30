package org.example;

public class DifferentiateStringOperatorAndEqualsMethod2 {

    public static void main(String[] args) {

        String name1 = new String("Programiz");
        String name2 = name1;

        System.out.println("Check if two strings are equal");


        boolean result1 = (name1 == name2);
        System.out.println("Using == operator: " + result1);


        boolean result2 = name1.equals(name2);
        System.out.println("Using equals(): " + result2);
    }
}
