package com.pflb.ntschool;

public class Rectangle extends AbstractShape {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getSquare() {
        return sideA * sideB;
    }
}
