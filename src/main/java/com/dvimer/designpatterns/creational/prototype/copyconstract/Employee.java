package com.dvimer.designpatterns.creational.prototype.copyconstract;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private String name;

    private Address address;

    public Employee(Employee other) {
        name = other.name;
        address = new Address(other.getAddress());
    }
}
