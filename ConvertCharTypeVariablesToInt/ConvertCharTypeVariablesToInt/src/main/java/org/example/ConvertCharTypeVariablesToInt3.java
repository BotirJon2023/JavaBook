package org.example;

public class ConvertCharTypeVariablesToInt3 {

    public static void main(String[] args) {

        char a = '5';
        char b = '9';

        int num1 = Integer.parseInt(String.valueOf(a));
        int num2 = Integer.parseInt(String.valueOf(b));

        System.out.println(num1);    // 5
        System.out.println(num2);    // 9
    }

}
