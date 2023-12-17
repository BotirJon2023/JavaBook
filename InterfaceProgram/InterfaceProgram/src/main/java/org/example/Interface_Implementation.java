package org.example;

import java.util.Scanner;

public class Interface_Implementation implements area {
    int length, breadth, area;

    public void dimensions() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length:");
        length = s.nextInt();
        System.out.print("Enter breadth:");
        breadth = s.nextInt();
    }

    public void area() {
        area = length * breadth;
        System.out.print("Area:" + area);
    }

    public static void main(String[] args) {
        Interface_Implementation obj = new Interface_Implementation();
        obj.dimensions();
        obj.area();
    }
}