package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoLists2 {


    public static void main(String[] args) {

        List<Integer> prime = new ArrayList<>(Arrays.asList(2, 3, 5));
        System.out.println("First List: " + prime);

        List<Integer> even = new ArrayList<>(Arrays.asList(4, 6));
        System.out.println("Second List: " + even);

        Stream<Integer> list1 = prime.stream();
        Stream<Integer> list2 = even.stream();

        Stream<Integer> merged = Stream.concat(list1, list2);

        List<Integer> numbers = merged.collect(Collectors.toList());

        System.out.println("Merged List: " + numbers);
    }
}
