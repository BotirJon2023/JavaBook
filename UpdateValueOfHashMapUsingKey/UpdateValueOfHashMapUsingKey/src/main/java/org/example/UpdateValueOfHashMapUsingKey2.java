package org.example;

import java.util.HashMap;

public class UpdateValueOfHashMapUsingKey2 {

    public static void main(String[] args) {

        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("First", 1);
        numbers.put("Second", 2);
        System.out.println("HashMap: " + numbers);


        numbers.computeIfPresent("Second", (key, oldValue) -> oldValue * 2);
        System.out.println("HashMap with updated value: " + numbers);

    }
}
