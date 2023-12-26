package org.example;

public class IsAlphabetic {

    public static void main(String[] args) {

        char c = 'a';

        if (Character.isAlphabetic(c)) {
            System.out.println(c + " is an alphabet.");
        } else {
            System.out.println(c + " is not an alphabet.");
        }
    }
}
