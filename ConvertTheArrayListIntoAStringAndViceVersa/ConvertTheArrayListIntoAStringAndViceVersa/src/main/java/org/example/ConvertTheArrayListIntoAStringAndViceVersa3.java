package org.example;

import java.util.ArrayList;
import java.util.Arrays;


public class ConvertTheArrayListIntoAStringAndViceVersa3 {

    public static void main(String[] args) {


        String str = "Java, JavaScript, Python";
        System.out.println("String: " + str);


        String[] arr = str.split(",");


        ArrayList<String> languages = new ArrayList<>(Arrays.asList(arr));

        System.out.println("ArrayList: " + languages);
    }
}

