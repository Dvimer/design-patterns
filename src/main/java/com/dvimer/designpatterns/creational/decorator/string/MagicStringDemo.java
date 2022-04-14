package com.dvimer.designpatterns.creational.decorator.string;

public class MagicStringDemo {
    public static void main(String[] args) {
        MagicString hello = new MagicString("Hello");
        System.out.println(hello + " has " + hello.getNumberOfVowels() + " vowels");
    }
}
