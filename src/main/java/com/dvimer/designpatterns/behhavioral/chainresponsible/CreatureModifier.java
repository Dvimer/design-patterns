package com.dvimer.designpatterns.behhavioral.chainresponsible;

public class CreatureModifier {
    protected Creature creature;
    protected CreatureModifier next;

    public CreatureModifier(Creature creature) {
        this.creature = creature;
    }

    public void addModifier(CreatureModifier modifier) {
        if (next != null) {
            next.addModifier(modifier);
        } else {
            next = modifier;
        }
    }

    public void handle() {
        if (next != null) {
            next.handle();
        }
    }
}
