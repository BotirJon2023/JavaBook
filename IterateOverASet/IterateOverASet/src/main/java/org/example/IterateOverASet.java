package org.example;

import java.util.HashSet;
import java.util.Set;

public class IterateOverASet {


    public static void main(String[] args) {

        Set<String> languages = new HashSet<>();
        languages.add("Java");
        languages.add("JavaScript");
        languages.add("Python");
        System.out.println("Set: " + languages);


        System.out.println("Iterating over Set using for-each loop:");
        for (String language : languages) {
            System.out.print(language);
            System.out.print(", ");
        }
    }
}
