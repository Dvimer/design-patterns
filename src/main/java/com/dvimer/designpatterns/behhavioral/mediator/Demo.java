package com.dvimer.designpatterns.behhavioral.mediator;

public class Demo {
    public static void main(String[] args) {
        ChatRoom chat = new ChatRoom();

        Person john = new Person("John");
        Person jane = new Person("Jane");
        Person jozef = new Person("Jozef");

        chat.join(john);
        chat.join(jane);
        chat.join(jozef);


        jane.privateMessage(john.name, "Hello");

        System.out.println();

        jane.say("Help me");
    }
}
