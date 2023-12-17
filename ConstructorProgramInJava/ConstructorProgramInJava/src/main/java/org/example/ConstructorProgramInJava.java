package org.example;

import java.lang.reflect.Constructor;

public class ConstructorProgramInJava {

    double width;
    double height;
    double depth;

    public ConstructorProgramInJava(int i, int i1, int i2) {
    }

    public void ConstructorProgramInJava() {
        System.out.println("Constructor without parameter");
        width = 10;
        height = 10;
        depth = 10;
    }

    void ConstructorProgramInJava(int a, int b, int c) {
        System.out.println("Constructor with parameter");
        width = a;
        height = b;
        depth = c;
    }

    double volume() {
        return width * height * depth;
    }
}

class ConstructorDemo {
    public static void main(String args[]) {
        ConstructorProgramInJava cuboid1 = new ConstructorProgramInJava(2, 3, 4);
        double vol;
        vol = cuboid1.volume();
        System.out.println("Volume is " + vol);
        ConstructorProgramInJava cuboid2 = new ConstructorProgramInJava(8, 11, 9);
        vol = cuboid2.volume();
        System.out.println("Volume is " + vol);
    }
}
