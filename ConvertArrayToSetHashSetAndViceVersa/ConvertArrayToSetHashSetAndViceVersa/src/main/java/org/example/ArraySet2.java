package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class ArraySet2 {

    public static void main(String[] args) {

        String[] array = {"a", "b", "c"};
        Set<String> set = new HashSet<>(Arrays.stream(array).collect(Collectors.toSet()));

        System.out.println("Set: " + set);

    }
}
