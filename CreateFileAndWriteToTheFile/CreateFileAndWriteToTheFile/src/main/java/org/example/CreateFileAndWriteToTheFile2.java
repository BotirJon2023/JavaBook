package org.example;

import java.io.FileWriter;

public class CreateFileAndWriteToTheFile2 {

    public static void main(String args[]) {

        // creates a multiline string using + operator
        // the string is a Java Program
        String program = "class JavaFile { " +
                "public static void main(String[] args) { " +
                "System.out.println(\"This is file\");"+
                "}"+
                "}";
        try {
            FileWriter output = new FileWriter("JavaFile.java");

            output.write(program);
            System.out.println("Data is written to the file.");

            output.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
