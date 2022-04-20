package com.dvimer.designpatterns.creational.flyweight;

import java.util.ArrayList;
import java.util.List;

public class BetterFormattedText {
    private String plainText;
    private List<TextRange> formatting = new ArrayList<>();


    public BetterFormattedText(String plainText) {
        this.plainText = plainText;
    }

    public TextRange getRange(int start, int end) {
        TextRange textRange = new TextRange(start, end);
        formatting.add(textRange);
        return textRange;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < plainText.length(); ++i) {
            char c = plainText.charAt(i);
            for (TextRange range : formatting) {
                if (range.covers(i) && range.capitalize) {
                    c = Character.toUpperCase(c);
                }
                builder.append(c);
            }
        }
        return builder.toString();
    }
}

