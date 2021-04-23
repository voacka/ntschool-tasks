package com.pflb.ntschool;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5);
        Rectangle rectangle = new Rectangle(2, 8);
        Square square = new Square(4);

        AbstractShape[] shapes = {circle, rectangle, square};

        for (AbstractShape shape : shapes) {
            System.out.println(shape);
        }

//        circle.printShape();
    }
}
