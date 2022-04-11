package com.dvimer.designpatterns.creational.bridge;

public class VectorRender implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing a circle of radius " + radius);
    }

    @Override
    public void renderTriangle(float line) {
        System.out.println("Drawing triangle with line length " + line);
    }
}
