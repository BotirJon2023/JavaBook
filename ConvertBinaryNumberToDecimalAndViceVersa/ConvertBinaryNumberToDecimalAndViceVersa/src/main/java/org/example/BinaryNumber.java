package org.example;

public class BinaryNumber {

    public static void main(String[] args) {

        String binary = "01011011";

        int decimal = Integer.parseInt(binary, 2);
        System.out.println(binary + " in binary = " + decimal + " in decimal.");
    }
}
