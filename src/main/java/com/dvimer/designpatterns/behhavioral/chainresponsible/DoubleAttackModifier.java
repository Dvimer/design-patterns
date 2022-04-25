package com.dvimer.designpatterns.behhavioral.chainresponsible;

public class DoubleAttackModifier extends CreatureModifier {

    public DoubleAttackModifier(Creature creature) {
        super(creature);
    }

    @Override
    public void handle() {
        creature.setAttack(creature.getAttack() * 2);
        super.handle();
    }
}
