package com.pflb.ntschool;

public abstract class AbstractShape implements Geom {
    public void printShape() {
        System.out.printf("[%s] %.2f", this.getClass().getSimpleName(), getSquare());
    }

    @Override
    public String toString() {
        return String.format("[%s] %.2f", this.getClass().getSimpleName(), getSquare());
    }
}
