package com.dvimer.designpatterns.creational.builder.facadebuilder;

public class Demo {

    public static void main(String[] args) {
        Person person = new PersonBuilder()
                .lives()
                .in("Moskow")
                .withPostCode("77")
                .at("Profsouznaya")
                .works()
                .asA("Developer")
                .earning(100000)
                .at("SuperCompany")
                .build();

        System.out.println(person);
    }
}
