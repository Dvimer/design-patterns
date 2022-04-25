package com.dvimer.designpatterns.behhavioral.chainresponsible;

public class ChainResponsibleDemo {
    public static void main(String[] args) {
        Creature goblin = new Creature("Dvim", 10, 100);

        CreatureModifier root = new CreatureModifier(goblin);
        root.addModifier(new NoBonusModifier(goblin));
        root.addModifier(new DoubleAttackModifier(goblin));
        root.addModifier(new MinusDefendModifier(goblin, 11));

        root.handle();
        System.out.println(goblin);
    }
}
