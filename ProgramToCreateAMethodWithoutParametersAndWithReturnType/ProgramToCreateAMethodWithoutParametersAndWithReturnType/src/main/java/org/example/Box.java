package org.example;

import java.util.Scanner;

public class Box {

    double width;
    double height;
    double depth;
    double volume()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("enter width : ");
        double width = s.nextDouble();
        System.out.print("enter height : ");
        double height = s.nextDouble();
        System.out.print("enter depth: ");
        double depth = s.nextDouble();
        return width * height * depth;
    }
}
