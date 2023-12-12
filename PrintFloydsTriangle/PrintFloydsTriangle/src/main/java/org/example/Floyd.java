package org.example;

import java.util.Scanner;

public class Floyd {
    public static void main(String args[]) {
        int n, num = 1, c = 1, d = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        n = in.nextInt();
        System.out.println("Floyd's triangle :-");

        while (c <= n) {
            while (d <= c) {
                System.out.print(num + " ");
                num++;
                d++;
            }
            System.out.println();
            c++;
            d = 1;
        }
    }
}
