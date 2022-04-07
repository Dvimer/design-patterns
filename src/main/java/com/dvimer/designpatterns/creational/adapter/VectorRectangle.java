package com.dvimer.designpatterns.creational.adapter;

import java.util.ArrayList;

public class VectorRectangle extends VectorObject {
    public VectorRectangle(int x, int y, int width, int height) {
        add(new Line(new Point(x, y), new Point(x + width, y)));
        add(new Line(new Point(x + width, y), new Point(x + width, y + width)));
        add(new Line(new Point(x, y), new Point(x, y + width)));
        add(new Line(new Point(x, y + height), new Point(x + width, y + width)));
    }
}
