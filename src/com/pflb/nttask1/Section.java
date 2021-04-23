package com.pflb.nttask1;

import java.util.Objects;

public class Section {
    public double x1;
    public double y1;

    public double x2;
    public double y2;

    public Section(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public static boolean SectionLengthEquals(Section s1, Section s2) {
        double lengthOne = Math.sqrt(Math.pow(s1.x2 - s1.x1, 2) + Math.pow(s1.y2 - s1.y1, 2));
        double lengthTwo = Math.sqrt(Math.pow(s2.x2 - s2.x1, 2) + Math.pow(s2.y2 - s2.y1, 2));

        System.out.println(lengthOne);
        System.out.println(lengthTwo);

        if (lengthOne == lengthTwo) {
            System.out.println("Длины отрезков равны");
            return true;
        } else {
            System.out.println("Длины отрезков не равны");
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Section section = (Section) o;
        return Double.compare(section.x1, x1) == 0 &&
                Double.compare(section.y1, y1) == 0 &&
                Double.compare(section.x2, x2) == 0 &&
                Double.compare(section.y2, y2) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x1, y1, x2, y2);
    }
}

//тестовое решение №1
//public class Point {
//    public double x;
//    public double y;
//
//    public Point(double x, double y) {
//        this.x = x;
//        this.y = y;
//    }
//}
