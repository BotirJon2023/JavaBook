package org.example;

import java.util.EnumSet;

enum Size1 {
    SMALL, MEDIUM, LARGE, EXTRALARGE
}

public class IterateOverEnum2 {

    public static void main(String[] args) {

        EnumSet<Size1> enumSet = EnumSet.allOf(Size1.class);

        System.out.println("Elements of EnumSet: ");

        for (Size1 constant : enumSet) {
            System.out.print(constant + ", ");
        }
    }
}
