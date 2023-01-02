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



        // Player/Monster landing a hit is determined here.
        // Get the modulo 100 of a random int, if it's bigger than players attack value, the hit is landed.
        if (new Random().nextInt(0, Integer.MAX_VALUE) % 100 > player.getAttack()) {
            monster.damage(getDamage(player.getAttack()));
        } else {
            Display.miss(monster.getName());
        }

        // Monster getting damage
        if (new Random().nextInt(0, Integer.MAX_VALUE) % 100 > monster.getAttack()) {
            player.damage(getDamage(player.getAttack()));
        } else {
            Display.miss(player.getName());
        }

        while (player.getHealth() != 0 && monster.getHealth() != 0) {
            if (new Random().nextInt(0, Integer.MAX_VALUE) % 100 > monster.getAttack()) {

                Display.hit(player.getName(), entityHealthPreHit, player.getHealth());
            }

            if (player.getHealth() <= 0) {
                Display.deathnote(player.getName());
            }

            if (monster.getHealth() <= 0) {
                Display.deathnote(monster.getName());
            }

        }
    }

    private static int getDamage(int entityAttackValue) {
        return new Random().nextInt(1, entityAttackValue);
    }
}

