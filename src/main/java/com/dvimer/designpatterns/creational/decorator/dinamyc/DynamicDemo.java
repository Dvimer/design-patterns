package com.dvimer.designpatterns.creational.decorator.dinamyc;

public class DynamicDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle.info());

        ColorShape blueSquare = new ColorShape(new Square(15), "blue");
        System.out.println(blueSquare.info());

        TransparentShape transparentShape =
                new TransparentShape(
                        new ColorShape(
                                new Circle(5), "red"), 50);
        TransparentShape transparentShape1 =
                new TransparentShape(
                        new ColorShape(new ColorShape(
                                new Circle(5), "red"), "green"), 50);
        System.out.println(transparentShape.info());
        System.out.println(transparentShape1.info());
    }
}
