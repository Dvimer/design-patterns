package com.dvimer.designpatterns.creational.proxy.simple;

public class Car implements Drivable {
    public Driver driver;


    public Car(Driver driver) {
        this.driver = driver;
    }

    @Override
    public void drive() {
        System.out.println("Car being driven");
    }
}
