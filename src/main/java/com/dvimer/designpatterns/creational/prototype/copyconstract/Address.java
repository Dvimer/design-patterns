package com.dvimer.designpatterns.creational.prototype.copyconstract;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private String streetAddress;

    private int houseNumber;

    public Address(Address other) {
        streetAddress = other.streetAddress;
        houseNumber = other.houseNumber;
    }
}
