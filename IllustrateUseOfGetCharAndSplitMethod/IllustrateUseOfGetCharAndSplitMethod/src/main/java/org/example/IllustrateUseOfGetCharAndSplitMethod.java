package org.example;

public class IllustrateUseOfGetCharAndSplitMethod {

    public static void main(String args[]) {
        String[] a;
        String b = "Sanfoundary 1000 Java Programs";
        a = b.split(" ");

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Using getChar() method:");
        char c[] = new char[11];
        b.getChars(0, 11, c, 0);
        for (int i = 0; i < 11; i++) {
            System.out.print(c[i]);
        }
    }
}
