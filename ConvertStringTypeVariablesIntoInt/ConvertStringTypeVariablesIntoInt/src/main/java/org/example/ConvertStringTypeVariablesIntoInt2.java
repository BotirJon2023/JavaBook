package org.example;

public class ConvertStringTypeVariablesIntoInt2 {

    public static void main(String[] args) {

        String str1 = "Programiz";

        int num1 = Integer.parseInt(str1);

        System.out.println(num1);    // throws NumberFormatException
    }

}
