package com.dvimer.designpatterns.solid.onepclose.filter;

import com.dvimer.designpatterns.solid.onepclose.specification.Specification;

import java.util.List;
import java.util.stream.Stream;

public interface Filter<T> {
    Stream<T> filter(List<T> items, Specification<T> spec);
}
