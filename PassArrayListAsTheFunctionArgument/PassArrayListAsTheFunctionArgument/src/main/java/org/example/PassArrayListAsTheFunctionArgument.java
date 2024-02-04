package org.example;

import java.util.ArrayList;

public class PassArrayListAsTheFunctionArgument {

    public static void display(ArrayList<String> languages) {

        System.out.print("ArrayList: ");
        for (String language : languages) {
            System.out.print(language + ", ");
        }
    }

    public static void main(String[] args) {


        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");


        display(languages);
    }
}
