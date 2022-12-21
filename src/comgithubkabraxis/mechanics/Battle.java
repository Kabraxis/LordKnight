package comgithubkabraxis.mechanics;

import comgithubkabraxis.entities.*;

public class Battle {
    public static void fight(Player player, Monster monster) {
        System.out.printf("%s encounters %s!%n%1$s's HP is: %d, %2$s's HP is: %d%nFIGHT !!",
                player.getName(), monster.getName(), player.getHealth(), monster.getHealth());

        int healthPreHit;

        while (player.getHealth() > 0 || monster.getHealth() >0) {

        }
    }

}
