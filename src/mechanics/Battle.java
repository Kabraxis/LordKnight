package mechanics;

import java.util.Random;
import entities.Monster;
import entities.Player;
import texts.Display;

public class Battle {
    public static void fight(Player player, Monster monster) {

        System.out.printf("%s encounters %s!%n%1$s's HP is: %d, %2$s's HP is: %d%nCHARGE !!%n%n",
                player.getName(), monster.getName(), player.getHealth(), monster.getHealth());

        int healthPreHit;
        while (player.getHealth() != 0 && monster.getHealth() != 0) {
            if (new Random().nextInt(0, Integer.MAX_VALUE) % 100 > monster.getAttack()) {
                healthPreHit = player.getHealth();

                player.setHealth(player.getHealth() - (new Random().nextInt(1, monster.getAttack())));
                System.out.printf("%s%s%n",
                        player.getName(), Display.hitMessage(healthPreHit, player.getHealth()));
            } else {
                System.out.printf("%s%s%n",
                        monster.getName(), Display.missedMessage());
            }

            if (player.getHealth() <= 0) {
                System.out.printf("%s is dead!%n",
                        player.getName());

            }

            if (monster.getHealth() <= 0) {
                System.out.printf("%s is dead!%n",
                        monster.getName());
            }

        }
    }
}

