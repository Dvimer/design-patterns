package com.dvimer.designpatterns.solid.onepclose.specification;

import com.dvimer.designpatterns.solid.onepclose.model.Product;
import com.dvimer.designpatterns.solid.onepclose.model.Size;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SizeSpecification implements Specification<Product> {

    private final Size size;

    @Override
    public boolean isSatisfied(Product item) {
        return item.getSize() == size;
    }
}
