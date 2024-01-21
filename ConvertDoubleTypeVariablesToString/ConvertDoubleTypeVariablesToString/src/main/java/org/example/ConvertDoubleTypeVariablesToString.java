package org.example;

public class ConvertDoubleTypeVariablesToString {

    public static void main(String[] args) {

        double num1 = 36.33;
        double num2 = 99.99;

        String str1 = String.valueOf(num1);
        String str2 = String.valueOf(num2);

        System.out.println(str1);    // 36.33
        System.out.println(str2);    // 99.99
    }

}
