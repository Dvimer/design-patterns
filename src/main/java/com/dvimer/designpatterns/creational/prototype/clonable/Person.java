package com.dvimer.designpatterns.creational.prototype.clonable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Cloneable {
    private String[] names;
    private Address address;

    @Override
    public Person clone() {
        return new Person(names.clone(), address.clone());
    }
}
