package org.example;

import java.io.File;
import java.util.Scanner;

public class ReadTheContentOfAFileLineByLine {

    public static void main(String[] args) {

        try {
            File file = new File("input.txt");

            Scanner sc = new Scanner(file);

            System.out.println("Reading File Using Scanner:");
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
