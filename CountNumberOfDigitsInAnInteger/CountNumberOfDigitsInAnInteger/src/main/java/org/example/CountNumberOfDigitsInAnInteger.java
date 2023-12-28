package org.example;

public class CountNumberOfDigitsInAnInteger {

    public static void main(String[] args) {

        int count = 0, num = 000342;

        while (num != 0) {

            num /= 10;
            ++count;
        }

        System.out.println("Number of digits: " + count);
    }
}