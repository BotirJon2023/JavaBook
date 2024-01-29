package org.example;

public class ClearTheStringBuffer2 {

    public static void main(String[] args) {

        StringBuffer str = new StringBuffer();

        str.append("Java");
        str.append(" is");
        str.append(" awesome.");
        System.out.println("StringBuffer: " + str);

        str.setLength(0);
        System.out.println("Updated StringBuffer: " + str);
    }
}
