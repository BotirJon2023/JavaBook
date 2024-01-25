package org.example;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFileInJava2 {

    public static void main(String[] args) {

        try {

            Path path = Paths.get("JavaFile.java");

            boolean value = Files.deleteIfExists(path);
            if(value) {
                System.out.println("JavaFile.java is successfully deleted.");
            }
            else {
                System.out.println("File doesn't exit");
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
