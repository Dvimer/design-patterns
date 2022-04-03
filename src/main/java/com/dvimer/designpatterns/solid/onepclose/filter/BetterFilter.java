package com.dvimer.designpatterns.solid.onepclose.filter;

import com.dvimer.designpatterns.solid.onepclose.model.Product;
import com.dvimer.designpatterns.solid.onepclose.specification.Specification;

import java.util.List;
import java.util.stream.Stream;

public class BetterFilter implements Filter<Product> {

    @Override
    public Stream<Product> filter(List<Product> items, Specification<Product> spec) {
        return items.stream().filter(spec::isSatisfied);
    }
}
