package org.example;

public class ReturnDemo {

    public static void main(String args[])
    {
        Box cuboid = new Box();
        double vol;
        vol = cuboid.volume();
        System.out.println("Volume is " + vol);
    }
}
