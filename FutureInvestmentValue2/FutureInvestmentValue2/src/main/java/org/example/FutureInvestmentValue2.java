package org.example;


import java.util.*;
import java.util.Scanner;
public class FutureInvestmentValue2 {

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter present value: ");
        double p=sc.nextInt();
        System.out.print("Enter the interest rate: ");
        double r=sc.nextInt();
        System.out.print("Enter the time period in years: ");
        double y=sc.nextInt();



        FIVCalculation  e= new FIVCalculation(p,r,y);

        System.out.print("value is:= "+e.fiv+"\n");

    }
}
