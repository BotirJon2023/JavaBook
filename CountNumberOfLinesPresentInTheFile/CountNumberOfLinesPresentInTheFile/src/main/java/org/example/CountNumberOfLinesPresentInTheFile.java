package org.example;

import java.io.File;
import java.util.Scanner;

public class CountNumberOfLinesPresentInTheFile {

    public static void main(String[] args) {

        int count = 0;

        try {

            File file = new File("input.txt");

            Scanner sc = new Scanner(file);

            while(sc.hasNextLine()) {
                sc.nextLine();
                count++;
            }
            System.out.println("Total Number of Lines: " + count);

            sc.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
