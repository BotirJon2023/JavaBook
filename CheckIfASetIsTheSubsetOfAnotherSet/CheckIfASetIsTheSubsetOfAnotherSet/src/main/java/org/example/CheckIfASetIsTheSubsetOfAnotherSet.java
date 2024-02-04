package org.example;

import java.util.Set;
import java.util.TreeSet;

public class CheckIfASetIsTheSubsetOfAnotherSet {

    public static void main(String[] args) {


        Set<String> languages = new TreeSet<>();
        languages.add("Java");
        languages.add("JavaScript");
        languages.add("Python");
        languages.add("CSS");
        System.out.println("Programming Languages: " + languages);


        Set<String> frontend = new TreeSet<>();
        frontend.add("CSS");
        frontend.add("JavaScript");
        System.out.println("Frontend Languages: " + frontend);

        boolean result = languages.containsAll(frontend);
        System.out.println("Is frontend is subset of languages? " + result);
    }
}
