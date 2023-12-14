package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FindTheAreaOfRhombus {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double l1, l2;

        System.out.println("Enter the length of the diagonals of the rhombus");

        try {
            l1 = Double.parseDouble(br.readLine());
            l2 = Double.parseDouble(br.readLine());
        } catch (Exception e) {
            System.out.println("An error occurred");
            return;
        }

        if (l1 <= 0 || l2 <= 0) {
            System.out.println("Wrong input");
            return;
        }

        System.out.println("Area = " + (l1 * l2) / 2);
    }
}
