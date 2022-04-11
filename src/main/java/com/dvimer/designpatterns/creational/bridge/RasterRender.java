package com.dvimer.designpatterns.creational.bridge;

public class RasterRender implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing pixels a circle of radius " + radius);
    }

    @Override
    public void renderTriangle(float line) {
        System.out.println("Drawing pixels a triangle with line length " + line);
    }
}
