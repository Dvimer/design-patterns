package com.dvimer.designpatterns.behhavioral.chainresponsible.brokenchain;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Event<Arg> {
    private int index = 0;
    private Map<Integer, Consumer<Arg>> handlers = new HashMap<>();

    public Integer subscribe(Consumer<Arg> handler) {
        int i = index++;
        handlers.put(i, handler);
        return i;
    }

    public void unsubscribe(int key) {
        handlers.remove(key);
    }

    public void fire(Arg args) {
        for (Consumer<Arg> handler : handlers.values()) {
            handler.accept(args);
        }
    }
}
