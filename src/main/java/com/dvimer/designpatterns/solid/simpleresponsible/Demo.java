package com.dvimer.designpatterns.solid.simpleresponsible;

import org.javatuples.Triplet;

public class Demo {
    public static void main(String[] args) throws Exception {
        Journal j = new Journal();
        j.addEntry("I cried today");
        j.addEntry("I ate a bug");
        System.out.println(j);

        Persistence p = new Persistence();
        String filename = "c:\\temp\\journal.txt";
        p.saveToFile(j, filename, true);

        // windows!
        Runtime.getRuntime().exec("notepad.exe " + filename);

//        Triplet triplet = new Triplet();
    }
}
