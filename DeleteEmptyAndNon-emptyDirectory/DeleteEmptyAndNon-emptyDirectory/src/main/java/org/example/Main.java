package org.example;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        try {

            File directory = new File("Directory");

            Main.deleteDirectory(directory);

        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    private static void deleteDirectory(File directory) {

        if (directory.isDirectory()) {
            File[] files = directory.listFiles();

            if (files != null) {
                for (File file : files) {

                    deleteDirectory(file);
                }
            }
        }

        if (directory.delete()) {
            System.out.println(directory + " is deleted");
        } else {
            System.out.println("Directory not deleted");
        }
    }
}