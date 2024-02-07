package org.example;

import static org.example.Test.checkLength;
import static org.example.Test.shuffleCheck;

public class CheckIfAStringIsAValidShuffleOfTwoDistinctStrings {

    public static void main(String[] args) {

        String first = "XY";
        String second = "12";
        String[] results = {"1XY2", "Y1X2", "Y21XX"};

        for (String result : results) {
            if (checkLength(first, second, result) == true && shuffleCheck(first, second, result) == true) {
                System.out.println(result + " is a valid shuffle of " + first + " and " + second);
            } else {
                System.out.println(result + " is not a valid shuffle of " + first + " and " + second);
            }
        }
    }
}
