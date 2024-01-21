package org.example;

public class ConvertStringVariablesToDouble {

    public static void main(String[] args) {

        String str1 = "23";
        String str2 = "456.6";

        double num1 = Double.parseDouble(str1);
        double num2 = Double.parseDouble(str2);

        System.out.println(num1);    // 23.0
        System.out.println(num2);    // 456.6
    }
}
