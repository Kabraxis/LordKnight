package mechanics;

/*
Todo
- implement case 2 item.potion
- implement case 3 run
*/

import texts.Display;
import entities.Player;

import java.util.Scanner;

public class DecisionMenu {
    public static void select(Player player) {
        //  Actions and therefore cases are: 1 - attack, 2 - potion, 3 - run
        Display.actions();
        switch (validateInput()) {
            case 1: // attack
                Battle.fight(player);
                break;

//            case 2: // potion
//                Item.potion();
//                break;

            // Run will cause an initiative check: If player looses they'll have to fight
            case 3: // run
                Initiative.whoseCharge();
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
