package org.example;


class Test3 {
}
public class DetermineTheClassOfAndObject3 {


    public static void main(String[] args) {

        Test3 obj = new Test3();

        if (Test3.class.isInstance(obj)) {

            System.out.println("obj is an object of the Test class");

        } else {

            System.out.println("obj is not an object of the Test class");

        }
    }
}
