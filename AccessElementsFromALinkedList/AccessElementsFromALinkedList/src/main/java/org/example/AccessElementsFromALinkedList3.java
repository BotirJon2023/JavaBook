package org.example;

import java.util.LinkedList;
import java.util.ListIterator;

public class AccessElementsFromALinkedList3 {

    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();

        animals.add("Dog");
        animals.add("Horse");
        animals.add("Cat");

        ListIterator<String> listIterate = animals.listIterator();
        System.out.print("LinkedList: ");

        while (listIterate.hasNext()) {
            System.out.print(listIterate.next());
            System.out.print(", ");
        }

        System.out.print("\nReverse LinkedList: ");

        while (listIterate.hasPrevious()) {
            System.out.print(listIterate.previous());
            System.out.print(", ");
        }
    }
}
