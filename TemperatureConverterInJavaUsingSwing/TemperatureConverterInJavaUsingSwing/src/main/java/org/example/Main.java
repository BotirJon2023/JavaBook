package org.example;

import javax.swing.*;

public class Main {


    public static void main(String[] args) {
        TC jf = new TC("Temperature Converter");
        jf.setComp();
        jf.setSize(400, 500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
