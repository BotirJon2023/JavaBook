package org.example;


import java.util.Scanner;
public class FinalKeyword {


        final int length = 5;
        final int bredth = 4;
        final void area()
        {
            int a = length * bredth;
            System.out.println("Area:"+a);
        }
    }
    class Rectangle extends FinalKeyword
    {
        final void rect()
        {
            System.out.println("This is rectangle");
        }
    }
    