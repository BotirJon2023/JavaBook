package org.example;

import java.nio.file.Path;
import java.nio.file.Paths;

public class GetTheRelativePathFromTwoAbsolutePaths3 {

    public static void main(String[] args) {

        Path absolutePath1 = Paths.get("C:\\Users\\Desktop\\Programiz\\Java\\Time.java");
        Path absolutePath2 = Paths.get("C:\\Users\\Desktop");

        Path relativePath = absolutePath2.relativize(absolutePath1);
        System.out.println("Relative Path: " + relativePath);
    }
}
