package org.example;

public class ConvertStringVariablesToDouble4 {

    public static void main(String[] args) {

        String str = "614,33";

        str = str.replace(",", ".");

        double value = Double.parseDouble(str);

        System.out.println(value);    // 614.33
    }

}
