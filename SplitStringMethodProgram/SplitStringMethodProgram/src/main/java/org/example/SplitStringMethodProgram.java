package org.example;

public class SplitStringMethodProgram {

    public static void main(String... a) {
        String s1 = "HelloJava from JavaGuy";
        String s2[] = s1.split(" ");
        String part1 = s2[0];
        String part2 = s2[1];
        String part3 = s2[2];
        System.out.println("The string after spliting is " + part1 + " and " + part2);
    }
}
