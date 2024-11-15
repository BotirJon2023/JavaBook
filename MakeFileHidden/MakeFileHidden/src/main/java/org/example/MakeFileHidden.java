package org.example;

import java.io.File;

public class MakeFileHidden {

    public static void main(String[] args) {


        String strFilePath = "C:/dir_1/data.txt";


        File file = new File(strFilePath);


        boolean isHidden = file.isHidden();

        System.out.println("Is file hidden? " + isHidden);

    }


}
