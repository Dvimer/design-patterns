package com.dvimer.designpatterns.behhavioral.chainresponsible;

public class MinusDefendModifier extends CreatureModifier {

    public int defense;

    public MinusDefendModifier(Creature creature, int defense) {
        super(creature);
        this.defense = defense;
    }

    @Override
    public void handle() {
        creature.setDefense(creature.getDefense() - defense);
        super.handle();
    }
}
