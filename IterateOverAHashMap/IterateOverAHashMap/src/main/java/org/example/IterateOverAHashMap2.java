package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class IterateOverAHashMap2 {


    public static void main(String[] args) {

        HashMap<String, String> languages = new HashMap<>();
        languages.put("Java", "Enterprise");
        languages.put("Python", "ML/AI");
        languages.put("JavaScript", "Frontend");
        System.out.println("HashMap: " + languages);


        Iterator<Entry<String, String>> iterate1 = languages.entrySet().iterator();


        System.out.print("Entries: ");
        while (iterate1.hasNext()) {
            System.out.print(iterate1.next());
            System.out.print(", ");
        }


        Iterator<String> iterate2 = languages.keySet().iterator();
        System.out.print("\nKeys: ");
        while (iterate2.hasNext()) {
            System.out.print(iterate2.next());
            System.out.print(", ");
        }


        Iterator<String> iterate3 = languages.values().iterator();
        System.out.print("\nValues: ");
        while (iterate3.hasNext()) {
            System.out.print(iterate3.next());
            System.out.print(", ");
        }
    }
}
