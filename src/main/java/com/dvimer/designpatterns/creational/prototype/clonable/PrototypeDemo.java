package com.dvimer.designpatterns.creational.prototype.clonable;

public class PrototypeDemo {
    public static void main(String[] args) {
        Person john = Person.builder()
                .names(new String[]{"John", "Smith"})
                .address(Address
                        .builder()
                        .streetAddress("London Road")
                        .houseNumber(123)
                        .build())
                .build();

        Person jane = john.clone();
        jane.getNames()[0] = "Jane";
        jane.getAddress().setStreetAddress("New Road");


        System.out.println(john);
        System.out.println(jane);
    }
}
