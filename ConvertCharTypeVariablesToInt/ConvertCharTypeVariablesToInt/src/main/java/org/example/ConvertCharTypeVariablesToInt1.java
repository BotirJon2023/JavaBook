package org.example;

public class ConvertCharTypeVariablesToInt1 {

    public static void main(String[] args) {

        char a = '9';
        char b = '3';

        int num1 = a - '0';
        int num2 = b - '0';

        System.out.println(num1);    // 9
        System.out.println(num2);    // 3
    }

}
