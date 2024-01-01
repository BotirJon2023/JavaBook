package org.example;

public class FactorOfANumber {

    public static void main(String[] args) {

        int number = -60;
        System.out.print("Factors of " + number + " are: ");

        for (int i = number; i <= Math.abs(number); ++i) {

            if (i == 0) {
            } else {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
