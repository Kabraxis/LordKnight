package mechanics;

/*
Todo
- implement case 2 item.potion
- implement case 3 run
*/

import texts.Display;
import entities.Player;
import entities.Mob;

import java.util.Scanner;

public class DecisionMenu {
    public static void select(Player player, Mob mob) {
        //  Actions and therefore cases are: 1 - attack, 2 - potion, 3 - run
        Display.actions();
        switch (validateInput()) {
            case 1: // attack
                Encounter.fight(player);
                break;

//            case 2: // potion
//                Item.potion();
//                break;

            // Run will cause an initiative check: If player looses they'll have to fight
            case 3: // run
                player.setInitiative();
                mob.setInitiative();
                break;

            default:
                System.out.println("Ehhhhhhhhhhh!");

        }

    }

    private static int validateInput() {
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt(1 | 2 | 3)) {
            Display.invalidAction();
            Display.actions();
            scanner.next(); // clears scanner
        }
        return scanner.nextInt();
    }

}
