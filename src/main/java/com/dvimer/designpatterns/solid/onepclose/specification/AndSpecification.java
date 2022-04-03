package com.dvimer.designpatterns.solid.onepclose.specification;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AndSpecification<T> implements Specification<T> {

    private final Specification<T> first;
    private final Specification<T> second;

    @Override
    public boolean isSatisfied(T item) {
        return first.isSatisfied(item) && second.isSatisfied(item);
    }
}
