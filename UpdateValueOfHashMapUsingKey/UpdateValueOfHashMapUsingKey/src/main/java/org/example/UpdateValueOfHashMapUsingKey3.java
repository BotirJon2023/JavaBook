package org.example;

import java.util.HashMap;

public class UpdateValueOfHashMapUsingKey3 {
    public static void main(String[] args) {

        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("First", 1);
        numbers.put("Second", 2);
        System.out.println("HashMap: " + numbers);

        numbers.merge("First", 4, (oldValue, newValue) -> oldValue + newValue);
        System.out.println("HashMap with updated value: " + numbers);
    }
}

