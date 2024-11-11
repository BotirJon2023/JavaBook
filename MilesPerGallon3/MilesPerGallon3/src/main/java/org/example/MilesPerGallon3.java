package org.example;

import java.util.Scanner;
public class MilesPerGallon3 {

    public static void main(String arg[]) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter miles travelled : ");

        double miles = scan.nextDouble();

        System.out.print("Enter gallons : ");

        double gallons = scan.nextDouble();

        System.out.print("miles per gallons = " + distance(miles, gallons));

    }

    static double distance(double m, double g) {

        return m / g;

    }
}
