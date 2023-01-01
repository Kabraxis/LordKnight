package mechanics;

import java.util.Random;

import entities.Monster;
import entities.Player;
import texts.Display;

public class Battle {
    public static void fight(Player player, Monster monster) {

        Display.encountering(player.getName(), monster.getName(),
                player.getHealth(), monster.getHealth());

        int healthPreHit;
        while (player.getHealth() != 0 && monster.getHealth() != 0) {
            if (new Random().nextInt(0, Integer.MAX_VALUE) % 100 > monster.getAttack()) {
                healthPreHit = player.getHealth();

                player.setHealth(player.getHealth() - (new Random().nextInt(1, monster.getAttack())));
                Display.hit(player.getName(), healthPreHit, player.getHealth());
            } else {
                Display.miss(monster.getName());
            }

            if (player.getHealth() <= 0) {
                Display.deathnote(player.getName());
            }

            if (monster.getHealth() <= 0) {
                Display.deathnote(monster.getName());
            }

        }
    }
}

