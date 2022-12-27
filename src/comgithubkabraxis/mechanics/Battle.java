package comgithubkabraxis.mechanics;

import comgithubkabraxis.entities.*;
import comgithubkabraxis.texts.Display;

public class Battle {
    public static void fight(Player player, Monster monster) {
        System.out.printf("%s encounters %s!%n%1$s's HP is: %d, %2$s's HP is: %d%nCHARGE !!%n%n",
                player.getName(), monster.getName(), player.getHealth(), monster.getHealth());

        while (!player.isDead() || monster.isDead()) {
            if (Randomizer.rndRange(0, Integer.MAX_VALUE) % 100 > monster.getAttack()) {
               int healthPreHit = player.getHealth();
                player.setHealth(player.getHealth() - (Randomizer.rndDMG(monster.getAttack())));
                System.out.printf("%s%s%n",
                        player.getName(), Display.hitMessage(healthPreHit, player.getHealth()));
            }
        }
    }

}
