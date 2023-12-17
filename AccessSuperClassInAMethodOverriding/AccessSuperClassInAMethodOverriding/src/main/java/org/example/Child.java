package org.example;

public class Child extends Base {

    void get() {
        super.get();
        System.out.println("Child class method");
    }

    public static void main(String... a) {
        Child obj1 = new Child();
        obj1.get();
    }
}
