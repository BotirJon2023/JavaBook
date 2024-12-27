package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingReadAndWriteToAFile {

    public static void main(String[] args) {

        String content = "Hello, this is a file handling example in Java.";


        try (FileWriter writer = new FileWriter("example.txt")) {

            writer.write(content);

            System.out.println("Data has been written to the file.");

        } catch (IOException e) {

            e.printStackTrace();
        }

        // Read from the file
        try (FileReader reader = new FileReader("example.txt")) {

            int character;

            while ((character = reader.read()) != -1) {

                System.out.print((char) character);
            }
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
