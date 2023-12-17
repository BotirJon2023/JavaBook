package org.example;


public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        rectangle.setColor("Red");
        System.out.println("Rectangle color: " + rectangle.getColor());
    }
}