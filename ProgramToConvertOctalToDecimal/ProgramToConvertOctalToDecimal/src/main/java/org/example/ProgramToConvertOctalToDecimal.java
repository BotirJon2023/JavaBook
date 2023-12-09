package org.example;

import java.util.Scanner;

public class ProgramToConvertOctalToDecimal {

    Scanner scan;
    int num;

    void getVal() {
        System.out.println("Octal to Decimal");
        scan = new Scanner(System.in);
        System.out.println("\nEnter the number :");
        num = Integer.parseInt(scan.nextLine(), 8);
    }

    void convert() {
        String decimal = Integer.toString(num);
        System.out.println("Decimal Value is : " + decimal);
    }
}

class MainClass {
    public static void main(String args[]) {
        Octal_Decimal obj = new Octal_Decimal();
        obj.getVal();
        obj.convert();
    }
}
