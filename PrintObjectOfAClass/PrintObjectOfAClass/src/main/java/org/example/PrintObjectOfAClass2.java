package org.example;

class Test2 {

    @Override
    public String toString() {
        return "object";
    }
}

public class PrintObjectOfAClass2 {

    public static void main(String[] args) {

        Test2 obj = new Test2();

        System.out.println(obj);
    }
}
