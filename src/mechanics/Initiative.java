package mechanics;

import entities.Mob;
import entities.Player;

public class Initiative {
    public static void whoseCharge(Player player, Mob mob) {
        player.setInitiative();
        mob.setInitiative();
    }
}

/*
The initiative of an entity determines whether it
will have the offensive position or the one of the
defender.

Both entities roll and will have a number, ranging
from 0-Integer.MAX_VALUE, on which % 100 will be
applied.

The higher value will have the initiative.

Initiative will be set inside Battle.java for
the fight's duration, and will reset at the end.

Player is wandering around. If they see a monster, they
may choose to attack or run.
In case of attack, CPU must determine who will attack first.

-Boolean
-> easy, very strict, only limited to two entities at a time.

-Name(String)
-> more resources(String), flexible, several orders of entities, as it's clear who's in charge.

-Integer
-> easy, low resources(int), flexible, several orders of entities, as it's clear who's in charge,


 */