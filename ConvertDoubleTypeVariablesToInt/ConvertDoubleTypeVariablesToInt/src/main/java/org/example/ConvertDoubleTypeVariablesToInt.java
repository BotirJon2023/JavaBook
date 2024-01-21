package org.example;

public class ConvertDoubleTypeVariablesToInt {

    public static void main(String[] args) {

        double a = 23.78D;
        double b = 52.11D;

        int c = (int)a;
        int d = (int)b;

        System.out.println(c);    // 23
        System.out.println(d);    // 52
    }

}
