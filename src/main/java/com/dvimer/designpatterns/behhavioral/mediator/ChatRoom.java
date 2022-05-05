package com.dvimer.designpatterns.behhavioral.mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ChatRoom {
    private List<Person> people = new ArrayList<>();

    public void join(Person person) {
        String joinMsg = person.name + " joins the room";
        broadcast("room", joinMsg);
        person.room = this;
        people.add(person);
    }

    public void message(String source, String destination, String message) {
        people.stream()
                .filter(p -> p.name.equals(destination))
                .findFirst()
                .ifPresent(person -> person.receive(source, message));
    }

    public void broadcast(String source, String message) {
        for (Person person : people) {
            if (Objects.equals(person.name, source)) continue;
            person.receive(source, message);
        }
    }
}
