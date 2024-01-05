package org.example;

public class CreatePyramidAndPattern4 {

    public static void main(String[] args) {
        int rows = 35;

        for (int i = rows; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
