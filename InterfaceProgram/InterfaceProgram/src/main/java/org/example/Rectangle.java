package org.example;
class Rectangle implements Shape, Color {
    private String color;

    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

