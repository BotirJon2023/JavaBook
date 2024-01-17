package org.example;

public class ConvertStringTypeVariablesIntoInt {

    public static void main(String[] args) {

        String str1 = "23";
        String str2 = "4566";

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        System.out.println(num1);    // 23
        System.out.println(num2);    // 4566
    }

}
