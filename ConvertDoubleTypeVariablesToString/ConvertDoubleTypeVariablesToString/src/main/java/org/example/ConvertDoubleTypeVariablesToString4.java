package org.example;

public class ConvertDoubleTypeVariablesToString4 {

    public static void main(String[] args) {

        double num = 99.99;

        String str = String.format("%f", num);

        System.out.println(str);    // 99.990000
    }

}
