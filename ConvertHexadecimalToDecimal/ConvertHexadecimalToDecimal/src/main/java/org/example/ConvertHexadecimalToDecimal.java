package org.example;

public class ConvertHexadecimalToDecimal {

    public static void main(String args[]) {

        String hex = "a";

        int decimal = Integer.parseInt(hex, 16);

        System.out.println(decimal);
    }
}
