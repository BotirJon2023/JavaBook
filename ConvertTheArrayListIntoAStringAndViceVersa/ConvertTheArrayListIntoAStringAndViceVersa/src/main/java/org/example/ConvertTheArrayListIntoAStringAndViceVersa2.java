package org.example;


import java.util.ArrayList;

public class ConvertTheArrayListIntoAStringAndViceVersa2 {


    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();


        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        System.out.println("ArrayList: " + languages);


        String arraylist = String.join(", ", languages);
        System.out.println("String: " + arraylist);

    }
}
