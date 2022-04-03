package com.dvimer.designpatterns.solid.onepclose.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Product {
    private String name;

    private Color color;

    private Size size;
}
