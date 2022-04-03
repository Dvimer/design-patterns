package com.dvimer.designpatterns.solid.onepclose.specification;

public interface Specification<T> {
    boolean isSatisfied(T item);
}
