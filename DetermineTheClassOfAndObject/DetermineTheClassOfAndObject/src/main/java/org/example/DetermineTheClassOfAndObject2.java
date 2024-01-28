package org.example;

class Test {

}

public class DetermineTheClassOfAndObject2 {


    public static void main(String[] args) {

        Test obj = new Test();


        if (obj instanceof Test) {
            System.out.println("obj is an object of the Test class");
        } else {
            System.out.println("obj is not an object of the Test class");
        }
    }
}
