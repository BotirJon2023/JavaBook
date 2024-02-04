package org.example;

import com.google.common.collect.Sets;

import java.util.HashSet;
import java.util.Set;

public class CalculateTheDifferenceBetweenTwoSets2 {
    public static void main(String[] args) {


        Set<String> languages1 = new HashSet<>();
        languages1.add("Java");
        languages1.add("JavaScript");
        languages1.add("English");
        languages1.add("Spanish");
        System.out.println("Languages: " + languages1);


        Set<String> languages2 = new HashSet<>();
        languages2.add("English");
        languages2.add("Spanish");
        System.out.println("Human Languages: " + languages2);

        Set<String> intersect = Sets.difference(languages1, languages2);
        System.out.println("Programming Languages: " + intersect);
    }
}
