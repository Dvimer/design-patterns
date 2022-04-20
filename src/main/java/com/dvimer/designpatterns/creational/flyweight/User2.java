package com.dvimer.designpatterns.creational.flyweight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class User2 {
    static List<String> strings = new ArrayList<>();
    private int[] names;

    public User2(String fullName) {
        names = Arrays.stream(fullName.split(" "))
                .mapToInt(getStringIntegerFunction()::apply).toArray();
    }

    private Function<String, Integer> getStringIntegerFunction() {
        return (String s) -> {
            int idx = strings.indexOf(s);
            if (idx != -1) return idx;
            else {
                strings.add(s);
                return strings.size() - 1;
            }
        };
    }

    public String getFullName() {
        return Arrays.stream(names).mapToObj(i -> strings.get(i))
                .collect(Collectors.joining(","));
    }
}

