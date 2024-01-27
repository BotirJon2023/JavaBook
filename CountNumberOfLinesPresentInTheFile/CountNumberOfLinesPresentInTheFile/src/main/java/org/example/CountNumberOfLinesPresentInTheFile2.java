package org.example;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountNumberOfLinesPresentInTheFile2 {

    public static void main(String[] args) {

        try {

            Path file = Paths.get("input.txt");

            long count = Files.lines(file).count();
            System.out.println("Total Lines: " + count);

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
