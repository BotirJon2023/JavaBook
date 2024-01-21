package org.example;

public class ConvertDoubleTypeVariablesToString2 {

    public static void main(String[] args) {

        double num1 = 4.76;
        double num2 = 786.56;

        String str1 = Double.toString(num1);
        String str2 = Double.toString(num2);

        System.out.println(str1);    // 4.76
        System.out.println(str2);    // 786.56
    }

}
