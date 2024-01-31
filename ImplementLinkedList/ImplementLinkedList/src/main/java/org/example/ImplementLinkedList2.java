package org.example;

import java.util.LinkedList;

public class ImplementLinkedList2 {

    public static void main(String[] args) {


        LinkedList<String> animals = new LinkedList<>();


        animals.add("Dog");


        animals.addFirst("Cat");


        animals.addLast("Horse");
        System.out.println("LinkedList: " + animals);


        System.out.println("First Element: " + animals.getFirst());


        System.out.println("Last Element: " + animals.getLast());
    }
}
