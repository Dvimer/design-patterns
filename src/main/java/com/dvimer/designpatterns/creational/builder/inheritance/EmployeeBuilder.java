package com.dvimer.designpatterns.creational.builder.inheritance;

public class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {
    protected Person person = new Person();

    public EmployeeBuilder withPosition(String position) {
        person.setPosition(position);
        return self();
    }

    public Person build() {
        return person;
    }

    @Override
    protected EmployeeBuilder self() {
        return this;
    }
}
