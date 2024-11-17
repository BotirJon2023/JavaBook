package org.example;

import java.io.File;
import java.io.IOException;

public class MakeFileHidden3 {

    public static void main(String[] args) throws IOException, InterruptedException {

        String strFilePath = "C:/dir_1/data.txt";

        File file = new File(strFilePath);


        Process p = Runtime.getRuntime().exec("attrib +H " + strFilePath);

        p.waitFor();

        if(file.isHidden())

            System.out.println("File is hidden");

        else

            System.out.println("File is visible");

    }
}
