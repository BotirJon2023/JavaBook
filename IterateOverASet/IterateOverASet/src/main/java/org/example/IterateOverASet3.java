package org.example;

import java.util.HashSet;
import java.util.Set;

public class IterateOverASet3 {
    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("Set: " + numbers);

        System.out.print("Element of Set: ");

        numbers.forEach((e) -> {
            System.out.print(e + " ");
        });
    }
}
