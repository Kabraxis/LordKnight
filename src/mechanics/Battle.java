package mechanics;

import java.util.Random;

import entities.Monster;
import entities.Player;
import texts.Display;

public class Battle {
    public static void fight(Player player) {

        // The values are health, attack, name
        Monster monster = new Monster(5, 15, "Goblin");

        Display.encountering(player.getName(), monster.getName(),
                player.getHealth(), monster.getHealth());

        /* In the current version the player always has initiative */

        /*
        ToDo
        - implement check if entity has HP left/is alive
        - implement an initiative check
        - the fight action must become more dynamic (DRY-principle)
        */

        // Player/Monster landing a hit is determined here.
        // Get the modulo 100 of a random int, if it's bigger than players attack value, the hit is landed.
        if (new Random().nextInt(0, Integer.MAX_VALUE) % 100 > player.getAttack()) {
            int damage = getDamage(player.getAttack());
            monster.damage(damage);
            Display.hit(player.getName(), damage);
        } else {
            Display.miss(monster.getName());
        }

        // Monster getting damage
        if (new Random().nextInt(0, Integer.MAX_VALUE) % 100 > monster.getAttack()) {
            int damage = getDamage(monster.getAttack());
            player.damage(damage);
            Display.hit(monster.getName(), damage);
        } else {
            Display.miss(player.getName());
        }
//
//            if (player.getHealth() <= 0) {
//                Display.deathnote(player.getName());
//            }
//
//            if (monster.getHealth() <= 0) {
//                Display.deathnote(monster.getName());
//            }

    }


    private static int getDamage(int entityAttackValue) {
        return new Random().nextInt(1, entityAttackValue);
    }
}

