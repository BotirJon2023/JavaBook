package org.example;

import java.util.Arrays;
import java.util.LinkedList;

public class ConvertTheLinkedListIntoAnArrayAndViceVersa2 {

    public static void main(String[] args) {


        String[] array = {"Java", "Python", "C"};
        System.out.println("Array: " + Arrays.toString(array));


        LinkedList<String> languages = new LinkedList<>(Arrays.asList(array));

        System.out.println("LinkedList: " + languages);

    }
}
