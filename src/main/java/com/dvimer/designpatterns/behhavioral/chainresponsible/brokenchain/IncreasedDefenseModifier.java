package com.dvimer.designpatterns.behhavioral.chainresponsible.brokenchain;

public class IncreasedDefenseModifier
        extends CreatureModifier {

    public IncreasedDefenseModifier(Game game, Creature creature) {
        super(game, creature);

        game.queries.subscribe(q -> {
            if (q.creatureName.equals(creature.name)
                    && q.argument == Query.Argument.DEFENCE) {
                q.result += 3;
            }
        });
    }
}