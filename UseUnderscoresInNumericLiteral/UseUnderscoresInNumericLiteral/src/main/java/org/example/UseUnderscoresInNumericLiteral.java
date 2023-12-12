package org.example;

public class UseUnderscoresInNumericLiteral {

    public static void main(String[] args) {
        //  int a1 = _52;                   Invalid; cannot put underscores at the start of a literal
        int a2 = 5_2;                // OK (decimal literal)
        System.out.println(a2);
        //  int a3 = 52_;                   Invalid; cannot put underscores at the end of a literal
        int a4 = 5_______2;          // OK (decimal literal)
        System.out.println(a4);
        //  int a5 = 0_x52;                 Invalid; cannot put underscores in the 0x radix prefix
        //  int a6 = 0x_52;                 Invalid; cannot put underscores at the beginning of a number
        int a7 = 0x5_2;              // OK (hexadecimal literal)
        System.out.println(a7);
        //  int a8 = 0x52_;                 Invalid; cannot put underscores at the end of a number
        int a9 = 0_52;               // OK (octal literal)
        System.out.println(a9);
        int a10 = 05_2;              // OK (octal literal)
        System.out.println(a10);
        //  int a11 = 052_;                 Invalid; cannot put underscores at the end of a number
        //  float b1 = 3_.1415F;            Invalid; cannot put underscores adjacent to a decimal point
        //  float b2 = 3._1415F;            Invalid; cannot put underscores adjacent to a decimal point
        float b3 = 3.1_415F;         // OK (float literal)
        System.out.println(b3);
        //  long c1 = 9999_L;                Invalid; cannot put underscores prior to an L suffix
        long c2 = 99_99L;             // OK (long literal)
        System.out.println(c2);
    }
}
