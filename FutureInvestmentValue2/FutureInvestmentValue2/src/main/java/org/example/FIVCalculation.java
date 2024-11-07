package org.example;

public class FIVCalculation {

    double fiv;

    FIVCalculation(double p, double r, double y) {
        fiv = p * Math.pow((1 + r / 100), y);
    }
}
