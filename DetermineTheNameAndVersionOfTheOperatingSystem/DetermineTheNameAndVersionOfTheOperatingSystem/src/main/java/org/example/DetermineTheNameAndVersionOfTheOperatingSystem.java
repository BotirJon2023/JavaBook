package org.example;

public class DetermineTheNameAndVersionOfTheOperatingSystem {

    public static void main(String[] args) {

        String operatingSystem = System.getProperty("os.name");
        System.out.println(operatingSystem);

    }

}
