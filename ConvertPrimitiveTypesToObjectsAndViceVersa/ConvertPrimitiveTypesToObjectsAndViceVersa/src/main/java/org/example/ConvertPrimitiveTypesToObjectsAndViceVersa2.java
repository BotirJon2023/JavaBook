package org.example;

public class ConvertPrimitiveTypesToObjectsAndViceVersa2 {

    public static void main(String[] args) {

        Integer obj1 = Integer.valueOf(23);
        Double obj2 = Double.valueOf(5.55);
        Boolean obj3 = Boolean.valueOf(true);

        int var1 = obj1.intValue();
        double var2 = obj2.doubleValue();
        boolean var3 = obj3.booleanValue();

        System.out.println("The value of int variable: " + var1);
        System.out.println("The value of double variable: " + var2);
        System.out.println("The value of boolean variable: " + var3);
    }
}
