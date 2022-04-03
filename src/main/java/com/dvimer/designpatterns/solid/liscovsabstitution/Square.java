package com.dvimer.designpatterns.solid.liscovsabstitution;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

public class Square extends Rectangle {

    public Square(int size) {
        super(size, size);
    }
}
