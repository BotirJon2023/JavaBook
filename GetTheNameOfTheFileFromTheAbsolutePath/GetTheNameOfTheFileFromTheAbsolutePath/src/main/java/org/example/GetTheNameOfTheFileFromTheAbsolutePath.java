package org.example;

import java.io.File;

public class GetTheNameOfTheFileFromTheAbsolutePath {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\Sudip Bhandari\\Desktop\\Programiz\\Java Article\\Test.class");

        String fileName = file.getName();
        System.out.println("File Name: " + fileName);

    }
}
