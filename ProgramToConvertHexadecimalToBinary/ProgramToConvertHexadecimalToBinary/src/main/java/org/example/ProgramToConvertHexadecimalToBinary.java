package org.example;

import java.util.Scanner;

public class ProgramToConvertHexadecimalToBinary {

    Scanner scan;
    int num;

    void getVal() {
        System.out.println("HexaDecimal to Binary");
        scan = new Scanner(System.in);
        System.out.println("\nEnter the number :");
        num = Integer.parseInt(scan.nextLine(), 16);
    }

    void convert() {
        String binary = Integer.toBinaryString(num);
        System.out.println("Binary Value is : " + binary);
    }
}

class MainClass {
    public static void main(String args[]) {
        Hexa_Binary obj = new Hexa_Binary();
        obj.getVal();
        obj.convert();
    }
}

