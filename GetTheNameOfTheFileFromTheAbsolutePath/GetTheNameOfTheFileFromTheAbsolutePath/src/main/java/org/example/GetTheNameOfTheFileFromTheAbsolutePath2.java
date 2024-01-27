package org.example;

import java.io.File;

public class GetTheNameOfTheFileFromTheAbsolutePath2 {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\Sudip Bhandari\\Desktop\\Programiz\\Java Article\\Test.class");

        String stringFile = file.toString();

        int index = stringFile.lastIndexOf('\\');
        if(index > 0) {
            String fileName = stringFile.substring(index + 1);
            System.out.println("File Name: " + fileName);
        }
    }
}
