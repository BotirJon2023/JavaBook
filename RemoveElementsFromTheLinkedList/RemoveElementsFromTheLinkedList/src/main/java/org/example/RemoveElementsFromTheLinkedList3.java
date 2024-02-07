package org.example;


import java.util.LinkedList;

public class RemoveElementsFromTheLinkedList3 {

    public static void main(String[] args) {
        LinkedList<String> languages = new LinkedList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("Swift");
        System.out.println("LinkedList: " + languages);

        languages.clear();
        System.out.println("LinkedList after clear(): " + languages);
    }
}
