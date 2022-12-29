package comgithubkabraxis.mechanics;

import java.util.Random;
import comgithubkabraxis.entities.*;
import comgithubkabraxis.texts.Display;

public class Battle {
    public static void fight(Player player, Monster monster) {
        System.out.printf("%s encounters %s!%n%1$s's HP is: %d, %2$s's HP is: %d%nCHARGE !!%n%n",
                player.getName(), monster.getName(), player.getHealth(), monster.getHealth());

        int healthPreHit;
        while (!player.isDead() || !monster.isDead()) {
            System.out.printf("Player is dead: %b  Monster is dead: %b%n",
                    player.isDead(), monster.isDead());
            if (new Random().nextInt(0, Integer.MAX_VALUE) % 100 > monster.getAttack()) {
                healthPreHit = player.getHealth();
                player.setHealth(player.getHealth() - (new Random().nextInt(1, monster.getAttack())));
                System.out.printf("%s%s%n",
                        player.getName(), Display.hitMessage(healthPreHit, player.getHealth()));
            } else {
                System.out.printf("%s%s%n",
                        monster.getName(), Display.missedMessage());
            }
            System.out.printf("Player is dead: %b  Monster is dead: %b%n",
                    player.isDead(), monster.isDead());
        }
    }
}
//
//            if (new Random().nextInt(0,Integer.MAX_VALUE) % 100 > player.getAttack()) {
//                healthPreHit = monster.getHealth();
//                monster.setHealth(monster.getHealth() - (new Random().nextInt(1, player.getAttack())));
//                System.out.printf("%s%s%n",
//                        monster.getName(), Display.hitMessage(healthPreHit, monster.getHealth()));
//            } else {
//                System.out.printf("You%s%n",
//                        Display.missedMessage());
//            }
//        }
//
//        System.out.println(player.isDead() ? "You are dead!" : monster.getName() + " is dead!");



