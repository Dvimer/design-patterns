package com.dvimer.designpatterns.creational.bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        RasterRender rasterRender = new RasterRender();
        VectorRender vectorRender = new VectorRender();

        new Circle(rasterRender, 10).draw();
        new Circle(vectorRender, 10).draw();

        new Triangle(rasterRender, 11).draw();
        new Triangle(vectorRender, 11).draw();
    }
}
