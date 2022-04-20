package com.dvimer.designpatterns.creational.flyweight;

public class FormattedText {
    private String plainText;
    private boolean[] capitalize = new boolean[100];

    public FormattedText(String plainText) {
        this.plainText = plainText;
    }

    public void capitalize(int start, int end) {
        for (int i = start; i <= end; ++i) {
            capitalize[i] = true;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < plainText.length(); ++i) {
            char c = plainText.charAt(i);
            builder.append((capitalize[i] ? Character.toUpperCase(c) : c));
        }
        return builder.toString();
    }
}
