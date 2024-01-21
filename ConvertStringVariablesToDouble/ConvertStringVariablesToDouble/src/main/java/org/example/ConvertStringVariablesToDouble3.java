package org.example;

public class ConvertStringVariablesToDouble3 {

    public static void main(String[] args) {

        String str1 = "6143";
        String str2 = "21312";

        double num1 = Double.valueOf(str1);
        double num2 = Double.valueOf(str2);

        System.out.println(num1);    // 6143.0
        System.out.println(num2);    // 21312.0
    }

}
