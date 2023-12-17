package org.example;


class Base {
    void showme() {
        System.out.println(" Base class method");
    }
}

class Child extends Base {
    void showme() {
        System.out.println("Child class method");
    }

    public static void main(String... a) {
        Child obj = new Child();
        obj.showme();
    }
}