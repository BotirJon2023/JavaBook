package org.example;

import java.util.Scanner;

public class Xyz {

    public static void main(String args[])
    {

        Scanner s= new Scanner(System.in);

        System.out.println("Enter the width of the Triangle:");

        long b= s.nextLong();

        System.out.println("Enter the height of the Triangle:");

        long h= s.nextLong();

        AreaOfTriangle2 A1=new AreaOfTriangle2(b,h);

        System.out.println("Area of Triangle is: " + A1.area);
    }

}
