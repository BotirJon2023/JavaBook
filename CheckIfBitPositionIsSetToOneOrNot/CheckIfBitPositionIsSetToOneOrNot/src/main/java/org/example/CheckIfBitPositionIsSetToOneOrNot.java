package org.example;

import java.util.Scanner;

public class CheckIfBitPositionIsSetToOneOrNot {

    public static void main(String[] args) {
        int n, m;
        String x = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any Decimal Number:");
        n = s.nextInt();
        while (n > 0) {
            int a = n % 2;
            x = a + x;
            n = n / 2;
        }
        System.out.print("Enter the position where you want to check:");
        int l = x.length();
        m = s.nextInt();
        if ((l - m) >= 0 && (x.charAt(l - m) == '1')) {
            System.out.println("1 is present at given bit position");
        } else {
            System.out.println("0 is present at given bit position");
        }
    }
}
