package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertAListToArrayAndViceVersa2 {

    public static void main(String[] args) {

        String[] array = {"Java", "Python", "C"};
        System.out.println("Array: " + Arrays.toString(array));

        List languages = new ArrayList<>(Arrays.asList(array));

        System.out.println("List: " + languages);
    }
}
