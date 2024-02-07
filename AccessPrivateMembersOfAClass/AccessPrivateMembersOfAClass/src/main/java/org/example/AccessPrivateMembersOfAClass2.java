package org.example;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class AccessPrivateMembersOfAClass2 {

    public static void main(String[] args) {
        try {
            Test2 test2 = new Test2();

            // create an object of the class named Class
            Class obj = test2.getClass();

            // access the private variable
            Field field = obj.getDeclaredField("name");
            // make private field accessible
            field.setAccessible(true);

            field.set(test2, "Programiz");


            String value = (String) field.get(test2);
            System.out.println("Name: " + value);


            Method[] methods = obj.getDeclaredMethods();
            System.out.println("Method Name: " + methods[0].getName());
            int modifier = methods[0].getModifiers();
            System.out.println("Access Modifier: " + Modifier.toString(modifier));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
