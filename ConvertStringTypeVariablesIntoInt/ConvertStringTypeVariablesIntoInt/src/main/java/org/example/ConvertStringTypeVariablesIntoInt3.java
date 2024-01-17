package org.example;

public class ConvertStringTypeVariablesIntoInt3 {

    public static void main(String[] args) {

        String str1 = "643";
        String str2 = "1312";

        int num1 = Integer.valueOf(str1);
        int num2 = Integer.valueOf(str2);

        System.out.println(num1);    // 643
        System.out.println(num2);    // 1312
    }

}
