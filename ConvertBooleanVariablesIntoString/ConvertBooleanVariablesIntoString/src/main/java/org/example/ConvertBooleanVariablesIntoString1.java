package org.example;

public class ConvertBooleanVariablesIntoString1 {

    public static void main(String[] args) {

        boolean booleanValue1 = true;
        boolean booleanValue2 = false;

        String stringValue1 = Boolean.toString(booleanValue1);
        String stringValue2 = Boolean.toString(booleanValue2);

        System.out.println(stringValue1);    // true
        System.out.println(stringValue2);    // true
    }

}
