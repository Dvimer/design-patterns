package com.dvimer.designpatterns.creational.prototype.clonable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Address implements Cloneable {
    private String streetAddress;

    private int houseNumber;

    @Override
    public Address clone() {
        return new Address(streetAddress, houseNumber);
    }
}
