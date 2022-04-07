package com.dvimer.designpatterns.creational.adapter;

import java.util.List;

public class AdapterDemo {
    private static final List<VectorObject> vectorObjects =
            List.of(
                    new VectorRectangle(1,1,10,10),
                    new VectorRectangle(3,3,6,6)
            );

    public static void drawPoint(Point p) {
        System.out.print(".");
    }

    private static void draw() {
        for (VectorObject vo : vectorObjects) {
            for (Line line : vo) {
                LineToPointAdapter adapter = new LineToPointAdapter(line);
                adapter.forEach(AdapterDemo::drawPoint);
            }
        }
    }

    public static void main(String[] args) {
        draw();
        draw();
    }
}
