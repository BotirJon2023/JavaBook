package org.example;

import java.util.Scanner;
public class Squarestar3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N : ");

        int n = sc.nextInt();

        System.out.print("Enter Symbol : ");

        char c = sc.next().charAt(0);

        int i = 0;

        while (i++ < n) {

            int j = 0;

            while (j++ < n) {

                System.out.print(c);

            }

            System.out.println();

        }
    }
}
