package com.dvimer.designpatterns.creational.factory;

public class Point {
    private double x;
    private double y;

    private Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static class PointFactory {
        public static Point newCartesianConstruct(double a, double b) {
            return new Point(a, b);
        }

        public static Point newPolarConstruct(double a, double b) {
            return new Point(a * Math.cos(b), a * Math.sin(b));
        }
    }
}
