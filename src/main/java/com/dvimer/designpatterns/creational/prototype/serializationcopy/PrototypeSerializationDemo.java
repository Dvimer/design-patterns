package com.dvimer.designpatterns.creational.prototype.serializationcopy;

import org.apache.commons.lang3.SerializationUtils;

public class PrototypeSerializationDemo {
    public static void main(String[] args) {
        Foo foo = new Foo("firs", "second");
        Foo clone = SerializationUtils.clone(foo);

        clone.setStuff("cloneStuff");

        System.out.println(foo);
        System.out.println(clone);
    }
}
