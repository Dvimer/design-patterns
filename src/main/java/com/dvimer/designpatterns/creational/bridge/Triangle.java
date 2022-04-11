package com.dvimer.designpatterns.creational.bridge;

public class Triangle extends Shape {

    protected float line;

    public Triangle(Renderer renderer, float line) {
        super(renderer);
        this.line = line;
    }

    @Override
    public void draw() {
        renderer.renderTriangle(line);
    }

    @Override
    public void resize(float factor) {
        line *= factor;
    }
}
