package com.dvimer.designpatterns.creational.proxy.simple;

public class ProxyDemo {
    public static void main(String[] args) {
        Car car = new Car(new Driver(17));
        car.drive();

        Car car1 = new CarProxy(new Driver(17));
        car1.drive();
    }
}
