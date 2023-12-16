package org.example;

import java.util.Scanner;

public class BitwiseOperators {

    public static void main(String[] args) {
        int m, n, x, a;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter First number:");
        m = s.nextInt();
        System.out.print("Enter Second number:");
        n = s.nextInt();
        while (true) {
            System.out.println("");
            System.out.println("Press 1 for Right Shift by 2:");
            System.out.println("Press 2 for Left Shift by 2:");
            System.out.println("Press 3 for Bitwise AND:");
            System.out.println("Press 4 for Bitwise OR by 2:");
            System.out.println("Press 5 for Bitwise Exclusive OR:");
            System.out.println("Press 6 for Bitwise NOT:");
            System.out.println("Press 7 to Exit:");
            System.out.println("");
            System.out.print("Option:");
            x = s.nextInt();
            switch (x) {
                case 1:
                    a = m << 2;
                    System.out.println("Result after left shift by 2:" + a);
                    break;

                case 2:
                    a = n >> 2;
                    System.out.println("Result after right shift by 2:" + a);
                    break;

                case 3:
                    a = m & n;
                    System.out.println("Result after bitwise AND:" + a);
                    break;

                case 4:
                    a = m | n;
                    System.out.println("Result after bitwise OR:" + a);
                    break;

                case 5:
                    a = m ^ n;
                    System.out.println("Result after bitwise Exclusive OR:" + a);
                    break;

                case 6:
                    a = ~m;
                    System.out.println("Result after bitwise NOT:" + a);
                    break;

                case 7:
                    System.exit(0);
            }
        }
    }
}
