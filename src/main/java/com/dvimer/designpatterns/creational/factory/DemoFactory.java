package com.dvimer.designpatterns.creational.factory;

public class DemoFactory {
    public static void main(String[] args) {
        Point point = Point.PointFactory.newPolarConstruct(10, 20);
        Point point2 = Point.PointFactory.newCartesianConstruct(10, 20);
    }
}
