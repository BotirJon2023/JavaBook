package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FindVolumeAndSurfaceAreaOfSphere {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double radius;
        System.out.println("Enter the radius of the sphere");
        try {
            radius = Double.parseDouble(br.readLine());
        } catch (Exception e) {
            System.out.println("An error occurred");
            return;
        }
        if (radius <= 0) {
            System.out.println("Wrong Input");
            return;
        }
        System.out.println("Volume = " + (4 * Math.pow(radius, 3) * Math.PI) / 3);
        System.out.println("Surface area = " + (4 * Math.PI * Math.pow(radius, 2)));
    }
}
