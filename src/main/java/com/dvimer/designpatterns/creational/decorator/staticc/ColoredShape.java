package com.dvimer.designpatterns.creational.decorator.staticc;

import java.util.function.Supplier;

public class ColoredShape<T extends Shape> implements Shape {
    private Shape shape;
    private String color;

    public ColoredShape(Supplier<? extends T> supplier, String color) {
        this.shape = supplier.get();
        this.color = color;
    }

    @Override
    public String info() {
        return shape.info() + " has the color " + color;
    }
}
