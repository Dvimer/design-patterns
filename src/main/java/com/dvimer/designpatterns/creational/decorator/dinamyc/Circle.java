package com.dvimer.designpatterns.creational.decorator.dinamyc;

public class Circle implements Shape {
    private float radius;

    public Circle() {
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    public void resize(float factor) {
        this.radius *= factor;
    }

    @Override
    public String info() {
        return "A circle of radius " + radius;
    }
}
