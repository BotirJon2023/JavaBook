package org.example;

import com.google.common.collect.Sets;

import java.util.HashSet;
import java.util.Set;

public class CalculateTheIntersectionOfTwoSets1 {


    public static void main(String[] args) {


        Set<String> backend = new HashSet<>();
        backend.add("Java");
        backend.add("JavaScript");
        System.out.println("Backend Languages: " + backend);


        Set<String> frontend = new HashSet<>();
        frontend.add("JavaScript");
        frontend.add("CSS");
        System.out.println("Frontend Languages: " + frontend);

        Set<String> intersect = Sets.intersection(backend, frontend);
        System.out.println("Common Languages: " + intersect);
    }
}
