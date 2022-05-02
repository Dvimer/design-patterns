package com.dvimer.designpatterns.behhavioral.interpretor;

public class Token {
    enum Type {
        INTEGER,
        PLUS,
        MINUS,
        LPAREN,
        RPAREN
    }

    public Type type;
    public String text;

    public Token(Type type, String text) {
        this.type = type;
        this.text = text;
    }

    @Override
    public String toString() {
        return
                "'" + text + "'";
    }
}
