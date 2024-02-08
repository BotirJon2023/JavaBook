package org.example;

import java.util.ArrayList;
import java.util.ListIterator;

public class AddElementsToALinkedList4 {

    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();

        ListIterator<String> listIterate = languages.listIterator();
        listIterate.add("Java");
        listIterate.add("Python");

        System.out.println("LinkedList: " + languages);
    }
}
