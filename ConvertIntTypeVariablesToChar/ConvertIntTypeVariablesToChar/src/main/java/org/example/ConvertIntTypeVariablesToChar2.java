package org.example;

public class ConvertIntTypeVariablesToChar2 {

    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 9;

        char a = (char)(num1 + '0');
        char b = (char)(num2 + '0');

        System.out.println(a);    // 1
        System.out.println(b);    // 9
    }

}
