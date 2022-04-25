package com.dvimer.designpatterns.behhavioral.chainresponsible.brokenchain;

public class CreatureModifier { // protected, not private!
    protected Game game;
    protected Creature creature;

    public CreatureModifier(Game game, Creature creature) {
        this.game = game;
        this.creature = creature;
    }
}
