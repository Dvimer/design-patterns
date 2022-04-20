package com.dvimer.designpatterns.creational.decorator.staticc;

public class StaticDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle.info());

        ColoredShape blueSquare = new ColoredShape(() -> new Square(15), "blue");
        System.out.println(blueSquare.info());

        TransparentShape transparentShape =
                new TransparentShape(() ->
                        new ColoredShape(() ->
                                new Circle(5), "red"), 50);
        TransparentShape transparentShape1 =
                new TransparentShape(() ->
                        new ColoredShape(() -> new ColoredShape(() ->
                                new Circle(5), "red"), "green"), 50);
        System.out.println(transparentShape.info());
        System.out.println(transparentShape1.info());
        StringBuilder builder = new StringBuilder();


    }
}
