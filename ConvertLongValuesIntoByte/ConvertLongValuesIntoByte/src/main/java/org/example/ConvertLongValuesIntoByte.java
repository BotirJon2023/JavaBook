package org.example;

import java.util.Scanner;

public class ConvertLongValuesIntoByte {

    public static void main(String[] args)
    {
        long a;
        byte b;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any long value:");
        a = s.nextLong();
        b = (byte) a;
        System.out.println("Conversion into byte:"+b);
    }
}
