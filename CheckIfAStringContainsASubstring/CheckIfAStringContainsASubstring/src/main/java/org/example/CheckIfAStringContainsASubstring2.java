package org.example;

public class CheckIfAStringContainsASubstring2 {

    public static void main(String[] args) {

        String txt = "This is Programiz";
        String str1 = "Programiz";
        String str2 = "Programming";


        int result = txt.indexOf(str1);
        if (result == -1) {
            System.out.println(str1 + " not is present in the string.");
        } else {
            System.out.println(str1 + " is present in the string.");
        }

        result = txt.indexOf(str2);
        if (result == -1) {
            System.out.println(str2 + " is not present in the string.");
        } else {
            System.out.println(str2 + " is present in the string.");
        }
    }
}
