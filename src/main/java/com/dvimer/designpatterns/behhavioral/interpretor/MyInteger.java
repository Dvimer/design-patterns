package com.dvimer.designpatterns.behhavioral.interpretor;

public class MyInteger implements Element {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    @Override
    public int eval() {
        return value;
    }
}
