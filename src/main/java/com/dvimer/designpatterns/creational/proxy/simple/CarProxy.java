package com.dvimer.designpatterns.creational.proxy.simple;

public class CarProxy extends Car {
    public CarProxy(Driver driver) {
        super(driver);
    }

    @Override
    public void drive() {
        if (driver.age >= 18) {
            super.drive();
        } else {
            System.out.println("Driver too young!");
        }
    }
}
