package org.example;

import java.util.LinkedList;

public class RemoveElementsFromTheLinkedList {

    public static void main(String[] args) {
        LinkedList<String> languages = new LinkedList<>();


        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("Kotlin");
        System.out.println("LinkedList: " + languages);


        String str = languages.remove(3);
        System.out.println("Removed Element: " + str);

        System.out.println("Updated LinkedList: " + languages);
    }
}
