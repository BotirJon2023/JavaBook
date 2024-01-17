package org.example;

public class ConvertStringTypeVariablesIntoBoolean {

    public static void main(String[] args) {

        String str1 = "true";
        String str2 = "false";

        boolean b1 = Boolean.parseBoolean(str1);
        boolean b2 = Boolean.parseBoolean(str2);

        System.out.println(b1);    // true
        System.out.println(b2);    // false
    }

}
