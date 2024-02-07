package org.example;

import java.util.LinkedList;

public class RemoveElementsFromTheLinkedList4 {

    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();


        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("LinkedList: " + numbers);

        numbers.removeIf((Integer i) -> i < 4);
        System.out.println("Updated LinkedList: " + numbers);

    }
}
