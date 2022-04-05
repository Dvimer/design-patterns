package com.dvimer.designpatterns.creational.prototype.copyconstract;


public class PrototypeConstructorDemo {
    public static void main(String[] args) {
        Employee john = Employee.builder()
                .name("John")
                .address(Address
                        .builder()
                        .streetAddress("London Road")
                        .houseNumber(123)
                        .build())
                .build();

        Employee jane = new Employee(john);
        jane.setName("Jane");
        jane.getAddress().setStreetAddress("New Road");


        System.out.println(john);
        System.out.println(jane);
    }
}
