package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicateElementsFromArrayList1 {


    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1, 3));
        System.out.println("ArrayList with duplicate elements: " + numbers);


        Stream<Integer> stream = numbers.stream();


        stream = stream.distinct();


        numbers = (ArrayList<Integer>) stream.collect(Collectors.toList());
        System.out.println("ArrayList without duplicate elements: " + numbers);

    }
}
