package org.example;

public class ConstructorChainingProgram {



    public static void ConstructorChainingProgram() {
        this(20);
        System.out.println("Default constructor of class.");
    }

    ConstructorChainingProgram(int x) {
        System.out.println("Parameterized (1 parameter) constructor of class.");
        System.out.println("The value of x is " + x);
    }

    ConstructorChainingProgram(int x, int y) {
        this();
        System.out.println("Parameterized (2 parameters) constructor of class.");
        System.out.println("The  value of x and y is  " + x + "and " + y + ". "
                + "The sum of x and y is " + (x + y));
    }

    public static void main(String... a) {
        ConstructorChainingProgram(11, 12);
    }

}
