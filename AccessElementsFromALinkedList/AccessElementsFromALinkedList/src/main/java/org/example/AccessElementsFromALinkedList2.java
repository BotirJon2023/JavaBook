package org.example;

import java.util.Iterator;
import java.util.LinkedList;

public class AccessElementsFromALinkedList2 {

    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();

        animals.add("Dog");
        animals.add("Horse");
        animals.add("Cat");

        Iterator<String> iterate = animals.iterator();
        System.out.print("LinkedList: ");

        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
    }
}
