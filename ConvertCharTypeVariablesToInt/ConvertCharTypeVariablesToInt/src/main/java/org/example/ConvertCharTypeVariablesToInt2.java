package org.example;

public class ConvertCharTypeVariablesToInt2 {

    public static void main(String[] args) {

        char a = '5';
        char b = '9';

        int num1 = Character.getNumericValue(a);
        int num2 = Character.getNumericValue(b);

        System.out.println(num1);    // 5
        System.out.println(num2);    // 9
    }
}
