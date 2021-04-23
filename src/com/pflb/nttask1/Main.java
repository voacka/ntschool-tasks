package com.pflb.nttask1;

public class Main {
    public static void main(String[] args) {
        Section s1 = new Section(1, 1, 2, 2);
        Section s2 = new Section(-3, 0, 1, 1);
//        Section s3 = new Section(2, 2, 3, 3);

        Section.SectionLengthEquals(s1, s2);

//проверка равенства объектов через equals. Тут необходимо уточнить критерий равенства двух объектов (отрезков).
//Будет ли единственным критерием равенства их длина, или точки расположения тоже должны быть равны?
//поскольку длина является не задаваемым, а вычисляемым значением, я решил проверять по точкам расположения начала отрезка и конца.
//Т.е. при создании в параметрах задаются точки по X и по Y и сравнение equals происходит по ним.

//        if (s1.equals(s3)) {
//            System.out.println("Длины отрезков равны");
//        } else {
//            System.out.println("Длины отрезков не равны");
//        }
    }
}


//тестовое решение №1
//public class Section {
//    public static void main(String[] args) {
//        Point p1 = new Point(1, 1);
//        Point p2 = new Point(2, 2);
//
//        Point p3 = new Point(-3, 0);
//        Point p4 = new Point(1, 1);
//
//        SectionEquals(p1, p2, p3, p4);
//    }
//
//    public static boolean SectionEquals(Point p1, Point p2, Point p3, Point p4) {
//        double lengthOne = Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
//        double lengthTwo = Math.sqrt(Math.pow(p4.x - p3.x, 2) + Math.pow(p4.y - p3.y, 2));
//        System.out.println(lengthOne);
//        System.out.println(lengthTwo);
//
//        if (lengthOne == lengthTwo) {
//            System.out.println("Длины отрезков равны");
//            return true;
//        } else {
//            System.out.println("Длины отрезков не равны");
//            return false;
//        }
//    }
//}
