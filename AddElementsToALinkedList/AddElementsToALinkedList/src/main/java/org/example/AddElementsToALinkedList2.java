package org.example;

import java.util.LinkedList;

public class AddElementsToALinkedList2 {

    public static void main(String[] args) {


        LinkedList<String> languages = new LinkedList<>();

        languages.add("Swift");
        languages.add("Python");
        System.out.println("LinkedList: " + languages);


        languages.add(0, "Java");
        System.out.println("Updated LinkedList: " + languages);
    }
}
