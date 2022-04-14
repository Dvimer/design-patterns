package com.dvimer.designpatterns.creational.decorator.staticc;

import java.util.function.Supplier;

public class TransparentShape<T extends Shape> implements Shape {
    private Shape shape;
    private int transparency;

    public TransparentShape(Supplier<? extends T> supplier, int transparency) {
        this.shape = supplier.get();
        this.transparency = transparency;
    }

    @Override
    public String info() {
        return shape.info() + " has " + transparency + "% transparency";
    }
}
