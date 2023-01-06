package mechanics;

import java.util.Random;

import entities.Mob;
import entities.Player;
import texts.Display;

public class Battle {
    public static void fight(Player player) {

        // Getting a new random mob
        Mob mob = Mob.spawn();

        Display.encountering(player.getName(), mob.getName(),
                player.getHealth(), mob.getHealth());

        /* In the current version the player always has initiative */

        /*
        ToDo
        - implement check if entity has HP left/is alive
        - implement an initiative check
        - the fight action must become more dynamic (DRY-principle)
        */

        // Player/Mob landing a hit is determined here.
        // Get the modulo 100 of a random int, if it's bigger than players attack value, the hit is landed.
        if (new Random().nextInt(0, Integer.MAX_VALUE) % 100 > player.getAttack()) {
            int damage = getDamage(player.getAttack());
            mob.damage(damage);
            Display.hit(player.getName(), damage);
        } else {
            Display.miss(mob.getName());
        }

        // Mob getting damage
        if (new Random().nextInt(0, Integer.MAX_VALUE) % 100 > mob.getAttack()) {
            int damage = getDamage(mob.getAttack());
            player.damage(damage);
            Display.hit(mob.getName(), damage);
        } else {
            Display.miss(player.getName());
        }
//
//            if (player.getHealth() <= 0) {
//                Display.deathnote(player.getName());
//            }
//
//            if (mob.getHealth() <= 0) {
//                Display.deathnote(mob.getName());
//            }

    }


    private static int getDamage(int entityAttackValue) {
        return new Random().nextInt(1, entityAttackValue);
    }
}

