package org.example;

public class AccessPrivateMembersOfAClass1 {

    public static void main(String[] args) {

        Test test = new Test();

        test.setAge(24);
        test.setName("Programiz");

        System.out.println("Age: " + test.getAge());
        System.out.println("Name: " + test.getName());
    }
}

