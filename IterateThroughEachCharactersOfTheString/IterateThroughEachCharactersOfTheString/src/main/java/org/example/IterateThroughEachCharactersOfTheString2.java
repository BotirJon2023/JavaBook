package org.example;

public class IterateThroughEachCharactersOfTheString2 {

    public static void main(String[] args) {


        String name = "Programiz";

        System.out.println("Characters in string \"" + name + "\":");


        for (char c : name.toCharArray()) {


            System.out.print(c + ", ");
        }

    }

}
