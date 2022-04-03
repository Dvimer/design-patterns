package com.dvimer.designpatterns.creational.builder.facadebuilder;

public class PersonBuilder {
    protected Person person = new Person();

    public PersonJobBuilder works() {
        return new PersonJobBuilder(person);
    }

    public PersonAddressBuilder lives() {
        return new PersonAddressBuilder(person);
    }

    public Person build() {
        return person;
    }
}

class PersonAddressBuilder extends PersonBuilder {

    public PersonAddressBuilder(Person person) {
        this.person = person;
    }

    public PersonAddressBuilder in(String city) {
        person.setCity(city);
        return this;
    }

    public PersonAddressBuilder withPostCode(String postCode) {
        person.setPostCode(postCode);
        return this;
    }

    public PersonAddressBuilder at(String streetAddress) {
        person.setStreetAddress(streetAddress);
        return this;
    }
}

class PersonJobBuilder extends PersonBuilder {

    public PersonJobBuilder(Person person) {
        this.person = person;
    }

    public PersonJobBuilder earning(int annualIncome) {
        person.setAnnualIncome(annualIncome);
        return this;
    }

    public PersonJobBuilder asA(String position) {
        person.setPosition(position);
        return this;
    }

    public PersonJobBuilder at(String companyName) {
        person.setCompanyName(companyName);
        return this;
    }
}
