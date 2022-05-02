package com.dvimer.designpatterns.behhavioral.interpretor;

public class BinaryOperation implements Element {

    public enum Type {
        ADDITION,
        SUBTRACTION
    }

    public Type type;
    public Element right;
    public Element left;

    @Override
    public int eval() {
        switch (type) {
            case ADDITION:
                return left.eval() + right.eval();
            case SUBTRACTION:
                return right.eval() - left.eval();
            default:
                return 0;
        }
    }
}
