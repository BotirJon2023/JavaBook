package org.example;

public class ConvertStringVariablesToDouble2 {

    public static void main(String[] args) {

        String str1 = "Programiz";

        double num1 = Double.parseDouble(str1);

        System.out.println(num1);    // throws NumberFormatException
    }

}
