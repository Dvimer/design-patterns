package com.dvimer.designpatterns.creational.composite.base;

public class CompositeDemo {
    public static void main(String[] args) {
        GraphicObject drawing = new GraphicObject();
        drawing.children.add(new Circle("red"));
        drawing.children.add(new Square("blue"));
        drawing.children.add(new Circle("violet"));
        drawing.children.get(0).children.add(new Circle("green"));


        System.out.println(drawing);
    }
}
