package org.example;

import java.io.File;

public class GetTheRelativePathFromTwoAbsolutePaths2 {

    public static void main(String[] args) {

        File file1 = new File("C:\\Users\\Desktop\\Programiz\\Java\\Time.java");
        File file2 = new File("C:\\Users\\Desktop");

        String absolutePath1 = file1.toString();
        System.out.println("Absolute Path1: " + absolutePath1);
        String absolutePath2 = file2.toString();
        System.out.println("Absolute Path2: " + absolutePath2);

        String relativePath = absolutePath1.substring(absolutePath2.length());
        System.out.println("Absolute Path: " + relativePath);
    }
}
