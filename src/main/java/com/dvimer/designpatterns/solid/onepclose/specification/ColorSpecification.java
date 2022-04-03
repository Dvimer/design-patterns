package com.dvimer.designpatterns.solid.onepclose.specification;

import com.dvimer.designpatterns.solid.onepclose.model.Color;
import com.dvimer.designpatterns.solid.onepclose.model.Product;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ColorSpecification implements Specification<Product> {

    private final Color color;

    @Override
    public boolean isSatisfied(Product item) {
        return item.getColor() == color;
    }
}
