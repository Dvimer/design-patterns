package com.dvimer.designpatterns.creational.builder.inheritance;

public class Demo {
    public static void main(String[] args) {
//        HtmlBuilder ul = new HtmlBuilder("ul")
//                .addChild("li", "firstName")
//                .addChild("li", "lastName");
//
//        System.out.println(ul);


        Person kexa = new PersonBuilder()
                .withName("Kexa")
                .build();

        System.out.println(kexa);

        Person lexa = new EmployeeBuilder()
                .withName("Lexa")
                .withPosition("left")
                .build();

        System.out.println(lexa);

    }
}
