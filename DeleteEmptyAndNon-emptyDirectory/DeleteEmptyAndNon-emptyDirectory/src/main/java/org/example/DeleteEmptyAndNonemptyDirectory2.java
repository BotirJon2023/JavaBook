package org.example;

import java.io.File;

public class DeleteEmptyAndNonemptyDirectory2 {

    public static void main(String[] args) {

        try {
            File directory = new File("Directory");

            File[] files = directory.listFiles();

            for(File file : files) {
                System.out.println(file + " deleted.");
                file.delete();
            }

            if(directory.delete()) {
                System.out.println("Directory Deleted");
            }
            else {
                System.out.println("Directory not Found");
            }

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
