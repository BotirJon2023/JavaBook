package org.example;

class Test1 {

}

class Test2 {

}
public class DetermineTheClassOfAndObject {

    public static void main(String[] args) {

        Test1 obj1 = new Test1();
        Test2 obj2 = new Test2();

        System.out.print("The class of obj1 is: ");
        System.out.println(obj1.getClass());

        System.out.print("The class of obj2 is: ");
        System.out.println(obj2.getClass());
    }

}
