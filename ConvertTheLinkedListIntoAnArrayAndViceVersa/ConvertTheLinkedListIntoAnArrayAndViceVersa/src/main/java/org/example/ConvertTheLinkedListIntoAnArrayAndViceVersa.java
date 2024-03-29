package org.example;

import java.util.LinkedList;

public class ConvertTheLinkedListIntoAnArrayAndViceVersa {

    public static void main(String[] args) {
        LinkedList<String> languages = new LinkedList<>();


        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        System.out.println("LinkedList: " + languages);


        String[] arr = new String[languages.size()];

        languages.toArray(arr);
        System.out.print("Array: ");
        for (String item : arr) {
            System.out.print(item + ", ");
        }
    }
}
