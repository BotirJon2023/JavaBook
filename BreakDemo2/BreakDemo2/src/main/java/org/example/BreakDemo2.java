package org.example;

public class BreakDemo2 {

    public static void main(String args[])

            throws java.io.IOException {

        char ch;

        for (; ; )
            ch = (char) System.in.read();// получение символа
// с клавиатуры
        if (ch == 'q') {
            break;
        }
        System.out.println("Вы нажали клавишу q!");
    }
}

