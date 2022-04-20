package com.dvimer.designpatterns.creational.flyweight;

public class TextRange {
    int start;
    int end;
    boolean bold;
    boolean italic;
    boolean capitalize;

    public TextRange(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public boolean covers(int position) {
        return position >= start && position <= end;
    }
}
