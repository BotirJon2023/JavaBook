package org.example;

public class ConvertDoubleTypeVariablesToInt2 {

    public static void main(String[] args) {

        double a = 99.99D;
        double b = 52.11D;

        int c = (int) Math.round(a);
        int d = (int) Math.round(b);

        System.out.println(c);    // 100
        System.out.println(d);    // 52
    }
}
