package org.example;

public class ConvertOctalToDecimal {

    public static void main(String args[]) {


        String octalString = "121";


        int decimal = Integer.parseInt(octalString, 8);


        System.out.println(decimal);
    }
}
