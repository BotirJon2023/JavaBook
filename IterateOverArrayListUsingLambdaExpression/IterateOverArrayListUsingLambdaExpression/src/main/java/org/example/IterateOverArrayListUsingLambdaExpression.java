package org.example;

import java.util.ArrayList;

public class IterateOverArrayListUsingLambdaExpression {
    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>();


        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");


        System.out.print("ArrayList: ");


        languages.forEach((e) -> {
            System.out.print(e + ", ");
        });
    }
}
