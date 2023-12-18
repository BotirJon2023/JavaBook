package org.example;

import java.util.Scanner;

public class User_Defined_Exception {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Amount:");
        int a = s.nextInt();
        try {
            if (a < 0) {
                throw new NegativeAmtException("Invalid Amount");
            }
            System.out.println("Amount Deposited");
        } catch (NegativeAmtException e) {
            System.out.println(e);
        }
    }
}
