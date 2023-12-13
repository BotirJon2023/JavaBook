package org.example;

import java.util.Scanner;

public class FindPowerOfANumber {

    public static void main(String args[])
    {
        int x;
        double y,z;
        System.out.print("Enter any number: ");
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        y = Math.pow(x , 2);
        z = Math.pow(x , 3);
        System.out.println("Square of "+x+":"+y);
        System.out.println("Cube of "+x+":"+z);
    }

}
