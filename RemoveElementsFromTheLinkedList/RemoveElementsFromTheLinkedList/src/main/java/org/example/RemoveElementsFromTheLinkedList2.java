package org.example;

import java.util.ArrayList;
import java.util.ListIterator;

public class RemoveElementsFromTheLinkedList2 {

    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        System.out.println("LinkedList: " + animals);

        ListIterator<String> listIterate = animals.listIterator();
        listIterate.next();


        listIterate.remove();
        System.out.println("New LinkedList: " + animals);
    }
}
