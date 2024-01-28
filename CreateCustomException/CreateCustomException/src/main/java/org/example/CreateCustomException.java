package org.example;

import java.util.ArrayList;
import java.util.Arrays;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}


public class CreateCustomException {


    ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript"));

    public void checkLanguage(String language) throws CustomException2 {

        if (languages.contains(language)) {
            throw new CustomException2(language + " already exists");
        } else {

            languages.add(language);
            System.out.println(language + " is added to the ArrayList");
        }
    }

    public static void main(String[] args) {

        Main obj = new Main();

        obj.checkLanguage("Swift");
        obj.checkLanguage("Java");
    }
}
