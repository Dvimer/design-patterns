package com.dvimer.designpatterns.creational.flyweight;

public class FormattedTextDemo {
    public static void main(String[] args) {
        FormattedText ft = new FormattedText("Hello world");
        ft.capitalize(2, 5);
        System.out.println(ft);

        BetterFormattedText bft = new BetterFormattedText("Hello world");
        bft.getRange(2, 5).capitalize = true;
        System.out.println(bft);
    }
}
