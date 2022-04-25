package com.dvimer.designpatterns.behhavioral.chainresponsible;

public class NoBonusModifier extends CreatureModifier {

    public NoBonusModifier(Creature creature) {
        super(creature);
    }

    @Override
    public void handle() {
    }
}
