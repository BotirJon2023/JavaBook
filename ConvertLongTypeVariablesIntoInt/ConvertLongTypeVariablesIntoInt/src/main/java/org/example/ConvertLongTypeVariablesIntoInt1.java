package org.example;

public class ConvertLongTypeVariablesIntoInt1 {

    public static void main(String[] args) {

        long value1 = 52336L;
        long value2 = -445636L;

        int num1 = Math.toIntExact(value1);
        int num2 = Math.toIntExact(value2);

        System.out.println(num1);  // 52336
        System.out.println(num2);  // -445636
    }

}
